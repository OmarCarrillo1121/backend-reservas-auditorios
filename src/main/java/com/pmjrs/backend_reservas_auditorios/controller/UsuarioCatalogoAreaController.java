package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.mapper.CatalogoMapper;
import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoArea;
import com.pmjrs.backend_reservas_auditorios.service.UsuarioCatalogoAreaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogos/areas")
public class UsuarioCatalogoAreaController extends CatalogoController<UsuarioCatalogoArea> {

    public UsuarioCatalogoAreaController(UsuarioCatalogoAreaService service, CatalogoMapper mapper) {
        super(service, mapper);
    }
}
