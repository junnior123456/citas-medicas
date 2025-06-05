package upeu.edu.pe.report_ms.models;

public class Atencion {
    private Long id;
    private Appointment cita;
    private String resumen;
    private String diagnostico;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Appointment getCita() { return cita; }
    public void setCita(Appointment cita) { this.cita = cita; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
}
