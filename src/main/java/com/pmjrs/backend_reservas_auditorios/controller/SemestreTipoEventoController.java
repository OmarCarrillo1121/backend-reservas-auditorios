package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.SemestreTipoEvento;
import com.pmjrs.backend_reservas_auditorios.repository.SemestreTipoEventoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/semestre_tipo_evento")
public class SemestreTipoEventoController {

    private final SemestreTipoEventoRepository semestreTipoEventoRepository;

    public SemestreTipoEventoController(SemestreTipoEventoRepository semestreTipoEventoRepository) {
        this.semestreTipoEventoRepository = semestreTipoEventoRepository;
    }

    @GetMapping
    public ResponseEntity<List<SemestreTipoEvento>> getAllSemestreTipoEvento() {
        List<SemestreTipoEvento> lista = semestreTipoEventoRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SemestreTipoEvento> getSemestreTipoEventoById(@PathVariable Long id) {
        return semestreTipoEventoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SemestreTipoEvento> createSemestreTipoEvento(@RequestBody SemestreTipoEvento tipoEvento) {
        SemestreTipoEvento nuevo = semestreTipoEventoRepository.save(tipoEvento);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SemestreTipoEvento> updateSemestreTipoEvento(@PathVariable Long id, @RequestBody SemestreTipoEvento detalles) {
        return semestreTipoEventoRepository.findById(id)
                .map(tipo -> {
                    tipo.setNombre_tipo_evento(detalles.getNombre_tipo_evento());
                    tipo.setColor_evento(detalles.getColor_evento());
                    tipo.setActivo(detalles.getActivo());
                    tipo.setActualizado_por(detalles.getActualizado_por());
                    tipo.setActualizado_el(detalles.getActualizado_el());
                    SemestreTipoEvento actualizado = semestreTipoEventoRepository.save(tipo);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteSemestreTipoEvento(@PathVariable Long id) {
    //     return semestreTipoEventoRepository.findById(id)
    //             .map(tipo -> {
    //                 semestreTipoEventoRepository.delete(tipo);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
