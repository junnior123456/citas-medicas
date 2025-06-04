package upeu.edu.pe.appointment_service.services;

import upeu.edu.pe.appointment_service.entity.Paciente;
import java.util.List;

public interface PacienteService {
    Paciente crearPaciente(Paciente paciente);
    List<Paciente> listarPacientes();
    Paciente obtenerPorId(Long id);
    void eliminar(Long id);
}
