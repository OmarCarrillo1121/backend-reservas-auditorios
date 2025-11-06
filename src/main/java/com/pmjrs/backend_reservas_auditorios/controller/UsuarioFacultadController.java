package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioFacultad;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioFacultadRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario_facultad")
public class UsuarioFacultadController {

    private final UsuarioFacultadRepository usuarioFacultadRepository;

    public UsuarioFacultadController(UsuarioFacultadRepository usuarioFacultadRepository) {
        this.usuarioFacultadRepository = usuarioFacultadRepository;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioFacultad>> getAllUsuarioFacultades() {
        List<UsuarioFacultad> lista = usuarioFacultadRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioFacultad> getUsuarioFacultadById(@PathVariable Long id) {
        return usuarioFacultadRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioFacultad> createUsuarioFacultad(@RequestBody UsuarioFacultad usuarioFacultad) {
        UsuarioFacultad nuevo = usuarioFacultadRepository.save(usuarioFacultad);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioFacultad> updateUsuarioFacultad(@PathVariable Long id, @RequestBody UsuarioFacultad detalles) {
        return usuarioFacultadRepository.findById(id)
                .map(facultad -> {
                    facultad.setNombre_facultad(detalles.getNombre_facultad());
                    facultad.setActivo(detalles.getActivo());
                    facultad.setActualizado_por(detalles.getActualizado_por());
                    facultad.setActualizado_el(detalles.getActualizado_el());
                    UsuarioFacultad actualizado = usuarioFacultadRepository.save(facultad);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUsuarioFacultad(@PathVariable Long id) {
    //     return usuarioFacultadRepository.findById(id)
    //             .map(facultad -> {
    //                 usuarioFacultadRepository.delete(facultad);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
