package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionHorasDisponibles;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionHorasDisponiblesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservacion_horas_disponibles")
public class ReservacionHorasDisponiblesController {

    private final ReservacionHorasDisponiblesRepository reservacionHorasDisponiblesRepository;

    public ReservacionHorasDisponiblesController(ReservacionHorasDisponiblesRepository reservacionHorasDisponiblesRepository) {
        this.reservacionHorasDisponiblesRepository = reservacionHorasDisponiblesRepository;
    }

    @GetMapping
    public ResponseEntity<List<ReservacionHorasDisponibles>> getAllReservacionHorasDisponibles() {
        List<ReservacionHorasDisponibles> lista = reservacionHorasDisponiblesRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionHorasDisponibles> getReservacionHorasDisponiblesById(@PathVariable Long id) {
        return reservacionHorasDisponiblesRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReservacionHorasDisponibles> createReservacionHorasDisponibles(@RequestBody ReservacionHorasDisponibles reservacionHorasDisponibles) {
        ReservacionHorasDisponibles nuevo = reservacionHorasDisponiblesRepository.save(reservacionHorasDisponibles);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservacionHorasDisponibles> updateReservacionHorasDisponibles(@PathVariable Long id, @RequestBody ReservacionHorasDisponibles detalles) {
        return reservacionHorasDisponiblesRepository.findById(id)
                .map(hora -> {
                    hora.setHora(detalles.getHora());
                    hora.setActivo(detalles.getActivo());
                    hora.setActualizado_por(detalles.getActualizado_por());
                    hora.setActualizado_el(detalles.getActualizado_el());
                    ReservacionHorasDisponibles actualizado = reservacionHorasDisponiblesRepository.save(hora);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteReservacionHorasDisponibles(@PathVariable Long id) {
    //     return reservacionHorasDisponiblesRepository.findById(id)
    //             .map(hora -> {
    //                 reservacionHorasDisponiblesRepository.delete(hora);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}

