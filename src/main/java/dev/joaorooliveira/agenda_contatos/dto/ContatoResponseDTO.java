package dev.joaorooliveira.agenda_contatos.dto;

import dev.joaorooliveira.agenda_contatos.domain.Contato;

import java.time.LocalDateTime;

public record ContatoResponseDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String observacoes,
        boolean favorito,
        LocalDateTime criado_em
) {
    public static ContatoResponseDTO fromEntity(Contato contato) {
        return new ContatoResponseDTO(
                contato.getId(),
                contato.getNome(),
                contato.getEmail(),
                contato.getTelefone(),
                contato.getObservacoes(),
                contato.isFavorito(),
                contato.getCriadoEm()
        );
    }
}
