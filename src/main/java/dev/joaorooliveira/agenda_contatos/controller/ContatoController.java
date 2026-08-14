package dev.joaorooliveira.agenda_contatos.controller;

import dev.joaorooliveira.agenda_contatos.dto.ContatoRequestDTO;
import dev.joaorooliveira.agenda_contatos.dto.ContatoResponseDTO;
import dev.joaorooliveira.agenda_contatos.service.ContatoService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping
    public ResponseEntity<ContatoResponseDTO> salvar(
            @RequestBody @Valid ContatoRequestDTO dto) {

        ContatoResponseDTO contato = contatoService.salvarContato(dto);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(contato.id())
                .toUri();

        return ResponseEntity.created(location).body(contato);
    }

    @GetMapping
    public ResponseEntity<Page<ContatoResponseDTO>> listar(
            @PageableDefault(size = 10, sort = "nome") Pageable pageable) {

        return ResponseEntity.ok(
                contatoService.listarContatos(pageable)
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContatoResponseDTO> listarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(
                contatoService.listarContatoPorId(id)
        );
}
}
