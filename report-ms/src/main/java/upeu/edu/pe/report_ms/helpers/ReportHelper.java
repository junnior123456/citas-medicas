package upeu.edu.pe.report_ms.helpers;

import org.springframework.stereotype.Component;
import upeu.edu.pe.report_ms.models.*;

@Component
public class ReportHelper {

    public String readTemplate(Appointment cita) {
        Paciente paciente = cita.getPaciente();
        Doctor doctor = cita.getDoctor();
        Medicacion medicacion = cita.getMedicacion();

        return String.format(
                """
                """,
                cita.getFechaHora(),
                paciente.getNombres(), paciente.getApellidos(), paciente.getDni(), paciente.getCorreo(),
                doctor.getNombres(), doctor.getApellidos(), doctor.getEspecialidad(), doctor.getHorarioDisponible(),
                medicacion != null ? medicacion.getMedicamento() : "N/A",
                medicacion != null ? medicacion.getDosis() : "N/A",
                medicacion != null ? medicacion.getFrecuencia() : "N/A",
                medicacion != null ? medicacion.getDuracion() : "N/A",
                cita.getEstado(),
                cita.getModalidad()
        );
    }
}