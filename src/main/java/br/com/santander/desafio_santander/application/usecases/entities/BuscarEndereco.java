package br.com.santander.desafio_santander.application.usecases.entities;

import br.com.santander.desafio_santander.domain.entities.Endereco;
import br.com.santander.desafio_santander.domain.ports.out.EnderecoPesquisa;
import br.com.santander.desafio_santander.domain.ports.out.RepositorioDeEndereco;
import br.com.santander.desafio_santander.infra.controller.EnderecoDTO;

import java.time.LocalDateTime;

public class BuscarEndereco {


    private final RepositorioDeEndereco enderecoRepository;
    private final EnderecoPesquisa enderecoPesquisa;

    public BuscarEndereco(EnderecoPesquisa enderecoPesquisa, RepositorioDeEndereco enderecoRepository) {
        this.enderecoPesquisa = enderecoPesquisa;
        this.enderecoRepository = enderecoRepository;
    }

    public EnderecoDTO buscar(String cep) {

        Endereco endereco = new Endereco();
        endereco.setCep(cep);
        endereco.setData(LocalDateTime.now());

        try {
            EnderecoDTO enderecoDTO = enderecoPesquisa.buscar(cep);

            if (enderecoDTO != null) {

                endereco.setComplemento(enderecoDTO.complemento());
                endereco.setLogradouro(enderecoDTO.logradouro());
                endereco.setBairro(enderecoDTO.bairro());
                endereco.setEstado(enderecoDTO.estado());
                endereco.setRegiao(enderecoDTO.regiao());
                endereco.setUf(enderecoDTO.uf());
                endereco.setUnidade(enderecoDTO.unidade());
                endereco.setLogBusca("202 OK CEP");
                enderecoRepository.salvar(endereco);
                return enderecoDTO;
            } else {
                endereco.setLogBusca("404 NOT FOUND - CEP não encontrado");
                enderecoRepository.salvar(endereco);
                return null;
            }


        } catch (Exception exception) {
            endereco.setLogBusca("404 NOT FOUND - CEP não encontrado");
            enderecoRepository.salvar(endereco);
            return null;
        }

    }
}
