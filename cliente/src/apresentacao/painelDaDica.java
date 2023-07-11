package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class painelDaDica extends JPanel {
	
	private JPanel painelDica;
	private JLabel dica;
	private JLabel dicaRecebida;

	public painelDaDica() {
        criarPainelDica();
    }

    public void criarPainelDica() {
    	this.setLayout(new FlowLayout());
        painelDica = new JPanel();
            
        dica = new JLabel("Dica: ");
        dicaRecebida = new JLabel("Palhaço dando um mortal");
        
        painelDica.setPreferredSize(new Dimension(470, 30));
        painelDica.setBackground(Color.white);
        painelDica.setBorder(new LineBorder(Color.black, 1));
        painelDica.add(dica);
        painelDica.add(dicaRecebida);
        painelDica.setBackground(new Color(216,191,216));
        add(painelDica);
        
        
    }

	public JLabel getDicaRecebida() {
		return dicaRecebida;
	}

	public void setDicaRecebida(JLabel dicaRecebida) {
		this.dicaRecebida = dicaRecebida;
	}

}
