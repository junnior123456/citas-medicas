package upeu.edu.pe.appointment_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu.edu.pe.appointment_service.entity.Atencion;
import upeu.edu.pe.appointment_service.repository.AtencionRepository;

import java.util.List;

@Service
public class AtencionServiceImpl implements AtencionService {

    @Autowired
    private AtencionRepository repo;

    @Override
    public Atencion registrarAtencion(Atencion atencion) {
        return repo.save(atencion);
    }

    @Override
    public List<Atencion> listarAtenciones() {
        return repo.findAll();
    }

    @Override
    public Atencion obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
