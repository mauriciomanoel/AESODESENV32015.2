package br.aeso.aula12.main;

import br.aeso.aula12.cliente.CPFInvalidoException;
import br.aeso.aula12.cliente.Cliente;
import br.aeso.aula12.cliente.ClienteJaCadastradoException;
import br.aeso.aula12.endereco.Endereco;
import br.aeso.aula12.endereco.EnderecoJaCadastradoException;
import br.aeso.aula12.fachada.Fachada;
import br.aeso.aula12.util.CampoObritarorioInvalidoException;

public class TelaCadastrarCliente {

	public static void main(String[] args) {
		Fachada fachada = Fachada.getInstance();
		Cliente cliente = new Cliente("Mauricio Manoel", "913.760.817-76", "Bradesco");
		Endereco endereco = new Endereco(cliente, "rua", "numero", "complemento", "bairro", "cidade", "cep");
		cliente.setEndereco(endereco);
		try {
			fachada.cadastrarCliente(cliente);
		} catch (IllegalArgumentException | CPFInvalidoException | ClienteJaCadastradoException
				| CampoObritarorioInvalidoException | EnderecoJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
