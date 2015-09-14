package br.aeso.aula12.endereco;

public class EnderecoJaCadastradoException extends Exception {
    public EnderecoJaCadastradoException(){
        super ("Cliente já cadastrado!");
    }
} 