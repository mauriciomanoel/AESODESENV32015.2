package br.aeso.aula22;
public class ProgramaCliente {
	public static void main(String[] args) {
		Foto foto = new Foto();
		foto.add(new Linha());
		foto.add(new Retangulo());
		foto.add(new Texto());
		foto.desenhar();
	}

}
