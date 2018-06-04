package formularios;
//tela onde o admin encomenda combustivel
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
import controladores.Combustiveis;

@SuppressWarnings("serial")
public class FormularioEncomendarC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPegarID;
	private JTextField txtPegarQtd;

	public FormularioEncomendarC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPegarID = new JTextField();
		txtPegarID.setBounds(160, 15, 172, 20);
		contentPane.add(txtPegarID);
		txtPegarID.setColumns(10);

		JLabel lblIdDoProduto = new JLabel("ID do combustivel:");
		lblIdDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoProduto.setBounds(10, 14, 161, 19);
		contentPane.add(lblIdDoProduto);

		JLabel lblQuantidade = new JLabel("Quantidade(L):");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidade.setBounds(10, 44, 139, 19);
		contentPane.add(lblQuantidade);

		txtPegarQtd = new JTextField();
		txtPegarQtd.setBounds(160, 46, 172, 20);
		contentPane.add(txtPegarQtd);
		txtPegarQtd.setColumns(10);

		JLabel lblQtd = new JLabel("Qtd atual:");
		lblQtd.setBounds(10, 129, 57, 14);
		contentPane.add(lblQtd);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(77, 129, 66, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(">>>");
		lblNewLabel_2.setBounds(160, 129, 28, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(209, 129, 123, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblCusto = new JLabel("Custo:");
		lblCusto.setBounds(10, 154, 46, 14);
		contentPane.add(lblCusto);

		JLabel lblCustoT = new JLabel();
		lblCustoT.setBounds(66, 154, 266, 14);
		contentPane.add(lblCustoT);

		JLabel lblProduto = new JLabel("Combustivel:");
		lblProduto.setBounds(10, 104, 91, 14);
		contentPane.add(lblProduto);

		JLabel lblP = new JLabel("");
		lblP.setBounds(100, 104, 217, 14);
		contentPane.add(lblP);


		JButton btnPrvisualizar = new JButton("Pr\u00E9-Visualizar");
		btnPrvisualizar.addMouseListener(new MouseAdapter() {



			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDc = 0;
				int Qtd = 0;

				try {
					IDc = Integer.parseInt(txtPegarID.getText());

					if(Integer.parseInt(txtPegarID.getText()) < 0 || Integer.parseInt(txtPegarID.getText()) > Combustiveis.dadosCombustivels.size()){
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
						JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
					continuar = false;
				}

				if(continuar == true){

					String Combustivel = Combustiveis.dadosCombustivels.get(IDc).getCombustivel();
					int QtdEstoque = Combustiveis.dadosCombustivels.get(IDc).getQuantidade();
					int NovaQtd = Qtd + QtdEstoque;
					double Custo = Combustiveis.dadosCombustivels.get(IDc).getCusto();
					double Gasto = Custo * Qtd;

					lblP.setText(Combustivel);

					lblNewLabel_1.setText(String.valueOf(Combustiveis.dadosCombustivels.get(IDc).getQuantidade()));

					lblNewLabel_3.setText(String.valueOf(NovaQtd));

					lblCustoT.setText(String.valueOf(Gasto));
				}else{

				}
			}
		});
		btnPrvisualizar.setBounds(10, 74, 322, 23);
		contentPane.add(btnPrvisualizar);

		JButton btnEncomendar = new JButton("Encomendar");
		btnEncomendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDc = 0;
				int Qtd = 0;

				try {
					IDc = Integer.parseInt(txtPegarID.getText());

					if(Integer.parseInt(txtPegarID.getText()) < 0 || Integer.parseInt(txtPegarID.getText()) > Combustiveis.dadosCombustivels.size()){
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
						JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
					continuar = false;
				}

				if(continuar == true){

					String Combustivel = Combustiveis.dadosCombustivels.get(IDc).getCombustivel();
					int QtdEstoque = Combustiveis.dadosCombustivels.get(IDc).getQuantidade();
					int NovaQtd = Qtd + QtdEstoque;
					double Valor = Combustiveis.dadosCombustivels.get(IDc).getValor();
					double Custo = Combustiveis.dadosCombustivels.get(IDc).getCusto();
					double Gasto = Custo * Qtd;
					double Ganho = 0;

					Cadastrar C = new Cadastrar();
					C.CadastrarValores(Gasto, Ganho);

					Alterar A = new Alterar();
					A.QtdC(IDc, Combustivel, NovaQtd, Valor, Custo);

					int linha = 0;
					FormularioCombustivel FC = new FormularioCombustivel(linha);
					FC.setVisible(true);
					dispose();
				}else{

				}
			}
		});
		btnEncomendar.setBounds(10, 179, 322, 23);
		contentPane.add(btnEncomendar);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = 0;
				FormularioCombustivel FC = new FormularioCombustivel(linha);
				FC.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(10, 213, 322, 23);
		contentPane.add(btnSair);

	}
}
