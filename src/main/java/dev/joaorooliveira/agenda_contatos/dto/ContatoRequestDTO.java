package dev.joaorooliveira.agenda_contatos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ContatoRequestDTO(

        @NotBlank(message = "O nome é obrigatório")
        String nome,

        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "O e-mail deve ser válido")
        String email,

        @NotBlank(message = "O telefone é obrigatório")
        @Size(
                min = 8,
                max = 20,
                message = "O telefone deve ter entre 8 e 20 caracteres"
        )
        String telefone,

        String observacoes,

        boolean favorito
) {
}