package formularios;
//tela onde o admin encomenda produtos
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Alterar;
import controladores.Cadastrar;
import controladores.Produtos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioEncomendarP extends JFrame {

	private JPanel contentPane;
	private JTextField txtPegarID;
	private JTextField txtPegarQtd;

	public FormularioEncomendarP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPegarID = new JTextField();
		txtPegarID.setBounds(144, 15, 190, 20);
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
		txtPegarQtd.setBounds(144, 45, 190, 20);
		contentPane.add(txtPegarQtd);
		txtPegarQtd.setColumns(10);

		JLabel lblQtd = new JLabel("Qtd atual:");
		lblQtd.setBounds(10, 129, 57, 14);
		contentPane.add(lblQtd);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(74, 129, 75, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(">>>");
		lblNewLabel_2.setBounds(159, 129, 28, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(197, 129, 124, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblCusto = new JLabel("Custo:");
		lblCusto.setBounds(10, 154, 46, 14);
		contentPane.add(lblCusto);

		JLabel lblCustoT = new JLabel();
		lblCustoT.setBounds(55, 154, 279, 14);
		contentPane.add(lblCustoT);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 104, 75, 14);
		contentPane.add(lblProduto);

		JLabel lblP = new JLabel("");
		lblP.setBounds(63, 104, 271, 14);
		contentPane.add(lblP);


		JButton btnPrvisualizar = new JButton("Pr\u00E9-Visualizar");
		btnPrvisualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDp = 0;
				int Qtd = 0;

				try {
					IDp = Integer.parseInt(txtPegarID.getText());

					if(Integer.parseInt(txtPegarID.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Digite um ID válido");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um ID válido");
					continuar = false;
				}

				try {
					Qtd = Integer.parseInt(txtPegarQtd.getText());

					if(Integer.parseInt(txtPegarQtd.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Digite uma quanridade válida");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quanridade válida");
					continuar = false;
				}

				if(continuar == true){

					String Produto = Produtos.dadosProdutos.get(IDp).getProduto();
					int QtdEstoque = Produtos.dadosProdutos.get(IDp).getQuantidade();
					int NovaQtd = Qtd + QtdEstoque;
					double Custo = Produtos.dadosProdutos.get(IDp).getCusto();
					double Gasto = Custo * Qtd;

					lblP.setText(Produto);

					lblNewLabel_1.setText(String.valueOf(Produtos.dadosProdutos.get(IDp).getQuantidade()));

					lblNewLabel_3.setText(String.valueOf(NovaQtd));

					lblCustoT.setText(String.valueOf(Gasto));
				}else{

				}
			}
		});
		btnPrvisualizar.setBounds(10, 74, 324, 23);
		contentPane.add(btnPrvisualizar);

		JButton btnEncomendar = new JButton("Encomendar");
		btnEncomendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDp = 0;
				int Qtd = 0;

				try {
					IDp = Integer.parseInt(txtPegarID.getText());

					if(Integer.parseInt(txtPegarID.getText()) < 0){
						JOptionPane.showMessageDialog(null, "Digite um ID válido");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um ID válido");
					continuar = false;
				}

				try {
					Qtd = Integer.parseInt(txtPegarQtd.getText());

					if(Integer.parseInt(txtPegarQtd.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Digite uma quanridade válida");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quanridade válida");
					continuar = false;
				}

				if(continuar == true){

					String Produto = Produtos.dadosProdutos.get(IDp).getProduto();
					int QtdEstoque = Produtos.dadosProdutos.get(IDp).getQuantidade();
					int NovaQtd = Qtd + QtdEstoque;
					double Valor = Produtos.dadosProdutos.get(IDp).getValor();
					double Custo = Produtos.dadosProdutos.get(IDp).getCusto();
					double Gasto = Custo * Qtd;
					double Ganho = 0;

					Cadastrar C = new Cadastrar();
					C.CadastrarValores(Gasto, Ganho);

					Alterar A = new Alterar();
					A.QtdP(IDp, Produto, NovaQtd, Valor, Custo);

					FormularioProdutos FP = new FormularioProdutos();
					FP.setVisible(true);
					dispose();
				}else{

				}
			}
		});
		btnEncomendar.setBounds(10, 179, 324, 23);
		contentPane.add(btnEncomendar);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioProdutos FP = new FormularioProdutos();
				FP.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(10, 213, 324, 23);
		contentPane.add(btnSair);

	}
}
