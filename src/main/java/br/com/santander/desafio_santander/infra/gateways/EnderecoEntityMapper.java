package br.com.santander.desafio_santander.infra.gateways;

import br.com.santander.desafio_santander.domain.entities.Endereco;
import br.com.santander.desafio_santander.infra.persistance.EnderecoEntity;

public class EnderecoEntityMapper {
    public EnderecoEntity toEntity(Endereco endereco) {
        return new EnderecoEntity(endereco.getCep(), endereco.getUf(), endereco.getComplemento(), endereco.getUnidade(), endereco.getBairro(),
                endereco.getEstado(), endereco.getLogBusca(), endereco.getLogradouro(), endereco.getData(), endereco.getRegiao());
    }

    public Endereco toDomain(EnderecoEntity entity) {
        return new Endereco(entity.getCep(), entity.getLogradouro(), entity.getComplemento(), entity.getUnidade(), entity.getBairro(),
                entity.getUf(), entity.getEstado(), entity.getRegiao(), entity.getData(), entity.getLogBusca());
    }
}
