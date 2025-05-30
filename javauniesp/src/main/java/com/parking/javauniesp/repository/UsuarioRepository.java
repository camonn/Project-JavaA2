package com.parking.javauniesp.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.javauniesp.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
