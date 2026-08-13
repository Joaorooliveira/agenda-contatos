package dev.joaorooliveira.agenda_contatos.service;

import dev.joaorooliveira.agenda_contatos.dto.ContatoAtualizarDTO;
import dev.joaorooliveira.agenda_contatos.dto.ContatoRequestDTO;
import dev.joaorooliveira.agenda_contatos.dto.ContatoResponseDTO;
import dev.joaorooliveira.agenda_contatos.repository.ContatoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Transactional
    public ContatoResponseDTO salvarContato(ContatoRequestDTO contatoRequestDTO) {
        var contato = contatoRequestDTO.toEntity();
        return ContatoResponseDTO.fromEntity(contatoRepository.save(contato));
    }

    public Page<ContatoResponseDTO> listarContatos(Pageable pageable) {
        return contatoRepository.findAll(pageable).map(ContatoResponseDTO::fromEntity);
    }

    public ContatoResponseDTO listarContatoPorId(Long id) {
        var contato = contatoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Contato não encontrado"));
        return ContatoResponseDTO.fromEntity(contato);
    }

    @Transactional
    public void excluirContatoPorId(Long id) {
        var contato = contatoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Contato não encontrado"));
        contatoRepository.delete(contato);
    }

    @Transactional
    public void atualizarContato(Long id, ContatoAtualizarDTO dto) {

        var contato = contatoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato não encontrado"));

        dto.preencher(contato);

        contatoRepository.save(contato);
    }
}
