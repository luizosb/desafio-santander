package br.com.santander.desafio_santander.mockoon;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Componente para buscar informações na API online ViaCEP
 */

@Component
@Profile("prod")
public class EnderecoViaCEP implements EnderecoPesquisaInterface {

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    public EnderecoDTO buscarPorCep(String cep){
        String url = "https://viacep.com.br/ws/"+ cep + "/json/";
        return restTemplate.getForObject(url, EnderecoDTO.class);
    }
    
}
