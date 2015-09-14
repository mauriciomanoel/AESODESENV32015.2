package br.aeso.aula07.main;

import br.aeso.aula07.cliente.Cliente;
import br.aeso.aula07.endereco.Endereco;

public class TelaCadastrarCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Mauricio Manoel", "913.760.817-76", "Bradesco");
		Endereco endereco = new Endereco(cliente, "rua", "numero", "complemento", "bairro", "cidade", "cep");
		cliente.setEndereco(endereco);
	}
}
