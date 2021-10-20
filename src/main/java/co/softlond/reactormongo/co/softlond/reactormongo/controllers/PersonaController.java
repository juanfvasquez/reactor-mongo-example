package co.softlond.reactormongo.co.softlond.reactormongo.controllers;

import co.softlond.reactormongo.co.softlond.reactormongo.models.Persona;
import co.softlond.reactormongo.co.softlond.reactormongo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public Flux<Persona> getPersonas() {
        return service.getPersonas();
    }

    @PostMapping
    public Mono<Persona> crearPersona(@RequestBody Persona body) {
        return service.crearPersona(body);
    }
}
