package com.pmjrs.backend_reservas_auditorios.repository;


import com.pmjrs.backend_reservas_auditorios.model.Auditorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditorioRepository extends JpaRepository<Auditorio, Long> {
    
}
