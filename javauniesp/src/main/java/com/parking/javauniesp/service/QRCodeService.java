package com.parking.javauniesp.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.javauniesp.model.QRCodeLiberacao;
import com.parking.javauniesp.repository.QRCodeRepository;

@Service
public class QRCodeService {
    @Autowired private QRCodeRepository repo;

    public QRCodeLiberacao gerar(Long usuarioId, Long vagaId) {
        QRCodeLiberacao qr = new QRCodeLiberacao();
        qr.setUsuarioId(usuarioId);
        qr.setVagaId(vagaId);
        qr.setValidade(LocalDateTime.now().plusMinutes(15));
        return repo.save(qr);
    }

    public void verificarExpirados() {
        for (QRCodeLiberacao qr : repo.findAll()) {
            if (qr.isAtivo() && qr.getValidade().isBefore(LocalDateTime.now())) {
                qr.setAtivo(false);
                repo.save(qr);
            }
        }
    }
}
