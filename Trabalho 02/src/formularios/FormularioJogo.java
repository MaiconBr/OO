package formularios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Acoes;
import controladores.PerguntasTemaEscolhido;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JTextArea;
import java.awt.Color;

@SuppressWarnings("serial")
public class FormularioJogo extends JFrame {

	private JPanel contentPane;

	public FormularioJogo() {
		setUndecorated(true);
		setResizable(false);

		Acoes A = new Acoes();

		int[] random = A.PegarPergunta();
		int i = random[PerguntasTemaEscolhido.qtdR];
		PerguntasTemaEscolhido.qtdP++;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JTextArea textPergunta = new JTextArea(PerguntasTemaEscolhido.qtdR+1+" - "+PerguntasTemaEscolhido.Perguntas.get(i).getPergunta());
		textPergunta.setBackground(Color.LIGHT_GRAY);
		textPergunta.setBounds(10, 11, 501, 50);
		textPergunta.setEditable(false);
		contentPane.add(textPergunta);

		ButtonGroup alternativa = new ButtonGroup();

		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBackground(Color.GRAY);
		rdbtnA.setBounds(10, 68, 33, 23);
		alternativa.add(rdbtnA);
		contentPane.add(rdbtnA);

		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBackground(Color.GRAY);
		rdbtnB.setBounds(10, 94, 33, 23);
		alternativa.add(rdbtnB);
		contentPane.add(rdbtnB);

		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBackground(Color.GRAY);
		rdbtnC.setBounds(10, 120, 33, 23);
		alternativa.add(rdbtnC);
		contentPane.add(rdbtnC);

		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBackground(Color.GRAY);
		rdbtnD.setBounds(10, 146, 33, 23);
		alternativa.add(rdbtnD);
		contentPane.add(rdbtnD);

		JLabel lblAlta = new JLabel(PerguntasTemaEscolhido.Perguntas.get(i).getA());
		lblAlta.setBounds(49, 72, 462, 14);
		contentPane.add(lblAlta);

		JLabel lblAltb = new JLabel(PerguntasTemaEscolhido.Perguntas.get(i).getB());
		lblAltb.setBounds(49, 98, 462, 14);
		contentPane.add(lblAltb);

		JLabel lblAltc = new JLabel(PerguntasTemaEscolhido.Perguntas.get(i).getC());
		lblAltc.setBounds(49, 124, 462, 14);
		contentPane.add(lblAltc);

		JLabel lblAltd = new JLabel(PerguntasTemaEscolhido.Perguntas.get(i).getD());
		lblAltd.setBounds(49, 150, 462, 14);
		contentPane.add(lblAltd);

		JLabel lblAcertos = new JLabel("Acertos: "+PerguntasTemaEscolhido.qtdA);
		lblAcertos.setBounds(422, 174, 89, 14);
		contentPane.add(lblAcertos);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(109, 199, 105, 93);
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				int j = random[PerguntasTemaEscolhido.qtdR+PerguntasTemaEscolhido.qtdPulos];

				String escolha = "";

				boolean valido = true;

				if(rdbtnA.isSelected()){
					escolha = "A";
				}else if(rdbtnB.isSelected()){
					escolha = "B";				
				}else if(rdbtnC.isSelected()){
					escolha = "C";		
				}else if(rdbtnD.isSelected()){
					escolha = "D";	
				}else{
					JOptionPane.showMessageDialog(null, "Selecione uma alternativa primeiro");
					valido = false;
				}

				if(valido == true){

					alternativa.clearSelection();

					String correta = PerguntasTemaEscolhido.Perguntas.get(j).getCorreta();

					if(escolha.equals(correta)){
						PerguntasTemaEscolhido.qtdA++;
					}

					PerguntasTemaEscolhido.qtdR++;

					btnConfirmar.setVisible(false);

					lblAcertos.setText("Acertos: "+PerguntasTemaEscolhido.qtdA);

					if(PerguntasTemaEscolhido.qtdR > 9){
						JOptionPane.showMessageDialog(null, "Fim do jogo\n\n"+"Você obteve: "+PerguntasTemaEscolhido.qtdA+" Acertos");

						Acoes A = new Acoes();

						A.CadastrarJogador();

						PerguntasTemaEscolhido.qtdJ++;

						PerguntasTemaEscolhido.qtdR = 0;
						PerguntasTemaEscolhido.qtdA = 0;
						PerguntasTemaEscolhido.qtdP = 0;
						PerguntasTemaEscolhido.qtdPulos = 0;
						PerguntasTemaEscolhido.qtdDicas = 0;
						dispose();
						FormularioMenu FM = new FormularioMenu();
						FM.setVisible(true);
					}
				}

			}

		});
		contentPane.add(btnConfirmar);


		JButton btnProxima = new JButton("Proxima");
		btnProxima.setBounds(10, 199, 89, 93);
		btnProxima.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if(PerguntasTemaEscolhido.qtdR == PerguntasTemaEscolhido.qtdP){

					int i = random[PerguntasTemaEscolhido.qtdR+PerguntasTemaEscolhido.qtdPulos];

					textPergunta.setText(PerguntasTemaEscolhido.qtdR+1+" - "+PerguntasTemaEscolhido.Perguntas.get(i).getPergunta());
					lblAlta.setText(PerguntasTemaEscolhido.Perguntas.get(i).getA());
					lblAltb.setText(PerguntasTemaEscolhido.Perguntas.get(i).getB());
					lblAltc.setText(PerguntasTemaEscolhido.Perguntas.get(i).getC());
					lblAltd.setText(PerguntasTemaEscolhido.Perguntas.get(i).getD());

					PerguntasTemaEscolhido.qtdP++;

					btnConfirmar.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(null, "Responda a pergunta atual primeiro");
				}


			}
		});
		contentPane.add(btnProxima);


		JButton btnSair = new JButton("Desistir");
		btnSair.setBounds(422, 199, 89, 93);
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				PerguntasTemaEscolhido.qtdR = 0;
				PerguntasTemaEscolhido.qtdA = 0;
				PerguntasTemaEscolhido.qtdP = 0;
				PerguntasTemaEscolhido.qtdPulos = 0;
				PerguntasTemaEscolhido.qtdDicas = 0;

				FormularioMenu FM = new FormularioMenu();
				FM.setVisible(true);
				dispose();

			}
		});
		contentPane.add(btnSair);

		JButton btnPular = new JButton("Pular");
		btnPular.setBounds(323, 199, 89, 93);
		btnPular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(PerguntasTemaEscolhido.qtdPulos < 3){

					PerguntasTemaEscolhido.qtdPulos++; 

					int i = random[PerguntasTemaEscolhido.qtdR+PerguntasTemaEscolhido.qtdPulos];

					textPergunta.setText(PerguntasTemaEscolhido.qtdR+1+" - "+PerguntasTemaEscolhido.Perguntas.get(i).getPergunta());
					lblAlta.setText(PerguntasTemaEscolhido.Perguntas.get(i).getA());
					lblAltb.setText(PerguntasTemaEscolhido.Perguntas.get(i).getB());
					lblAltc.setText(PerguntasTemaEscolhido.Perguntas.get(i).getC());
					lblAltd.setText(PerguntasTemaEscolhido.Perguntas.get(i).getD());
				}else{
					JOptionPane.showMessageDialog(null, "Você já usou todos os 3 pulos");
				}

			}
		});
		contentPane.add(btnPular);

		JButton btnDica = new JButton("Dica");
		btnDica.setBounds(224, 199, 89, 93);
		btnDica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if(PerguntasTemaEscolhido.qtdDicas == 0){

					PerguntasTemaEscolhido.qtdDicas++;

					int i = random[PerguntasTemaEscolhido.qtdR+PerguntasTemaEscolhido.qtdPulos];

					int r = new Random().nextInt(4);
							
					if(r == 0){
						JOptionPane.showMessageDialog(null, "Deu Azar");
					}else if(r == 1 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("A")){
						lblAltb.setText("");
					}else if(r == 1 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("B")){
						lblAltc.setText("");
					}else if(r == 1 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("C")){
						lblAltd.setText("");
					}else if(r == 1 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("D")){
						lblAlta.setText("");
					}else if(r == 2 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("A")){
						lblAltb.setText("");
						lblAltd.setText("");
					}else if(r == 2 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("B")){
						lblAltc.setText("");
						lblAlta.setText("");
					}else if(r == 2 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("C")){
						lblAltd.setText("");
						lblAltb.setText("");
					}else if(r == 2 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("D")){
						lblAlta.setText("");
						lblAltc.setText("");
					}else if(r == 3 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("A")){
						lblAltb.setText("");
						lblAltc.setText("");
						lblAltd.setText("");
					}else if(r == 3 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("B")){
						lblAlta.setText("");
						lblAltc.setText("");
						lblAltd.setText("");
					}else if(r == 3 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("C")){
						lblAltb.setText("");
						lblAlta.setText("");
						lblAltd.setText("");
					}else if(r == 3 && PerguntasTemaEscolhido.Perguntas.get(i).getCorreta().equals("D")){
						lblAltb.setText("");
						lblAltc.setText("");
						lblAlta.setText("");

					}
							 
						}else{
							JOptionPane.showMessageDialog(null, "Você já usou a dica");
						}
					}
				});
		contentPane.add(btnDica);

			}
		}
