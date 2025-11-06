package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.SemestreEvento;
import com.pmjrs.backend_reservas_auditorios.repository.SemestreEventoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/semestre_eventos")
public class SemestreEventoController {

    private final SemestreEventoRepository semestreEventosRepository;

    public SemestreEventoController(SemestreEventoRepository semestreEventosRepository) {
        this.semestreEventosRepository = semestreEventosRepository;
    }

    @GetMapping
    public ResponseEntity<List<SemestreEvento>> getAllSemestreEventos() {
        List<SemestreEvento> lista = semestreEventosRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SemestreEvento> getSemestreEventoById(@PathVariable Long id) {
        return semestreEventosRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<SemestreEvento> createSemestreEvento(@RequestBody SemestreEvento evento) {
        SemestreEvento nuevo = semestreEventosRepository.save(evento);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SemestreEvento> updateSemestreEvento(@PathVariable Long id, @RequestBody SemestreEvento detalles) {
        return semestreEventosRepository.findById(id)
                .map(evento -> {
                    evento.setId_semestre(detalles.getId_semestre());
                    evento.setId_evento(detalles.getId_evento());
                    evento.setDia_evento(detalles.getDia_evento());
                    evento.setActivo(detalles.getActivo());
                    evento.setActualizado_por(detalles.getActualizado_por());
                    evento.setActualizado_el(detalles.getActualizado_el());
                    SemestreEvento actualizado = semestreEventosRepository.save(evento);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteSemestreEvento(@PathVariable Long id) {
    //     return semestreEventosRepository.findById(id)
    //             .map(evento -> {
    //                 semestreEventosRepository.delete(evento);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
