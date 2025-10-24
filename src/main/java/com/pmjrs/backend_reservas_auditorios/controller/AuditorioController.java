package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Auditorio;
import com.pmjrs.backend_reservas_auditorios.repository.AuditorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditorios")
public class AuditorioController {

    @Autowired
    private AuditorioRepository auditorioRepository;

    @GetMapping
    public List<Auditorio> getAllAuditorios() {
        return auditorioRepository.findAll();
    }

    @PostMapping
    public Auditorio createAuditorio(@RequestBody Auditorio auditorio) {
        return auditorioRepository.save(auditorio);
    }

    @GetMapping("/{id}")
    public Auditorio getAuditorioById(@PathVariable Long id) {
        return auditorioRepository.findById(id).orElse(null);
    }
}
