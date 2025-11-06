package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecursosReservacion;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosReservacionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recurso-reservacion")
public class RecursosReservacionController {

    private final RecursosReservacionRepository RecursosReservacionRepository;

    public RecursosReservacionController(RecursosReservacionRepository RecursosReservacionRepository) {
        this.RecursosReservacionRepository = RecursosReservacionRepository;
    }

    @GetMapping
    public List<RecursosReservacion> getAllRecursosReservacion() {
        return RecursosReservacionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursosReservacion> getRecursosReservacionById(@PathVariable Long id) {
        return RecursosReservacionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RecursosReservacion createRecursosReservacion(@RequestBody RecursosReservacion RecursosReservacion) {
        return RecursosReservacionRepository.save(RecursosReservacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecursosReservacion> updateRecursosReservacion(@PathVariable Long id, @RequestBody RecursosReservacion details) {
        return RecursosReservacionRepository.findById(id)
                .map(rr -> {
                    rr.setRecurso(details.getRecurso());
                    rr.setReservacion(details.getReservacion());
                    rr.setCantidad_asignada(details.getCantidad_asignada());
                    rr.setActivo(details.getActivo());
                    rr.setActualizado_por(details.getActualizado_por());
                    rr.setActualizado_el(details.getActualizado_el());
                    return ResponseEntity.ok(RecursosReservacionRepository.save(rr));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecursosReservacion(@PathVariable Long id) {
        if (RecursosReservacionRepository.existsById(id)) {
            RecursosReservacionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
