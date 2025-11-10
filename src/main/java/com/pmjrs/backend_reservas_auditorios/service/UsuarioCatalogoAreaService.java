package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoArea;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioCatalogoAreaRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioCatalogoAreaService extends CatalogoService<UsuarioCatalogoArea> {

    public UsuarioCatalogoAreaService(UsuarioCatalogoAreaRepository repository) {
        super(repository);
    }
}
