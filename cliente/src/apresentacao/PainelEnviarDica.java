package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PainelEnviarDica extends JPanel{
	
	private JPanel painelEnviarDica;
	private JLabel escreverDica;
	private JButton enviar;
	private JTextField textField;
	
	public PainelEnviarDica() {
		
		adicionarAoPainel();
		
	}
	public void adicionarAoPainel() {
		setLayout(new FlowLayout());
		
		painelEnviarDica = new JPanel();
		painelEnviarDica.setBorder(new LineBorder(Color.black, 1));
		escreverDica = new JLabel("Escreva uma dica: ");
		enviar = new JButton("Enviar");
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(50, 27));
		textField.setColumns(19);
		
		
		painelEnviarDica.setPreferredSize((new Dimension(470, 37)));
		painelEnviarDica.setBackground(Color.white);
		
		painelEnviarDica.add(escreverDica);
		painelEnviarDica.add(textField);
		painelEnviarDica.add(enviar);
		
		add(painelEnviarDica);	
		textField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				atualizarEstadoBotaoEnviar();
			}

			public void removeUpdate(DocumentEvent e) {
				atualizarEstadoBotaoEnviar();
			}

			public void insertUpdate(DocumentEvent e) {
				atualizarEstadoBotaoEnviar();
			}
		});
		enviar.setEnabled(false);
		
	}
	
	private void atualizarEstadoBotaoEnviar() {
		
		boolean textFieldPreenchido = !textField.getText().isEmpty();		
		enviar.setEnabled(textFieldPreenchido);
	}

}
