package negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.*;

public class GerenciadorJogo {
	private PainelMenu painelMenu;
	private painelDaDica painelDaDica;
	private PainelEnviarDica painelEnviarDica;

	public GerenciadorJogo(painelDaDica painelDaDica, PainelEnviarDica painelEnviarDica, PainelMenu painelMenu) {
		this.painelDaDica = painelDaDica;
		this.painelEnviarDica = painelEnviarDica;
		this.painelMenu = painelMenu;
		
		painelEnviarDica.getEnviar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				atualizarDica();
				
			}
		});
	}
	
	
	
	public void atualizarDica() {
		painelEnviarDica.getTextField().setText("Dica: " + String.valueOf(painelDaDica.getDicaRecebida()));
		System.out.println("Enviou");
	}
}
