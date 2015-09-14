package br.aeso.aula12.cliente;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 