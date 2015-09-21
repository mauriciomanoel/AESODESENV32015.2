package br.aeso.aula12.exemplo03;

public class EmissorSincronoJMS implements Emissor {
	public void envia (String mensagem) {
		System.out.println(" Envio Assincrono por JMS a mensagem : ");
		System.out.println( mensagem );
	}
}
