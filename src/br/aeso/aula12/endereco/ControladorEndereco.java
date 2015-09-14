package br.aeso.aula12.endereco;

import java.util.ArrayList;

import br.aeso.aula12.util.CampoObritarorioInvalidoException;

public class ControladorEndereco {
	private IRepositorioEndereco repositorioEndereco;
	
	public ControladorEndereco() {
		this.repositorioEndereco = new RepositorioEnderecoBDR();
	}
	
	public void cadastrar(Endereco endereco) throws EnderecoJaCadastradoException, 
													CampoObritarorioInvalidoException  {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inv�lido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Logradouro");
	    
	    this.repositorioEndereco.cadastrar(endereco);
	}
	public void atualizar(Endereco endereco) throws EnderecoNaoEncontradoException, 
													CampoObritarorioInvalidoException {
		if (endereco == null) throw new IllegalArgumentException("Endereco Inv�lido.");
	    if (endereco.getRua().equals("")) throw new CampoObritarorioInvalidoException("Logradouro");
		this.repositorioEndereco.atualizar(endereco);
	}
	public void remover(Integer id) throws EnderecoNaoEncontradoException {
		this.repositorioEndereco.remover(id);
	}
	public Endereco procurar(Integer id) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurar(id);
	}
	public Endereco procurarPorCliente(Integer clienteId) throws EnderecoNaoEncontradoException  {
		return this.repositorioEndereco.procurarPorCliente(clienteId);
	}
	public ArrayList<Endereco> listar() {
		return this.repositorioEndereco.listar();
	}
}

