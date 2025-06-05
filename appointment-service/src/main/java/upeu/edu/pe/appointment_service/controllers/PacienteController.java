package upeu.edu.pe.appointment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.appointment_service.entity.Paciente;
import upeu.edu.pe.appointment_service.services.PacienteService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping
    public Paciente crear(@RequestBody Paciente paciente) {
        return service.crearPaciente(paciente);
    }

    @GetMapping
    public List<Paciente> listar() {
        return service.listarPacientes();
    }

    @GetMapping("/{id}")
    public Paciente obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
