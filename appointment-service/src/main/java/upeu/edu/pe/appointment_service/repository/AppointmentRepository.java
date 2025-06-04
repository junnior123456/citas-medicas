package upeu.edu.pe.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.appointment_service.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
