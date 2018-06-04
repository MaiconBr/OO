package formularios;
//tela de login
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Login;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioLogin extends JFrame {

	public FormularioLogin(){
		
		FormularioAdmin FA = new FormularioAdmin();
		FormularioFrentista FF = new FormularioFrentista();
		FormularioCaixa Fc = new FormularioCaixa();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		setIconImage(Toolkit.getDefaultToolkit().getImage(FormularioLogin.class.getResource("/imagens/if_city_11_3078512.png")));
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setLayout(null);
		contentPane.setLayout(null);

		cmpUsuario = new JTextField();
		cmpUsuario.setBounds(109, 150, 170, 30);
		getContentPane().add(cmpUsuario);
		cmpUsuario.setColumns(10);

		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(109, 180, 170, 30);
		pwdSenha.setToolTipText("");
		getContentPane().add(pwdSenha);

		JLabel lblNewLabel = new JLabel("Usu\u00E1rio :");
		lblNewLabel.setBounds(24, 150, 61, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblNewLabel);

		lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(24, 180, 61, 30);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login L = new Login();
				
				String usuario = cmpUsuario.getText();
				String senha = String.valueOf(pwdSenha.getPassword());
				
				String cargo = "";
				
				int nivel = L.VerificarLogin(usuario, senha, cargo);
				
				if(nivel == 3){
					FA.setVisible(true);
					dispose();
				}else if(nivel == 2){
					FF.setVisible(true);
					dispose();
				}else if(nivel == 1){
					Fc.setVisible(true);
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
				}
				
				cmpUsuario.setText("");
				pwdSenha.setText("");
				
			}
		});
		btnEntrar.setBounds(109, 221, 170, 30);
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnEntrar);

		lblPostoDeGasolina = new JLabel("Posto de Gasolina");
		lblPostoDeGasolina.setBounds(39, 49, 255, 47);
		lblPostoDeGasolina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostoDeGasolina.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblPostoDeGasolina);
		
		JButton btnSenhas = new JButton("?");
		btnSenhas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FormularioDuvida FD = new FormularioDuvida();
				
				FD.setVisible(true);
				
			}
		});
		btnSenhas.setBounds(283, 184, 43, 23);
		contentPane.add(btnSenhas);

	}

	private JPanel contentPane;
	private JTextField cmpUsuario;
	private JPasswordField pwdSenha;
	private JLabel lblSenha;
	private JLabel lblPostoDeGasolina;

}
