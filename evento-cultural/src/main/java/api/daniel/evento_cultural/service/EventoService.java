package api.daniel.evento_cultural.service;

import api.daniel.evento_cultural.entity.Evento;
import api.daniel.evento_cultural.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public List<Evento> listar() {
        return repository.findAll();
    }

    public Evento salvar(Evento evento) {
        return repository.save(evento);
    }

    public Optional<Evento> buscarPorId(Long id) {
        return repository.findById(id);
    }
}
