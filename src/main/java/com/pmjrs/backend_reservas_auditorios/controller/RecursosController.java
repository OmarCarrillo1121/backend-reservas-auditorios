package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Recursos;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recursos")
public class RecursosController {

    @Autowired
    private RecursosRepository recursosRepository;

    @GetMapping
    public List<Recursos> getAll() {
        return recursosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recursos> getById(@PathVariable Long id) {
        Optional<Recursos> recurso = recursosRepository.findById(id);
        return recurso.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Recursos create(@RequestBody Recursos recurso) {
        return recursosRepository.save(recurso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recursos> update(@PathVariable Long id, @RequestBody Recursos recursoDetails) {
        return recursosRepository.findById(id).map(recurso -> {
            recurso.setRecurso_catalogo(recursoDetails.getRecurso_catalogo());
            recurso.setArea(recursoDetails.getArea());
            recurso.setActivo(recursoDetails.getActivo());
            recurso.setCreado_por(recursoDetails.getCreado_por());
            recurso.setCreado_el(recursoDetails.getCreado_el());
            recurso.setActualizado_por(recursoDetails.getActualizado_por());
            recurso.setActualizado_el(recursoDetails.getActualizado_el());
            return ResponseEntity.ok(recursosRepository.save(recurso));
        }).orElse(ResponseEntity.notFound().build());
    }
}
