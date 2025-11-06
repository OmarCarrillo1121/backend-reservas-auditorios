package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.PonenteSemblanza;
import com.pmjrs.backend_reservas_auditorios.repository.PonenteSemblanzaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ponentes-semblanza")
public class PonenteSemblanzaController {

    private final PonenteSemblanzaRepository ponenteSemblanzaRepository;

    public PonenteSemblanzaController(PonenteSemblanzaRepository ponenteSemblanzaRepository) {
        this.ponenteSemblanzaRepository = ponenteSemblanzaRepository;
    }

    @GetMapping
    public ResponseEntity<List<PonenteSemblanza>> getAllPonenteSemblanzas() {
        return ResponseEntity.ok(ponenteSemblanzaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PonenteSemblanza> getPonenteSemblanzaById(@PathVariable Long id) {
        return ponenteSemblanzaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PonenteSemblanza> createPonenteSemblanza(@RequestBody PonenteSemblanza ponenteSemblanza) {
        return ResponseEntity.ok(ponenteSemblanzaRepository.save(ponenteSemblanza));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PonenteSemblanza> updatePonenteSemblanza(@PathVariable Long id, @RequestBody PonenteSemblanza semblanzaDetails) {
        return ponenteSemblanzaRepository.findById(id)
                .map(semblanza -> {
                    semblanza.setPonente(semblanzaDetails.getPonente());
                    semblanza.setNombreArchivo(semblanzaDetails.getNombreArchivo());
                    semblanza.setRutaArchivo(semblanzaDetails.getRutaArchivo());
                    semblanza.setActivo(semblanzaDetails.getActivo());
                    semblanza.setActualizadoPor(semblanzaDetails.getActualizadoPor());
                    semblanza.setActualizadoEl(semblanzaDetails.getActualizadoEl());
                    return ResponseEntity.ok(ponenteSemblanzaRepository.save(semblanza));
                })
                .orElse(ResponseEntity.notFound().build());
    }

}
