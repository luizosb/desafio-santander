package br.com.santander.desafio_santander.application.gateways;

import br.com.santander.desafio_santander.arquitetura_antiga.model.Endereco;

public interface RepositorioDeEndereco {

    Endereco buscarEndereco (String cep);
}
