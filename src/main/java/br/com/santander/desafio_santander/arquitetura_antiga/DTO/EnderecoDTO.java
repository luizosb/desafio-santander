package br.com.santander.desafio_santander.arquitetura_antiga.DTO;

/**
 * DTO representa os dados que trafegam entre cliente e servidor
 */
public record EnderecoDTO(String cep, String logradouro, String complemento, String unidade, String bairro, String uf, String estado, String regiao) {
}
