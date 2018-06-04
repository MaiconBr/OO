package formularios;
//tela do admin
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Saldo;

import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FormularioAdmin extends JFrame {

	private JPanel contentPane;

	FormularioCadastrar FC = new FormularioCadastrar();

	public FormularioAdmin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 411, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCadastrar = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrar.setForeground(Color.RED);
		btnCadastrar.setBounds(10, 11, 183, 50);
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				FC.setVisible(true);
				dispose();

			}
		});
		contentPane.setLayout(null);
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.add(btnCadastrar);

		JButton btnTrocar = new JButton("Trocar Usu\u00E1rio");
		btnTrocar.setBounds(10, 318, 385, 23);
		btnTrocar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				FormularioLogin FL = new FormularioLogin();
				FL.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnTrocar);

		JButton btnDadosFunc = new JButton("Funcion\u00E1rios");
		btnDadosFunc.setForeground(Color.RED);
		btnDadosFunc.setBounds(10, 72, 183, 50);
		btnDadosFunc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				FormularioDadosFunc FDF = new FormularioDadosFunc();
				FDF.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnDadosFunc);

		JButton btnCadastrarP = new JButton("Cadastrar Produtos");
		btnCadastrarP.setForeground(Color.RED);
		btnCadastrarP.setBounds(10, 133, 183, 50);
		btnCadastrarP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioCadastrarP CP = new FormularioCadastrarP();
				CP.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnCadastrarP);

		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setForeground(Color.RED);
		btnProdutos.setBounds(10, 194, 183, 50);
		btnProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioProdutos FP = new FormularioProdutos();
				FP.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnProdutos);

		JButton btnVenderProduto = new JButton("Vender Produto");
		btnVenderProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean Caixa = false;
				FormularioVenderP FVP = new FormularioVenderP(Caixa);
				FVP.setVisible(true);
				dispose();

			}
		});
		btnVenderProduto.setBounds(212, 133, 183, 50);
		contentPane.add(btnVenderProduto);

		JButton btnCombustiveis = new JButton("Combust\u00EDveis");
		btnCombustiveis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = 0;
				FormularioCombustivel Fc = new FormularioCombustivel(linha);
				Fc.setVisible(true);
				dispose();
				
			}
		});
		btnCombustiveis.setForeground(Color.RED);
		btnCombustiveis.setBounds(212, 11, 183, 50);
		contentPane.add(btnCombustiveis);

		JButton btnVenderCombustvel = new JButton("Vender Combust\u00EDvel");
		btnVenderCombustvel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				boolean Frentista = false;
				FormularioVenderC FVC = new FormularioVenderC(Frentista);
				FVC.setVisible(true);
				dispose();
							
			}
		});
		btnVenderCombustvel.setBounds(212, 72, 183, 50);
		contentPane.add(btnVenderCombustvel);

		JButton btnLucrosdespesas = new JButton("Lucros/Despesas");
		btnLucrosdespesas.addMouseListener(new MouseAdapter() {
			@Override

			public void mouseClicked(MouseEvent e) {

				Saldo S = new Saldo();

				double Ganho = 0;
				double GastoS = 0;
				double GastoE = 0;
				double saldos = 0;

				Ganho = S.Ganhos(Ganho);
				GastoS = S.GastoSalarios(GastoS);
				GastoE = S.GastoEncomendas(GastoE);
				saldos = S.Saldo(saldos);

				JOptionPane.showMessageDialog(null, "Ganhos: "+Ganho+"\nDespesas com Salários: "+GastoS+"\nDespesas com Encomendas: "+GastoE+"\nSaldo: "+saldos);

			}
		});
		btnLucrosdespesas.setForeground(Color.RED);
		btnLucrosdespesas.setBounds(10, 257, 385, 50);
		contentPane.add(btnLucrosdespesas);

		JLabel lblFunesExclusivasDe = new JLabel("Fun\u00E7\u00F5es Exclusivas de admin");
		lblFunesExclusivasDe.setForeground(Color.RED);
		lblFunesExclusivasDe.setBounds(212, 212, 183, 14);
		contentPane.add(lblFunesExclusivasDe);

	}
}
