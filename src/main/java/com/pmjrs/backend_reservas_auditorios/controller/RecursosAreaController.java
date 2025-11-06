package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.RecursosArea;
import com.pmjrs.backend_reservas_auditorios.repository.RecursosAreaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/recursos-area")
public class RecursosAreaController {

    private final RecursosAreaRepository recursosAreaRepository;

    public RecursosAreaController(RecursosAreaRepository recursosAreaRepository) {
        this.recursosAreaRepository = recursosAreaRepository;
    }

    @GetMapping
    public List<RecursosArea> getAllAreas() {
        return recursosAreaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursosArea> getAreaById(@PathVariable Long id) {
        return recursosAreaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public RecursosArea createArea(@RequestBody RecursosArea area) {
        return recursosAreaRepository.save(area);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecursosArea> updateArea(@PathVariable Long id, @RequestBody RecursosArea areaDetails) {
        return recursosAreaRepository.findById(id)
                .map(area -> {
                    area.setNombre_area(areaDetails.getNombre_area());
                    area.setUbicacion_area(areaDetails.getUbicacion_area());
                    area.setResponsable_area(areaDetails.getResponsable_area());
                    area.setCorreo_contacto(areaDetails.getCorreo_contacto());
                    area.setNumero_contacto(areaDetails.getNumero_contacto());
                    area.setActivo(areaDetails.getActivo());
                    return ResponseEntity.ok(recursosAreaRepository.save(area));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArea(@PathVariable Long id) {
        if (recursosAreaRepository.existsById(id)) {
            recursosAreaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
