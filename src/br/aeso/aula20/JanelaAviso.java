package br.aeso.aula20;

public class JanelaAviso extends JanelaAbstrata {
	public JanelaAviso(JanelaImplementada janela) {
		super(janela);
	}
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
}
