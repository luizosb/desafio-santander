package br.com.santander.desafio_santander.domain.entities;

import java.time.LocalDateTime;

public class FabricaDeEnderecos {

    private Endereco endereco;

    public Endereco comCepEDados(String cep, String logradouro, String complemento, String unidade, String bairro,
                                 String uf, String estado, String regiao, LocalDateTime data, String logBusca){

        this.endereco = new Endereco(cep, logradouro, complemento, unidade, bairro, uf, estado, regiao, data, logBusca);
        return this.endereco;

    }
}
