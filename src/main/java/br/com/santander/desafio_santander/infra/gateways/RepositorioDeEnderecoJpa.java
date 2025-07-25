package br.com.santander.desafio_santander.infra.gateways;

import br.com.santander.desafio_santander.domain.entities.Endereco;
import br.com.santander.desafio_santander.domain.ports.out.RepositorioDeEndereco;
import br.com.santander.desafio_santander.infra.persistance.EnderecoEntity;
import br.com.santander.desafio_santander.infra.persistance.EnderecoRepository;

public class RepositorioDeEnderecoJpa implements RepositorioDeEndereco {

    private final EnderecoRepository repository;
    private final EnderecoEntityMapper mapper;

    public RepositorioDeEnderecoJpa(EnderecoRepository repository, EnderecoEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        EnderecoEntity entity = mapper.toEntity(endereco);
        repository.save(entity);
        return mapper.toDomain(entity);
    }
}
