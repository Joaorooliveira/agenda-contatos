package dev.joaorooliveira.agenda_contatos.dto;

import dev.joaorooliveira.agenda_contatos.domain.Contato;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record ContatoAtualizarDTO(

        String nome,

        @Email
        String email,

        @Size(
                min = 8,
                max = 20,
                message = "O telefone deve ter entre 8 e 20 caracteres"
        )
        String telefone,

        String observacoes,

        Boolean favorito
) {

    public Contato toEntity() {
        Contato contato = new Contato();
        preencher(contato);
        return contato;
    }

    public void preencher(Contato contato) {

        if (nome != null) {
            contato.setNome(nome);
        }

        if (email != null) {
            contato.setEmail(email);
        }

        if (telefone != null) {
            contato.setTelefone(telefone);
        }

        if (observacoes != null) {
            contato.setObservacoes(observacoes);
        }

        if (favorito != null) {
            contato.setFavorito(favorito);
        }
    }


}
