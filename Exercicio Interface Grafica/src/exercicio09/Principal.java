package exercicio09;

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
		formulario.setSize(350, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);

		//JLabel
		JLabel rtlNome = new JLabel();
		rtlNome.setText("Informe o numero 1");
		rtlNome.setBounds(10, 10, 130, 20);

		JLabel rtlIdade = new JLabel();
		rtlIdade.setText("Informe o numero 2");
		rtlIdade.setBounds(10, 30, 130, 20);

		JLabel rtlCidade = new JLabel();
		rtlCidade.setText("Informe o numero 3");
		rtlCidade.setBounds(10, 50, 130, 20);

		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 10, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 30, 150, 20);

		JTextField campo3 = new JTextField();
		campo3.setBounds(140, 50, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double numero1 = Double.parseDouble(campo1.getText());
				double numero2 = Double.parseDouble(campo2.getText());
				double numero3 = Double.parseDouble(campo3.getText());

				if((numero1 < numero2) && (numero1 < numero3)){JOptionPane.showMessageDialog(null, numero1);
				}else if((numero2 < numero1) && (numero2 < numero3)){JOptionPane.showMessageDialog(null, numero2);
				}else{JOptionPane.showMessageDialog(null, numero3);}

				//Limpar o campo contendo o nome
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");

				//Selecionar o campo nome
				campo1.requestFocus();			

			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNome);
		formulario.add(rtlIdade);
		formulario.add(rtlCidade);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
