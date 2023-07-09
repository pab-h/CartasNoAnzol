package main;

import apresentacao.*;
import apresentacao.Janela;
import negocio.Cliente;

public class Main {

	public static void main(String[] args) {
		Janela janela = new Janela();
		Cliente cliente = new Cliente(1313); // Combinação das duas versões
	}
}