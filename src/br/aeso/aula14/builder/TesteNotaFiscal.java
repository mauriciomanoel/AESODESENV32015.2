package br.aeso.aula14.builder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ItemDaNota>itens = Arrays.asList(new ItemDaNota("item 1", 200.0), 
				new ItemDaNota("item 2", 100.0));
		String emitente = "AESO Barros Melo";
		String razaoSocial = "Empresa Júnior LTDA";
		String cnpj = "123.126"; 
		Calendar dataEmissao = Calendar.getInstance();
		double valorBruto = 0;
		for(ItemDaNota item : itens) {
			valorBruto += item.getValor();
		}
		double impostos = valorBruto * 0.05;
		String observacoes = "obs diversas";
		NotaFiscal nf = new NotaFiscal(emitente, razaoSocial, cnpj, dataEmissao, 
									 valorBruto, impostos, itens, observacoes);
		System.out.println(nf);
	}
}
