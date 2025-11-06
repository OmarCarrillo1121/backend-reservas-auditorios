package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Recinto;
import com.pmjrs.backend_reservas_auditorios.repository.RecintoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recintos")
@CrossOrigin(origins = "*")
public class RecintoController {

    @Autowired
    private RecintoRepository recintoRepository;

    @GetMapping
    public ResponseEntity<List<Recinto>> getAllRecintos() {
        List<Recinto> recintos = recintoRepository.findAll();
        return ResponseEntity.ok(recintos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recinto> getRecintoById(@PathVariable Long id) {
        return recintoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Recinto> createRecinto(@RequestBody Recinto recinto) {
        Recinto savedRecinto = recintoRepository.save(recinto);
        return ResponseEntity.status(201).body(savedRecinto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recinto> updateRecinto(@PathVariable Long id, @RequestBody Recinto recintoDetails) {
        return recintoRepository.findById(id)
                .map(recinto -> {
                    recinto.setNombre(recintoDetails.getNombre());
                    recinto.setUbicacion(recintoDetails.getUbicacion());
                    recinto.setEdificio(recintoDetails.getEdificio());
                    recinto.setCapacidad(recintoDetails.getCapacidad());
                    Recinto updatedRecinto = recintoRepository.save(recinto);
                    return ResponseEntity.ok(updatedRecinto);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecinto(@PathVariable Long id) {
        return recintoRepository.findById(id)
                .map(recinto -> {
                    recintoRepository.delete(recinto);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}

