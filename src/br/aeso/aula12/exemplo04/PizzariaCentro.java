package br.aeso.aula12.exemplo04;

import br.aeso.aula12.exemplo04.Pizza;
import br.aeso.aula12.exemplo04.PizzaMarguerita;
import br.aeso.aula12.exemplo04.Pizzaria;

public class PizzariaCentro implements IFabrica {

	public Pizza criarPizza(int tipo) {
		Pizza pizza = null;
        if (tipo == Pizza.PORTUGUESA) {
        	pizza = new PizzaPortuguesaCentro();
        } else if (tipo == Pizza.FRANGO_CATUPIRY) {
        	pizza = new PizzaFrangoCatupiryCentro();
        } else if (tipo == Pizza.MARGUERITA) {
        	pizza = new PizzaMarguerita();
        } 
        return pizza;
	}
}
