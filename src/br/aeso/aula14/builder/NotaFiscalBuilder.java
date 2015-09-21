package br.aeso.aula14.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String emitente;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens;
	private String observacoes;
	
	public NotaFiscalBuilder() {
		itens = new ArrayList<ItemDaNota>();
	}
	public void comEmitente(String emitente) {
		this.emitente = emitente;
	}

	public void comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void comCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
	}

	public void comObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void comItem(ItemDaNota itemDaNota) {
		itens.add(itemDaNota);
		valorBruto += itemDaNota.getValor();
		impostos += itemDaNota.getValor() * 0.05;
	}
	
	public NotaFiscal construir() {
		return new NotaFiscal(emitente, razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
