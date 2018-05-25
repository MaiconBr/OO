package exercicio07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
		rtlNome.setText("Informe o numero");
		rtlNome.setBounds(10, 10, 110, 20);

		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(130, 10, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Resultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por zero : " + (Integer.parseInt(campo.getText())) *0 
						+"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por um : " + (Integer.parseInt(campo.getText())) *1 + 
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por dois : " + (Integer.parseInt(campo.getText())) *2 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por tres : " + (Integer.parseInt(campo.getText())) *3 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por quatro : " + (Integer.parseInt(campo.getText())) *4 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por cinco : " + (Integer.parseInt(campo.getText())) *5 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por seis : " + (Integer.parseInt(campo.getText())) *6 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por sete : " + (Integer.parseInt(campo.getText())) *7 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por oito : " + (Integer.parseInt(campo.getText())) *8 +
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por nove : " + (Integer.parseInt(campo.getText())) *9 + 
						"\nResultado de : " + (Integer.parseInt(campo.getText())) + " Multiplicado por dez : " + (Integer.parseInt(campo.getText())) *10);	

				//Limpar o campo contendo o nome
				campo.setText("");

				//Selecionar o campo nome
				campo.requestFocus();			

			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNome);
		formulario.add(campo);
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);


	}

}
