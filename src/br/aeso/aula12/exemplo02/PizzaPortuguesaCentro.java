package br.aeso.aula12.exemplo02;

public class PizzaPortuguesaCentro extends Pizza {
    public void fazer() {
        super.fazer();
        System.out.println("** Colocar queijo");
        System.out.println("** Colocar presunto");
        System.out.println("** Colocar cebola e tomate");
        System.out.println("** Levar ao forno por 5 minutos");
    }
    public String tipo() {
    	return "PORTUGUESA";
    }
    @Override
	public void preparar() {
		System.out.println("=== INICIO PREPARACAO PIZZA " 
				+ this.tipo() + " ===");
	}
}
