package persistencia;

import java.net.Socket;

import negocio.Cliente;

public class ClienteSocket {
	
	public ClienteSocket(Cliente cliente) {
		
		try {
			Socket socket = new Socket("localhost", cliente.getPorta());
			
		} catch (Exception error) {
			System.out.println("Deu ruim no cliente");
			
			error.printStackTrace();
		}
		
	}
	
}
