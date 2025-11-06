package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioArea;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioAreaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario_area")
public class UsuarioAreaController {

    private final UsuarioAreaRepository usuarioAreaRepository;

    public UsuarioAreaController(UsuarioAreaRepository usuarioAreaRepository) {
        this.usuarioAreaRepository = usuarioAreaRepository;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioArea>> getAllUsuarioAreas() {
        List<UsuarioArea> lista = usuarioAreaRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioArea> getUsuarioAreaById(@PathVariable Long id) {
        return usuarioAreaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioArea> createUsuarioArea(@RequestBody UsuarioArea usuarioArea) {
        UsuarioArea nuevo = usuarioAreaRepository.save(usuarioArea);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioArea> updateUsuarioArea(@PathVariable Long id, @RequestBody UsuarioArea detalles) {
        return usuarioAreaRepository.findById(id)
                .map(area -> {
                    area.setNombre_area(detalles.getNombre_area());
                    area.setActivo(detalles.getActivo());
                    area.setActualizado_por(detalles.getActualizado_por());
                    area.setActualizado_el(detalles.getActualizado_el());
                    UsuarioArea actualizado = usuarioAreaRepository.save(area);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUsuarioArea(@PathVariable Long id) {
    //     return usuarioAreaRepository.findById(id)
    //             .map(area -> {
    //                 usuarioAreaRepository.delete(area);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
