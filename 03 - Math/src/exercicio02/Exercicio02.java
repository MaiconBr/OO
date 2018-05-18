package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

	double numeroRandomico;
	int numero = 0;
	int continuar = 0;
	double diferenca = 0;
	int palpites = 0;
	boolean fim = false;

	//Metodo para gerar numero randomico
	public double geraNumero() {
		numeroRandomico = Math.random();
		numeroRandomico = (int) Math.round(0 + numeroRandomico * 101);

		return numeroRandomico;
	}

	//Metodo para pedir o numero
	public void PedirNumero(){
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}while(numero < 0 && numero > 100);
	}

	//Metodo para verificar palpite
	public void Verificar(){
		diferenca = numero - numeroRandomico;
		diferenca = Math.abs(diferenca);
		if(numero == numeroRandomico){
			JOptionPane.showMessageDialog(null, "Acertou !");
			fim = true;
		}else if(diferenca <= 10){
			JOptionPane.showMessageDialog(null, "Está perto");
		}else if(diferenca <= 20){
			JOptionPane.showMessageDialog(null, "Está longe");
		}else{
			JOptionPane.showMessageDialog(null, "Errou feio,Errou rude");
		}
	}

	//Metodo para mostrar numero de palpites
	public void Palpites(){
		if(palpites == 1){
			JOptionPane.showMessageDialog(null, "Acertou em cheio");
		}else if(palpites <= 5){
			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
		}else if(palpites <= 10){
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
		}else if(palpites <= 20){
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
		}else{
			JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
		}
	}

	public void laco() {
		do {
			geraNumero();
			do{
				PedirNumero();
				palpites++;
				Verificar();
			}while(fim == false);
			fim = false;
			Palpites();
			palpites = 0;
			continuar = JOptionPane.showConfirmDialog(null, "Outra vez?");
		} while (continuar == 0);
	}
}
