package br.com.santander.desafio_santander.adapters.out;

import br.com.santander.desafio_santander.domain.ports.out.EnderecoPesquisa;
import br.com.santander.desafio_santander.infra.controller.EnderecoDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * Componente para buscar informações na API mockada
 */
@Component
@Profile("dev")
public class EnderecoTeste implements EnderecoPesquisa {

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public EnderecoDTO buscar(String cep) {
        String url = "http://localhost:3000/buscaCep/" + cep;
        return restTemplate.getForObject(url, EnderecoDTO.class);
    }

}
