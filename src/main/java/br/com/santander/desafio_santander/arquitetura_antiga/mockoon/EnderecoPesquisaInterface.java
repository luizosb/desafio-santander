package br.com.santander.desafio_santander.arquitetura_antiga.mockoon;

import br.com.santander.desafio_santander.arquitetura_antiga.DTO.EnderecoDTO;

public interface EnderecoPesquisaInterface {

    EnderecoDTO buscarPorCep(String cep);

}
