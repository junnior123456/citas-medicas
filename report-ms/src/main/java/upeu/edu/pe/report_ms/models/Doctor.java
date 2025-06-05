package upeu.edu.pe.report_ms.models;

public class Doctor {
    private Long id;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String horarioDisponible;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getHorarioDisponible() { return horarioDisponible; }
    public void setHorarioDisponible(String horarioDisponible) { this.horarioDisponible = horarioDisponible; }
}
