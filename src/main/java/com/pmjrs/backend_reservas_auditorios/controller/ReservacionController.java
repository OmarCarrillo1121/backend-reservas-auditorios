package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.Reservacion;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionRepository;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservaciones")
public class ReservacionController {

    @Autowired
    private ReservacionRepository reservacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Reservacion> getAllReservaciones() {
        return reservacionRepository.findAll();
    }

    @PostMapping
    public Reservacion createReservacion(@RequestBody Reservacion reservacion) {
        return reservacionRepository.save(reservacion);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Reservacion> getReservacionesPorUsuario(@PathVariable Long usuarioId) {
        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
        if (usuario.isPresent()) {
            return reservacionRepository.findBySolicitante(usuario.get());
        } else {
            return List.of();
        }
    }
}
