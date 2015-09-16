package br.aeso.aula12.exemplo04;
public class Pizzaria {
	private IFabrica fabrica;

    public Pizzaria(IFabrica fabrica)   {
        this.fabrica = fabrica;
    }

    public void setFabrica(IFabrica fabrica) {
        this.fabrica = fabrica;
    }
    
	public Pizza pedirPizza(int tipo)    {
        Pizza pizza = fabrica.criarPizza(tipo);
		pizza.fazer();
		pizza.embalar();
		pizza.entregar();
        return pizza;
    }
}
