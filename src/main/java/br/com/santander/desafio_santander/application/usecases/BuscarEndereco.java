package br.com.santander.desafio_santander.application.usecases;

import br.com.santander.desafio_santander.application.gateways.RepositorioDeEndereco;
import br.com.santander.desafio_santander.arquitetura_antiga.model.Endereco;

public class BuscarEndereco {

    private RepositorioDeEndereco repositorioDeEndereco;

    public BuscarEndereco(RepositorioDeEndereco repositorioDeEndereco) {
        this.repositorioDeEndereco = repositorioDeEndereco;
    }

    public Endereco buscarEndereco(String cep){
        return repositorioDeEndereco.buscarEndereco(cep);
    }
}
