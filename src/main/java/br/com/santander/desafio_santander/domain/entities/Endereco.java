package br.com.santander.desafio_santander.domain.entities;

import java.time.LocalDateTime;

/**
 * Representa a estrutura que será persistida no banco.
 */
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String uf;
    private String estado;
    private String regiao;

    private LocalDateTime data;

    private String logBusca;

    public Endereco(String cep, String logradouro, String complemento, String unidade, String bairro,
                    String uf, String estado, String regiao, LocalDateTime data, String logBusca) {
        if(cep == null || cep.matches("\\d{5}\\-\\d{3}")){
            throw new IllegalArgumentException("CEP não está no padrão correto para a pesquisa.");
        }
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
        this.data = data;
        this.logBusca = logBusca;
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getLogBusca() {
        return logBusca;
    }

    public void setLogBusca(String logBusca) {
        this.logBusca = logBusca;
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
