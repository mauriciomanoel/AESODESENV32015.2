package br.aeso.aula14.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private static int sequenciaNota = 1;
	private int numeroNota;
	private String emitente;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens;
	private String observacoes;
	
	public NotaFiscal(String emitente, String razaoSocial, String cnpj, Calendar dataEmissao,
			double valorBruto, double impostos, List<ItemDaNota> itens, String observacoes) {
		this.numeroNota = this.getProximoNumero();
		this.emitente = emitente;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	private static int getProximoNumero() {
		return sequenciaNota++;
	}
	public int getNumeroNota() {
		return numeroNota;
	}

	public String getEmitente() {
		return emitente;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
		return "NotaFiscal [numeroNota=" + numeroNota + ", emitente=" + emitente + ", razaoSocial=" + razaoSocial
				+ ", cnpj=" + cnpj + ", dataEmissao=" + formatData.format(dataEmissao.getTime()) + ", valorBruto=" + valorBruto + ", impostos="
				+ impostos + ", itens=" + itens + ", observacoes=" + observacoes + "]";
	}
}
