package formularios;
//tela de dados dos produtos do caixa)
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controladores.Tabelas;

@SuppressWarnings("serial")
public class FormularioProdutosCaixa extends JFrame {

	private JPanel contentPane;

	private JButton btnNewButton;
	private JTable table;

	public FormularioProdutosCaixa() {

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
		table.setModel(T.AdicionarTabelaProd());
		scrollPane.setViewportView(table);

		btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioCaixa FC = new FormularioCaixa();
				FC.setVisible(true);
				dispose();

			}
		});
		btnNewButton.setBounds(10, 209, 164, 41);
		contentPane.add(btnNewButton);

	}
}
