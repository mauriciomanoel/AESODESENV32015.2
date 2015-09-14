package br.aeso.aula07.endereco;

import br.aeso.aula07.cliente.Cliente;

public class Endereco {
	private Integer id;
	private Cliente cliente;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	
	public Endereco(Integer id, Cliente cliente, String rua, String numero, String complemento, String bairro,
			String cidade, String cep) {
		this.id = id;
		this.cliente = cliente;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public Endereco(Cliente cliente, String rua, String numero, String complemento, String bairro,
			String cidade, String cep) {
		this.id = 0;
		this.cliente = cliente;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + "]";
	}
}
