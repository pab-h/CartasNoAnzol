package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class PainelDoRanking extends JPanel{
	
	private JPanel painelRanking;
	private JPanel painelJogadores;
	private JLabel ranking;
	private JLabel pontuacao;
	private JLabel jogadores;
	private JLabel jogador1;
	private JLabel pontos1;
	private JLabel jogador2;	
	private JLabel pontos2;
	private JLabel jogador3;	
	private JLabel pontos3;
	private JLabel jogador4;
	private JLabel pontos4;
	private JPanel jogador1Panel;
	private JPanel jogador2Pane2;
	private JPanel jogador3Pane3;
	private JPanel jogador4Pane4;
	private JPanel sair;
	private JButton creditos;
	private JButton botaoSair;
	
	

	
	public PainelDoRanking () {		
		setLayout(new BorderLayout());		
		adicionarTudo();	
		
	}
	
	public void ranking() {
		
		this.setLayout(new FlowLayout());
		painelRanking =  new JPanel();
		ranking = new JLabel("RAKING");	
		ranking.setFont(new Font("Open Sans", Font.BOLD, 20)); 
		
		JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\troféu.png")));
		painelRanking.add(ranking);	
		painelRanking.setPreferredSize(new Dimension(300, 35));
		painelRanking.add(label);
		add(painelRanking);
	
	}
	
	public void jogadoresEPontucao() {
			
		this.setLayout(new GridLayout(7, 2));

	    painelJogadores = new JPanel();
	    painelJogadores.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 0)); // Espaçamento horizontal de 20 pixels
	    JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\winner.png")));
	    jogadores = new JLabel("JOGADOR");
	    pontuacao = new JLabel("PONTUAÇÃO");
	    painelJogadores.add(label);
	    painelJogadores.add(jogadores);
	    painelJogadores.add(pontuacao);
	

	    add(painelJogadores);
      }
	
	public void painelJogadorUm() {
		
		
		 jogador1Panel = new JPanel();
		 jogador1Panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		 JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\gamer.png")));
		 jogador1 = new JLabel("Jogador 1");
		 pontos1 = new JLabel("0");
		 jogador1Panel.add(label);
		 jogador1Panel.add(jogador1);
		 jogador1Panel.add(pontos1);
		 add(jogador1Panel);
		
	}
	public void painelJogadorDois() {
		
		
		 jogador2Pane2 = new JPanel();
		 jogador2Pane2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		 JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\gamer (1).png")));
		 jogador2 = new JLabel("Jogador 2");
		 pontos2 = new JLabel("0");
		 jogador2Pane2.add(label);
		 jogador2Pane2.add(jogador2);
		 jogador2Pane2.add(pontos2);
		 add(jogador2Pane2);
		
	}
	public void painelJogadorTres() {
		
		
		 jogador3Pane3 = new JPanel();
		 jogador3Pane3.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		 JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\gamer (2).png")));
		 jogador3 = new JLabel("Jogador 3");
		 pontos3 = new JLabel("0");
		 jogador3Pane3.add(label);
		 jogador3Pane3.add(jogador3);
		 jogador3Pane3.add(pontos3);
		 add(jogador3Pane3);
		
	}
	public void painelJogadorQuatro() {
		
		
		 jogador4Pane4 = new JPanel();
		 jogador4Pane4.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		 JLabel label = (new JLabel(new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\gamer (3).png")));
		 jogador4 = new JLabel("Jogador 4");
		 pontos4 = new JLabel("0");
		 jogador4Pane4.add(label);
		 jogador4Pane4.add(jogador4);
		 jogador4Pane4.add(pontos4);
		 add(jogador4Pane4);
		
	}
	public void painelFinal() {
		
		sair = new JPanel();
		creditos = new JButton("Créditos");
		botaoSair = new JButton("Sair");
		sair.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		creditos.addActionListener(new creditosevento());
		botaoSair.addActionListener(new sairEvento());
		sair.add(creditos);
		sair.add(botaoSair);
		
		add(sair);
			
	}
	public class creditosevento implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			UIManager.put("Button.background", new Color(255, 228, 225));
	        ImageIcon coding = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\coding.png");
	        
	        String mensagem = "Antônio Lucas\n"
	        				  +"Laisa Mireli\n" +
	        				  "Lara Vitória\n"+
	                          "Pablo Hugo\n" ;
	        JOptionPane.showMessageDialog(null, mensagem, "Criadores de Cartas no Anzol", JOptionPane.INFORMATION_MESSAGE, coding);
		}
	}
	
	public class sairEvento implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			UIManager.put("Button.background", new Color(255, 228, 225));
			ImageIcon aviso = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\exit.png");
			UIManager.put("OptionPane.questionIcon", aviso);

			Object[] options = { "Sim", "Não" };
			int confirmacao = JOptionPane.showOptionDialog(null, "Você deseja fechar o jogo?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			if (confirmacao == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			
		}
		
	}

	public void adicionarTudo() {	
	
		ranking();
		jogadoresEPontucao();
		painelJogadorUm();
		painelJogadorDois();
		painelJogadorTres();
		painelJogadorQuatro();
		painelFinal();
		
	}

}
