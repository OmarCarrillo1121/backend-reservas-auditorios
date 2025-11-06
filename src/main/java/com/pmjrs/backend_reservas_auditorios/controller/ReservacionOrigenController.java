package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionOrigen;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionOrigenRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservacion_origen")
public class ReservacionOrigenController {

    private final ReservacionOrigenRepository reservacionOrigenRepository;

    public ReservacionOrigenController(ReservacionOrigenRepository reservacionOrigenRepository) {
        this.reservacionOrigenRepository = reservacionOrigenRepository;
    }

    @GetMapping
    public ResponseEntity<List<ReservacionOrigen>> getAllReservacionOrigen() {
        List<ReservacionOrigen> lista = reservacionOrigenRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionOrigen> getReservacionOrigenById(@PathVariable Long id) {
        return reservacionOrigenRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ReservacionOrigen> createReservacionOrigen(@RequestBody ReservacionOrigen reservacionOrigen) {
        ReservacionOrigen nuevo = reservacionOrigenRepository.save(reservacionOrigen);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservacionOrigen> updateReservacionOrigen(@PathVariable Long id, @RequestBody ReservacionOrigen detalles) {
        return reservacionOrigenRepository.findById(id)
                .map(origen -> {
                    origen.setNombre_origen(detalles.getNombre_origen());
                    origen.setActivo(detalles.getActivo());
                    origen.setActualizado_por(detalles.getActualizado_por());
                    origen.setActualizado_el(detalles.getActualizado_el());
                    ReservacionOrigen actualizado = reservacionOrigenRepository.save(origen);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteReservacionOrigen(@PathVariable Long id) {
    //     return reservacionOrigenRepository.findById(id)
    //             .map(origen -> {
    //                 reservacionOrigenRepository.delete(origen);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
