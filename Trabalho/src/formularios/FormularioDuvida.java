package formularios;
//tela que mostra nome sobrenome usuario senha quando aperta o botão ? no login
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import controladores.Tabelas;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioDuvida extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

	public FormularioDuvida() {
		
		Tabelas T = new Tabelas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 606, 129);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		tabela.setModel(T.AdicionarTabelaDuvida());
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				
			}
		});
		btnSair.setBounds(10, 151, 125, 47);
		contentPane.add(btnSair);
		
	}
	
}
	
	

