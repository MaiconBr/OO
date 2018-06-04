package formularios;
//tela para vender produtos
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controladores.Alterar;
import controladores.Cadastrar;
import controladores.Produtos;

@SuppressWarnings("serial")
public class FormularioVenderP extends JFrame {

	private JPanel contentPane;
	private JTextField txtPegarID;
	private JTextField txtPegarQtd;

	public FormularioVenderP(boolean Caixa) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPegarID = new JTextField();
		txtPegarID.setBounds(135, 15, 199, 20);
		contentPane.add(txtPegarID);
		txtPegarID.setColumns(10);

		JLabel lblIdDoProduto = new JLabel("ID do produto:");
		lblIdDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoProduto.setBounds(10, 14, 107, 19);
		contentPane.add(lblIdDoProduto);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidade.setBounds(10, 44, 91, 19);
		contentPane.add(lblQuantidade);

		txtPegarQtd = new JTextField();
		txtPegarQtd.setBounds(135, 46, 199, 20);
		contentPane.add(txtPegarQtd);
		txtPegarQtd.setColumns(10);

		JLabel lblQtd = new JLabel("Qtd atual:");
		lblQtd.setBounds(10, 129, 57, 14);
		contentPane.add(lblQtd);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(75, 129, 82, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(">>>");
		lblNewLabel_2.setBounds(167, 129, 28, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(218, 129, 116, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblCusto = new JLabel("Ganho:");
		lblCusto.setBounds(10, 154, 46, 14);
		contentPane.add(lblCusto);

		JLabel lblCustoT = new JLabel();
		lblCustoT.setBounds(55, 154, 46, 14);
		contentPane.add(lblCustoT);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 104, 71, 14);
		contentPane.add(lblProduto);

		JLabel lblP = new JLabel("");
		lblP.setBounds(91, 104, 243, 14);
		contentPane.add(lblP);


		JButton btnPrvisualizar = new JButton("Pr\u00E9-Visualizar");
		btnPrvisualizar.addMouseListener(new MouseAdapter() {



			@Override
			public void mouseClicked(MouseEvent e) {

				int IDp = Integer.parseInt(txtPegarID.getText());
				String Produto = Produtos.dadosProdutos.get(IDp).getProduto();
				int Qtd = Integer.parseInt(txtPegarQtd.getText());
				int QtdEstoque = Produtos.dadosProdutos.get(IDp).getQuantidade();
				int NovaQtd = QtdEstoque - Qtd;
				double Valor = Produtos.dadosProdutos.get(IDp).getValor();
				Double Ganho = Valor * Qtd;

				lblP.setText(Produto);

				lblNewLabel_1.setText(String.valueOf(Produtos.dadosProdutos.get(IDp).getQuantidade()));

				lblNewLabel_3.setText(String.valueOf(NovaQtd));

				lblCustoT.setText(String.valueOf(Ganho));

			}
		});
		btnPrvisualizar.setBounds(10, 74, 324, 23);
		contentPane.add(btnPrvisualizar);

		JButton btnVender = new JButton("Vender");
		btnVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int IDp = Integer.parseInt(txtPegarID.getText());
				String Produto = Produtos.dadosProdutos.get(IDp).getProduto();
				int Qtd = Integer.parseInt(txtPegarQtd.getText());
				int QtdEstoque = Produtos.dadosProdutos.get(IDp).getQuantidade();
				int NovaQtd = QtdEstoque - Qtd;
				double Valor = Produtos.dadosProdutos.get(IDp).getValor();
				double Custo = Produtos.dadosProdutos.get(IDp).getCusto();
				double Ganho = Valor * Qtd;
				double Gasto = 0;

				Cadastrar C = new Cadastrar();
				C.CadastrarValores(Gasto, Ganho);

				Alterar A = new Alterar();
				A.QtdP(IDp, Produto, NovaQtd, Valor, Custo);

				if(Caixa == false){
					FormularioAdmin FA = new FormularioAdmin();
					FA.setVisible(true);
					dispose();
				}else{
					FormularioCaixa FC = new FormularioCaixa();
					FC.setVisible(true);
					dispose();
				}

			}
		});
		btnVender.setBounds(10, 179, 324, 23);
		contentPane.add(btnVender);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(Caixa == false){
					FormularioAdmin FA = new FormularioAdmin();
					FA.setVisible(true);
					dispose();
				}else{
					FormularioCaixa FC = new FormularioCaixa();
					FC.setVisible(true);
					dispose();
				}
			}
		});
		
		btnSair.setBounds(10, 213, 324, 23);
		contentPane.add(btnSair);

	}

}
