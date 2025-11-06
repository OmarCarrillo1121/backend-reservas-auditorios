package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.LoginHistorial;
import com.pmjrs.backend_reservas_auditorios.repository.LoginHistorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/login-historial")
public class LoginHistorialController {

    @Autowired
    private LoginHistorialRepository loginHistorialRepository;

    // Obtener todos los registros
    @GetMapping
    public List<LoginHistorial> getAll() {
        return loginHistorialRepository.findAll();
    }

    // Obtener un registro por ID
    @GetMapping("/{id}")
    public ResponseEntity<LoginHistorial> getById(@PathVariable Long id) {
        Optional<LoginHistorial> loginHistorial = loginHistorialRepository.findById(id);
        return loginHistorial.map(ResponseEntity::ok)
                             .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear un nuevo registro
    @PostMapping
    public ResponseEntity<LoginHistorial> create(@RequestBody LoginHistorial nuevoLogin) {
        LoginHistorial guardado = loginHistorialRepository.save(nuevoLogin);
        return ResponseEntity.ok(guardado);
    }

    // Actualizar un registro existente
    @PutMapping("/{id}")
    public ResponseEntity<LoginHistorial> update(@PathVariable Long id, @RequestBody LoginHistorial detalles) {
        return loginHistorialRepository.findById(id)
                .map(existing -> {
                    existing.setIdUsuario(detalles.getIdUsuario());
                    existing.setCreadoPor(detalles.getCreadoPor());
                    existing.setCreadoEl(detalles.getCreadoEl());
                    existing.setActualizadoPor(detalles.getActualizadoPor());
                    existing.setActualizadoEl(detalles.getActualizadoEl());
                    LoginHistorial actualizado = loginHistorialRepository.save(existing);
                    return ResponseEntity.ok(actualizado);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
