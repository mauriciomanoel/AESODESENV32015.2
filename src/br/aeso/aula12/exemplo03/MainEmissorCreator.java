package br.aeso.aula12.exemplo03;

public class MainEmissorCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmissorCreator creator = new EmissorCreator();
		Emissor emissor = creator.create(EmissorCreator.EMAIL);
		emissor.envia("AESO - 2015.2");
		emissor = creator.create(EmissorCreator.SMS);
		emissor.envia("AESO - 2015.2");
	}

}
