package main;

import apresentacao.JanelaServidor;
import negocio.Servidor;

public class Main {

	public static void main(String[] args) {
		
		Servidor servidor = new Servidor(1313);	
		servidor.ouvir();
		
		JanelaServidor JS = new JanelaServidor();
		
	}
}
