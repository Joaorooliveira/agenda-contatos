package dev.joaorooliveira.agenda_contatos.repository;

import dev.joaorooliveira.agenda_contatos.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
