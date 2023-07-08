package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class PainelPrincipal extends JPanel{
	private JPanel principalPainel;
	
	public PainelPrincipal() {
		
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		
		PainelEsquerda pe = new PainelEsquerda();
		PainelDireita pd = new PainelDireita();
		
		add(pe, BorderLayout.WEST);
		add(pd, BorderLayout.EAST);
		
		
	}
}
