package com.example.api_rest.Repositorio;

import com.example.api_rest.modelo.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
