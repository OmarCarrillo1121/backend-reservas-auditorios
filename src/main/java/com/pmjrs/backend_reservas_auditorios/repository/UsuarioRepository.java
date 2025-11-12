package com.pmjrs.backend_reservas_auditorios.repository;

import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}
