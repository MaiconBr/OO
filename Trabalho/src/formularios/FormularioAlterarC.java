package formularios;
//tela de alteraçao de dados dos combustiveis (no caso só o preço)
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
import controladores.Combustiveis;

@SuppressWarnings("serial")
public class FormularioAlterarC extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

	public FormularioAlterarC(int linha) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 124);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtValor = new JTextField(String.valueOf(Combustiveis.dadosCombustivels.get(linha).getValor()));
		txtValor.setBounds(84, 10, 340, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValor.setBounds(10, 11, 46, 14);
		contentPane.add(lblValor);

		JButton btnAlterarP = new JButton("Alterar");
		btnAlterarP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;
				double Valor = 0;
				double Custo = Valor - Valor * 0.2;

				try {
					Valor = Double.parseDouble(txtValor.getText());

					if(txtValor.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo valor vazio");
						continuar = false;
					}
					if(Double.parseDouble(txtValor.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Digite um valor valido");
						continuar = false;
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Digite um valor valido");
					continuar = false;
				}

				if(continuar == true){

					Alterar A = new Alterar();

					int IDc = linha;
					String Combustivel = Combustiveis.dadosCombustivels.get(IDc).getCombustivel();
					int quantidade = Combustiveis.dadosCombustivels.get(IDc).getQuantidade();

					A.QtdC(IDc, Combustivel, quantidade, Valor, Custo);

					FormularioAdmin FA = new FormularioAdmin();
					FA.setVisible(true);
					dispose();
				}else{

				}

			}
		});
		btnAlterarP.setBounds(10, 41, 193, 33);
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
		btnCancelar.setBounds(231, 41, 193, 33);
		contentPane.add(btnCancelar);

	}

}
