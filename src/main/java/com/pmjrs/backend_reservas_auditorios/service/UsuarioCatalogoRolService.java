package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoRol;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioCatalogoRolRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCatalogoRolService extends CatalogoService<UsuarioCatalogoRol> {

    public UsuarioCatalogoRolService(UsuarioCatalogoRolRepository repository) {
        super(repository);
    }
}
