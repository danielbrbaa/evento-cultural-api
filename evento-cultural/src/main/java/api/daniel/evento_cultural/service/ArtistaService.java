package api.daniel.evento_cultural.service;

import api.daniel.evento_cultural.entity.Artista;
import api.daniel.evento_cultural.repository.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    private final ArtistaRepository repository;

    public ArtistaService(ArtistaRepository repository) {
        this.repository = repository;
    }

    public List<Artista> listar() {
        return repository.findAll();
    }

    public Artista salvar(Artista artista) {
        return repository.save(artista);
    }

    public Optional<Artista> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
