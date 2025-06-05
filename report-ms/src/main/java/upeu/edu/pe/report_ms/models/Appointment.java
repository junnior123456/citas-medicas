package upeu.edu.pe.report_ms.models;

import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private Paciente paciente;
    private Doctor doctor;
    private Medicacion medicacion;
    private LocalDateTime fechaHora;
    private String modalidad;
    private String estado;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public Medicacion getMedicacion() { return medicacion; }
    public void setMedicacion(Medicacion medicacion) { this.medicacion = medicacion; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getModalidad() { return modalidad; }
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
