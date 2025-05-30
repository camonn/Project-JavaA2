package com.parking.javauniesp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Bloco {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private int limite;
}