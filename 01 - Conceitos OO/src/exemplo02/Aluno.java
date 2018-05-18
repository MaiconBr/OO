package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovado = 0, reprovado = 0;

	//metodo para realizar perguntas
	public void obterDados(){

		nome = JOptionPane.showInputDialog("Informe seu nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));

	}

	//metodo para o la�o de repeticao
	public void laco(){

		//variavel continuar
		int continuar = 0;

		do{
			obterDados();
			contabilizarSituacao();
			exibirDados();

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");

		}while(continuar == 0);

	}

	//Metodo para retornar a media
	public double calcularMedia(){

		double media = (nota1+nota2+nota3)/3;

		return media;
		
	}

	//metodo para retornar a situacao do aluno;
	public String situacaoAluno(){

		String situacao = calcularMedia() > 7 ? "Aprovado" : "Reprovado";
												
		return situacao;

	}
	
	//Metodo para contabilizar aprovados e reprovados
	public void contabilizarSituacao(){
		
		if(calcularMedia() >= 7){
			aprovado++;
		}else{
			reprovado++;
		}
		
	}

	//metodo para exibir a media e a situa�ao do aluno
	public void exibirDados(){

		String msg = "O aluno "+nome;
		msg+= "\nObteve m�dia: "+String.format("%.2f", calcularMedia());
		msg+= "\nSua situacao �: "+situacaoAluno();
		msg+= "\nH� "+aprovado+" aprovados.";
		msg+= "\nH� "+reprovado+" reprovados.";
		
		JOptionPane.showMessageDialog(null, msg);

	}

}
