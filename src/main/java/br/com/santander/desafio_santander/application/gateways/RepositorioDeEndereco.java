package br.com.santander.desafio_santander.application.gateways;

import br.com.santander.desafio_santander.domain.entities.Endereco;

public interface RepositorioDeEndereco {

    Endereco buscarEndereco (String cep);
}
