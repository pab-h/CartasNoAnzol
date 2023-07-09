package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class PainelPrincipal extends JPanel {

	public PainelPrincipal() {
		setLayout(new BorderLayout());
		PainelEsquerda PE = new PainelEsquerda();
		add(PE, BorderLayout.CENTER);
		PainelDireita PD = new PainelDireita();
		add(PD, BorderLayout.EAST);
	}

}
