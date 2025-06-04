package upeu.edu.pe.appointment_service.services;

import upeu.edu.pe.appointment_service.entity.Doctor;
import java.util.List;

public interface DoctorService {
    Doctor crearDoctor(Doctor doctor);
    List<Doctor> listarDoctores();
    Doctor obtenerPorId(Long id);
    void eliminar(Long id);
}
