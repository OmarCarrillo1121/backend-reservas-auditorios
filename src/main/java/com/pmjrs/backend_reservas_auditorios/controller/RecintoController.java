package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Recinto;
import com.pmjrs.backend_reservas_auditorios.repository.RecintoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recintos")
public class RecintoController {

    @Autowired
    private RecintoRepository recintoRepository;

    // Obtener todos los recintos
    @GetMapping
    public List<Recinto> getAllRecintos() {
        return recintoRepository.findAll();
    }

    // Obtener recinto por id
    @GetMapping("/{id}")
    public ResponseEntity<Recinto> getRecintoById(@PathVariable Long id) {
        Optional<Recinto> recinto = recintoRepository.findById(id);
        if (recinto.isPresent()) {
            return ResponseEntity.ok(recinto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear un nuevo recinto
    @PostMapping
    public Recinto createRecinto(@RequestBody Recinto recinto) {
        return recintoRepository.save(recinto);
    }

    // Actualizar un recinto existente
    @PutMapping("/{id}")
    public ResponseEntity<Recinto> updateRecinto(@PathVariable Long id, @RequestBody Recinto recintoDetails) {
        return recintoRepository.findById(id).map(recinto -> {
            recinto.setNombreRecinto(recintoDetails.getNombreRecinto());
            recinto.setUbicacionRecinto(recintoDetails.getUbicacionRecinto());
            recinto.setEdificioRecinto(recintoDetails.getEdificioRecinto());
            recinto.setCapacidad(recintoDetails.getCapacidad());
            recinto.setActivo(recintoDetails.getActivo());
            recinto.setActualizadoPor(recintoDetails.getActualizadoPor());
            recinto.setActualizadoEl(recintoDetails.getActualizadoEl());
            Recinto updatedRecinto = recintoRepository.save(recinto);
            return ResponseEntity.ok(updatedRecinto);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Eliminar un recinto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecinto(@PathVariable Long id) {
        return recintoRepository.findById(id).map(recinto -> {
            recintoRepository.delete(recinto);
            return ResponseEntity.noContent().<Void>build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
