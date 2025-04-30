package br.com.santander.desafio_santander.controller;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.service.EnderecoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<EnderecoDTO> buscarCep(@PathVariable String cep) {
        EnderecoDTO enderecoDTO = enderecoService.buscarCep(cep);

        if (enderecoDTO == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(enderecoDTO);
    }
}
