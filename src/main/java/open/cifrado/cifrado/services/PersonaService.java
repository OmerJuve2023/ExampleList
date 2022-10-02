package open.cifrado.cifrado.services;

import open.cifrado.cifrado.interfaceServices.IPersonaService;
import open.cifrado.cifrado.interfaces.IPersona;
import open.cifrado.cifrado.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(Long id) {
        return Optional.empty();
    }

    @Override
    public int save(Persona persona) {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }
}
