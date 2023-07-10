package negocio;

import persistencia.ClienteSocket;
import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {

	private int porta;
	private ClienteSocket socket;
	private ArrayList<Carta> cartas;
	
	public Cliente(int porta) {
		this.porta = porta;
		this.socket = new ClienteSocket(this);
		this.cartas = new ArrayList<Carta>();
	}
	
	public void adicionarCartas(ArrayList<String> ids) {
		DequeCartas dequeCartas = new DequeCartas();
		for (String id : ids) {
			Carta carta = dequeCartas.getCarta(Integer.parseInt(id));
			this.cartas.add(carta);
		}
	}
	
	public int getPorta() {
		return this.porta;
	}
	
	public ClienteSocket getSocket() {
		return this.socket;
	}
	
	public ArrayList<Carta> getCartas() {
		return this.cartas;
	}
	
}
