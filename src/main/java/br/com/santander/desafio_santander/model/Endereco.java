package br.com.santander.desafio_santander.model;

import br.com.santander.desafio_santander.DTO.EnderecoDTO;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "enderecos")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String uf;
    private String estado;
    private String regiao;
    private LocalDate data;

    public Endereco(EnderecoDTO enderecoDTO) {
        this.cep = enderecoDTO.cep();
        this.logradouro = enderecoDTO.logradouro();
        this.complemento = enderecoDTO.complemento();
        this.unidade = enderecoDTO.unidade();
        this.bairro = enderecoDTO.bairro();
        this.uf = enderecoDTO.uf();
        this.estado = enderecoDTO.estado();
        this.regiao = enderecoDTO.regiao();
        this.data = LocalDate.now();
    }

    public Endereco() {
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return
                "  cep= " + cep +
                        ", logradouro= " + logradouro +
                        ", complemento= " + complemento +
                        ", unidade= " + unidade +
                        ", bairro= " + bairro +
                        ", uf= " + uf +
                        ", estado= " + estado +
                        ", regiao= " + regiao;
    }
}
