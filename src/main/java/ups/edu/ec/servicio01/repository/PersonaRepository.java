package ups.edu.ec.servicio01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ups.edu.ec.servicio01.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
