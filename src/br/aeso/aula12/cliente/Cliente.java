package br.aeso.aula12.cliente;

import br.aeso.aula12.endereco.Endereco;

public class Cliente {
	private Integer codigo;
	private String nome;
	private String cpf;
	private String banco;
	private Endereco endereco;
	
	public Cliente(Integer codigo, String nome, String cpf, String banco, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.setCpf(cpf);
		this.banco = banco;
		this.endereco = endereco;
	}
	
	public Cliente(String nome, String cpf, String banco, Endereco endereco) {
		this.codigo = 0;
		this.nome = nome;
		this.setCpf(cpf);
		this.banco = banco;
		this.endereco = endereco;
	}
	
	public Cliente(String nome, String cpf, String banco) {
		this.codigo = 0;
		this.nome = nome;
		this.setCpf(cpf);
		this.banco = banco;
		this.endereco = null;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String formatarCpf() {
		return cpf.substring(0, 3) + '.' + cpf.substring(3, 6) + '.' + 
			   cpf.substring(6, 9)+ '-' + cpf.substring(9, 11)
				;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", banco=" + banco + ", endereco=" + endereco
				+ ", CPF=" + formatarCpf() + "]";
	}

}
