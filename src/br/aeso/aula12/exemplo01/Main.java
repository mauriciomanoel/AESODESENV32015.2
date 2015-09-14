package br.aeso.aula12.exemplo01;

public class Main {
    public static void main(String args[]) {
        String pizzas[] = new String[]{"MARGUERITA", "PORTUGUESA"};
        for (int i = 0; i < pizzas.length; i++) {
        	Pizza pizza = null;
            if (pizzas[i].equalsIgnoreCase("MARGUERITA")) {
                pizza = new PizzaMarguerita();
            } else if (pizzas[i].equalsIgnoreCase("PORTUGUESA")) {
            	pizza = new PizzaPortuguesa();
            }
            System.out.println("=== INICIO PREPARACAO " + pizzas[i] + " ===");
            pizza.fazer();
            pizza.embalar();
            pizza.entregar();
        }
    }
}
