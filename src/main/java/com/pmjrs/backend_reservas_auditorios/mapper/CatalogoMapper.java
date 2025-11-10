package com.pmjrs.backend_reservas_auditorios.mapper;

import com.pmjrs.backend_reservas_auditorios.dto.*;
import com.pmjrs.backend_reservas_auditorios.model.CatalogoBase;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CatalogoMapper {

    public <T extends CatalogoBase> T toEntity(CatalogoRequestDTO dto, T entity) {
        entity.setNombre(dto.nombre());
        entity.setDescripcion(dto.descripcion());
        entity.setColor(dto.color());
        entity.setActivo(1);
        entity.setCreadoPor(dto.creadoPor());
        entity.setCreadoEl(LocalDate.now());
        return entity;
    }

    public CatalogoResponseDTO toDTO(CatalogoBase entity) {
        return new CatalogoResponseDTO(
                entity.getId(),
                entity.getNombre(),
                entity.getDescripcion(),
                entity.getColor(),
                entity.getActivo(),
                entity.getCreadoPor(),
                entity.getCreadoEl(),
                entity.getUltimaActualizacionPor(),
                entity.getUltimaActualizacionEl()
        );
    }
}
