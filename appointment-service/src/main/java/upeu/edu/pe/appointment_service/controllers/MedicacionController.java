package upeu.edu.pe.appointment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.appointment_service.entity.Medicacion;
import upeu.edu.pe.appointment_service.services.MedicacionService;

import java.util.List;

@RestController
@RequestMapping("/api/medicaciones")
public class MedicacionController {

    @Autowired
    private MedicacionService service;

    @PostMapping
    public Medicacion registrar(@RequestBody Medicacion medicacion) {
        return service.registrarMedicacion(medicacion);
    }

    @GetMapping
    public List<Medicacion> listar() {
        return service.listarMedicaciones();
    }

    @GetMapping("/{id}")
    public Medicacion obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
