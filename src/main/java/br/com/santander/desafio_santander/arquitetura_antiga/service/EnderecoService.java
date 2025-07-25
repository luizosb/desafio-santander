package br.com.santander.desafio_santander.arquitetura_antiga.service;

import br.com.santander.desafio_santander.arquitetura_antiga.DTO.EnderecoDTO;
import br.com.santander.desafio_santander.domain.entities.Endereco;
import br.com.santander.desafio_santander.arquitetura_antiga.mockoon.EnderecoPesquisaInterface;
import br.com.santander.desafio_santander.arquitetura_antiga.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


/**
 * Service que contém a lógica de negócios.
 */
@Service
public class EnderecoService {


    private final EnderecoRepository enderecoRepository;
    private final EnderecoPesquisaInterface enderecoPesquisaInterface;

    public EnderecoService(EnderecoPesquisaInterface enderecoPesquisaInterface, EnderecoRepository enderecoRepository) {
        this.enderecoPesquisaInterface = enderecoPesquisaInterface;
        this.enderecoRepository = enderecoRepository;
    }

    public EnderecoDTO buscarCep(String cep) {

        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setData(LocalDateTime.now());

        try {
            EnderecoDTO enderecoDTO = enderecoPesquisaInterface.buscarPorCep(cep);

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
                return enderecoDTO;
            } else {
                endereco.setLogBusca("404 NOT FOUND - CEP não encontrado");
                enderecoRepository.save(endereco);
                return null;
            }


        } catch (Exception exception) {
            endereco.setLogBusca("404 NOT FOUND - CEP não encontrado");
            enderecoRepository.save(endereco);
            return null;
        }

    }
}
