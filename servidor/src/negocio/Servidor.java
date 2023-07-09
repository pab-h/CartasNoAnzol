package negocio;

import java.util.Random;

import persistencia.rede.ServidorThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Servidor {
	private int porta; 
	private ServidorThread thread;
	private ArrayList<Cliente> clientes;
	
	public Servidor(int porta) {
		this.porta = porta;
		this.thread = new ServidorThread(this);
		this.clientes = new ArrayList<Cliente>();
	}
	
	public static List<Integer> sortearCartas() {
		List<Integer> ids = new ArrayList<>();
		for (int i = 1; i <= 24; i++) {
			ids.add(i);
		}
		Collections.shuffle(ids);
		return ids;
	}

	public static List<List<Integer>> agruparIds(List<Integer> ids) {
		List<List<Integer>> deckPorJogador = new ArrayList<>();
		int tamanhoDoDeck = 6;
		int quantidadeDeck = 4;
		
		for (int i = 0; i < quantidadeDeck; i ++) {
			deckPorJogador.add(new ArrayList<>());
		}
		
		int deckVazio = 0;
		for (Integer id : ids) {
			deckPorJogador.get(deckVazio).add(id);
			
			if (deckPorJogador.get(deckVazio).size() >= tamanhoDoDeck)
				deckVazio = (deckVazio + 1) % quantidadeDeck;
		}
		
		return deckPorJogador;
	}

	public static boolean verificarDecksIguais(List<List<Integer>> deckPorJogador) {
		for (int i = 0; i < deckPorJogador.size(); i++) {
			List<Integer> deck = deckPorJogador.get(i);
			for (int j = 0; j < deckPorJogador.size(); j++) {
				List<Integer> outroDeck = deckPorJogador.get(i);
				for (int k = 0; k < deck.size(); k++) {
					Integer id = deck.get(k);
					if(outroDeck.contains(id)) {
						for (int l = 0; l < 24;) {
							if(!deck.contains(l) && !outroDeck.contains(l))
								deck.set(k, l);
							break;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static Cliente sortearJogador(ArrayList<Cliente> clientes) {
		Random random = new Random();
		int idJogadorSorteado = random.nextInt(clientes.size());
		return clientes.get(idJogadorSorteado);
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
