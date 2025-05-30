package com.parking.javauniesp.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.javauniesp.model.Pagamento;
import com.parking.javauniesp.repository.PagamentoRepository;

@Service
public class PagamentoService {
    @Autowired private PagamentoRepository repo;

    public Pagamento gerarPagamento(Long usuarioId, Long vagaId, String metodo) {
        Pagamento p = new Pagamento();
        p.setUsuarioId(usuarioId);
        p.setVagaId(vagaId);
        p.setMetodo(metodo);
        p.setQrCodePix("qrcode-pix-" + UUID.randomUUID());
        return repo.save(p);
    }

    public Pagamento confirmar(Long id) {
        Pagamento p = repo.findById(id).orElseThrow();
        p.setPago(true);
        return repo.save(p);
    }

    public Optional<Pagamento> buscar(Long id) {
        return repo.findById(id);
    }
}