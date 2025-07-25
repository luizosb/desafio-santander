package br.com.santander.desafio_santander.config;

import br.com.santander.desafio_santander.application.usecases.entities.BuscarEndereco;
import br.com.santander.desafio_santander.domain.ports.out.EnderecoPesquisa;
import br.com.santander.desafio_santander.domain.ports.out.RepositorioDeEndereco;
import br.com.santander.desafio_santander.infra.gateways.EnderecoEntityMapper;
import br.com.santander.desafio_santander.infra.gateways.RepositorioDeEnderecoJpa;
import br.com.santander.desafio_santander.infra.persistance.EnderecoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnderecoConfig {

    @Bean
    BuscarEndereco buscarEndereco(EnderecoPesquisa enderecoPesquisa, RepositorioDeEndereco repositorioDeEndereco){
        return new BuscarEndereco(enderecoPesquisa, repositorioDeEndereco);
    }

    @Bean
    RepositorioDeEnderecoJpa criarRepositorioJpa(EnderecoRepository repositorio, EnderecoEntityMapper mapper){
        return new RepositorioDeEnderecoJpa(repositorio, mapper);
    }

    @Bean
    EnderecoEntityMapper retornaMapper(){
        return new EnderecoEntityMapper();
    }



}
