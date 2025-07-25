package br.com.santander.desafio_santander.domain.ports.out;

import br.com.santander.desafio_santander.domain.entities.Endereco;

public interface RepositorioDeEndereco {

    Endereco salvar (Endereco endereco);
}
