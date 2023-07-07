package negocio;

import persistencia.ClienteSocket;

public class Cliente {

	private int porta;
	private ClienteSocket socket;
	
	public Cliente(int porta) {
		this.porta = porta;
		this.socket = new ClienteSocket(this);
	}
	
	public int getPorta() {
		return this.porta;
	}
	
}
