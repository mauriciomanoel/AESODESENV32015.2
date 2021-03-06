package br.aeso.aula12.cliente;

import java.util.ArrayList;

import br.aeso.aula07.util.ValidarCPF;
import br.aeso.aula12.endereco.ControladorEndereco;
import br.aeso.aula12.endereco.Endereco;
import br.aeso.aula12.endereco.EnderecoJaCadastradoException;
import br.aeso.aula12.endereco.EnderecoNaoEncontradoException;
import br.aeso.aula12.util.CampoObritarorioInvalidoException;

public class ControladorCliente {
	private IRepositorioCliente repositorioCliente;
	private ControladorEndereco controladorEndereco;
	
	public ControladorCliente() {
		this.repositorioCliente = new RepositorioClienteBDR();
		this.controladorEndereco = new ControladorEndereco();
	}
	public void cadastrar(Cliente cliente) throws IllegalArgumentException, 
												  CPFInvalidoException, 
												  ClienteJaCadastradoException, 
												  CampoObritarorioInvalidoException, 
												  EnderecoJaCadastradoException  {
		// Valida��es das Informa��es
		if (cliente == null) throw new IllegalArgumentException("Cliente Inv�lido.");
	    if (!ValidarCPF.validaCPF(cliente.getCpf())) throw new CPFInvalidoException(cliente.getCpf());
	    if (cliente.getNome().equals("")) throw new CampoObritarorioInvalidoException("Nome");
	    
	    // Cadastrando Cliente
	    this.repositorioCliente.cadastrar(cliente);
	    // Cadastrando Endereco
	    controladorEndereco.cadastrar(cliente.getEndereco());
	}
	public void atualizar(Cliente cliente) throws CPFInvalidoException, 
												  CampoObritarorioInvalidoException, 
												  ClienteNaoEncontradoException, 
												  EnderecoNaoEncontradoException {
		// Valida��es da Classe Cliente		
		if (!ValidarCPF.validaCPF(cliente.getCpf())) throw new CPFInvalidoException(cliente.getCpf());
		if (cliente.getNome() == "") 			throw new CampoObritarorioInvalidoException("Nome � nulo ou Inv�lido.");
		
		this.repositorioCliente.atualizar(cliente);
		controladorEndereco.atualizar(cliente.getEndereco());
	}
	public void remover(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException {
		Cliente cliente = null;
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		cliente = this.procurar(cpf);
		controladorEndereco.remover(cliente.getEndereco().getId());
		this.repositorioCliente.remover(cpf);
	}
	public Cliente procurar(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException {
		Cliente cliente = null;
		Endereco endereco = null;
		// Limpando a formata��o do CPF;
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		// Valida��es da Classe Cliente
		if (!ValidarCPF.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		
		cliente = this.repositorioCliente.procurar(cpf);
		endereco = controladorEndereco.procurarPorCliente(cliente.getEndereco().getId());
		cliente.setEndereco(endereco);
		return cliente;
	}
	public ArrayList<Cliente> listar() {
		ArrayList<Cliente> clientes = null;
		Endereco endereco = null;
		
		clientes =  this.repositorioCliente.listar();
		for(Cliente cliente: clientes) {
			try {
				endereco = controladorEndereco.procurarPorCliente(cliente.getCodigo());
				cliente.setEndereco(endereco);
			} catch (EnderecoNaoEncontradoException e) {}
		}
		return clientes;
	}
}

