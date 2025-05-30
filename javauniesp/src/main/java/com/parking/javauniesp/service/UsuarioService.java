package com.parking.javauniesp.service;

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