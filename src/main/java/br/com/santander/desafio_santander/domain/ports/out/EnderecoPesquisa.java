package br.com.santander.desafio_santander.domain.ports.out;

import br.com.santander.desafio_santander.infra.controller.EnderecoDTO;

public interface EnderecoPesquisa {

    EnderecoDTO buscar(String cep);

}
