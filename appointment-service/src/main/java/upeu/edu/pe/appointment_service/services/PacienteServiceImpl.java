package upeu.edu.pe.appointment_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.appointment_service.entity.Paciente;
import upeu.edu.pe.appointment_service.repository.PacienteRepository;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository repo;

    @Override
    public Paciente crearPaciente(Paciente paciente) {
        return repo.save(paciente);
    }

    @Override
    public List<Paciente> listarPacientes() {
        return repo.findAll();
    }

    @Override
    public Paciente obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
