package upeu.edu.pe.appointment_service.services;

import upeu.edu.pe.appointment_service.entity.Medicacion;
import java.util.List;

public interface MedicacionService {
    Medicacion registrarMedicacion(Medicacion medicacion);
    List<Medicacion> listarMedicaciones();
    Medicacion obtenerPorId(Long id);
    void eliminar(Long id);
}
