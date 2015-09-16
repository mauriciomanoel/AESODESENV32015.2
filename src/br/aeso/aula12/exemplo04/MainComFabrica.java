package br.aeso.aula12.exemplo04;

public class MainComFabrica {
    public static void main(String args[]) {
    	Pizzaria pizzariaCentro = new Pizzaria(new PizzariaCentro());
    	Pizzaria pizzariaJardimBrasil = new Pizzaria(new PizzariaJardimBrasil());
    	
    	pizzariaCentro.pedirPizza(Pizza.PORTUGUESA);
    	pizzariaJardimBrasil.pedirPizza(Pizza.PORTUGUESA);
    }
}
