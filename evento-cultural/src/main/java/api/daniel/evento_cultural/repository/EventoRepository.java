package api.daniel.eventocultural.repository;

import api.daniel.evento_cultural.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {}
