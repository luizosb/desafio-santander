package br.com.santander.desafio_santander.config;

import br.com.santander.desafio_santander.application.gateways.RepositorioDeEndereco;
import br.com.santander.desafio_santander.application.usecases.BuscarEndereco;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnderecoConfig {

    @Bean
    BuscarEndereco buscarEndereco(RepositorioDeEndereco repositorioDeEndereco){
        return new BuscarEndereco(repositorioDeEndereco);
    }



}
