package com.parking.javauniesp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.javauniesp.model.QRCodeLiberacao;

public interface QRCodeRepository extends JpaRepository<QRCodeLiberacao, Long> {
    Optional<QRCodeLiberacao> findByVagaIdAndAtivoTrue();
}