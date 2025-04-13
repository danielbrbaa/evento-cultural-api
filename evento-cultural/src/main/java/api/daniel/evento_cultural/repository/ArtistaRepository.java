package api.daniel.evento_cultural.repository;

import api.daniel.evento_cultural.entity.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {}
