package formularios;
//tela para vender combustivel
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
public class FormularioVenderC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPegarID;
	private JTextField txtPegarQtd;

	public FormularioVenderC(boolean Frentista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtPegarID = new JTextField();
		txtPegarID.setBounds(168, 15, 166, 20);
		contentPane.add(txtPegarID);
		txtPegarID.setColumns(10);

		JLabel lblIdDoProduto = new JLabel("ID do Combustivel:");
		lblIdDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdDoProduto.setBounds(10, 14, 157, 19);
		contentPane.add(lblIdDoProduto);

		JLabel lblQuantidade = new JLabel("Quantidade(L):");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantidade.setBounds(10, 44, 133, 19);
		contentPane.add(lblQuantidade);

		txtPegarQtd = new JTextField();
		txtPegarQtd.setBounds(168, 45, 166, 20);
		contentPane.add(txtPegarQtd);
		txtPegarQtd.setColumns(10);

		JLabel lblQtd = new JLabel("Qtd atual:");
		lblQtd.setBounds(10, 129, 57, 14);
		contentPane.add(lblQtd);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(75, 129, 83, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(">>>");
		lblNewLabel_2.setBounds(168, 129, 28, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setBounds(223, 129, 111, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblCusto = new JLabel("Ganho:");
		lblCusto.setBounds(10, 154, 46, 14);
		contentPane.add(lblCusto);

		JLabel lblCustoT = new JLabel();
		lblCustoT.setBounds(55, 154, 279, 14);
		contentPane.add(lblCustoT);

		JLabel lblProduto = new JLabel("Combustivel:");
		lblProduto.setBounds(10, 104, 83, 14);
		contentPane.add(lblProduto);

		JLabel lblP = new JLabel("");
		lblP.setBounds(103, 104, 231, 14);
		contentPane.add(lblP);


		JButton btnPrvisualizar = new JButton("Pr\u00E9-Visualizar");
		btnPrvisualizar.addMouseListener(new MouseAdapter() {



			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDc = 0;
				int Qtd = 0;
				int QtdEstoque = Combustiveis.dadosCombustivels.get(IDc).getQuantidade();

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
					if(Integer.parseInt(txtPegarQtd.getText()) > QtdEstoque){
						JOptionPane.showMessageDialog(null, "Estoque insuficiente");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
					continuar = false;
				}

				if(continuar == true){

					String Combustivel = Combustiveis.dadosCombustivels.get(IDc).getCombustivel();
					int NovaQtd = QtdEstoque - Qtd;
					double Valor = Combustiveis.dadosCombustivels.get(IDc).getValor();
					Double Ganho = Valor * Qtd;

					lblP.setText(Combustivel);

					lblNewLabel_1.setText(String.valueOf(Combustiveis.dadosCombustivels.get(IDc).getQuantidade()));

					lblNewLabel_3.setText(String.valueOf(NovaQtd));

					lblCustoT.setText(String.valueOf(Ganho));

				}else{

				}
			}
		});
		btnPrvisualizar.setBounds(10, 74, 324, 23);
		contentPane.add(btnPrvisualizar);

		JButton btnVender = new JButton("Vender");
		btnVender.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				int IDc = 0;
				int Qtd = 0;
				int QtdEstoque = Combustiveis.dadosCombustivels.get(IDc).getQuantidade();

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
					if(Integer.parseInt(txtPegarQtd.getText()) > QtdEstoque){
						JOptionPane.showMessageDialog(null, "Estoque insuficiente");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
					continuar = false;
				}

				if(continuar == true){

					String Combustivel = Combustiveis.dadosCombustivels.get(IDc).getCombustivel();
					int NovaQtd = QtdEstoque - Qtd;
					double Valor = Combustiveis.dadosCombustivels.get(IDc).getValor();
					double Custo = Combustiveis.dadosCombustivels.get(IDc).getCusto();
					double Ganho = Valor * Qtd;
					double Gasto = 0;

					Cadastrar C = new Cadastrar();
					C.CadastrarValores(Gasto, Ganho);

					Alterar A = new Alterar();
					A.QtdC(IDc, Combustivel, NovaQtd, Valor, Custo);

					if(Frentista == false){
						FormularioAdmin FA = new FormularioAdmin();
						FA.setVisible(true);
						dispose();
					}else{
						FormularioFrentista FF = new FormularioFrentista();
						FF.setVisible(true);
						dispose();
					}
					
				}else{

				}
			}
		});
		btnVender.setBounds(10, 179, 324, 23);
		contentPane.add(btnVender);

		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(Frentista == false){
					FormularioAdmin FA = new FormularioAdmin();
					FA.setVisible(true);
					dispose();
				}else{
					FormularioFrentista FF = new FormularioFrentista();
					FF.setVisible(true);
					dispose();
				}
			}
		});
		btnSair.setBounds(10, 213, 324, 23);
		contentPane.add(btnSair);

	}

}
