package br.aeso.aula16.prototype;
public class ExemploNota {
	public static void main (String[] args) {
		Nota nota = new Nota("D�");
		Nota nota2 = (Nota) nota.clone();
		nota2.setSom("R�");
		System.out.println(nota.getSom());
		System.out.println(nota2.getSom());
	}
}
