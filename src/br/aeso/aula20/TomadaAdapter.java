package br.aeso.aula20;
public class TomadaAdapter extends TomadaDeDoisPinos {
	private TomadaDeTresPinos tomadaDeTresPinos;
	
	public TomadaAdapter(TomadaDeTresPinos tomadaDeTresPinos) {
		this.tomadaDeTresPinos = tomadaDeTresPinos;
	}
	public void ligarNaTomadaDeDoisPinos() {
		tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
	}

}
