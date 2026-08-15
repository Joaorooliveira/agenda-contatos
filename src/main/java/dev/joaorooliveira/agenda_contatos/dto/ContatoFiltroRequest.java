package dev.joaorooliveira.agenda_contatos.dto;

public record ContatoFiltroRequest(
        String nome,
        String email,
        String telefone,
        String observacoes,
        Boolean favorito
) {
}
