package upeu.edu.pe.appointment_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.appointment_service.entity.Medicacion;
import upeu.edu.pe.appointment_service.repository.MedicacionRepository;

import java.util.List;

@Service
public class MedicacionServiceImpl implements MedicacionService {

    @Autowired
    private MedicacionRepository repo;

    @Override
    public Medicacion registrarMedicacion(Medicacion medicacion) {
        return repo.save(medicacion);
    }

    @Override
    public List<Medicacion> listarMedicaciones() {
        return repo.findAll();
    }

    @Override
    public Medicacion obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
