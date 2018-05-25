package exercicio16;

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
		formulario.setSize(300, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);

		//JLabel
		JLabel rtlNome = new JLabel();
		rtlNome.setText("Valor pago");
		rtlNome.setBounds(10, 10, 110, 20);

		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(130, 10, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(130, 30, 150, 20);
		combo.addItem("Hambúrguer + Suco de Laranja");
		combo.addItem("Sanduíche natural + Suco de Uva");
		combo.addItem("Prato do dia");
		combo.addItem("Pizza");
		combo.addItem("Lasanha");
		combo.addItem("Pão de queijo");
		combo.addItem("Bolo");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {


				double pagamento = Double.parseDouble(campo.getText());
				double pedido1, troco;


				if(combo.getSelectedItem().equals("Hambúrguer + Suco de Laranja")){troco = pagamento - 5;pedido1 = 1;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"5.00"+"\nTroco: "+troco);
				}
				else if(combo.getSelectedItem().equals("Sanduíche natural + Suco de Uva")){troco = pagamento - 4.50;pedido1 = 2;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"4.50"+"\nTroco: "+troco);
				}
				else if(combo.getSelectedItem().equals("Prato do dia")){troco = pagamento - 8;pedido1 = 3;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"8.00"+"\nTroco: "+troco);
				}
				else if(combo.getSelectedItem().equals("Pizza")){troco = pagamento - 12;pedido1 = 4;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"12.00"+"\nTroco: "+troco);
				}
				else if(combo.getSelectedItem().equals("Lasanha")){troco = pagamento - 16.50;pedido1 = 5;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"16.50"+"\nTroco: "+troco);
				}
				else if(combo.getSelectedItem().equals("Pão de queijo")){troco = pagamento - 1;pedido1 = 6;
				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"1.00"+"\nTroco: "+troco);
				}
				else{troco = pagamento - 2.50;pedido1 = 7;

				JOptionPane.showMessageDialog(null,"pedido: "+pedido1+"\nCusto do pedido: "+"2.50"+"\nTroco: "+troco);

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
		formulario.add(combo);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
