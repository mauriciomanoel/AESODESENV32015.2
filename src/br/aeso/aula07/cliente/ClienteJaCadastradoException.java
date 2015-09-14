package br.aeso.aula07.cliente;

public class ClienteJaCadastradoException extends Exception {
    public ClienteJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 