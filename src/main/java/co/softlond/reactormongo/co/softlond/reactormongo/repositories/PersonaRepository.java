package co.softlond.reactormongo.co.softlond.reactormongo.repositories;

import co.softlond.reactormongo.co.softlond.reactormongo.models.Persona;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonaRepository extends ReactiveMongoRepository<Persona, String> {
}
