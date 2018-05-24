package exercicio06;

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
		JLabel rtlNumero1 = new JLabel();
		rtlNumero1.setText("Informe o numero 1");
		rtlNumero1.setBounds(10, 10, 150, 20);

		JLabel rtlNumero2 = new JLabel();
		rtlNumero2.setText("Informe o numero 2");
		rtlNumero2.setBounds(10, 30, 150, 20);

		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(140, 10, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(140, 30, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double numero1 = Double.parseDouble(campo1.getText());
				double numero2 = Double.parseDouble(campo2.getText()); ;
				double soma = numero1 + numero2 ;
				double multiplicacao = numero1 * numero2;

				if(numero1 == numero2){
					JOptionPane.showMessageDialog(null, soma);
				}else{
					JOptionPane.showMessageDialog(null, multiplicacao);
				}
				
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
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
