package exercicio01;

import javax.swing.JOptionPane;

public class exercicio1 {

	String palavra;
	String novaPalavra = "";
	int continuar = 0;
	
	//Metodo para continuar
	public void Continuar(){
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Continuar", 0);
	}

	//Metodo para pedir a palavra
	public void PedirPalavra(){
		palavra = JOptionPane.showInputDialog("Insira a palavra");
		palavra = palavra.toLowerCase();
	}

	//metodo para alternar as letras em maiusculo e minusculo
	public void Alternar(){
		for (int i = 0; i < palavra.length(); i++) {

			if(i % 2 == 0){
				novaPalavra += palavra.toUpperCase().charAt(i);
			}else{
				novaPalavra += palavra.charAt(i);
			}
		}
	}

	//Metodo para exibir a frase
	public void Exibir(){
		JOptionPane.showMessageDialog(null, novaPalavra);
	}

	//Metodo do laco
	public void laco(){
		
		do{
		
		Continuar();
		if(continuar == 1){break;}
		PedirPalavra();
		Alternar();
		Exibir();
		novaPalavra = "";
		
		}while(continuar == 0);
		
	}
	
}
