package br.aeso.aula12.exemplo01;

public class Pizzaria {
    public Pizza criarPizza(int tipo) {
        Pizza pizza = null;
        if (tipo == Pizza.MARGUERITA) {
        	pizza = new PizzaMarguerita();
        } else if (tipo == Pizza.PORTUGUESA) {
        	pizza = new PizzaPortuguesa();
        } 
        return pizza;
    }
}
