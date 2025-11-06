package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioArea;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario-area")
public class UsuarioAreaController {

    @Autowired
    private UsuarioAreaRepository repository;

    @GetMapping
    public List<UsuarioArea> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioArea> getById(@PathVariable Long id) {
        Optional<UsuarioArea> usuarioArea = repository.findById(id);
        return usuarioArea.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UsuarioArea create(@RequestBody UsuarioArea usuarioArea) {
        return repository.save(usuarioArea);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioArea> update(@PathVariable Long id, @RequestBody UsuarioArea details) {
        return repository.findById(id).map(usuarioArea -> {
            usuarioArea.setNombreArea(details.getNombreArea());
            usuarioArea.setActivo(details.getActivo());
            usuarioArea.setCreadoPor(details.getCreadoPor());
            usuarioArea.setCreadoEl(details.getCreadoEl());
            usuarioArea.setActualizadoPor(details.getActualizadoPor());
            usuarioArea.setActualizadoEl(details.getActualizadoEl());
            return ResponseEntity.ok(repository.save(usuarioArea));
        }).orElse(ResponseEntity.notFound().build());
    }
}
