package exercicio04;

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
		formulario.setSize(400, 200);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JButton");
		formulario.setLayout(null);

		//JLabel
		JLabel rtlNome = new JLabel();
		rtlNome.setText("Informe o produto");
		rtlNome.setBounds(10, 10, 110, 20);

		JLabel rtlIdade = new JLabel();
		rtlIdade.setText("Informe o valor");
		rtlIdade.setBounds(10, 30, 110, 20);

		JLabel rtlCidade = new JLabel();
		rtlCidade.setText("Informe a forma de pagamento");
		rtlCidade.setBounds(10, 50, 200, 20);

		//JTextField
		JTextField campo1 = new JTextField();
		campo1.setBounds(130, 10, 150, 20);

		JTextField campo2 = new JTextField();
		campo2.setBounds(130, 30, 150, 20);

		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(200, 50, 150, 20);
		combo.addItem("À vista");
		combo.addItem("À prazo");

		//Açao no combo
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double valor = Double.parseDouble(campo2.getText());
				double desconto = (valor/ 100) *90;

				if(combo.getSelectedItem().equals("À vista") && valor > 500){
					JOptionPane.showMessageDialog(null, "O produto "+campo1.getText()+" custará "+desconto);
				}else{
					JOptionPane.showMessageDialog(null, "O produto "+campo1.getText()+" custará "+valor);
				}
			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(rtlNome);
		formulario.add(rtlIdade);
		formulario.add(rtlCidade);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(combo);

		//Exibir o formulário
		formulario.setVisible(true);

	}

}
