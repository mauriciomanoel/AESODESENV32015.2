package br.aeso.aula12.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionManager {
    private static Connection connection;
    public static Connection getConnection(int sistema) {
    	String conexao = "";
    	String usuario = "";
    	String senha = "";
    	if (sistema == Database.MYSQL) {
    		conexao = "jdbc:mysql://localhost/aula11";
    		usuario = "root";
    		senha = "root";
    	}
    	else {
    		throw new IllegalArgumentException("Tipo de banco não suportado");
    	}
    	if (connection == null) {
            try {
            	connection = DriverManager.getConnection(conexao, usuario, senha);
	    	} catch(SQLException e) {
	    		throw new RuntimeException(e);
	    	}
        }
        return connection;
    }
    
    public static void beginTransaction() {
    	if (connection != null) {
	    	try {
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
    	}
    }
    
    public static void rollback() {
    	if (connection != null) {
	    	try {
				connection.rollback();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
    	}
    }
    
    public static void commit() {
    	if (connection != null) {
	    	try {
				connection.commit();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
    	}
    }
    
    public static void close() throws Exception {
    	connection.close();
    }
}