package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class PainelEsquerda extends JPanel {
	private painelDaDica PD;
	private PainelDasCartas PC;
	private PainelEnviarDica PED;

	public PainelEsquerda() {
		setLayout(new BorderLayout());

		PD = new painelDaDica();
		add(PD, BorderLayout.NORTH);

		PC = new PainelDasCartas();
		add(PC, BorderLayout.CENTER);

		PED = new PainelEnviarDica();
		add(PED, BorderLayout.SOUTH);
		setBackground(new Color(230, 230, 250));
	}

	public painelDaDica getPD() {
		return PD;
	}

	public void setPD(painelDaDica pD) {
		PD = pD;
	}

	public PainelDasCartas getPC() {
		return PC;
	}

	public void setPC(PainelDasCartas pC) {
		PC = pC;
	}

	public PainelEnviarDica getPED() {
		return PED;
	}

	public void setPED(PainelEnviarDica pED) {
		PED = pED;
	}

}
