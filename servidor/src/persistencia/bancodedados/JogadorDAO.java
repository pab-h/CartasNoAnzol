package bancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controler.Jogador;
import controler.Rodada;

public class JogadorDAO {

	private CartasDAO carta;
	
	public void salvarJogador(Jogador jogador, Rodada rodada) {
		
		try {
			
			Connection conexao = new Conexao().getConexao();
            PreparedStatement result = conexao.prepareStatement("INSERT INTO cartas_selecionadas(id_da_Rodada, id_carta, nome_Jogador) VALUES(?,?,?)");
	            result.setInt(1, rodada.id);
	            result.setString(2, carta.selecionarCarta(jogador));
	            result.setString(3, jogador.nome);

	            result.executeUpdate();
	            conexao.close();
	        } catch (SQLException e) {
	            
	        }
	    }
	
	
	
	
	
}
