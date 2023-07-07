package persistencia.rede;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.Thread;

import java.net.ServerSocket;
import java.net.Socket;

import negocio.Cliente;
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
				Socket socket = servidor.accept();
				
				ClienteSocket clienteSocket = new ClienteSocket(socket);
				
				Cliente cliente = new Cliente(clienteSocket);
				
				this.servidor.getClientes().add(cliente);
				
				System.out.println("Quantidade de clientes: " + this.servidor.getClientes().size());
				
			}
			
		} catch (IOException erro) {
			
			System.out.println("Deu ruim no servidor");
			
			erro.printStackTrace();
		}
			
		
		
	}
}
