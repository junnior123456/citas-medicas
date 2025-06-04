package upeu.edu.pe.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.appointment_service.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
