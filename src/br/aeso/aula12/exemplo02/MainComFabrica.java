package br.aeso.aula12.exemplo02;

public class MainComFabrica {
    public static void main(String args[]) {
    	Pizzaria pizzariaCentro = new PizzariaCentro();
    	Pizzaria pizzariaJardimBrasil = new PizzariaJardimBrasil();
    	pizzariaCentro.pedirPizza(Pizza.PORTUGUESA);
    	pizzariaJardimBrasil.pedirPizza(Pizza.PORTUGUESA);
    }
}
