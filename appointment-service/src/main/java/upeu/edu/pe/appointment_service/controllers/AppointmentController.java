package upeu.edu.pe.appointment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.appointment_service.entity.Appointment;
import upeu.edu.pe.appointment_service.services.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping
    public Appointment crear(@RequestBody Appointment cita) {
        return service.crearCita(cita);
    }

    @GetMapping
    public List<Appointment> listar() {
        return service.listarCitas();
    }

    @GetMapping("/{id}")
    public Appointment obtener(@PathVariable Long id) {
        return service.obtenerCita(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
