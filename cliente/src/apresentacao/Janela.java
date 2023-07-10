package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Janela extends JFrame {
	
	public Janela () {

		this.setTitle("Cartas no Anzol");
		this.setSize(850, 545);

		ImageIcon icon = new ImageIcon("icones/fish.png");
		this.setIconImage(icon.getImage());
		this.setLayout(new BorderLayout());
		setResizable(false);
		setBackground(new Color(230,230,250));
		
//		PainelPrincipal painelPrincipal = new PainelPrincipal();
//		this.add(painelPrincipal, BorderLayout.CENTER);
		PainelMenu PM = new PainelMenu();
		this.add(PM, BorderLayout.CENTER);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
