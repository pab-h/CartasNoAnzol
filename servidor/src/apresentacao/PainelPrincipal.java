package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import negocio.Servidor;

public class PainelPrincipal extends JPanel {

	public PainelPrincipal(Servidor servidor) {
		setLayout(new BorderLayout());
		PainelEsquerda PE = new PainelEsquerda(servidor);
		add(PE, BorderLayout.CENTER);
		PainelDireita PD = new PainelDireita();
		add(PD, BorderLayout.EAST);
	}

}
