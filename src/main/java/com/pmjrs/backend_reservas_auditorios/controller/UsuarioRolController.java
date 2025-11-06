package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioRol;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario-rol")
public class UsuarioRolController {

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @GetMapping
    public List<UsuarioRol> getAllRoles() {
        return usuarioRolRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioRol> getRolById(@PathVariable Long id) {
        return usuarioRolRepository.findById(id);
    }

    @PostMapping
    public UsuarioRol createRol(@RequestBody UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    @PutMapping("/{id}")
    public UsuarioRol updateRol(@PathVariable Long id, @RequestBody UsuarioRol usuarioRol) {
        usuarioRol.setIdUsuarioRol(id);
        return usuarioRolRepository.save(usuarioRol);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Long id) {
        usuarioRolRepository.deleteById(id);
    }
}
