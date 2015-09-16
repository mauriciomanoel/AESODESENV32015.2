package br.aeso.aula12.exemplo02;

import br.aeso.aula12.exemplo02.Pizza;
import br.aeso.aula12.exemplo02.PizzaMarguerita;
import br.aeso.aula12.exemplo02.Pizzaria;

public class PizzariaCentro extends Pizzaria {

	@Override
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
