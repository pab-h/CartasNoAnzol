package apresentacao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import negocio.Servidor;

public class PainelEsquerda extends JPanel {

	private JButton continuar;
	private JButton pausar;
	private JPanel painelBotoes;
	private Servidor servidor;

	public PainelEsquerda(Servidor servidor) {
		this.servidor = servidor;
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
		
		continuar.addActionListener(new eventoConectar());
		pausar.addActionListener(new eventoParar());

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

	public class eventoConectar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			  servidor.ouvir();

		}
	}
	public class eventoParar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			  Servidor servidor = new Servidor(1234); 
			
		}
	}
}
