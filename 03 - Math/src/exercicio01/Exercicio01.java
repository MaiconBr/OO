package exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01 {


	Object[] operacoes = {"Soma","Subtração","Multiplicação","Divisão","Seno","Cosseno","Tangente","Log","Raiz Quadrada","Raiz Cúbica"};
	double numero1 = 0;
	double numero2 = 0;
	double resultado = 0;
	Object operacao = "";
	int continuar = 0;

	//Metodo para continuar
		public void Continuar(){
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Continuar", 0);
		}

	//Metodo para escolher operaçao
	public void Operacao(){
		operacao = JOptionPane.showInputDialog(null, "Escolha a operação", "Calculadora", JOptionPane.PLAIN_MESSAGE, null, operacoes, "");
	}

	//Metodo para pedir numero 1
	public void PedirNumero1(){
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1"));
	}

	//Metodo para pedir numero 2
	public void PedirNumero2(){
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2"));
	}

	//Metodo para Soma
	public void Soma(){
		PedirNumero1();
		PedirNumero2();
		resultado = numero1 + numero2;	
	}

	//Metodo para Subtração
	public void Subtracao(){
		PedirNumero1();
		PedirNumero2();
		resultado = numero1 - numero2;	
	}

	//Metodo para multiplicação
	public void Multiplicacao(){
		PedirNumero1();
		PedirNumero2();
		resultado = numero1 * numero2;	
	}

	//Metodo para Divisão
	public void Divisao(){
		PedirNumero1();
		PedirNumero2();
		resultado = numero1 / numero2;	
	}

	//Metodo para seno
	public void Seno(){
		PedirNumero1();
		resultado = Math.sin(numero1);
	}

	//Metodo para cosseno
	public void Cosseno(){
		PedirNumero1();
		resultado = Math.cos(numero1);
	}

	//Metodo para Tangente
	public void Tangente(){
		PedirNumero1();
		resultado = Math.tan(numero1);
	}

	//Metodo para Log
	public void Log(){
		PedirNumero1();
		resultado = Math.log(numero1);
	}

	//Metodo para Raiz quadrada
	public void RaizQ(){
		PedirNumero1();
		resultado = Math.sqrt(numero1);
	}

	//Metodo para Raiz cubica
	public void RaizC(){
		PedirNumero1();
		resultado = Math.cbrt(numero1);

	}
	
	//Exibir
	public void Exibir(){
		JOptionPane.showMessageDialog(null, resultado);
	}

	//Metodo do laco
	public void laco(){

		do{
			Continuar();
			Operacao();
			if(operacao.equals("Soma")){
				Soma();
			}
			if(operacao.equals("Subtração")){
				Subtracao();
			}
			if(operacao.equals("Multiplicação")){
				Multiplicacao();
			}
			if(operacao.equals("Divisão")){
				Divisao();
			}
			if(operacao.equals("Seno")){
				Seno();
			}
			if(operacao.equals("Cosseno")){
				Cosseno();
			}
			if(operacao.equals("Tangente")){
				Tangente();
			}
			if(operacao.equals("Log")){
				Log();
			}
			if(operacao.equals("Raiz Quadrada")){
				RaizQ();
			}
			if(operacao.equals("Raiz Cúbica")){
				RaizC();
			}
			Exibir();
			resultado = 0;

		}while(continuar == 0);
	}
}

