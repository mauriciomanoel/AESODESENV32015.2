package br.aeso.aula14.builder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class NotaFiscalBuilderComInterfaceFluente {
	private String emitente;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens;
	private String observacoes;
	
	public NotaFiscalBuilderComInterfaceFluente() {
		itens = new ArrayList<ItemDaNota>();
	}
	public NotaFiscalBuilderComInterfaceFluente comEmitente(String emitente) {
		this.emitente = emitente;
		return this;
	}
	public NotaFiscalBuilderComInterfaceFluente comRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilderComInterfaceFluente comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilderComInterfaceFluente naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	public NotaFiscalBuilderComInterfaceFluente comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscalBuilderComInterfaceFluente comItem(ItemDaNota itemDaNota) {
		itens.add(itemDaNota);
		valorBruto += itemDaNota.getValor();
		impostos += itemDaNota.getValor() * 0.05;
		return this;
	}
	public NotaFiscal construir() {
		return new NotaFiscal(emitente, razaoSocial, cnpj, dataEmissao, valorBruto, impostos, itens, observacoes);
	}
}
