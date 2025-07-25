package br.com.santander.desafio_santander.infra.controller;

import br.com.santander.desafio_santander.application.usecases.entities.BuscarEndereco;
import br.com.santander.desafio_santander.infra.erros.RespostaErro;
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

    private final BuscarEndereco buscarEndereco;

    public EnderecoController(BuscarEndereco buscarEndereco) {
        this.buscarEndereco = buscarEndereco;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<?> buscarCep(@PathVariable String cep) {
        EnderecoDTO dto = buscarEndereco.buscar(cep.replace("-", "").trim());

        if (dto == null) {
            RespostaErro erro = new RespostaErro("CEP não encontrado na API", 404);

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
        }

        return ResponseEntity.ok(dto);
    }
}
