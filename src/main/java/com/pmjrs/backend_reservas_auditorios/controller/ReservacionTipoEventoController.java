package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.model.ReservacionTipoEvento;
import com.pmjrs.backend_reservas_auditorios.repository.ReservacionTipoEventoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reservacion-tipo-evento")
@CrossOrigin(origins = "*")
public class ReservacionTipoEventoController {

    private final ReservacionTipoEventoRepository reservacionTipoEventoRepository;

    public ReservacionTipoEventoController(ReservacionTipoEventoRepository reservacionTipoEventoRepository) {
        this.reservacionTipoEventoRepository = reservacionTipoEventoRepository;
    }

    @GetMapping
    public List<ReservacionTipoEvento> getAll() {
        return reservacionTipoEventoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservacionTipoEvento> getById(@PathVariable Long id) {
        return reservacionTipoEventoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ReservacionTipoEvento create(@RequestBody ReservacionTipoEvento reservacionTipoEvento) {
        return reservacionTipoEventoRepository.save(reservacionTipoEvento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservacionTipoEvento> update(@PathVariable Long id, @RequestBody ReservacionTipoEvento reservacionTipoEvento) {
        return reservacionTipoEventoRepository.findById(id)
                .map(existing -> {
                    reservacionTipoEvento.setIdReservacionTipoEvento(existing.getIdReservacionTipoEvento());
                    return ResponseEntity.ok(reservacionTipoEventoRepository.save(reservacionTipoEvento));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return reservacionTipoEventoRepository.findById(id)
                .map(existing -> {
                    reservacionTipoEventoRepository.delete(existing);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
