package br.aeso.aula14.builder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscalComBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.comEmitente("AESO Barros Melo");
		builder.comRazaoSocial("Empresa Júnior LTDA");
		builder.comCnpj("123.126");
		builder.naDataAtual();
		builder.comItem(new ItemDaNota("Item 1", 200));
		builder.comItem(new ItemDaNota("Item 2", 100));
		builder.comItem(new ItemDaNota("Item 3", 400));
		builder.comObservacoes("obs diversas");
		NotaFiscal nf = builder.construir();
		System.out.println(nf.getValorBruto());
	}
}
