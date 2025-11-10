package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoPuesto;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioCatalogoPuestoRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCatalogoPuestoService extends CatalogoService<UsuarioCatalogoPuesto> {

    public UsuarioCatalogoPuestoService(UsuarioCatalogoPuestoRepository repository) {
        super(repository);
    }
}
