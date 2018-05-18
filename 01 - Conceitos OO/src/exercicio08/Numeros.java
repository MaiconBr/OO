package exercicio08;

import javax.swing.JOptionPane;

public class Numeros {

	String t1,t2;
	int n = 0;
	int prosseguir = 0;
	boolean valido = false;

	//Metodo para proseguir
	public void Verificar(){
		prosseguir = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Prosseguir", 0);
	}

	//Metodo para informar o numero
	public void PedirNumero(){
		do{
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero Inteiro"));
				valido = true;     
			} catch (Exception e) { 
				JOptionPane.showMessageDialog(null, "Erro");
				valido = false;}
		}while(valido == false);
		valido = false;
	}

	//Metodo para fazer antecessores
	public void Antecessores(){
		t1 = (n-10)+","+(n-9)+","+(n-8)+","+(n-7)+","+(n-6)+","+(n-5)+","+(n-4)+","+(n-3)+","+(n-2)+","+(n-1)+",'";
	}

	//Metodo para fazer sucessores
	public void Sucessores(){
		t2 = "',"+(n+1)+","+(n+2)+","+(n+3)+","+(n+4)+","+(n+5)+","+(n+6)+","+(n+7)+","+(n+8)+","+(n+9)+","+(n+10);
	}

	//metodo para mostar resultado
	public void Exibir(){
		JOptionPane.showMessageDialog(null, t1+(n)+t2);
	}

	//Metodo do laço
	public void laco(){

		do{

			Verificar();
			if(prosseguir == 1){break;}
			PedirNumero();
			Antecessores();
			Sucessores();
			Exibir();
			
		}while(prosseguir != 1);

	}
}
