package upeu.edu.pe.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.appointment_service.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
