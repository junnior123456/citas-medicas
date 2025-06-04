package upeu.edu.pe.appointment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.appointment_service.entity.Atencion;
import upeu.edu.pe.appointment_service.services.AtencionService;

import java.util.List;

@RestController
@RequestMapping("/api/atenciones")
public class AtencionController {

    @Autowired
    private AtencionService service;

    @PostMapping
    public Atencion registrar(@RequestBody Atencion atencion) {
        return service.registrarAtencion(atencion);
    }

    @GetMapping
    public List<Atencion> listar() {
        return service.listarAtenciones();
    }

    @GetMapping("/{id}")
    public Atencion obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
