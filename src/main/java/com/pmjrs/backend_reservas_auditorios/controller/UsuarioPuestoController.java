package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioPuesto;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioPuestoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario_puesto")
public class UsuarioPuestoController {

    private final UsuarioPuestoRepository usuarioPuestoRepository;

    public UsuarioPuestoController(UsuarioPuestoRepository usuarioPuestoRepository) {
        this.usuarioPuestoRepository = usuarioPuestoRepository;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioPuesto>> getAllUsuarioPuestos() {
        List<UsuarioPuesto> lista = usuarioPuestoRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioPuesto> getUsuarioPuestoById(@PathVariable Long id) {
        return usuarioPuestoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioPuesto> createUsuarioPuesto(@RequestBody UsuarioPuesto usuarioPuesto) {
        UsuarioPuesto nuevo = usuarioPuestoRepository.save(usuarioPuesto);
        return ResponseEntity.ok(nuevo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioPuesto> updateUsuarioPuesto(@PathVariable Long id, @RequestBody UsuarioPuesto detalles) {
        return usuarioPuestoRepository.findById(id)
                .map(puesto -> {
                    puesto.setNombre_puesto(detalles.getNombre_puesto());
                    puesto.setActivo(detalles.getActivo());
                    puesto.setActualizado_por(detalles.getActualizado_por());
                    puesto.setActualizado_el(detalles.getActualizado_el());
                    UsuarioPuesto actualizado = usuarioPuestoRepository.save(puesto);
                    return ResponseEntity.ok(actualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Void> deleteUsuarioPuesto(@PathVariable Long id) {
    //     return usuarioPuestoRepository.findById(id)
    //             .map(puesto -> {
    //                 usuarioPuestoRepository.delete(puesto);
    //                 return ResponseEntity.noContent().build();
    //             })
    //             .orElse(ResponseEntity.notFound().build());
    // }
}
