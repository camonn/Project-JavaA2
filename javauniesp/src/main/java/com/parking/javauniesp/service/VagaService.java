package com.parking.javauniesp.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.javauniesp.model.Bloco;
import com.parking.javauniesp.model.Vaga;
import com.parking.javauniesp.repository.BlocoRepository;
import com.parking.javauniesp.repository.VagaRepository;

@Service
public class VagaService {
    @Autowired private BlocoRepository blocoRepo;
    @Autowired private VagaRepository vagaRepo;

    public Map<String, List<Vaga>> vagasDisponiveis() {
        Map<String, List<Vaga>> mapa = new LinkedHashMap<>();
        for (Bloco bloco : blocoRepo.findAll()) {
            List<Vaga> vagas = vagaRepo.findByBloco(bloco);
            List<Vaga> livres = vagas.stream()
                .filter(v -> !v.isOcupada())
                .limit(bloco.getLimite())
                .toList();
            mapa.put(bloco.getNome(), livres);
        }
        return mapa;
    }
}
