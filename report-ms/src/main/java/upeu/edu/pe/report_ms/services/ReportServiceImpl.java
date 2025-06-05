package upeu.edu.pe.report_ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.report_ms.helpers.ReportHelper;
import upeu.edu.pe.report_ms.models.Appointment;
import upeu.edu.pe.report_ms.repositories.AppointmentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private AppointmentRepository repo;

    @Autowired
    private ReportHelper helper;

    @Override
    public List<String> generarReporte() {
        List<Appointment> citas = repo.findAll();
        return citas.stream()
                .map(helper::readTemplate)
                .collect(Collectors.toList());
    }
}
