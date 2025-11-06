package com.pmjrs.backend_reservas_auditorios.repository;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioPuesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPuestoRepository extends JpaRepository<UsuarioPuesto, Long> {}
