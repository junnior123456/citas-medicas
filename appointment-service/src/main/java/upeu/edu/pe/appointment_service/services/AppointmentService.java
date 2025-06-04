package upeu.edu.pe.appointment_service.services;

import upeu.edu.pe.appointment_service.entity.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment crearCita(Appointment cita);
    List<Appointment> listarCitas();
    Appointment obtenerCita(Long id);
    void eliminar(Long id);
}
