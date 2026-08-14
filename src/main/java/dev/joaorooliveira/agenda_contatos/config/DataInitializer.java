package dev.joaorooliveira.agenda_contatos.config;

import dev.joaorooliveira.agenda_contatos.domain.Contato;
import dev.joaorooliveira.agenda_contatos.repository.ContatoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ContatoRepository contatoRepository) {
        return args -> {

            Contato joao = new Contato();
            joao.setNome("João Oliveira");
            joao.setEmail("joao@gmail.com");
            joao.setTelefone("61999999999");
            joao.setObservacoes("Contato de teste");
            joao.setFavorito(true);

            Contato maria = new Contato();
            maria.setNome("Maria Silva");
            maria.setEmail("maria@gmail.com");
            maria.setTelefone("61988888888");
            maria.setObservacoes("Amiga");
            maria.setFavorito(true);

            Contato carlos = new Contato();
            carlos.setNome("Carlos Santos");
            carlos.setEmail("carlos@gmail.com");
            carlos.setTelefone("61977777777");
            carlos.setObservacoes("Trabalha com TI");
            carlos.setFavorito(false);

            Contato ana = new Contato();
            ana.setNome("Ana Souza");
            ana.setEmail("ana@gmail.com");
            ana.setTelefone("61966666666");
            ana.setObservacoes("Contato pessoal");
            ana.setFavorito(false);

            Contato pedro = new Contato();
            pedro.setNome("Pedro Almeida");
            pedro.setEmail("pedro@gmail.com");
            pedro.setTelefone("61955555555");
            pedro.setObservacoes("Faculdade");
            pedro.setFavorito(true);

            Contato lucas = new Contato();
            lucas.setNome("Lucas Ferreira");
            lucas.setEmail("lucas@gmail.com");
            lucas.setTelefone("61944444444");
            lucas.setObservacoes("Colega de trabalho");
            lucas.setFavorito(false);

            Contato juliana = new Contato();
            juliana.setNome("Juliana Costa");
            juliana.setEmail("juliana@gmail.com");
            juliana.setTelefone("61933333333");
            juliana.setObservacoes("Amiga da faculdade");
            juliana.setFavorito(true);

            Contato rafael = new Contato();
            rafael.setNome("Rafael Martins");
            rafael.setEmail("rafael@gmail.com");
            rafael.setTelefone("61922222222");
            rafael.setObservacoes("Contato profissional");
            rafael.setFavorito(false);

            Contato beatriz = new Contato();
            beatriz.setNome("Beatriz Lima");
            beatriz.setEmail("beatriz@gmail.com");
            beatriz.setTelefone("61911111111");
            beatriz.setObservacoes("Vizinha");
            beatriz.setFavorito(false);

            Contato gabriel = new Contato();
            gabriel.setNome("Gabriel Rocha");
            gabriel.setEmail("gabriel@gmail.com");
            gabriel.setTelefone("61912345678");
            gabriel.setObservacoes("Amigo de infância");
            gabriel.setFavorito(true);

            Contato fernanda = new Contato();
            fernanda.setNome("Fernanda Alves");
            fernanda.setEmail("fernanda@gmail.com");
            fernanda.setTelefone("61923456789");
            fernanda.setObservacoes("Contato pessoal");
            fernanda.setFavorito(false);

            Contato bruno = new Contato();
            bruno.setNome("Bruno Rodrigues");
            bruno.setEmail("bruno@gmail.com");
            bruno.setTelefone("61934567890");
            bruno.setObservacoes("Trabalha na mesma empresa");
            bruno.setFavorito(true);

            Contato camila = new Contato();
            camila.setNome("Camila Martins");
            camila.setEmail("camila@gmail.com");
            camila.setTelefone("61945678901");
            camila.setObservacoes("Colega de faculdade");
            camila.setFavorito(false);

            Contato thiago = new Contato();
            thiago.setNome("Thiago Nascimento");
            thiago.setEmail("thiago@gmail.com");
            thiago.setTelefone("61956789012");
            thiago.setObservacoes("Contato profissional");
            thiago.setFavorito(false);

            Contato larissa = new Contato();
            larissa.setNome("Larissa Mendes");
            larissa.setEmail("larissa@gmail.com");
            larissa.setTelefone("61967890123");
            larissa.setObservacoes("Amiga");
            larissa.setFavorito(true);

            contatoRepository.save(joao);
            contatoRepository.save(maria);
            contatoRepository.save(carlos);
            contatoRepository.save(ana);
            contatoRepository.save(pedro);
            contatoRepository.save(lucas);
            contatoRepository.save(juliana);
            contatoRepository.save(rafael);
            contatoRepository.save(beatriz);
            contatoRepository.save(gabriel);
            contatoRepository.save(fernanda);
            contatoRepository.save(bruno);
            contatoRepository.save(camila);
            contatoRepository.save(thiago);
            contatoRepository.save(larissa);
        };
    }
}