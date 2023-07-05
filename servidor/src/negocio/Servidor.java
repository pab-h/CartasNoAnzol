package negocio;

import persistencia.rede.ServidorThread;

public class Servidor {
	private int porta; 
	private ServidorThread thread;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.thread = new ServidorThread(this);
	}
	
	public int getPorta() {
		return this.porta;
	}
	
	public void ouvir() {
		this.thread.start();
	}
	
}
