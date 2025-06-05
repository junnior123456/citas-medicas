package upeu.edu.pe.report_ms.repositories;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import upeu.edu.pe.report_ms.models.Appointment;

import java.util.List;

@FeignClient(name = "appointment-service")
public interface AppointmentRepository {

    @GetMapping("/api/appointment/citas")
    List<Appointment> findAll();
}