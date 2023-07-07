package negocio;

import persistencia.rede.ServidorThread;

import java.util.ArrayList;

public class Servidor {
	private int porta; 
	private ServidorThread thread;
	private ArrayList<Cliente> clientes;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.thread = new ServidorThread(this);
		this.clientes = new ArrayList<Cliente>();
	}
	
	public int getPorta() {
		return this.porta;
	}
	
	public void ouvir() {
		this.thread.start();
	}
	
	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
}
