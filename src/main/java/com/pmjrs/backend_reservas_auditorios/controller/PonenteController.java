package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Ponente;
import com.pmjrs.backend_reservas_auditorios.repository.PonenteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ponentes")
public class PonenteController {

    private final PonenteRepository ponenteRepository;

    public PonenteController(PonenteRepository ponenteRepository) {
        this.ponenteRepository = ponenteRepository;
    }

    @GetMapping
    public ResponseEntity<List<Ponente>> getAllPonentes() {
        return ResponseEntity.ok(ponenteRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ponente> getPonenteById(@PathVariable Long id) {
        return ponenteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ponente> createPonente(@RequestBody Ponente ponente) {
        return ResponseEntity.ok(ponenteRepository.save(ponente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ponente> updatePonente(@PathVariable Long id, @RequestBody Ponente ponenteDetails) {
        return ponenteRepository.findById(id)
                .map(ponente -> {
                    ponente.setNombrePonente(ponenteDetails.getNombrePonente());
                    ponente.setGradoPonente(ponenteDetails.getGradoPonente());
                    ponente.setTipoPonente(ponenteDetails.getTipoPonente());
                    ponente.setActivo(ponenteDetails.getActivo());
                    ponente.setActualizadoPor(ponenteDetails.getActualizadoPor());
                    ponente.setActualizadoEl(ponenteDetails.getActualizadoEl());
                    return ResponseEntity.ok(ponenteRepository.save(ponente));
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
