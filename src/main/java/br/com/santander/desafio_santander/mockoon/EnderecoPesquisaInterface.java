package br.com.santander.desafio_santander.mockoon;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;

public interface EnderecoPesquisaInterface {
    EnderecoDTO buscarPorCep(String cep);
}
