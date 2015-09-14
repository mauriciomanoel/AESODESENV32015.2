package br.aeso.aula07.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.aeso.aula07.cliente.Cliente;

public class Exemplo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Integer codigo = 0;
			Cliente cliente = new Cliente("Nome", "CPF", "BB");
			System.out.println(cliente);
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost/aula11", "root", "root");
			String sql = "insert into cliente (nome, cpf, banco) values (?,?,?)";
			PreparedStatement prepareStatement = 
					conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			prepareStatement.setString(1, cliente.getNome());
			prepareStatement.setString(2, cliente.getCpf());
			prepareStatement.setString(3, cliente.getBanco());
			prepareStatement.execute();
			
			ResultSet resultSet = prepareStatement.getGeneratedKeys();
			while(resultSet.next()) {
				codigo = resultSet.getInt(1);
			}
			cliente.setCodigo(codigo);
			System.out.println(cliente);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		/*
		
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getString("nome"));
		}
*/
	}

}
