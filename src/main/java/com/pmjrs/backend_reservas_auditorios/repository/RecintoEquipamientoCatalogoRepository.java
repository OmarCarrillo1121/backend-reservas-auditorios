package com.pmjrs.backend_reservas_auditorios.repository;

import com.pmjrs.backend_reservas_auditorios.model.RecintoEquipamientoCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecintoEquipamientoCatalogoRepository extends JpaRepository<RecintoEquipamientoCatalogo, Long> {
}
