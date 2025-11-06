package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionHistorial;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionHistorialRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservacion-historial")
public class ReservacionHistorialController {

    private final ReservacionHistorialRepository reservacionHistorialRepository;

    public ReservacionHistorialController(ReservacionHistorialRepository reservacionHistorialRepository) {
        this.reservacionHistorialRepository = reservacionHistorialRepository;
    }

    @GetMapping
    public ResponseEntity<List<ReservacionHistorial>> getAllReservacionHistorial() {
        List<ReservacionHistorial> lista = reservacionHistorialRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionHistorial> getReservacionHistorialById(@PathVariable Long id) {
        return reservacionHistorialRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReservacionHistorial> createReservacionHistorial(@RequestBody ReservacionHistorial reservacionHistorial) {
        ReservacionHistorial nuevo = reservacionHistorialRepository.save(reservacionHistorial);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservacionHistorial> updateReservacionHistorial(@PathVariable Long id, @RequestBody ReservacionHistorial detalles) {
        return reservacionHistorialRepository.findById(id)
                .map(historial -> {
                    historial.setReservacion(detalles.getReservacion());
                    historial.setStatus(detalles.getStatus());
                    historial.setComentarioReservacion(detalles.getComentarioReservacion());
                    historial.setActivo(detalles.getActivo());
                    historial.setCreadoPor(detalles.getCreadoPor());
                    historial.setCreadoEl(detalles.getCreadoEl());
                    historial.setActualizadoPor(detalles.getActualizadoPor());
                    historial.setActualizadoEl(detalles.getActualizadoEl());
                    ReservacionHistorial actualizado = reservacionHistorialRepository.save(historial);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteReservacionHistorial(@PathVariable Long id) {
    //     return reservacionHistorialRepository.findById(id)
    //             .map(historial -> {
    //                 reservacionHistorialRepository.delete(historial);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
