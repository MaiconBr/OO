package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/*

	Encapsulamento -> Visibilidade de atributos e métodos
	DEFAULT   -> Visivel apenas nas classes no mesmo pacote
	PUBLIC    -> Visivel por qualquer classe (em qualquer projeto)
	PRIVATE   -> Visivel apenas na classe onde são criados
	PROTECTED -> Visivel na classe onde são criados ou herdados
	 */

	//Atributos da classe
	private String nome;
	private double nota1, nota2;

	//Metodo para obter dados
	public void obterDados(){
		nome = JOptionPane.showInputDialog("nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2"));	

		exibirFrase();
	}

	//Metodo para retornar a média
	private double calculoMedia(){
		return (nota1+nota2) / 2;
	}

	//Metodo para exibir uma frase
	private void exibirFrase(){
		JOptionPane.showMessageDialog(null, nome+" obteve média "+calculoMedia());
	}

}
