package apresentacao;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelDireita extends JPanel {

	private JPanel painelStatus;
	private JLabel estado;
	private JLabel status;
	private JLabel conectados;
	private JLabel numeroConectados;

	public PainelDireita() {
		criarPainel();
	}

	public void criarPainel() {

		setLayout(new GridLayout(1, 5));

		painelStatus = new JPanel(new GridBagLayout());
		estado = new JLabel("Estado: ");
		status = new JLabel("Conectado");
		conectados = new JLabel("Conectados: ");
		numeroConectados = new JLabel("4");

		ImageIcon imageStatus = new ImageIcon(
				"iconesServidor/signal.png");
		ImageIcon imageConectados = new ImageIcon(
				"iconesServidor/wireless-router.png");

		JLabel labelStatusIcon = new JLabel(imageStatus);
		JLabel labelConectadosIcon = new JLabel(imageConectados);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(5, 5, 5, 5);

		painelStatus.add(labelStatusIcon, gbc);

		gbc.gridx = 1;
		painelStatus.add(estado, gbc);

		gbc.gridx = 2;
		painelStatus.add(status, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		painelStatus.add(labelConectadosIcon, gbc);

		gbc.gridx = 1;
		painelStatus.add(conectados, gbc);

		gbc.gridx = 2;
		painelStatus.add(numeroConectados, gbc);

		painelStatus.setBackground(new Color(245, 245, 245));
		add(painelStatus, BorderLayout.WEST);
	}

}
