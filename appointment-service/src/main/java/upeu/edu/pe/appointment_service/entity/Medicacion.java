package upeu.edu.pe.appointment_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medicacion")
public class Medicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "atencion_id", nullable = false)
    private Atencion atencion;

    private String medicamento;
    private String dosis;
    private String frecuencia;
    private String duracion;

    public Medicacion() {}

    public Medicacion(Atencion atencion, String medicamento, String dosis, String frecuencia, String duracion) {
        this.atencion = atencion;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracion = duracion;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Atencion getAtencion() { return atencion; }
    public void setAtencion(Atencion atencion) { this.atencion = atencion; }

    public String getMedicamento() { return medicamento; }
    public void setMedicamento(String medicamento) { this.medicamento = medicamento; }

    public String getDosis() { return dosis; }
    public void setDosis(String dosis) { this.dosis = dosis; }

    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }
}
