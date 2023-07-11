package negocio;

import apresentacao.*;

public class GerenciadorJogo {
	private PainelMenu painelMenu;
	private painelDaDica painelDaDica;
	private PainelEnviarDica painelEnviarDica;

	public GerenciadorJogo(painelDaDica painelDaDica, PainelEnviarDica painelEnviarDica, PainelMenu painelMenu) {
		this.painelDaDica = painelDaDica;
		this.painelEnviarDica = painelEnviarDica;
		this.painelMenu = painelMenu;
	}
	
	public void atualizarDica() {
		
	}
}
