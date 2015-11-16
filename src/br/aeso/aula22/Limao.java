package br.aeso.aula22;

public class Limao extends CoquetelDecorator {
	public Limao(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Limão";
		preco = 0.5;
	}
}
