package api.daniel.evento_cultural.controller;

import api.daniel.evento_cultural.entity.Artista;
import api.daniel.evento_cultural.service.ArtistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private final ArtistaService service;

    public ArtistaController(ArtistaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Artista> listar() {
        return service.listar();
    }

    @PostMapping
    public Artista criar(@RequestBody Artista artista) {
        return service.salvar(artista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Artista> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
