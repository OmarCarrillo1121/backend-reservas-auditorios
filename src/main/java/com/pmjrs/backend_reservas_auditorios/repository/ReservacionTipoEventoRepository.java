package com.pmjrs.backend_reservas_auditorios.repository;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionTipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservacionTipoEventoRepository extends JpaRepository<ReservacionTipoEvento, Long> {
}
