package br.aeso.aula12.exemplo02;
abstract class Pizzaria {
	
	public Pizza pedirPizza(int tipo)    {
        Pizza pizza = criarPizza(tipo);
		pizza.fazer();
		pizza.embalar();
		pizza.entregar();
        return pizza;
    }
	
    public abstract Pizza criarPizza(int tipo);
}
