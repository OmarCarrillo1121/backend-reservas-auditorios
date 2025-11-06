package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecintoEquipamientoCatalogo;
import com.pmjrs.backend_reservas_auditorios.repository.RecintoEquipamientoCatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recinto-equipamientos")
@CrossOrigin(origins = "*")
public class RecintoEquipamientoCatalogoController {

    @Autowired
    private RecintoEquipamientoCatalogoRepository repository;

    @GetMapping
    public ResponseEntity<List<RecintoEquipamientoCatalogo>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecintoEquipamientoCatalogo> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RecintoEquipamientoCatalogo> create(@RequestBody RecintoEquipamientoCatalogo entity) {
        return ResponseEntity.status(201).body(repository.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecintoEquipamientoCatalogo> update(@PathVariable Long id, @RequestBody RecintoEquipamientoCatalogo entity) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setNombreEquipamiento(entity.getNombreEquipamiento());
                    existing.setDescripcionEquipamiento(entity.getDescripcionEquipamiento());
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
