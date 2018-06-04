package formularios;
//tela de cadastro de funcionarios
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Cadastrar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FormularioCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField cmpNome;
	private JTextField cmpIdade;
	private JTextField cmpSobrenome;
	private JTextField cmpSalario;
	private JTextField cmpCadastrarUsuario;
	private JTextField cmpCadastrarSenha;

	public FormularioCadastrar() {

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 25, 48, 19);
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 124, 48, 19);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblIdade);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 225, 42, 19);
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblSexo);

		JLabel lblNewLabel = new JLabel("Sal\u00E1rio:");
		lblNewLabel.setBounds(10, 275, 59, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);

		cmpNome = new JTextField();
		cmpNome.setBounds(110, 26, 201, 20);
		contentPane.add(cmpNome);
		cmpNome.setColumns(10);

		cmpIdade = new JTextField();
		cmpIdade.setBounds(110, 125, 86, 20);
		contentPane.add(cmpIdade);
		cmpIdade.setColumns(10);

		ButtonGroup sexos = new ButtonGroup();

		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setActionCommand("Masculino");
		rdbtnMasculino.setBounds(110, 225, 86, 23);
		sexos.add(rdbtnMasculino);
		contentPane.add(rdbtnMasculino);

		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setActionCommand("Feminino");
		rdbtnFeminino.setBounds(222, 225, 86, 23);
		sexos.add(rdbtnFeminino);
		contentPane.add(rdbtnFeminino);

		JRadioButton rdbtnIndefinido = new JRadioButton("Indefinido");
		rdbtnIndefinido.setActionCommand("Indefinido");
		rdbtnIndefinido.setBounds(342, 225, 86, 23);
		sexos.add(rdbtnIndefinido);
		contentPane.add(rdbtnIndefinido);

		rdbtnMasculino.setSelected(true);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCargo.setBounds(10, 175, 49, 19);
		contentPane.add(lblCargo);

		ButtonGroup cargos = new ButtonGroup();

		JRadioButton rdbtnFrentista = new JRadioButton("Frentista");
		rdbtnFrentista.setActionCommand("Frentista");
		cargos.add(rdbtnFrentista);
		rdbtnFrentista.setBounds(110, 175, 109, 23);
		contentPane.add(rdbtnFrentista);

		JRadioButton rdbtnCaixa = new JRadioButton("Caixa");
		rdbtnCaixa.setActionCommand("Caixa");
		cargos.add(rdbtnCaixa);
		rdbtnCaixa.setBounds(222, 175, 109, 23);
		contentPane.add(rdbtnCaixa);

		rdbtnFrentista.setSelected(true);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(10, 75, 89, 19);
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblSobrenome);

		cmpSobrenome = new JTextField();
		cmpSobrenome.setBounds(110, 76, 201, 20);
		contentPane.add(cmpSobrenome);
		cmpSobrenome.setColumns(10);

		JLabel lblmaiorQue = new JLabel("(Maior que 16 e menor que 70 anos)");
		lblmaiorQue.setBounds(206, 128, 222, 14);
		contentPane.add(lblmaiorQue);

		cmpSalario = new JTextField();
		cmpSalario.setBounds(110, 275, 201, 20);
		contentPane.add(cmpSalario);
		cmpSalario.setColumns(10);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(10, 325, 63, 19);
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblUsurio);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 375, 51, 19);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblSenha);

		cmpCadastrarUsuario = new JTextField();
		cmpCadastrarUsuario.setBounds(110, 326, 201, 20);
		contentPane.add(cmpCadastrarUsuario);
		cmpCadastrarUsuario.setColumns(10);

		cmpCadastrarSenha = new JTextField();
		cmpCadastrarSenha.setBounds(110, 376, 201, 20);
		contentPane.add(cmpCadastrarSenha);
		cmpCadastrarSenha.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(94, 427, 102, 23);
		btnCadastrar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				Cadastrar C = new Cadastrar();
				FormularioAdmin FA = new FormularioAdmin();

				boolean continuar = true;
				String nome = "";
				String sobrenome = "";
				int idade = 0;
				String sexo = String.valueOf(sexos.getSelection().getActionCommand());
				String cargo = String.valueOf(cargos.getSelection().getActionCommand());
				double salario = 0;
				String usuario = "";
				String Senha = "";

				try {
					nome = cmpNome.getText();

					if(cmpNome.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo nome vazio");
						continuar = false;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite um nome válido");
					continuar = false;
				}

				try {
					sobrenome = cmpSobrenome.getText();

					if(cmpSobrenome.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo sobrenome vazio");
						continuar = false;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite um sobrenome válido");
					continuar = false;
				}

				try {
					idade = Integer.parseInt(cmpIdade.getText());

					if(Integer.parseInt(cmpIdade.getText()) < 16 || Integer.parseInt(cmpIdade.getText()) > 70){
						JOptionPane.showMessageDialog(null, "Idade fora do permitido");
						continuar = false;
					}
					if(cmpIdade.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo idade vazio");
						continuar = false;
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite uma idade valída");
					continuar = false;
				}

				try {
					salario = Double.parseDouble(cmpSalario.getText());

					if(Double.parseDouble(cmpSalario.getText()) <= 0){
						JOptionPane.showMessageDialog(null, "Digite um salário valido");
						continuar = false;
					}
					if(cmpSalario.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo salário vazio");
						continuar = false;
					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite um salário valido");
					continuar = false;
				}

				try {
					usuario = String.valueOf(cmpCadastrarUsuario.getText());

					if(cmpCadastrarUsuario.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo usuário vazio");
						continuar = false;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite um usuário valído");
					continuar = false;
				}

				try {
					Senha = String.valueOf(cmpCadastrarSenha.getText());

					if(cmpCadastrarSenha.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Campo senha vazio");
						continuar = false;
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Digite uma senha valído");
					continuar = false;
				}

				if(continuar == true){

					boolean valido = C.VerficarRepetido(usuario);

					if(valido == true){

						int ID = C.DefinirID();

						C.Cadastra(ID  ,nome, sobrenome, idade, sexo, cargo, salario, usuario, Senha);

						FA.setVisible(true);
						dispose();

					}else{

						JOptionPane.showMessageDialog(null, "Usuário já cadastrado");
						cmpCadastrarUsuario.setText("");

					}
				}else{
					
				}
			}
		});
		contentPane.add(btnCadastrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(222, 427, 102, 23);
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioAdmin FA = new FormularioAdmin();
				FA.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnCancelar);

	}

}
