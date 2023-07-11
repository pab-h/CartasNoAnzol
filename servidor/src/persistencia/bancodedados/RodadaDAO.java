package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controler.Rodada;

public class RodadaDAO {

	private CartasDAO carta;
	
	public void salvarRodada(Rodada rodada) {
	
		 try {
			   Connection conexao = new Conexao().getConexao();
	           PreparedStatement result = conexao.prepareStatement("INSERT INTO rodada(jogador_da_vez, dica, caminho_carta) VALUES(?,?,?)");
	            result.setString(1, rodada.nomejogador);
	            result.setString(2, rodada.dica);
	            result.setString(3, carta.selecionarCarta(rodada.jogador));
	            

	            result.executeUpdate();
	      
	            conexao.close();
	        } catch (SQLException e) {
	          
	        }
		 selecionarRodada(rodada);
	    }
	
	
	
	public void selecionarRodada(Rodada rodada) {
		
		try {
			Connection conexao = new Conexao().getConexao();
            PreparedStatement result = conexao.prepareStatement("SELECT id FROM rodada WHERE dica = ?");
            result.setString(1, rodada.dica);
			
            ResultSet resultado = result.executeQuery();
               
			if(resultado.next()){
	                rodada.id = resultado.getInt("id");}
			
			conexao.close();
		} catch (Exception e) {
			
		}
		
	}
	
	
	
	

	
}
