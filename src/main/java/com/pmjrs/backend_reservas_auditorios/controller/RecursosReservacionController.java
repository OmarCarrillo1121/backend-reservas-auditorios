package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecursosReservacion;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosReservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recursos-reservacion")
public class RecursosReservacionController {

    @Autowired
    private RecursosReservacionRepository repository;

    @GetMapping
    public List<RecursosReservacion> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursosReservacion> getById(@PathVariable Long id) {
        Optional<RecursosReservacion> recursoReservacion = repository.findById(id);
        return recursoReservacion.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RecursosReservacion create(@RequestBody RecursosReservacion recursoReservacion) {
        return repository.save(recursoReservacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecursosReservacion> update(@PathVariable Long id, @RequestBody RecursosReservacion details) {
        return repository.findById(id).map(recursoReservacion -> {
            recursoReservacion.setRecurso(details.getRecurso());
            recursoReservacion.setReservacion(details.getReservacion());
            recursoReservacion.setCantidadAsignada(details.getCantidadAsignada());
            recursoReservacion.setActivo(details.getActivo());
            recursoReservacion.setCreadoPor(details.getCreadoPor());
            recursoReservacion.setCreadoEl(details.getCreadoEl());
            recursoReservacion.setActualizadoPor(details.getActualizadoPor());
            recursoReservacion.setActualizadoEl(details.getActualizadoEl());
            return ResponseEntity.ok(repository.save(recursoReservacion));
        }).orElse(ResponseEntity.notFound().build());
    }
}
