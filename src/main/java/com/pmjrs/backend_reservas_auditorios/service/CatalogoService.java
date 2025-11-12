package com.pmjrs.backend_reservas_auditorios.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public abstract class CatalogoService<T> {

    protected final JpaRepository<T, Long> repository;

    protected CatalogoService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    // --- Métodos básicos ---
    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // --- Métodos usados por CatalogoController ---
    @Transactional
    public T create(T entity) {
        return repository.save(entity);
    }

    @Transactional
    public T update(Long id, T entity) {
        if (repository.existsById(id)) {
            return repository.save(entity);
        }
        return null;
    }

    @Transactional
    public boolean softDelete(Long id, Integer usuario) {
        Optional<T> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()) {
            T entity = optionalEntity.get();

            try {
                // Intenta establecer los campos comunes de borrado si existen
                entity.getClass().getMethod("setActivo", Integer.class).invoke(entity, 0);
                entity.getClass().getMethod("setUltimaActualizacionPor", Integer.class).invoke(entity, usuario);
                entity.getClass().getMethod("setUltimaActualizacionEl", LocalDate.class).invoke(entity, LocalDate.now());
            } catch (Exception e) {
                // Ignora si el método no existe (para catálogos simples)
            }

            repository.save(entity);
            return true;
        }
        return false;
    }
}


// package com.pmjrs.backend_reservas_auditorios.service;

// import com.pmjrs.backend_reservas_auditorios.model.CatalogoBase;
// import com.pmjrs.backend_reservas_auditorios.repository.CatalogoRepository;
// import org.springframework.transaction.annotation.Transactional;
// import java.time.LocalDate;
// import java.util.List;
// import java.util.Optional;

// @Transactional
// public abstract class CatalogoService<T extends CatalogoBase> {

//     protected final CatalogoRepository<T> repository;

//     protected CatalogoService(CatalogoRepository<T> repository) {
//         this.repository = repository;
//     }

//     public List<T> findAll() {
//         return repository.findAll().stream()
//                 .filter(c -> c.getActivo() != null && c.getActivo() == 1)
//                 .toList();
//     }

//     public Optional<T> findById(Long id) {
//         return repository.findById(id)
//                 .filter(c -> c.getActivo() != null && c.getActivo() == 1);
//     }

//     public T create(T entity) {
//         entity.setActivo(1);
//         entity.setCreadoEl(LocalDate.now());
//         return repository.save(entity);
//     }

//     public T update(Long id, T datos) {
//         return repository.findById(id)
//                 .map(existing -> {
//                     existing.setNombre(datos.getNombre());
//                     existing.setDescripcion(datos.getDescripcion());
//                     existing.setColor(datos.getColor());
//                     existing.setUltimaActualizacionPor(datos.getUltimaActualizacionPor());
//                     existing.setUltimaActualizacionEl(LocalDate.now());
//                     return repository.save(existing);
//                 })
//                 .orElse(null);
//     }

//     public boolean softDelete(Long id, Integer actualizadoPor) {
//         return repository.findById(id)
//                 .map(existing -> {
//                     existing.setActivo(0);
//                     existing.setUltimaActualizacionPor(actualizadoPor);
//                     existing.setUltimaActualizacionEl(LocalDate.now());
//                     repository.save(existing);
//                     return true;
//                 })
//                 .orElse(false);
//     }
// }
