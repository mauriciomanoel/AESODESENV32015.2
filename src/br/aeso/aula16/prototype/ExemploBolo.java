package br.aeso.aula16.prototype;
public class ExemploBolo {
	public static void main(String[] args) {
		CheeseCake cake = new CheeseCake();
		cake.addAcucar("100g");
		cake.addManteiga("200g");
		cake.addQueijo("Reino");
		System.out.println("Bolo = " + cake.toString());
		
		/* Order with custom name */
		CheeseCake cake1 = (CheeseCake) cake.prepareCake();
		cake1.setNome("Bolo Personalizado");
		System.out.println("Bolo1 = " + cake1.toString());


		/* Order with custom name and customized cheese */
		CheeseCake cake2 = (CheeseCake) cake.prepareCake();
		cake2.addQueijo("Extra Queijo");
		cake2.setNome("Bolo do Mau");
		System.out.println("Bolo3 = " + cake2.toString());

	}

}
