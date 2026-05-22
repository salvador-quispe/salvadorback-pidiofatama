package pe.edu.vallegrande.salvador_demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.salvador_demo.model.Persona;

@Repository
public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}
