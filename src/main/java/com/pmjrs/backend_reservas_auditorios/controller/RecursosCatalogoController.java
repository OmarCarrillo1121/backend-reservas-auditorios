package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecursosCatalogo;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosCatalogoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos-catalogo")
public class RecursosCatalogoController {

    private final RecursosCatalogoRepository recursosCatalogoRepository;

    public RecursosCatalogoController(RecursosCatalogoRepository recursosCatalogoRepository) {
        this.recursosCatalogoRepository = recursosCatalogoRepository;
    }

    @GetMapping
    public List<RecursosCatalogo> getAllRecursos() {
        return recursosCatalogoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursosCatalogo> getRecursoById(@PathVariable Long id) {
        return recursosCatalogoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RecursosCatalogo createRecurso(@RequestBody RecursosCatalogo recurso) {
        return recursosCatalogoRepository.save(recurso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecursosCatalogo> updateRecurso(@PathVariable Long id, @RequestBody RecursosCatalogo recursoDetails) {
        return recursosCatalogoRepository.findById(id)
                .map(recurso -> {
                    recurso.setNombreRecurso(recursoDetails.getNombreRecurso());
                    recurso.setDescripcionRecurso(recursoDetails.getDescripcionRecurso());
                    recurso.setActivo(recursoDetails.getActivo());
                    return ResponseEntity.ok(recursosCatalogoRepository.save(recurso));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecurso(@PathVariable Long id) {
        if (recursosCatalogoRepository.existsById(id)) {
            recursosCatalogoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
