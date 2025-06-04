package upeu.edu.pe.appointment_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.appointment_service.entity.Doctor;
import upeu.edu.pe.appointment_service.services.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/api/doctores")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    public Doctor crear(@RequestBody Doctor doctor) {
        return service.crearDoctor(doctor);
    }

    @GetMapping
    public List<Doctor> listar() {
        return service.listarDoctores();
    }

    @GetMapping("/{id}")
    public Doctor obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
