package open.cifrado.cifrado.interfaceServices;

import open.cifrado.cifrado.modelo.Persona;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    List<Persona> listar();

    Optional<Persona> listarId(Long id);

    int save(Persona persona);

    void delete(Long id);
}
