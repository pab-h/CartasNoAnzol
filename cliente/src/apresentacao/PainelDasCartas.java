package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelDasCartas extends JPanel {
	
	private JPanel painelCartas;
	private JButton cartaUm;
	private JButton cartaDois;
	private JButton cartaTres;
	private JButton cartaQuatro;
	private JButton cartaCinco;
	private JButton cartaSeis;
	
	public PainelDasCartas(){
		adicionarCartasAoPainel();
	 
	}

	public void CartaUm() {
		cartaUm = new JButton();
		cartaUm.setPreferredSize(new Dimension(150, 200));
		cartaUm.setBackground(Color.white);
		add(cartaUm);
	}
	
	public void CartaDois() {
		cartaDois = new JButton();
		cartaDois.setPreferredSize(new Dimension(150, 200));
		cartaDois.setBackground(Color.white);
		add(cartaDois);
		
	}

	public void CartaTres() {
		cartaTres = new JButton();
		cartaTres.setPreferredSize(new Dimension(150, 200));
		cartaTres.setBackground(Color.white);
		add(cartaTres);

	}

	public void CartaQuatro() {
		cartaQuatro = new JButton();
		cartaQuatro.setPreferredSize(new Dimension(150, 200));
		cartaQuatro.setBackground(Color.white);
		add(cartaQuatro);

	}

	public void CartaCinco() {
		cartaCinco = new JButton();
		cartaCinco.setPreferredSize(new Dimension(150, 200));
		cartaCinco.setBackground(Color.white);
		add(cartaCinco);
	}

	public void CartaSeis() {
		cartaSeis = new JButton();
		cartaSeis.setPreferredSize(new Dimension(150, 200));
		cartaSeis.setBackground(Color.white);
		add(cartaSeis);
	}
	public void adicionarCartasAoPainel() {
		
		JPanel painelCentral = new JPanel(new GridLayout(2, 3, 10, 10));
		
		CartaUm();
		CartaDois();
		CartaTres();
		CartaQuatro();
		CartaCinco();
		CartaSeis();
		
		painelCentral.add(cartaUm);
		painelCentral.add(cartaDois);
		painelCentral.add(cartaTres);
		painelCentral.add(cartaQuatro);
		painelCentral.add(cartaCinco);
		painelCentral.add(cartaSeis);
		
		
		add(painelCentral, BorderLayout.CENTER);
	}

}
