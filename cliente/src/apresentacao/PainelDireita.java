package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;


public class PainelDireita extends JPanel{

	public PainelDireita () {
		
		PainelDoRanking PR = new PainelDoRanking();
		add(PR);
		setPreferredSize(new Dimension(370, getHeight()));
		setBackground(new Color(255,240,245));
		
	}
}
