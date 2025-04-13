package api.daniel.evento_cultural.controller;

import api.daniel.evento_cultural.entity.Ingresso;
import api.daniel.evento_cultural.service.IngressoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingressos")
public class IngressoController {

    private final IngressoService service;

    public IngressoController(IngressoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ingresso> listar() {
        return service.listar();
    }

    @PostMapping
    public Ingresso criar(@RequestBody Ingresso ingresso) {
        return service.salvar(ingresso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingresso> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
