package br.aeso.aula20;
public class PecaAdapter extends PecaQuadrada {
	private PecaRedonda pecaRedonda;
	public PecaAdapter(PecaRedonda pecaRedonda) {
		this.pecaRedonda = pecaRedonda;
	}
	public void insert(String str) {
		pecaRedonda.insertIntoHole(str);
	}
}
