package br.aeso.aula12.exemplo04;

import br.aeso.aula12.exemplo04.Pizza;
import br.aeso.aula12.exemplo04.PizzaMarguerita;
import br.aeso.aula12.exemplo04.Pizzaria;

public class PizzariaJardimBrasil implements IFabrica {

	public Pizza criarPizza(int tipo) {
		Pizza pizza = null;
        if (tipo == Pizza.PORTUGUESA) {
        	pizza = new PizzaPortuguesaJardimBrasil();
        } else if (tipo == Pizza.MARGUERITA) {
        	pizza = new PizzaMarguerita();
        } 
        return pizza;
	}
}
