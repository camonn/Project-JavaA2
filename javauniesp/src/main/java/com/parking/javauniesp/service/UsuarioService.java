package com.parking.javauniesp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.javauniesp.model.Usuario;
import com.parking.javauniesp.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired private UsuarioRepository repo;

    public Usuario cadastrar(Usuario u) {
        return repo.save(u);
    }

    public Optional<Usuario> login(String email, String senha) {
        return repo.findByEmail(email)
                   .filter(u -> u.getSenha().equals(senha));
    }

    public Optional<Usuario> buscar(Long id) {
        return repo.findById(id);
    }
}