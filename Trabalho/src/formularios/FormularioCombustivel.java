package formularios;
//tela do estoque de combustivel do admin (pode alterar dados e encomendar)
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controladores.Tabelas;

@SuppressWarnings("serial")
public class FormularioCombustivel extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTable table;
	private JButton btnEncomendar;
	private JLabel lblCliqueNaLinha;

	public FormularioCombustivel(int linha) {

		Tabelas T = new Tabelas();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 636, 176);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				FormularioAlterarC FAC = new FormularioAlterarC(linha);
				FAC.setVisible(true);
				dispose();

			}
		});
		table.setModel(T.AdicionarTabelaComb());
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioAdmin FA = new FormularioAdmin();
				FA.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(442, 209, 204, 41);
		contentPane.add(btnNewButton);

		btnEncomendar = new JButton("Encomendar");
		btnEncomendar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioEncomendarC FEc = new FormularioEncomendarC();
				FEc.setVisible(true);
				dispose();
			}
		});
		btnEncomendar.setBounds(227, 209, 204, 41);
		contentPane.add(btnEncomendar);
		
		lblCliqueNaLinha = new JLabel("Clique na linha que deseja alterar");
		lblCliqueNaLinha.setBounds(10, 222, 207, 14);
		contentPane.add(lblCliqueNaLinha);

	}
}
