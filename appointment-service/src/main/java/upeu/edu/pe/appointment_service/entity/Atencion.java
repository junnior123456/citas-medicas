package upeu.edu.pe.appointment_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cita_id", unique = true, nullable = false)
    private Appointment cita;

    private String resumen;
    private String diagnostico;

    public Atencion() {}

    public Atencion(Appointment cita, String resumen, String diagnostico) {
        this.cita = cita;
        this.resumen = resumen;
        this.diagnostico = diagnostico;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Appointment getCita() { return cita; }
    public void setCita(Appointment cita) { this.cita = cita; }

    public String getResumen() { return resumen; }
    public void setResumen(String resumen) { this.resumen = resumen; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }
}
