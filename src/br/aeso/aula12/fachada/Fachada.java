/*
* Fachada.java
* Versão: 1.0
* Data de Criação : 12/02/2015
*
*/
package br.aeso.aula12.fachada;
import java.util.ArrayList;

import br.aeso.aula12.cliente.CPFInvalidoException;
import br.aeso.aula12.cliente.Cliente;
import br.aeso.aula12.cliente.ClienteJaCadastradoException;
import br.aeso.aula12.cliente.ClienteNaoEncontradoException;
import br.aeso.aula12.cliente.ControladorCliente;
import br.aeso.aula12.endereco.EnderecoJaCadastradoException;
import br.aeso.aula12.endereco.EnderecoNaoEncontradoException;
import br.aeso.aula12.util.CampoObritarorioInvalidoException;

public class Fachada {
	private static Fachada instance;
	private ControladorCliente controladorCliente;
	
	/**
	* Construtor privado da Classe Fachada 
	*
	* @param 
	* @return void
	* @throws 
	*/
	private Fachada() {
		this.controladorCliente = new ControladorCliente();
	}

	/**
	* Método para cria uma unica instancia da classe Fachada
	*
	* @param 
	* @return Retorna um objeto da Classe Fachada
	* @throws 
	*/
	
	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	/**
	 * @throws EnderecoJaCadastradoException 
	 * @throws CampoObritarorioInvalidoException 
	 * @throws ClienteJaCadastradoException 
	 * @throws CPFInvalidoException 
	 * @throws IllegalArgumentException 
	* Método para cadastrar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
	public void cadastrarCliente(Cliente cliente) throws IllegalArgumentException, CPFInvalidoException, ClienteJaCadastradoException, CampoObritarorioInvalidoException, EnderecoJaCadastradoException { 
		controladorCliente.cadastrar(cliente);
	}
	
	/**
	 * @throws EnderecoNaoEncontradoException 
	 * @throws ClienteNaoEncontradoException 
	 * @throws CampoObritarorioInvalidoException 
	 * @throws CPFInvalidoException 
	* Método para atualizar os dados do Cliente
	*
	* @param Objeto da Classe Cliente.
	* @return void
	* @throws 
	*/
	public void atualizarCliente(Cliente cliente) throws CPFInvalidoException, CampoObritarorioInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		this.controladorCliente.atualizar(cliente);
	}
	
	/**
	 * @throws CampoObritarorioInvalidoException 
	 * @throws EnderecoNaoEncontradoException 
	 * @throws ClienteNaoEncontradoException 
	 * @throws CPFInvalidoException 
	* Método para remover os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Booleano
	* @throws 
	*/
	public void removerCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException, CampoObritarorioInvalidoException { 
		this.controladorCliente.remover(cpf);
	}
	
	/**
	 * @throws EnderecoNaoEncontradoException 
	 * @throws ClienteNaoEncontradoException 
	 * @throws CPFInvalidoException 
	* Método para procurar os dados do Cliente
	*
	* @param CPF do Cliente
	* @return Retorna um objeto da Classe Cliente
	* @throws 
	*/
	public Cliente procurarCliente(String cpf) throws CPFInvalidoException, ClienteNaoEncontradoException, EnderecoNaoEncontradoException { 
		return this.controladorCliente.procurar(cpf);
	}
	
	/**
	* Método para lista todos os dados do Cliente
	*
	* @param 
	* @return Retorna uma coleção de objetos da Classe Cliente
	* @throws 
	*/
	public ArrayList<Cliente> listarCliente() { 
		return this.controladorCliente.listar();
	}
}
