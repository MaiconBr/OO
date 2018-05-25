package exercicio10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principla {

	public static void main(String[] args) {
	
		//Instanciar JFrame
				JFrame formulario = new JFrame();
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setSize(350, 250);
				formulario.setLocationRelativeTo(null);
				formulario.setTitle("Utilizando JButton");
				formulario.setLayout(null);

				//JLabel
				JLabel rtlNumero1 = new JLabel();
				rtlNumero1.setText("Moedas de 0,01R$");
				rtlNumero1.setBounds(10, 10, 150, 20);

				JLabel rtlNumero2 = new JLabel();
				rtlNumero2.setText("Moedas de 0,05R$");
				rtlNumero2.setBounds(10, 30, 150, 20);
				
				JLabel rtlNumero3 = new JLabel();
				rtlNumero3.setText("Moedas de 0,10R$");
				rtlNumero3.setBounds(10, 50, 150, 20);

				JLabel rtlNumero4 = new JLabel();
				rtlNumero4.setText("Moedas de 0,25R$");
				rtlNumero4.setBounds(10, 70, 150, 20);

				JLabel rtlNumero5 = new JLabel();
				rtlNumero5.setText("Moedas de 0,50R$");
				rtlNumero5.setBounds(10, 90, 150, 20);

				JLabel rtlNumero6 = new JLabel();
				rtlNumero6.setText("Moedas de 1,00R$");
				rtlNumero6.setBounds(10, 110, 150, 20);
					
				//JTextField
				JTextField campo1 = new JTextField();
				campo1.setBounds(140, 10, 150, 20);

				JTextField campo2 = new JTextField();
				campo2.setBounds(140, 30, 150, 20);
				
				JTextField campo3 = new JTextField();
				campo3.setBounds(140, 50, 150, 20);

				JTextField campo4 = new JTextField();
				campo4.setBounds(140, 70, 150, 20);

				JTextField campo5 = new JTextField();
				campo5.setBounds(140, 90, 150, 20);

				JTextField campo6 = new JTextField();
				campo6.setBounds(140, 110, 150, 20);

				//JButton
				JButton botao = new JButton();
				botao.setText("ok");
				botao.setBounds(140, 130, 150, 20);

				//Adicionar uma funçao ao botao

				botao.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						double numero1 = Double.parseDouble(campo1.getText());
						double numero2 = Double.parseDouble(campo2.getText());
						double numero3 = Double.parseDouble(campo3.getText());
						double numero4 = Double.parseDouble(campo4.getText());
						double numero5 = Double.parseDouble(campo5.getText());
						double numero6 = Double.parseDouble(campo6.getText());

						numero1 = numero1 * 0.01;
						numero2 = numero2 * 0.05;
						numero3 = numero3 * 0.10;
						numero4 = numero4 * 0.25;
						numero5 = numero5 * 0.50;
						numero6 = numero6 * 1;
						
						double total = numero1 + numero2 + numero3 + numero4 + numero5 + numero6;
						
						DecimalFormat df = new DecimalFormat("0.##");
						String novoTotal = df.format(total);
						
						JOptionPane.showMessageDialog(null, "Dinheiro: "+novoTotal);

						//Limpar o campo contendo o nome
						campo1.setText("");
						campo2.setText("");
						campo3.setText("");
						campo4.setText("");
						campo5.setText("");
						campo6.setText("");

						//Selecionar o campo nome
						campo1.requestFocus();			

					}
				});

				//Adicionar elementos ao JFrame
				formulario.add(rtlNumero1);
				formulario.add(rtlNumero2);
				formulario.add(rtlNumero3);
				formulario.add(rtlNumero4);
				formulario.add(rtlNumero5);
				formulario.add(rtlNumero6);
				formulario.add(campo1);
				formulario.add(campo2);
				formulario.add(campo3);
				formulario.add(campo4);
				formulario.add(campo5);
				formulario.add(campo6);
				formulario.add(botao);

				//Exibir o formulário
				formulario.setVisible(true);
	}

}
