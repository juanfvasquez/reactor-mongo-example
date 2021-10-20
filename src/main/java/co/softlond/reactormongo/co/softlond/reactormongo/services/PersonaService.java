package co.softlond.reactormongo.co.softlond.reactormongo.services;

import co.softlond.reactormongo.co.softlond.reactormongo.models.Persona;
import co.softlond.reactormongo.co.softlond.reactormongo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository repository;

    public Flux<Persona> getPersonas() {
        Flux<Persona> personas = repository.findAll();
        return personas;
    }

    public Mono<Persona> crearPersona(Persona body) {
        // TODO: validar body
        return repository.save(body);
    }
}
