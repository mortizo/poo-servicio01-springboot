package ups.edu.ec.servicio01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.servicio01.model.Persona;
import ups.edu.ec.servicio01.repository.PersonaRepository;

import java.util.List;

@Service
public class PersonaService {

    final
    PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona save(Persona persona){
        this.personaRepository.save(persona);
        return persona;
    }

    public List<Persona> findAll(){
        return this.personaRepository.findAll();
    }

}
