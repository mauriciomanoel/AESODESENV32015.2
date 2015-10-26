package br.aeso.aula20;
public class TesteTomada {
	public static void main(String[] args) {
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
		TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaAdapter(t3);
		tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();
	}
}
