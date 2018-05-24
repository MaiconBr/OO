package exercicio03;

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
		JLabel rtlNota1 = new JLabel();
		rtlNota1.setText("Informe a nota 1");
		rtlNota1.setBounds(10, 10, 110, 20);

		JLabel rtlNota2 = new JLabel();
		rtlNota2.setText("Informe a nota 2");
		rtlNota2.setBounds(10, 30, 110, 20);

		JLabel rtlNota3 = new JLabel();
		rtlNota3.setText("Informe a nota 3");
		rtlNota3.setBounds(10, 50, 110, 20);
		
		JLabel rtlNota4 = new JLabel();
		rtlNota4.setText("Informe a nota 4");
		rtlNota4.setBounds(10, 70, 110, 20);

		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(130, 10, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(130, 30, 150, 20);

		JTextField campo3 = new JTextField();
		campo3.setBounds(130, 50, 150, 20);
		
		JTextField campo4 = new JTextField();
		campo4.setBounds(130, 70, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(campo1.getText());
				double nota2 = Double.parseDouble(campo2.getText());
				double nota3 = Double.parseDouble(campo3.getText());
				double nota4 = Double.parseDouble(campo4.getText());
				
				double media = (nota1 + nota2 + nota3 + nota4) /4;
				
				JOptionPane.showMessageDialog(null, media);

				//Limpar o campo contendo o nome
				campo1.setText("");
				campo2.setText("");
				campo3.setText("");
				campo4.setText("");

				//Selecionar o campo nome
				campo1.requestFocus();			

			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNota1);
		formulario.add(rtlNota2);
		formulario.add(rtlNota3);
		formulario.add(rtlNota4);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		formulario.add(campo4);
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
