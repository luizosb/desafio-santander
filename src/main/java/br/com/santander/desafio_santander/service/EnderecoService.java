package br.com.santander.desafio_santander.service;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.model.Endereco;
import br.com.santander.desafio_santander.repository.EnderecoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class EnderecoService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public EnderecoDTO buscarCep(String cep) {
        String url = "http://localhost:3000/buscaCep/" + cep;

        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setData(LocalDateTime.now());

        try {
            EnderecoDTO enderecoDTO = restTemplate.getForObject(url, EnderecoDTO.class);

            if (enderecoDTO != null) {

                endereco.setComplemento(enderecoDTO.complemento());
                endereco.setLogradouro(enderecoDTO.logradouro());
                endereco.setBairro(enderecoDTO.bairro());
                endereco.setEstado(enderecoDTO.estado());
                endereco.setRegiao(enderecoDTO.regiao());
                endereco.setUf(enderecoDTO.uf());
                endereco.setUnidade(enderecoDTO.unidade());
                endereco.setLogBusca("202 OK CEP");
                enderecoRepository.save(endereco);

            }

            return enderecoDTO;

        } catch (Exception exception) {
            endereco.setLogBusca("404 NOT FOUND - CEP não encontrado");
            enderecoRepository.save(endereco);
            return null;
        }

    }
}
