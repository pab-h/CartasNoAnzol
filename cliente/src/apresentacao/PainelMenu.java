package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class PainelMenu extends JPanel{
	
	private Image imagemFundo;
	private JLabel nomeDoJogo;
	private JButton jogar;
	private JButton sair;
	private PainelPrincipal painelPrincipal;
	
	public PainelMenu() {	
		try {
			imagemFundo = ImageIO.read(new File("icones/zyro-image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		painelPrincipal = new PainelPrincipal();
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		nomeDoJogo = new JLabel("Cartas no Anzol");
		nomeDoJogo.setFont(new Font("Georgia", Font.BOLD, 54));
		nomeDoJogo.setHorizontalAlignment(JLabel.CENTER);
		nomeDoJogo.setForeground(Color.white);
	
		jogar = new JButton("Jogar");
		jogar.setPreferredSize(new Dimension(440, 40));
		jogar.setFont(new Font("Georgia", Font.BOLD, 16));
		jogar.setBackground(new Color (216,191,216));
		jogar.setForeground(Color.white);
		jogar.addActionListener(new eventoJogar());
		sair = new JButton("Sair");
		sair.setPreferredSize(new Dimension(440, 40));
		sair.setFont(new Font("Georgia", Font.BOLD, 16));
		sair.setBackground(new Color (216,191,216));
		sair.setForeground(Color.white);
		sair.addActionListener(new sairEvento());
		
		JPanel painelSuperior = new JPanel(new GridBagLayout());
		painelSuperior.setBackground(new Color(0, 0, 0, 0)); 
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(20, 0, 130, 0);
		painelSuperior.add(nomeDoJogo, gbc);

		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.insets = new Insets(10, 0, 0, 0); 
		painelSuperior.add(jogar, gbc);

		gbc.gridy = 2;
		painelSuperior.add(sair, gbc);

		add(painelSuperior, BorderLayout.NORTH);
		
		setVisible(true);
			
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(imagemFundo, 0, 0, getWidth(), getHeight(), this);
	}
	
	public class sairEvento implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			UIManager.put("Button.background", new Color(216,191,216));
			ImageIcon aviso = new ImageIcon("icones/exit.png");
			UIManager.put("OptionPane.questionIcon", aviso);

			Object[] options = { "Sim", "Não" };
			int confirmacao = JOptionPane.showOptionDialog(null, "Você deseja fechar o jogo?", "Confirmação",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			if (confirmacao == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			
		}
		
	}
	
	public class eventoJogar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
	        getParent().add(painelPrincipal, BorderLayout.CENTER);
	        setVisible(false);
	        painelPrincipal.setVisible(true);
		}
	}
	
}
