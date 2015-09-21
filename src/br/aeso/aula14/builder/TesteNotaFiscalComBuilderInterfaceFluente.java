package br.aeso.aula14.builder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscalComBuilderInterfaceFluente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotaFiscalBuilderComInterfaceFluente builder = 
				new NotaFiscalBuilderComInterfaceFluente();
		builder.comEmitente("AESO Barros Melo")
		.comRazaoSocial("Empresa Júnior LTDA")
		.comCnpj("123.126")
		.naDataAtual()
		.comItem(new ItemDaNota("Item 1", 200))
		.comItem(new ItemDaNota("Item 2", 100))
		.comItem(new ItemDaNota("Item 3", 400))
		.comObservacoes("obs diversas");
		NotaFiscal nf = builder.construir();
		System.out.println(nf.getValorBruto());
	}
}
