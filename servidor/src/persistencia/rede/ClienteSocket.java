package persistencia.rede;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.net.Socket;

import negocio.Eventos;

public class ClienteSocket {

	private PrintWriter escritor;
	private BufferedReader leitor;
	
	public ClienteSocket(Socket socket) {
		
		try {
			OutputStream saida = socket.getOutputStream();
			this.escritor = new PrintWriter(saida, true);
			
			InputStream entrada = socket.getInputStream();
			this.leitor = new BufferedReader(new InputStreamReader(entrada));
						
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	public void enviarEvento(Eventos evento, String dados) {
		this.escritor.write(evento + "\n" + dados);
	}
	
	public void enviarEvento(Eventos evento) {
		this.escritor.write(evento + "\n");
	}
	

	
}
