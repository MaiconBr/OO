package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.Tabelas;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class FormularioRanking extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public FormularioRanking() {
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 312);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 60, 463, 206);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new Tabelas().AdicionarTabelaRanking());
		scrollPane.setViewportView(table);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRanking.setBounds(189, 18, 104, 31);
		contentPane.add(lblRanking);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FormularioMenu FM = new FormularioMenu();
				FM.setVisible(true);
				dispose();
				
			}
		});
		btnSair.setBounds(197, 277, 89, 23);
		contentPane.add(btnSair);
		
	}
}
