package exercicio01;

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
		rtlNome.setText("Informe seu nome");
		rtlNome.setBounds(10, 10, 110, 20);
		
		JLabel rtlIdade = new JLabel();
		rtlIdade.setText("Informe sua idade");
		rtlIdade.setBounds(10, 30, 110, 20);
		
		JLabel rtlCidade = new JLabel();
		rtlCidade.setText("Informe sua cidade");
		rtlCidade.setBounds(10, 50, 110, 20);
		
		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(130, 10, 150, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(130, 30, 150, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(130, 50, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("ok");
		botao.setBounds(60, 100, 150, 20);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Olá "+campo1.getText()+" você tem "+campo2.getText()+" anos de idade e mora em "+campo3.getText());

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
