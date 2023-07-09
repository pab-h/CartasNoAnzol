package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaServidor extends JFrame {

	public JanelaServidor() {
		this.setTitle("Cartas no Anzol");
		this.setSize(450, 250);

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

