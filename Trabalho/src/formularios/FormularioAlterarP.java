package formularios;
//tela de alteraçao de dados dos produtos
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controladores.Alterar;
import controladores.Cadastrar;
import controladores.Produtos;

@SuppressWarnings("serial")
public class FormularioAlterarP extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;

	public FormularioAlterarP(int linha) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtProduto = new JTextField(Produtos.dadosProdutos.get(linha).getProduto());
		txtProduto.setBounds(84, 15, 340, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);

		txtValor = new JTextField(String.valueOf(Produtos.dadosProdutos.get(linha).getValor()));
		txtValor.setBounds(84, 56, 340, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JLabel lblNewLabel = new JLabel("Produto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 14, 64, 19);
		contentPane.add(lblNewLabel);

		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValor.setBounds(10, 59, 46, 14);
		contentPane.add(lblValor);

		JButton btnAlterarP = new JButton("Alterar");
		btnAlterarP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				String Produto = "";
				double Valor = 0;

				try {
					Produto = txtProduto.getText();

					if(txtProduto.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo produto vazio");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um produto valido");
					continuar = false;
				}

				try {
					Valor = Double.parseDouble(txtValor.getText());

					if(txtValor.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo valor vazio");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um produto valido");
					continuar = false;
				}

				if(continuar == true){


					double Custo = Valor - Valor * 0.2;

					Alterar A = new Alterar();
					Cadastrar C = new Cadastrar();
					boolean valido = C.VerficarProdutoRepetido(Produto);

					if(valido == true){

						int IDp = linha;
						int quantidade = Produtos.dadosProdutos.get(IDp).getQuantidade();

						A.AlterarP(IDp, Produto, quantidade, Valor, Custo);

						FormularioAdmin FA = new FormularioAdmin();
						FA.setVisible(true);
						dispose();

					}else{
						JOptionPane.showMessageDialog(null, "Produto já cadastrado");
					}
				}else{
					
				}
				
			}
		});
		btnAlterarP.setBounds(10, 97, 123, 33);
		contentPane.add(btnAlterarP);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioAdmin FA = new FormularioAdmin();
				FA.setVisible(true);
				dispose();

			}
		});
		btnCancelar.setBounds(301, 97, 123, 33);
		contentPane.add(btnCancelar);

		JButton btnExcluirP = new JButton("Excluir");
		btnExcluirP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int IDp = linha;
				Alterar A = new Alterar();

				A.excluirP(IDp);
				FormularioProdutos FP = new FormularioProdutos();
				FP.setVisible(true);
				dispose();

			}
		});
		btnExcluirP.setBounds(155, 97, 123, 33);
		contentPane.add(btnExcluirP);

	}

}
