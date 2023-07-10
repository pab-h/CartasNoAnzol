package persistencia.rede;

import negocio.Cliente;
import negocio.Eventos;

public class ThreadEventos extends Thread {

	private Cliente cliente;
	
	public ThreadEventos(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void run() {

		while (true) {
			Mensagem mensagem = this.cliente.getSocket().receberMensagem();
			
			if (mensagem == null) {
				continue;
			}
			
			if (mensagem.getEvento() == Eventos.CARTAS_SORTEADAS) {
				System.out.println(mensagem.getDados());
				this.cliente.adicionarCartas(mensagem.getDados());
			}
			
			
		}
		
	}
	
}
