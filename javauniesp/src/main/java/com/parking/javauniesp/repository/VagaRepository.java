package com.parking.javauniesp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.javauniesp.model.Bloco;
import com.parking.javauniesp.model.Vaga;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
    List<Vaga> findByBloco(Bloco bloco);
}