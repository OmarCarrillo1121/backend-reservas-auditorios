package com.pmjrs.backend_reservas_auditorios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pmjrs.backend_reservas_auditorios.model.LoginHistorial;

@Repository
public interface LoginHistorialRepository extends JpaRepository<LoginHistorial, Long> {
}