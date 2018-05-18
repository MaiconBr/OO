//Classe = molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//Atributos (característica)
	String nome;
	int idade;
	double peso, altura;

	//Metetodo de apresentaçao
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome é "+nome);

	}	

	//metodo para calcular o IMC
	public double calcularIMC(){

		double imc = peso / Math.pow(altura, 2);

		return imc;

	}

	//Metodo para retornar a condicao do IMC
	public String condicaoIMC(){

		//Obter o valor do imc
		double imc = calcularIMC();

		//Variavel contendo a condicao
		String condicao;

		//Condicional
		if(imc < 17){
			condicao = "Muito abaixo do peso";
		}else if(imc < 18.5){
			condicao = "Abaixo do peso";
		}else if(imc < 25){
			condicao = "Peso normal";
		}else if(imc < 30){
			condicao = "Acima do peso";
		}else if(imc < 35){
			condicao = "Obesidade 1";
		}else if(imc < 40){
			condicao = "Obesidade 2";
		}else{
			condicao = "Obesidade 3";
		}
		
		//retorno
		return condicao;
		
	}
	
	//Metodo para exibir o IMC
	public void exibirIMC(){
		
		String msg = "*****IMC*****\n";
		       msg+= "Seu imc é de: "+String.format("%.2f", calcularIMC())+".\n";
		       msg+= "Sua condição é "+condicaoIMC();
		       
		       JOptionPane.showMessageDialog(null, msg);
		       
	}

}
