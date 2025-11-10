package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.mapper.CatalogoMapper;
import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoFacultad;
import com.pmjrs.backend_reservas_auditorios.service.UsuarioCatalogoFacultadService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogos/facultades")
public class UsuarioCatalogoFacultadController extends CatalogoController<UsuarioCatalogoFacultad> {

    public UsuarioCatalogoFacultadController(UsuarioCatalogoFacultadService service, CatalogoMapper mapper) {
        super(service, mapper);
    }
}
