package open.cifrado.cifrado.interfaces;

import open.cifrado.cifrado.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona,Long> {
}
