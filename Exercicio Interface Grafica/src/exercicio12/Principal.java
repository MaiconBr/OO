package exercicio12;

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
		rtlNome.setText("Informe a velocidade");
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

			double velocidade = Double.parseDouble(campo.getText());
				
			if(velocidade <= 50){
				JOptionPane.showMessageDialog(null, "Bom motorista");
			}else if(velocidade <= 60){
				JOptionPane.showMessageDialog(null, "Multa de 50 conto");
			}else if(velocidade <= 80){
				JOptionPane.showMessageDialog(null, "Multa de 100 conto");
			}else{
				JOptionPane.showMessageDialog(null, "Multa de 200 conto");
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
		formulario.add(botao);

		//Exibir o formulário
		formulario.setVisible(true);


	}

}
