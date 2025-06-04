package upeu.edu.pe.appointment_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.appointment_service.entity.Appointment;
import upeu.edu.pe.appointment_service.repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository repo;

    @Override
    public Appointment crearCita(Appointment cita) {
        return repo.save(cita);
    }

    @Override
    public List<Appointment> listarCitas() {
        return repo.findAll();
    }

    @Override
    public Appointment obtenerCita(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
