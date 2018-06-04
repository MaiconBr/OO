package formularios;
//tela de dados dos funcionarios
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.Tabelas;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class FormularioDadosFunc extends JFrame {

	private JPanel contentPane;
	private JTable tabelaF;
	private JLabel lblCliqueNaLinha;

	public FormularioDadosFunc() {
		
		Tabelas T = new Tabelas();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 829, 232);
		contentPane.add(scrollPane);
		
		tabelaF = new JTable();
		tabelaF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = tabelaF.getSelectedRow();
				
				if(linha != 0){
				
				FormularioAlterar Fa = new FormularioAlterar(linha);
				Fa.setVisible(true);
				dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Não é possivel alterar ou excluir o admin");
				}
				
				
			}
		});
		scrollPane.setViewportView(tabelaF);
		tabelaF.setModel(T.AdicionarTabelaFunc());
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				FormularioAdmin FA = new FormularioAdmin();
				FA.setVisible(true);
				dispose();
			}
		});
		btnSair.setBounds(349, 254, 150, 46);
		contentPane.add(btnSair);
		
		lblCliqueNaLinha = new JLabel("Clique na linha que deseja alterar");
		lblCliqueNaLinha.setBounds(61, 270, 227, 14);
		contentPane.add(lblCliqueNaLinha);
		
	}
}
