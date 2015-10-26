package br.aeso.aula20;
public abstract class JanelaAbstrata {
	protected JanelaImplementada janela;
    public JanelaAbstrata(JanelaImplementada janela) {
        this.janela = janela;
    }
    public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }
    public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }
    public abstract void desenhar();
}
