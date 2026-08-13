package dev.joaorooliveira.agenda_contatos.dto;

public record ContatoResponseDTO(
        Long id,
        String nome,
        String email,
        String telefone,
        String observacoes,
        boolean favorito
) {
}
