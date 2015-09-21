package br.aeso.aula14.builder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscalComCriador {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CriadorNotaFiscal criador = new CriadorNotaFiscal();
		criador.comEmitente("AESO Barros Melo");
		criador.comRazaoSocial("Empresa Júnior LTDA");
		criador.comCnpj("123.126");
		criador.naDataAtual();
		criador.comItem(new ItemDaNota("Item 1", 200));
		criador.comItem(new ItemDaNota("Item 2", 100));
		criador.comItem(new ItemDaNota("Item 3", 400));
		criador.comObservacoes("obs diversas");
		NotaFiscal nf = criador.construir();
		System.out.println(nf.getValorBruto());
	}
}
