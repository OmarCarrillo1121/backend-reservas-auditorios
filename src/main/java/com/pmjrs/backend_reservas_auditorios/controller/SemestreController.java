package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Semestre;
import com.pmjrs.backend_reservas_auditorios.repository.SemestreRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/semestres")
public class SemestreController {

    private final SemestreRepository semestreRepository;

    public SemestreController(SemestreRepository semestreRepository) {
        this.semestreRepository = semestreRepository;
    }

    @GetMapping
    public ResponseEntity<List<Semestre>> getAllSemestres() {
        List<Semestre> semestres = semestreRepository.findAll();
        return ResponseEntity.ok(semestres);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semestre> getSemestreById(@PathVariable Long id) {
        return semestreRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Semestre> createSemestre(@RequestBody Semestre semestre) {
        Semestre nuevoSemestre = semestreRepository.save(semestre);
        return ResponseEntity.ok(nuevoSemestre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Semestre> updateSemestre(@PathVariable Long id, @RequestBody Semestre semestreDetalles) {
        return semestreRepository.findById(id)
                .map(semestre -> {
                    semestre.setNombre_semestre(semestreDetalles.getNombre_semestre());
                    semestre.setAnio_semestre(semestreDetalles.getAnio_semestre());
                    semestre.setInicio_actividades(semestreDetalles.getInicio_actividades());
                    semestre.setFin_actividades(semestreDetalles.getFin_actividades());
                    semestre.setActivo(semestreDetalles.getActivo());
                    semestre.setActualizado_por(semestreDetalles.getActualizado_por());
                    semestre.setActualizado_el(semestreDetalles.getActualizado_el());
                    Semestre actualizado = semestreRepository.save(semestre);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteSemestre(@PathVariable Long id) {
    //     return semestreRepository.findById(id)
    //             .map(semestre -> {
    //                 semestreRepository.delete(semestre);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
