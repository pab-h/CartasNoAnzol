package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conexao {
	private String host;
	private String usuario;
	private String senha;
	private String banco;

	public Conexao() {

		this.host = "127.0.0.1";
		this.banco = "test";
		this.usuario = "root";
		this.senha = ""; 
	}

	public Connection getConexao() {
		
		String url = "jdbc:mysql://" + this.host + "/" + this.banco+"?verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
