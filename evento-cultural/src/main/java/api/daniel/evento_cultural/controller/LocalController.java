package api.daniel.evento_cultural.controller;

import api.daniel.evento_cultural.entity.Local;
import api.daniel.evento_cultural.service.LocalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais")
public class LocalController {

    private final LocalService service;

    public LocalController(LocalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Local> listar() {
        return service.listar();
    }

    @PostMapping
    public Local criar(@RequestBody Local local) {
        return service.salvar(local);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Local> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
