package formularios;
//tela do frentista
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioFrentista extends JFrame {

	private JPanel contentPane;

	public FormularioFrentista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 193, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTrocarUsurio = new JButton("Trocar Usu\u00E1rio");
		btnTrocarUsurio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FormularioLogin FL = new FormularioLogin();
				
				FL.setVisible(true);
				dispose();
				
			}
		});
		btnTrocarUsurio.setBounds(10, 133, 150, 23);
		contentPane.add(btnTrocarUsurio);
		
		JButton btnVenderCombustivel = new JButton("Vender Combustivel");
		btnVenderCombustivel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				boolean Frentista = true;
				FormularioVenderC FVC = new FormularioVenderC(Frentista);
				FVC.setVisible(true);
				dispose();
				
			}
		});
		btnVenderCombustivel.setBounds(10, 11, 150, 50);
		contentPane.add(btnVenderCombustivel);
		
		JButton btnNewButton = new JButton("Listar Combustiveis");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FormularioCombustivelFrentista FCF = new FormularioCombustivelFrentista();
				FCF.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(10, 72, 150, 50);
		contentPane.add(btnNewButton);
		
	}
}
