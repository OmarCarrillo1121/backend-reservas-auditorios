package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.PonenteTipo;
import com.pmjrs.backend_reservas_auditorios.repository.PonenteTipoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ponentes-tipo")
public class PonenteTipoController {

    private final PonenteTipoRepository ponenteTipoRepository;

    public PonenteTipoController(PonenteTipoRepository ponenteTipoRepository) {
        this.ponenteTipoRepository = ponenteTipoRepository;
    }

    @GetMapping
    public ResponseEntity<List<PonenteTipo>> getAllPonenteTipos() {
        return ResponseEntity.ok(ponenteTipoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PonenteTipo> getPonenteTipoById(@PathVariable Long id) {
        return ponenteTipoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PonenteTipo> createPonenteTipo(@RequestBody PonenteTipo ponenteTipo) {
        return ResponseEntity.ok(ponenteTipoRepository.save(ponenteTipo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PonenteTipo> updatePonenteTipo(@PathVariable Long id, @RequestBody PonenteTipo tipoDetails) {
        return ponenteTipoRepository.findById(id)
                .map(tipo -> {
                    tipo.setNombreTipoPonente(tipoDetails.getNombreTipoPonente());
                    tipo.setActivo(tipoDetails.getActivo());
                    tipo.setActualizadoPor(tipoDetails.getActualizadoPor());
                    tipo.setActualizadoEl(tipoDetails.getActualizadoEl());
                    return ResponseEntity.ok(ponenteTipoRepository.save(tipo));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
