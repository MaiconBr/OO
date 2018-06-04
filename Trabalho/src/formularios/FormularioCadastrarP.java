package formularios;
//tela de cadastro de produtos
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Cadastrar;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioCadastrarP extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;

	public FormularioCadastrarP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtProduto = new JTextField();
		txtProduto.setBounds(84, 15, 223, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);

		txtValor = new JTextField();
		txtValor.setBounds(84, 56, 223, 20);
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

		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean continuar = true;
				String produto = "";
				double valor = 0;

				try {
					produto = txtProduto.getText();

					if(txtProduto.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo produto vazio");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um produto valido");
					continuar = false;
				}

				try {
					valor = Double.parseDouble(txtValor.getText());

					if(txtValor.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo valor vazio");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um produto valido");
					continuar = false;
				}

				if(continuar == true){
					
					double custo = valor - valor * 0.2;

					Cadastrar C = new Cadastrar();
					boolean valido = C.VerficarProdutoRepetido(produto);

					if(valido == true){

						int IDp = C.DefinirIDp();
						int quantidade = 0;

						C.CadastraP(IDp, produto,quantidade, valor, custo);

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
		btnCadastrarProduto.setBounds(10, 97, 166, 33);
		contentPane.add(btnCadastrarProduto);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioAdmin FA = new FormularioAdmin();
				FA.setVisible(true);
				dispose();

			}
		});
		btnCancelar.setBounds(186, 97, 121, 33);
		contentPane.add(btnCancelar);

	}
}
