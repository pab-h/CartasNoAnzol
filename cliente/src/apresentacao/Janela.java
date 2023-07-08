package apresentacao;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela extends JFrame {
public Janela () {
		
		this.setTitle("Cartas no Anzol");
		this.setSize(850, 545);
		
		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\fish.png");
		this.setIconImage(icon.getImage());
		this.setLayout(new BorderLayout());
		setResizable(false);
		
		PainelPrincipal painelPrincipal = new PainelPrincipal();
		this.add(painelPrincipal, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
