package dev.joaorooliveira.agenda_contatos.specification;

import dev.joaorooliveira.agenda_contatos.domain.Contato;
import dev.joaorooliveira.agenda_contatos.dto.ContatoFiltroRequest;
import org.springframework.data.jpa.domain.Specification;

public class ContatoSpecification {

    public static Specification<Contato> comFiltros(ContatoFiltroRequest filtro) {
        return Specification
                .where(nomeContem(filtro.nome()))
                .and(emailContem(filtro.email()))
                .and(telefoneContem(filtro.telefone()))
                .and(observacoesContem(filtro.observacoes()))
                .and(favoritoIgual(filtro.favorito()));
    }

    private static Specification<Contato> nomeContem(String nome) {
        return (root, query, cb) -> {
            if (nome == null || nome.isBlank()) {
                return null;
            }
            return cb.like(cb.lower(root.get("nome")), "%" + nome.toLowerCase() + "%");
        };
    }

    private static Specification<Contato> emailContem(String email) {
        return (root, query, cb) -> {
            if (email == null || email.isBlank()) {
                return null;
            }
            return cb.like(cb.lower(root.get("email")), "%" + email.toLowerCase() + "%");
        };
    }

    private static Specification<Contato> telefoneContem(String telefone) {
        return (root, query, cb) -> {
            if (telefone == null || telefone.isBlank()) {
                return null;
            }
            return cb.like(cb.lower(root.get("telefone")), "%" + telefone.toLowerCase() + "%");
        };
    }

    private static Specification<Contato> observacoesContem(String observacoes) {
        return (root, query, cb) -> {
            if (observacoes == null || observacoes.isBlank()) {
                return null;
            }
            return cb.like(cb.lower(root.get("observacoes")), "%" + observacoes.toLowerCase() + "%");
        };
    }

    private static Specification<Contato> estadoIgual(String estado) {
        return (root, query, cb) -> {
            if (estado == null || estado.isBlank()) {
                return null;
            }
            return cb.equal(cb.upper(root.get("estado")), estado.toUpperCase());
        };
    }

    private static Specification<Contato> favoritoIgual(Boolean favorito) {
        return (root, query, cb) -> {
            if (favorito == null) {
                return null;
            }

            return cb.equal(root.get("favorito"), favorito);
        };
    }
}
