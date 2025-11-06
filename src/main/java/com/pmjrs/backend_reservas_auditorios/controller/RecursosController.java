package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Recursos;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursosController {

    private final RecursosRepository recursosRepository;

    public RecursosController(RecursosRepository recursosRepository) {
        this.recursosRepository = recursosRepository;
    }

    @GetMapping
    public List<Recursos> getAllRecursos() {
        return recursosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recursos> getRecursoById(@PathVariable Long id) {
        return recursosRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Recursos createRecurso(@RequestBody Recursos recurso) {
        return recursosRepository.save(recurso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recursos> updateRecurso(@PathVariable Long id, @RequestBody Recursos recursoDetails) {
        return recursosRepository.findById(id)
                .map(recurso -> {
                    recurso.setId_recurso_catalogo(recursoDetails.getId_recurso_catalogo());
                    recurso.setId_area(recursoDetails.getId_area());
                    recurso.setActivo(recursoDetails.getActivo());
                    recurso.setActualizado_por(recursoDetails.getActualizado_por());
                    recurso.setActualizado_el(recursoDetails.getActualizado_el());
                    return ResponseEntity.ok(recursosRepository.save(recurso));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecurso(@PathVariable Long id) {
        if (recursosRepository.existsById(id)) {
            recursosRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
