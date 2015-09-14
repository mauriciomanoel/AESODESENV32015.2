package br.aeso.aula12.endereco;

public class EnderecoNaoEncontradoException extends Exception {
    public EnderecoNaoEncontradoException(){
        super ("Cliente não encontrado!");
    }
}
