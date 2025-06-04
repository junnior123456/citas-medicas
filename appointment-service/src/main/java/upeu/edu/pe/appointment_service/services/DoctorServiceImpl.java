package upeu.edu.pe.appointment_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.appointment_service.entity.Doctor;
import upeu.edu.pe.appointment_service.repository.DoctorRepository;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository repo;

    @Override
    public Doctor crearDoctor(Doctor doctor) {
        return repo.save(doctor);
    }

    @Override
    public List<Doctor> listarDoctores() {
        return repo.findAll();
    }

    @Override
    public Doctor obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
