package com.parking.javauniesp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Pagamento {
    @Id @GeneratedValue
    private Long id;

    private Long usuarioId;
    private Long vagaId;
    private String metodo; // PIX ou CARTAO
    private boolean pago = false;
    private String qrCodePix; // Simulação
}