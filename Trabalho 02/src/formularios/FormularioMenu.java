package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Gerais;
import controladores.Jogadores;
import controladores.Matematica;
import controladores.Minecraft;
import controladores.Padrao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;

@SuppressWarnings("serial")
public class FormularioMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;

	public FormularioMenu() {
		setResizable(false);
		setUndecorated(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 266);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblQuiz = new JLabel("Quiz");
		lblQuiz.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblQuiz.setBounds(164, 21, 79, 31);
		contentPane.add(lblQuiz);

		JLabel lblQuiz2 = new JLabel("Quiz");
		lblQuiz2.setForeground(Color.GRAY);
		lblQuiz2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblQuiz2.setBounds(168, 22, 79, 31);
		contentPane.add(lblQuiz2);

		textNome = new JTextField();
		textNome.setBounds(141, 84, 237, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		JLabel lblNomeDoParticipante = new JLabel("Nome do Participante:");
		lblNomeDoParticipante.setBounds(10, 87, 164, 14);
		contentPane.add(lblNomeDoParticipante);

		JLabel lblTema = new JLabel("Tema:");
		lblTema.setBounds(10, 125, 46, 14);
		contentPane.add(lblTema);

		ButtonGroup Temas = new ButtonGroup();

		JRadioButton rdbtnMinecraft = new JRadioButton("Minecraft");
		rdbtnMinecraft.setBackground(Color.LIGHT_GRAY);
		Temas.add(rdbtnMinecraft);
		rdbtnMinecraft.setBounds(48, 121, 82, 23);
		contentPane.add(rdbtnMinecraft);

		JRadioButton rdbtnMatemtica = new JRadioButton("Matematica");
		rdbtnMatemtica.setBackground(Color.LIGHT_GRAY);
		Temas.add(rdbtnMatemtica);
		rdbtnMatemtica.setBounds(132, 121, 92, 23);
		contentPane.add(rdbtnMatemtica);

		JRadioButton rdbtnCG = new JRadioButton("Conhecimentos Gerais");
		rdbtnCG.setBackground(Color.LIGHT_GRAY);
		Temas.add(rdbtnCG);
		rdbtnCG.setBounds(226, 121, 156, 23);
		contentPane.add(rdbtnCG);

		JButton btnJogar = new JButton("Jogar");
		btnJogar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean continuar = true;

				for (int i = 0; i < Jogadores.Dados.size() ; i++) {
					if(textNome.getText().equals(Jogadores.Dados.get(i).getNome())){
						continuar = false;
						JOptionPane.showMessageDialog(null, "O jogador "+textNome.getText()+" já existe");
					}

				}

				if(textNome.getText().isEmpty()){
					continuar = false;
					JOptionPane.showMessageDialog(null, "Digite um nome Primeiro");
				}

				if(continuar == true){


					if(rdbtnMinecraft.isSelected()){
						
						Jogadores.jgdr = textNome.getText();
						Jogadores.Data1 = LocalDateTime.now();

						Padrao P = new Minecraft();
						P.PerguntasTema();
						FormularioJogo FJ = new FormularioJogo();
						FJ.setVisible(true);
						dispose();


					}else if(rdbtnCG.isSelected()){
						
						Jogadores.jgdr = textNome.getText();
						Jogadores.Data1 = LocalDateTime.now();

						Padrao P = new Gerais();
						P.PerguntasTema();
						FormularioJogo FJ = new FormularioJogo();
						FJ.setVisible(true);
						dispose();

					}else if(rdbtnMatemtica.isSelected()){
						
						Jogadores.jgdr = textNome.getText();
						Jogadores.Data1 = LocalDateTime.now();

						Padrao P = new Matematica();
						P.PerguntasTema();
						FormularioJogo FJ = new FormularioJogo();
						FJ.setVisible(true);
						dispose();

					}else{
						JOptionPane.showMessageDialog(null, "Selecione um tema Primeiro");
					}

				}
			}
		});
		btnJogar.setBounds(10, 170, 82, 82);
		contentPane.add(btnJogar);

		JButton btnRanking = new JButton("Ranking");
		btnRanking.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				FormularioRanking FR = new FormularioRanking();
				FR.setVisible(true);
				dispose();

			}
		});
		btnRanking.setBounds(153, 170, 82, 82);
		contentPane.add(btnRanking);

		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				dispose();

			}
		});
		btnNewButton.setBounds(296, 170, 82, 82);
		contentPane.add(btnNewButton);

	}
}
