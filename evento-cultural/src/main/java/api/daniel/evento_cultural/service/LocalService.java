package api.daniel.evento_cultural.service;

import api.daniel.evento_cultural.entity.Local;
import api.daniel.evento_cultural.repository.LocalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalService {

    private final LocalRepository repository;

    public LocalService(LocalRepository repository) {
        this.repository = repository;
    }

    public List<Local> listar() {
        return repository.findAll();
    }

    public Local salvar(Local local) {
        return repository.save(local);
    }

    public Optional<Local> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
