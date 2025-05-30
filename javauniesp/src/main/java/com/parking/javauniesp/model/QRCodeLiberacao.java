package com.parking.javauniesp.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class QRCodeLiberacao {
    @Id @GeneratedValue
    private Long id;

    private Long usuarioId;
    private Long vagaId;
    private boolean ativo = true;
    private LocalDateTime validade;
}