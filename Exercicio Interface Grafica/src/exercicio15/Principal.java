package exercicio15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);

		//JLabel
		JLabel rtlNome = new JLabel();
		rtlNome.setText("Qtd dias");
		rtlNome.setBounds(10, 10, 110, 20);

		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(130, 10, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(130, 30, 150, 20);
		combo.addItem("apto simples");
		combo.addItem("apto luxo");
		combo.addItem("suite luxo");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double dia = Double.parseDouble(campo.getText());

				if(combo.getSelectedItem().equals("apto simples")){
					JOptionPane.showMessageDialog(null, dia*45+"R$" );
				}else if(combo.getSelectedItem().equals("apto luxo")){
					JOptionPane.showMessageDialog(null, dia*65+"R$" );
				}else{
					JOptionPane.showMessageDialog(null, dia*110+"R$" );
				}
				
				//Limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();			
			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNome);
		formulario.add(campo);
		formulario.add(combo);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
