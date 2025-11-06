package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Reservacion;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservaciones")
@CrossOrigin(origins = "*")
public class ReservacionController {

    @Autowired
    private ReservacionRepository reservacionRepository;

    @GetMapping
    public List<Reservacion> getAll() {
        return reservacionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reservacion> getById(@PathVariable Long id) {
        Optional<Reservacion> reservacion = reservacionRepository.findById(id);
        return reservacion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Reservacion create(@RequestBody Reservacion reservacion) {
        return reservacionRepository.save(reservacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservacion> update(@PathVariable Long id, @RequestBody Reservacion detalles) {
        Optional<Reservacion> existente = reservacionRepository.findById(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Reservacion r = existente.get();
        r.setRecinto(detalles.getRecinto());
        r.setSolicitante(detalles.getSolicitante());
        r.setFecha_reservacion(detalles.getFecha_reservacion());
        r.setHora_inicio(detalles.getHora_inicio());
        r.setHora_termino(detalles.getHora_termino());
        r.setActivo(detalles.getActivo());
        return ResponseEntity.ok(reservacionRepository.save(r));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!reservacionRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        reservacionRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

