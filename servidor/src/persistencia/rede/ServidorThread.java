package persistencia.rede;

import java.io.IOException;
import java.lang.Thread;
import java.net.ServerSocket;
import java.net.Socket;

import negocio.Servidor;

public class ServidorThread extends Thread {

	private Servidor servidor;
	
	public ServidorThread(Servidor servidor) {
		super("Thread do servidor");
		
		this.servidor = servidor;
	}
	
	@Override
	public void run() {
		System.out.println("Thread do servidor rodando");
		
		try {
			ServerSocket servidor = new ServerSocket(this.servidor.getPorta());
			
			System.out.println("Servidor ouvindo em  127.0.0.1:" + this.servidor.getPorta());
			
			while (true) {
				Socket cliente = servidor.accept();
				
				System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
				
			}
			
		} catch (IOException erro) {
			
			System.out.println("Deu ruim no servidor");
			
			erro.printStackTrace();
		}
			
		
		
	}
}
