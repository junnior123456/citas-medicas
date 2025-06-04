package upeu.edu.pe.appointment_service.services;

import upeu.edu.pe.appointment_service.entity.Atencion;
import java.util.List;

public interface AtencionService {
    Atencion registrarAtencion(Atencion atencion);
    List<Atencion> listarAtenciones();
    Atencion obtenerPorId(Long id);
    void eliminar(Long id);
}
