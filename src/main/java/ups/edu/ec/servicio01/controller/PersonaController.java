package ups.edu.ec.servicio01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ups.edu.ec.servicio01.model.Persona;
import ups.edu.ec.servicio01.service.PersonaService;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> findAll() {
        return this.personaService.findAll();
    }

    @PostMapping(path="/persona",consumes="application/json")
    public Persona save(@RequestBody Persona persona){
        return this.personaService.save(persona);
    }
}
