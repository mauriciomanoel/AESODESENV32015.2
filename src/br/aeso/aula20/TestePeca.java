package br.aeso.aula20;
public class TestePeca {
	public static void main(String[] args) {
		PecaRedonda pecaRedonda = new PecaRedonda();
		PecaQuadrada pecaQuadrada = new PecaAdapter(pecaRedonda);
		pecaQuadrada.insert("Inserindo Peça Quadrada");
	}
}
