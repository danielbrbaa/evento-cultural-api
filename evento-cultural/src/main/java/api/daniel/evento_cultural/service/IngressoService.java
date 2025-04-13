package api.daniel.evento_cultural.service;

import api.daniel.evento_cultural.entity.Ingresso;
import api.daniel.evento_cultural.repository.IngressoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngressoService {

    private final IngressoRepository repository;

    public IngressoService(IngressoRepository repository) {
        this.repository = repository;
    }

    public List<Ingresso> listar() {
        return repository.findAll();
    }

    public Ingresso salvar(Ingresso ingresso) {
        return repository.save(ingresso);
    }

    public Optional<Ingresso> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
