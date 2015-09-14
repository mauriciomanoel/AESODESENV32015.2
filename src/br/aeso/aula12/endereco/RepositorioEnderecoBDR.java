package br.aeso.aula12.endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.aeso.aula12.cliente.ClienteJaCadastradoException;
import br.aeso.aula12.util.ConnectionManager;
import br.aeso.aula12.util.Database;

public class RepositorioEnderecoBDR implements IRepositorioEndereco {
	private Connection conn;
	public RepositorioEnderecoBDR() {
		conn = ConnectionManager.getConnection(Database.MYSQL);
    }
	
	@Override
	public void cadastrar(Endereco endereco) {
        // Criando a String SQL
        String sql ="insert into endereco (cliente_id, rua, numero, complemento, bairro, cidade, cep) values (?, ?, ?, ?, ?, ?, ?)";
 
        // Criar o PreparedStatement, objeto para executar a query
        PreparedStatement preStatement = null;
        ResultSet resultSet = null;
		try {
			preStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
	        // Atualizando o primeiro parametro
	        preStatement.setInt(1, endereco.getCliente().getCodigo());
	        preStatement.setString(2, endereco.getRua());
	        preStatement.setString(3, endereco.getNumero());
	        preStatement.setString(4, endereco.getComplemento());
	        preStatement.setString(5, endereco.getBairro());
	        preStatement.setString(6, endereco.getCidade());
	        preStatement.setString(7, endereco.getCep());
	        preStatement.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void atualizar(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco procurar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco procurarPorCliente(Integer clienteId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Endereco> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
