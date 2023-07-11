package negocio;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import apresentacao.PainelDasCartas;

public class Carta {
	private PainelDasCartas painelDasCartas;

	private String caminho;
	private int id;
	private ArrayList<Carta> cartas;
	private ImageIcon imagemCarta;

	public Carta(String caminho, int id, ImageIcon imagemCarta) {
		this.caminho = caminho;
		this.id = id;
		this.cartas = cartas;
		this.imagemCarta = imagemCarta;
	}

	public String getCaminho() {
		return this.caminho;
	}

}
