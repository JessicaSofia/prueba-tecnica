package com.example.api_rest.servicio;

import com.example.api_rest.modelo.Usuario;
import com.example.api_rest.Repositorio.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicio {

    private final UsuarioRepositorio repositorio;

    public UsuarioServicio(UsuarioRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario> listarUsuarios() {
        return repositorio.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return repositorio.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        repositorio.deleteById(id);
    }
}
