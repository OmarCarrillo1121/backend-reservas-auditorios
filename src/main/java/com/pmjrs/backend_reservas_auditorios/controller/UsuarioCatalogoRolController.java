package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.mapper.CatalogoMapper;
import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoRol;
import com.pmjrs.backend_reservas_auditorios.service.UsuarioCatalogoRolService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogos/roles")
public class UsuarioCatalogoRolController extends CatalogoController<UsuarioCatalogoRol> {

    public UsuarioCatalogoRolController(UsuarioCatalogoRolService service, CatalogoMapper mapper) {
        super(service, mapper);
    }
}
