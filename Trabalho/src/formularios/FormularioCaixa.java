package formularios;
//tela do funcionario caixa
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioCaixa extends JFrame {

	private JPanel contentPane;

	public FormularioCaixa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 197, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnTrocarUsurio = new JButton("Trocar Usu\u00E1rio");
		btnTrocarUsurio.setBounds(10, 133, 160, 23);
		btnTrocarUsurio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioLogin FL = new FormularioLogin();

				FL.setVisible(true);
				dispose();

			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnTrocarUsurio);
		
		JButton btnNewButton = new JButton("Vender Produto");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean Caixa = true;
				FormularioVenderP FVP = new FormularioVenderP(Caixa);
				FVP.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(10, 11, 160, 50);
		contentPane.add(btnNewButton);
		
		JButton btnListarProdutos = new JButton("Listar Produtos");
		btnListarProdutos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FormularioProdutosCaixa FPC = new FormularioProdutosCaixa();
				FPC.setVisible(true);
				dispose();
			}
		});
		btnListarProdutos.setBounds(10, 72, 160, 50);
		contentPane.add(btnListarProdutos);

	}
}
