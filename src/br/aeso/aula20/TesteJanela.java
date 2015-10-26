package br.aeso.aula20;
public class TesteJanela {
	public static void main(String[] args) {
		JanelaAbstrata janela;
		janela = new JanelaDialogo(new JanelaWindows());
	    janela.desenhar();
	    janela = new JanelaAviso(new JanelaWindows());
	    janela.desenhar();
	}
}
