package br.aeso.aula12.exemplo01;

public class MainComFabrica {
    public static void main(String args[]) {
       // for (int tipo = 1; tipo <= 3; tipo++) {
        	Pizzaria fabricaPizza = new Pizzaria();
        	Pizza pizza = fabricaPizza.criarPizza(Pizza.PORTUGUESA);
            System.out.println("=== INICIO PREPARACAO " 
            					+ pizza.tipo() + " ===");
            pizza.fazer();
            pizza.embalar();
            pizza.entregar();
        //}
    }
}
