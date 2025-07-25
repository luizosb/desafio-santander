package br.com.santander.desafio_santander.arquitetura_antiga.controller;

import br.com.santander.desafio_santander.arquitetura_antiga.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.arquitetura_antiga.erros.RespostaErro;
import br.com.santander.desafio_santander.arquitetura_antiga.service.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller lida exclusivamente com a interação via API, responsável apenas por lidar com a comunicação com o cliente.
 */

@RestController
@RequestMapping("/api")
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<?> buscarCep(@PathVariable String cep) {
        EnderecoDTO enderecoDTO = enderecoService.buscarCep(cep.replace("-", "").trim());

        if (enderecoDTO == null) {
            RespostaErro erro = new RespostaErro("CEP não encontrado na API", 404);

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
        }

        return ResponseEntity.ok(enderecoDTO);
    }
}
