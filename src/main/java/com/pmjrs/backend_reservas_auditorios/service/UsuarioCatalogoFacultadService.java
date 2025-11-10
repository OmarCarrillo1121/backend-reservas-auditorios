package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoFacultad;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioCatalogoFacultadRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCatalogoFacultadService extends CatalogoService<UsuarioCatalogoFacultad> {

    public UsuarioCatalogoFacultadService(UsuarioCatalogoFacultadRepository repository) {
        super(repository);
    }
}
