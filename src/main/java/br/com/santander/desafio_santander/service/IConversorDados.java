package br.com.santander.desafio_santander.service;

public interface IConversorDados {
    <T> T  obterDados(String json, Class<T> classe);
}
