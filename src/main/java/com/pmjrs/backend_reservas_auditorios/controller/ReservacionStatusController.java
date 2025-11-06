package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionStatus;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionStatusRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservacion-status")
public class ReservacionStatusController {

    private final ReservacionStatusRepository reservacionStatusRepository;

    public ReservacionStatusController(ReservacionStatusRepository reservacionStatusRepository) {
        this.reservacionStatusRepository = reservacionStatusRepository;
    }

    @GetMapping
    public ResponseEntity<List<ReservacionStatus>> getAllReservacionStatus() {
        List<ReservacionStatus> lista = reservacionStatusRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionStatus> getReservacionStatusById(@PathVariable Long id) {
        return reservacionStatusRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReservacionStatus> createReservacionStatus(@RequestBody ReservacionStatus reservacionStatus) {
        ReservacionStatus nuevo = reservacionStatusRepository.save(reservacionStatus);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservacionStatus> updateReservacionStatus(@PathVariable Long id, @RequestBody ReservacionStatus detalles) {
        return reservacionStatusRepository.findById(id)
                .map(status -> {
                    status.setNombreStatus(detalles.getNombreStatus());
                    status.setColorStatus(detalles.getColorStatus());
                    status.setActivo(detalles.getActivo());
                    status.setCreadoPor(detalles.getCreadoPor());
                    status.setCreadoEl(detalles.getCreadoEl());
                    status.setActualizadoPor(detalles.getActualizadoPor());
                    status.setActualizadoEl(detalles.getActualizadoEl());
                    ReservacionStatus actualizado = reservacionStatusRepository.save(status);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteReservacionStatus(@PathVariable Long id) {
    //     return reservacionStatusRepository.findById(id)
    //             .map(status -> {
    //                 reservacionStatusRepository.delete(status);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
