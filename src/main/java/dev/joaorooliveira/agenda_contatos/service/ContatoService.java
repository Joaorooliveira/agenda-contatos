package dev.joaorooliveira.agenda_contatos.service;

import dev.joaorooliveira.agenda_contatos.dto.ContatoRequestDTO;
import dev.joaorooliveira.agenda_contatos.repository.ContatoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Transactional
    public void salvarContato(ContatoRequestDTO contatoRequestDTO) {
        var contato = contatoRequestDTO.toEntity();
        contatoRepository.save(contato);
    }






}
