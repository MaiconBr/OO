package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;
import controladores.Produto;

public class FormularioPrincipal {

	public static void main() {
		
		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(330, 300);;
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Cadastrar produto");
		formulario.setLayout(null);

		//JLabel
		JLabel Produto = new JLabel();
		Produto.setText("Informe o Produto:");
		Produto.setBounds(10, 10, 110, 20);

		JLabel Quantidade = new JLabel();
		Quantidade.setText("Informe a Quantidade:");
		Quantidade.setBounds(10, 30, 210, 20);

		JLabel Valor = new JLabel();
		Valor.setText("Informe o Valor:");
		Valor.setBounds(10, 50, 110, 20);

		//JTextField
		JTextField Produto1 = new JTextField();
		Produto1.setBounds(140, 10, 150, 20);

		JTextField Quantidade1 = new JTextField();
		Quantidade1.setBounds(140, 30, 150, 20);

		JTextField Valor1 = new JTextField();
		Valor1.setBounds(140, 50, 150, 20);

		//JButton
		JButton botao = new JButton();
		botao.setText("Cadastrar");
		botao.setBounds(80, 80, 150, 20);	
		
		JScrollPane barraRolagem = new JScrollPane();
		barraRolagem.setBounds(30, 110, 260, 100);

		//Adicionar uma funçao ao botao

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				//Obter dados para os parâmetros de cadastro
				String produto = Produto1.getText();
				double valor = Double.parseDouble(Valor1.getText());
				int quantidade = Integer.parseInt(Quantidade1.getText());
				
				//Instanciar objeto
				Acao a = new Acao();
				
				//Método de cadastro
				a.cadastrar(produto, valor, quantidade);
				
				//Limpar campos
				Produto1.setText("");
				Quantidade1.setText("");
				Valor1.setText("");
				
				barraRolagem.setViewportView(a.exibirDados());
				
			}
		});

		//Adicionar elementos ao JFrame
		formulario.add(Produto);
		formulario.add(Quantidade);
		formulario.add(Valor);
		formulario.add(Produto1);
		formulario.add(Quantidade1);
		formulario.add(Valor1);
		formulario.add(botao);
		formulario.add(barraRolagem);

		//Metodo Exibir o formulário

		formulario.setVisible(true);

	}

}
