package br.aeso.aula12.cliente;

import java.util.ArrayList;

public interface IRepositorioCliente {
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException;
	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException;
	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException;
	public void remover(String cpf) throws ClienteNaoEncontradoException;
	public boolean existe(String cpf);
	public ArrayList<Cliente> listar();
}
