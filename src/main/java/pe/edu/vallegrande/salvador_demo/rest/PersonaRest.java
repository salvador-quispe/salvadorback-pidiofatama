package pe.edu.vallegrande.salvador_demo.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.salvador_demo.model.Persona;
import pe.edu.vallegrande.salvador_demo.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/personas")
@RequiredArgsConstructor
public class PersonaRest {

    private final PersonaService personaService;

    @GetMapping
    public Flux<Persona> findAll() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Persona> findById(@PathVariable Long id) {
        return personaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Persona> save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @PutMapping("/{id}")
    public Mono<Persona> update(@PathVariable Long id, @RequestBody Persona persona) {
        return personaService.update(id, persona);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable Long id) {
        return personaService.delete(id);
    }
}
