package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.mapper.CatalogoMapper;
import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoPuesto;
import com.pmjrs.backend_reservas_auditorios.service.UsuarioCatalogoPuestoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/catalogos/puestos")
public class UsuarioCatalogoPuestoController extends CatalogoController<UsuarioCatalogoPuesto> {

    public UsuarioCatalogoPuestoController(UsuarioCatalogoPuestoService service, CatalogoMapper mapper) {
        super(service, mapper);
    }
}
