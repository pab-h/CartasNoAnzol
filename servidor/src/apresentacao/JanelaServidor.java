package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import negocio.Servidor;

public class JanelaServidor extends JFrame {

	public JanelaServidor(Servidor servidor) {
		this.setTitle("Cartas no Anzol");
		this.setSize(450, 250);

		ImageIcon icon = new ImageIcon("iconesServidor/fish.png");
		this.setIconImage(icon.getImage());
		this.setLayout(new BorderLayout());
		setResizable(false);

		PainelPrincipal painelPrincipal = new PainelPrincipal(servidor);
		this.add(painelPrincipal, BorderLayout.CENTER);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
}

