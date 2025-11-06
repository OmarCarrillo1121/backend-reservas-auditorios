package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecintoImagen;
import com.pmjrs.backend_reservas_auditorios.repository.RecintoImagenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recinto-imagenes")
@CrossOrigin(origins = "*")
public class RecintoImagenController {

    @Autowired
    private RecintoImagenRepository repository;

    @GetMapping
    public ResponseEntity<List<RecintoImagen>> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecintoImagen> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<RecintoImagen> create(@RequestBody RecintoImagen entity) {
        return ResponseEntity.status(201).body(repository.save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecintoImagen> update(@PathVariable Long id, @RequestBody RecintoImagen entity) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setRecinto(entity.getRecinto());
                    existing.setRutaImagen(entity.getRutaImagen());
                    existing.setNombreArchivo(entity.getNombreArchivo());
                    existing.setTamanioArchivo(entity.getTamanioArchivo());
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
