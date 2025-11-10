package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.dto.*;
import com.pmjrs.backend_reservas_auditorios.mapper.CatalogoMapper;
import com.pmjrs.backend_reservas_auditorios.model.CatalogoBase;
import com.pmjrs.backend_reservas_auditorios.service.CatalogoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CatalogoController<T extends CatalogoBase> {

    protected final CatalogoService<T> service;
    protected final CatalogoMapper mapper;

    protected CatalogoController(CatalogoService<T> service, CatalogoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<CatalogoResponseDTO>> getAll() {
        List<CatalogoResponseDTO> list = service.findAll().stream()
                .map(mapper::toDTO)
                .toList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatalogoResponseDTO> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(mapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CatalogoResponseDTO> create(@RequestBody CatalogoRequestDTO dto, T entity) {
        T created = service.create(mapper.toEntity(dto, entity));
        return ResponseEntity.ok(mapper.toDTO(created));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CatalogoResponseDTO> update(@PathVariable Long id, @RequestBody CatalogoRequestDTO dto, T entity) {
        T updated = mapper.toEntity(dto, entity);
        T saved = service.update(id, updated);
        return saved != null ? ResponseEntity.ok(mapper.toDTO(saved)) : ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}/delete")
    public ResponseEntity<Void> softDelete(@PathVariable Long id, @RequestParam Integer usuario) {
        boolean deleted = service.softDelete(id, usuario);
        return deleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
