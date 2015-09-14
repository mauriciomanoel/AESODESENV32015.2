package br.aeso.aula12.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
