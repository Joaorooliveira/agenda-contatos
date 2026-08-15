package dev.joaorooliveira.agenda_contatos.dto;

public record AlunoFiltroRequest(
        String nome,
        String email,
        String telefone,
        String observacoes,
        String favorito
) {
}
