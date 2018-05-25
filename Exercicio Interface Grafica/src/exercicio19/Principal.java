package exercicio19;

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
		formulario.setSize(350, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);

		//JLabel
		JLabel rtlNumero1 = new JLabel();
		rtlNumero1.setText("Informe a dist");
		rtlNumero1.setBounds(10, 10, 150, 20);

		JLabel rtlNumero2 = new JLabel();
		rtlNumero2.setText("Informe o tempo");
		rtlNumero2.setBounds(10, 30, 150, 20);

		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 10, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 30, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(140, 50, 150, 20);
		combo.addItem("m/s");
		combo.addItem("k/h");

		//Adicionar uma funçao ao botao

		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double S = Double.parseDouble(campo1.getText());
				double T = Double.parseDouble(campo2.getText()); ;
				
				double Vm = S/T;

				if(combo.getSelectedItem().equals("m/s")){JOptionPane.showMessageDialog(null,"Velocidade média é: "+Vm+" m/s");
				}else{JOptionPane.showMessageDialog(null,"Velocidade média é: "+Vm+" k/h");}

				//Limpar o campo contendo o nome
				campo1.setText("");
				campo2.setText("");

				//Selecionar o campo nome
				campo1.requestFocus();			

			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNumero1);
		formulario.add(rtlNumero2);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(combo);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
