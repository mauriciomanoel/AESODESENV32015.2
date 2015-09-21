package br.aeso.aula12.exemplo03;

public class EmissorAssincronoEmail implements Emissor {
	public void envia (String mensagem) {
		System.out.println(" Enviando por email a mensagem : ");
		System.out.println( mensagem );
	}
}