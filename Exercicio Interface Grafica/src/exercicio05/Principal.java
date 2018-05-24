package exercicio05;

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
		rtlNome.setText("Informe o dia");
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

				if ((Integer.parseInt(String.valueOf(campo.getText())) <= 0) || (Integer.parseInt(String.valueOf(campo.getText())) >=29)) {
					JOptionPane.showMessageDialog(null,"Data inválida");
				}else if ((Integer.parseInt(String.valueOf(campo.getText())) == 3) || (Integer.parseInt(String.valueOf(campo.getText())) == 4)
						|| (Integer.parseInt(String.valueOf(campo.getText())) == 10) || (Integer.parseInt(String.valueOf(campo.getText())) == 11) ||
						(Integer.parseInt(String.valueOf(campo.getText())) == 17) || (Integer.parseInt(String.valueOf(campo.getText())) == 18) ||
						(Integer.parseInt(String.valueOf(campo.getText())) == 24) ||  (Integer.parseInt(String.valueOf(campo.getText())) == 25) ){
					JOptionPane.showMessageDialog(null,"Fim de semana");}
				else
				{JOptionPane.showMessageDialog(null,"Dia de semana");}

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
