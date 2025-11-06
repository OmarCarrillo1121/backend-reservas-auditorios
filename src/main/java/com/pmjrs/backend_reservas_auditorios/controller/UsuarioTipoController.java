package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioTipo;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioTipoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario_tipo")
public class UsuarioTipoController {

    private final UsuarioTipoRepository usuarioTipoRepository;

    public UsuarioTipoController(UsuarioTipoRepository usuarioTipoRepository) {
        this.usuarioTipoRepository = usuarioTipoRepository;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioTipo>> getAllUsuarioTipos() {
        List<UsuarioTipo> lista = usuarioTipoRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioTipo> getUsuarioTipoById(@PathVariable Long id) {
        return usuarioTipoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioTipo> createUsuarioTipo(@RequestBody UsuarioTipo usuarioTipo) {
        UsuarioTipo nuevo = usuarioTipoRepository.save(usuarioTipo);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioTipo> updateUsuarioTipo(@PathVariable Long id, @RequestBody UsuarioTipo detalles) {
        return usuarioTipoRepository.findById(id)
                .map(tipo -> {
                    tipo.setNombre_tipo(detalles.getNombre_tipo());
                    tipo.setActivo(detalles.getActivo());
                    tipo.setActualizado_por(detalles.getActualizado_por());
                    tipo.setActualizado_el(detalles.getActualizado_el());
                    UsuarioTipo actualizado = usuarioTipoRepository.save(tipo);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUsuarioTipo(@PathVariable Long id) {
    //     return usuarioTipoRepository.findById(id)
    //             .map(tipo -> {
    //                 usuarioTipoRepository.delete(tipo);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
