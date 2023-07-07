package negocio;

import persistencia.rede.ClienteSocket;

public class Cliente {

	private ClienteSocket socket;
	
	public Cliente(ClienteSocket socket) {
		this.socket = socket;
	}
	
}
