package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controler.Jogador;

public class CartasDAO {

	
	public void salvarCarta(String caminho) {
		
		 try {
			 Connection conexao = new Conexao().getConexao();
             PreparedStatement result = conexao.prepareStatement("INSERT INTO cartas(caminho_carta) VALUES(?)"); 
	            result.setString(1, caminho);
	            
	            result.executeUpdate();
	            conexao.close();
	        } catch (SQLException e) {

	        }
	    }
	
	
	public String selecionarCarta(Jogador jogador) {
		String carta = null;
		
			try {
				Connection conexao = new Conexao().getConexao();
	
				PreparedStatement result = conexao.prepareStatement("SELECT caminho_carta FROM cartas WHERE id = ?");
	
				result.setInt(1, jogador.cartadavez);
				ResultSet resultado = result.executeQuery();
	
				
				if(resultado.next()){
		            carta = resultado.getString("caminho_carta");
		           }
				conexao.close();
			} catch (Exception e) {
				
			}
			return carta;
		}
		
}
