package com.parking.javauniesp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.javauniesp.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {}