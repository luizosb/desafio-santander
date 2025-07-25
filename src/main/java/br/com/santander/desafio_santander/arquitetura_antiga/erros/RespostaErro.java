package br.com.santander.desafio_santander.arquitetura_antiga.erros;

import java.time.LocalDateTime;

/**
 * Classe para criar uma mensagem de erro mais legivel ao cliente ao usar Postman
 */
public class RespostaErro {

    private String mensagem;
    private int status;
    private LocalDateTime timestamp;

    public RespostaErro(String mensagem, int status) {
        this.mensagem = mensagem;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
