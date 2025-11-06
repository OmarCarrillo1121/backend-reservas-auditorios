package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecintoEquipamiento;
import com.pmjrs.backend_reservas_auditorios.repository.RecintoEquipamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recinto-equipamientos-rel")
@CrossOrigin(origins = "*")
public class RecintoEquipamientoController {

    @Autowired
    private RecintoEquipamientoRepository repository;

    @GetMapping
    public ResponseEntity<List<RecintoEquipamiento>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecintoEquipamiento> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RecintoEquipamiento> create(@RequestBody RecintoEquipamiento entity) {
        return ResponseEntity.status(201).body(repository.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecintoEquipamiento> update(@PathVariable Long id, @RequestBody RecintoEquipamiento entity) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setRecinto(entity.getRecinto());
                    existing.setEquipamiento(entity.getEquipamiento());
                    existing.setActivo(entity.getActivo());
                    existing.setActualizadoPor(entity.getActualizadoPor());
                    existing.setActualizadoEl(entity.getActualizadoEl());
                    return ResponseEntity.ok(repository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return repository.findById(id)
                .map(existing -> {
                    repository.delete(existing);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
