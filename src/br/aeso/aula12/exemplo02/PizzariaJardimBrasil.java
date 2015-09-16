package br.aeso.aula12.exemplo02;

import br.aeso.aula12.exemplo02.Pizza;
import br.aeso.aula12.exemplo02.PizzaMarguerita;
import br.aeso.aula12.exemplo02.Pizzaria;

public class PizzariaJardimBrasil extends Pizzaria {

	@Override
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
