package br.aeso.aula07.cliente;

public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
