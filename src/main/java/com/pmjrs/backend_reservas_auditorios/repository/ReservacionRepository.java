package com.pmjrs.backend_reservas_auditorios.repository;

import com.pmjrs.backend_reservas_auditorios.model.Reservacion;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservacionRepository extends JpaRepository<Reservacion, Long> {
    List<Reservacion> findBySolicitante(Usuario solicitante);
}
