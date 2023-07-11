package negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.*;

public class GerenciadorJogo {
	private PainelEsquerda painelEsquerda;
	private painelDaDica painelDaDica;
	private PainelEnviarDica painelEnviarDica;

	public GerenciadorJogo(painelDaDica painelDaDica, PainelEnviarDica painelEnviarDica, PainelEsquerda painelEsquerda) {
		this.painelDaDica = painelDaDica;
		this.painelEnviarDica = painelEnviarDica;
		this.painelEsquerda = painelEsquerda;
		
		painelEnviarDica.getEnviar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("chamou");
				atualizarDica();
				
			}
		});
	}
	
	
	
	public void atualizarDica() {
		//painelEsquerda.getPED().getTextField().setText("Dica: " + String.valueOf(painelEsquerda.getPD().getDicaRecebida()));
		painelDaDica.getDicaRecebida().setText(painelEnviarDica.getTextField().getText());
		System.out.println("Enviou");
	}
}
