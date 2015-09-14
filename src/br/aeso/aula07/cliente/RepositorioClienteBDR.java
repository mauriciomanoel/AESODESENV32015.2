package br.aeso.aula07.cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RepositorioClienteBDR implements IRepositorioCliente {
    private Connection conn;
    public RepositorioClienteBDR() {
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/aula11", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
    
	public void cadastrar(Cliente cliente) throws ClienteJaCadastradoException {
		// Verifica se o cliente já existe no repositório
		if (!this.existe(cliente.getCpf())) throw new ClienteJaCadastradoException();
        // Criando a String SQL
        String sql ="insert into cliente (nome, cpf, banco) values (?, ?, ?)";
 
        // Criar o PreparedStatement, objeto para executar a query
        PreparedStatement preStatement = null;
        ResultSet resultSet = null;
		try {
			preStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
	        // Atualizando o primeiro parametro
	        preStatement.setString(1, cliente.getNome());
	        preStatement.setString(2, cliente.getCpf());
	        preStatement.setString(3, cliente.getBanco());
	        preStatement.execute();
	        // Retorna um ResultSet com todas as chaves geradas
	        resultSet = preStatement.getGeneratedKeys();
	        Integer clienteId = 0;
	        // Pegando o identificador gerado a partir do último insert
	        while(resultSet.next()) {
	        	clienteId = resultSet.getInt(1);
	        }
	        cliente.setCodigo(clienteId);
	        
	        // Fechando conexões
	        preStatement.close();
	        resultSet.close();
	        
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
    }
	
	public void remover(String cpf) throws ClienteNaoEncontradoException {
	}
	public Cliente procurar(String cpf) throws ClienteNaoEncontradoException {
		return null;
	}
	public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException {
	}
	
	public boolean existe(String cpf) {
		return true;
    }
	
	public ArrayList<Cliente> listar()  {
		return null;
	}
	
	public ArrayList<Cliente> listar(String complemento) throws SQLException {
		return null;
	}

	
}