package br.aeso.aula12.exemplo04;

public class PizzaMarguerita extends Pizza {
    @Override
    public void fazer() {
        super.fazer();
        System.out.println("** Colocar queijo");
        System.out.println("** Colocar oregano");
        System.out.println("** Colocar manjericao");
        System.out.println("** Levar ao forno por 4 minutos");
    }
    public String tipo() {
    	return "MARGUERITA";
    }
    @Override
	public void preparar() {
		System.out.println("=== INICIO PREPARACAO PIZZA " 
				+ this.tipo() + " ===");
	}
}
