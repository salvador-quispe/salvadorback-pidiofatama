package pe.edu.vallegrande.salvador_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.salvador_demo.model.Persona;
import pe.edu.vallegrande.salvador_demo.repository.PersonaRepository;
import pe.edu.vallegrande.salvador_demo.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;

    @Override
    public Flux<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Mono<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Mono<Persona> save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Mono<Persona> update(Long id, Persona persona) {
        return personaRepository.findById(id)
                .flatMap(existing -> {
                    existing.setNombre(persona.getNombre());
                    existing.setApellido(persona.getApellido());
                    existing.setEmail(persona.getEmail());
                    return personaRepository.save(existing);
                });
    }

    @Override
    public Mono<Void> delete(Long id) {
        return personaRepository.deleteById(id);
    }
}
