package br.aeso.aula22;
import java.util.ArrayList;
public class Foto implements Grafico {
	ArrayList<Grafico> graficos = new ArrayList<Grafico>();
	public void add(Grafico grafico) {
		graficos.add(grafico);
	}
	public void remover(Grafico grafico) {
		graficos.remove(grafico);
	}
	@Override
	public void desenhar() {
		for(Grafico graficoTmp: graficos) {
			graficoTmp.desenhar();
		}
	}
}
