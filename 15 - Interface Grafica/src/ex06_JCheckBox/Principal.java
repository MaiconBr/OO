package ex06_JCheckBox;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(240, 130);;
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JComboBox");
		formulario.setLayout(null);

		//JCheckBox
		JCheckBox cbxMasculino = new JCheckBox("Masculino");
		cbxMasculino.setBounds(10, 10, 100, 20);

		JCheckBox cbxFeminino = new JCheckBox("Feminino");
		cbxFeminino.setBounds(110, 10, 100, 20);

		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 45, 120, 20);

		//Açao
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if((cbxMasculino.isSelected()) && (cbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estao selecionados");
				}else if(cbxMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino selecionado");
				}else if(cbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino selecionado");
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum selecionado");
				}

			}
		});

		//Adicionar componentes ao JFrame
		formulario.add(cbxFeminino);
		formulario.add(cbxMasculino);
		formulario.add(botao);

		//Exibir toda a estrutura
		formulario.setVisible(true);

	}

}
