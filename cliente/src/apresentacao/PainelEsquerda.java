package apresentacao;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class PainelEsquerda extends JPanel{
	
	public PainelEsquerda() {
		setLayout(new BorderLayout());

		painelDaDica PD = new painelDaDica();
		add(PD, BorderLayout.NORTH);

		PainelDasCartas PC = new PainelDasCartas();
		add(PC, BorderLayout.CENTER);

		PainelEnviarDica PED = new PainelEnviarDica();
		add(PED, BorderLayout.SOUTH);

	}
}
