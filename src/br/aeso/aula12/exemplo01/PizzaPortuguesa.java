package br.aeso.aula12.exemplo01;

public class PizzaPortuguesa extends Pizza{
    public void fazer() {
        super.fazer();
        System.out.println("** Colocar queijo");
        System.out.println("** Colocar presunto");
        System.out.println("** Colocar cebola, tomate e azeitona");
        System.out.println("** Levar ao forno por 5 minutos");
    }
    public String tipo() {
    	return "PORTUGUESA";
    }
}
