package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.CatalogoBase;
import com.pmjrs.backend_reservas_auditorios.repository.CatalogoRepository;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Transactional
public abstract class CatalogoService<T extends CatalogoBase> {

    protected final CatalogoRepository<T> repository;

    protected CatalogoService(CatalogoRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll().stream()
                .filter(c -> c.getActivo() != null && c.getActivo() == 1)
                .toList();
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id)
                .filter(c -> c.getActivo() != null && c.getActivo() == 1);
    }

    public T create(T entity) {
        entity.setActivo(1);
        entity.setCreadoEl(LocalDate.now());
        return repository.save(entity);
    }

    public T update(Long id, T datos) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setNombre(datos.getNombre());
                    existing.setDescripcion(datos.getDescripcion());
                    existing.setColor(datos.getColor());
                    existing.setUltimaActualizacionPor(datos.getUltimaActualizacionPor());
                    existing.setUltimaActualizacionEl(LocalDate.now());
                    return repository.save(existing);
                })
                .orElse(null);
    }

    public boolean softDelete(Long id, Integer actualizadoPor) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setActivo(0);
                    existing.setUltimaActualizacionPor(actualizadoPor);
                    existing.setUltimaActualizacionEl(LocalDate.now());
                    repository.save(existing);
                    return true;
                })
                .orElse(false);
    }
}
