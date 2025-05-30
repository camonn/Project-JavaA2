package com.parking.javauniesp.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class QRCodeLiberacao {
    @Id @GeneratedValue
    private Long id;

    private Long usuarioId;
    private Long vagaId;
    private boolean ativo = true;
    private LocalDateTime validade;
}