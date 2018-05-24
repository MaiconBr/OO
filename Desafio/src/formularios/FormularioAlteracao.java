package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioAlteracao {

	public FormularioAlteracao(String nomeProduto, double valorProduto, int quantidadeProduto, int linha){

		//Instanciar JFrame

		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(530, 300);;
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
		JTextField Produto1 = new JTextField(nomeProduto);
		Produto1.setBounds(140, 10, 150, 20);

		JTextField Quantidade1 = new JTextField(String.valueOf(quantidadeProduto));
		Quantidade1.setBounds(140, 30, 150, 20);

		JTextField Valor1 = new JTextField(String.valueOf(valorProduto));
		Valor1.setBounds(140, 50, 150, 20);

		// JButton
		JButton btnAlterar = new JButton("Alterar Produto");
		JButton btnExcluir = new JButton("Excluir Produto");
		JButton btnCancelar = new JButton("Cancelar");

		btnAlterar.setBounds(20, 130, 140, 20);
		btnExcluir.setBounds(170, 130, 140, 20);
		btnCancelar.setBounds(320, 130, 140, 20);

		// Ações - Alterar
		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Obter os dados
				String nomeProduto = Produto1.getText();
				int quantidadeProduto = Integer.parseInt(Quantidade1.getText());
				double valorProduto = Double.parseDouble(Valor1.getText());

				// Executar a ação para alterar
				Acao a = new Acao();
				a.alterar(nomeProduto, valorProduto, quantidadeProduto, linha);

				// Fechar formulário atual
				formulario.dispose();

				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();
				fp.inicializaFormulario();
			}
		});

		// Ações - Excluir
		btnExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Método para executar a exclusão
				Acao a = new Acao();
				a.excluir(linha);

				// Fechar formulário atual
				formulario.dispose();

				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();				
				fp.inicializaFormulario();
			}

		});

		// Ações - Cancelar
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar formulário atual
				formulario.dispose();

				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();
				fp.inicializaFormulario();
			}
		});

		// Adicionar elemenetos ao JFrame
		formulario.add(Produto);
		formulario.add(Quantidade);
		formulario.add(Valor);
		formulario.add(Produto1);
		formulario.add(Quantidade1);
		formulario.add(Valor1);
		formulario.add(btnAlterar);
		formulario.add(btnExcluir);
		formulario.add(btnCancelar);

		// Exibir Estrutura
		formulario.setVisible(true);


	}

}

