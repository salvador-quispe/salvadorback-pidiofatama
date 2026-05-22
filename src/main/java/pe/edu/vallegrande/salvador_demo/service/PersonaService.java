package pe.edu.vallegrande.salvador_demo.service;

import pe.edu.vallegrande.salvador_demo.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaService {

    Flux<Persona> findAll();

    Mono<Persona> findById(Long id);

    Mono<Persona> save(Persona persona);

    Mono<Persona> update(Long id, Persona persona);

    Mono<Void> delete(Long id);
}
