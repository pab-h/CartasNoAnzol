package main;

import negocio.Servidor;

public class Main {

	public static void main(String[] args) {
		Servidor servidor = new Servidor(1313);
		
		servidor.ouvir();
		
	}
	
}
