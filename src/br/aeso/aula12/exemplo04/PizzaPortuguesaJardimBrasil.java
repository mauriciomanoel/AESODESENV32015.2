package br.aeso.aula12.exemplo04;

public class PizzaPortuguesaJardimBrasil extends Pizza{
    public void fazer() {
        super.fazer();
        System.out.println("** Colocar queijo");
        System.out.println("** Colocar presunto");
        System.out.println("** Colocar cebola, tomate e azeitona");
        System.out.println("** Levar ao forno por 10 minutos");
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
