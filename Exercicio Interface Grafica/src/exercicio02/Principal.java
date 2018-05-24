package exercicio02;

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
		JLabel rtlPreço = new JLabel();
		rtlPreço.setText("Informe o preço");
		rtlPreço.setBounds(10, 10, 110, 20);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(130, 10, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double preco = Double.parseDouble(campo1.getText());
				double desconto = (preco/ 100) *90;

				JOptionPane.showMessageDialog(null, desconto );
						
				//Limpar o campo contendo o nome
				campo1.setText("");

				//Selecionar o campo nome
				campo1.requestFocus();			
				
			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlPreço);
		formulario.add(campo1);
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
