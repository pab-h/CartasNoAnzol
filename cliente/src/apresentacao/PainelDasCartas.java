package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import negocio.Carta;

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
		setBackground(new Color(230,230,250));
	}

//	public void CartaUm() {
//		cartaUm = new JButton();
//		cartaUm.setPreferredSize(new Dimension(150, 200));
//		cartaUm.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\CORPSE BRIDE POLAROID POSTER.png");
//		cartaUm.setIcon(icon);
//		add(cartaUm);
//	}
//	
//	public void CartaDois() {
//		cartaDois = new JButton();
//		cartaDois.setPreferredSize(new Dimension(150, 200));
//		cartaDois.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\avengers_ endgame.jpg");
//		cartaDois.setIcon(icon);
//		add(cartaDois);
//		
//	}
//
//	public void CartaTres() {
//		cartaTres = new JButton();
//		cartaTres.setPreferredSize(new Dimension(150, 200));
//		cartaTres.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\Harry Potter & Philosophers Stone by Maja.jpg");
//		cartaTres.setIcon(icon);
//		add(cartaTres);
//
//	}
//
//	public void CartaQuatro() {
//		cartaQuatro = new JButton();
//		cartaQuatro.setPreferredSize(new Dimension(150, 200));
//		cartaQuatro.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\Sherk.jpg");
//		cartaQuatro.setIcon(icon);
//		add(cartaQuatro);
//
//	}
//
//	public void CartaCinco() {
//		cartaCinco = new JButton();
//		cartaCinco.setPreferredSize(new Dimension(150, 200));
//		cartaCinco.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\Titanic by Maja.jpg");
//		cartaCinco.setIcon(icon);
//		add(cartaCinco);
//	}
//
//	public void CartaSeis() {
//		cartaSeis = new JButton();
//		cartaSeis.setPreferredSize(new Dimension(150, 200));
//		cartaSeis.setBackground(Color.white);
//		ImageIcon icon = new ImageIcon("C:\\Windows\\Temp\\ws-eclipse1\\modeloDeVizuzalizacao\\Icones\\cars.jpg");
//		cartaSeis.setIcon(icon);
//		add(cartaSeis);
//	}
	
	public void exibirCartas(ArrayList<Carta> cartas) {
	
		 this.removeAll();
		 
		 JPanel painelCartas = new JPanel(new GridLayout(2, 3, 10, 10)); 
		    for (Carta carta : cartas) {
		        JButton botaoCarta = new JButton(); 
		        botaoCarta.setPreferredSize(new Dimension(150, 200)); 
	      
		        ImageIcon icon = new ImageIcon(carta.getCaminho()); 
		        botaoCarta.setIcon(icon);

		        painelCartas.add(botaoCarta); 
		    }
		    add(painelCartas);			
	}
	
	public void adicionarCartasAoPainel() {
		
		JPanel painelCentral = new JPanel(new GridLayout(2, 3, 10, 10));		
		
//		exibirCartas(null);
//		CartaUm();
//		CartaDois();
//		CartaTres();
//		CartaQuatro();
//		CartaCinco();
//		CartaSeis();
//		
//		painelCentral.add(cartaUm);
//		painelCentral.add(cartaDois);
//		painelCentral.add(cartaTres);
//		painelCentral.add(cartaQuatro);
//		painelCentral.add(cartaCinco);
//		painelCentral.add(cartaSeis);
//		
		add(painelCentral, BorderLayout.CENTER);
	}
}
