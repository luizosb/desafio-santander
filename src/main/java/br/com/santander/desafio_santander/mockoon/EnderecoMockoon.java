package br.com.santander.desafio_santander.mockoon;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


/**
 * Componente para buscar informações na API mockada
 */
@Component
@Profile("dev")
public class EnderecoMockoon implements EnderecoPesquisaInterface {

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public EnderecoDTO buscarPorCep(String cep){
        String url = "http://localhost:3000/buscaCep/" + cep;
        return restTemplate.getForObject(url, EnderecoDTO.class);
    }


}
