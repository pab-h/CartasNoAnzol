package apresentacao;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelEsquerda extends JPanel {

	private JButton continuar;
	private JButton pausar;
	private JPanel painelBotoes;

	public PainelEsquerda() {
		CriarBotões();
	}

	public void CriarBotões() {

		setLayout(new BorderLayout());
		setBackground(Color.BLACK);

		painelBotoes = new JPanel();
		painelBotoes.setLayout(new GridBagLayout());

		continuar = new JButton();
		pausar = new JButton();
		ImageIcon continuarIcon = new ImageIcon(
				"iconesServidor/next.png");
		ImageIcon pausarIcon = new ImageIcon(
				"iconesServidor/pause.png");
		continuar.setIcon(continuarIcon);
		pausar.setIcon(pausarIcon);
		continuar.setBackground(Color.WHITE);
		pausar.setBackground(Color.white);
		continuar.setPreferredSize(new Dimension(50, 50));
		pausar.setPreferredSize(new Dimension(50, 50));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 10, 10);
		painelBotoes.add(continuar, gbc);

		gbc.gridx = 1;
		painelBotoes.add(pausar, gbc);
		painelBotoes.setBackground(new Color(216,191,216));

		add(painelBotoes, BorderLayout.CENTER);
	}
}
