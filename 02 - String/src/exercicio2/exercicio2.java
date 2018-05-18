package exercicio2;

import javax.swing.JOptionPane;

public class exercicio2 {

	String palavra = "";
	int QtdVogais = 0;
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

	//Metodo para verificar vogais 
	public void Verificar(){
		for (int i = 0; i < palavra.length(); i++) {

			if(String.valueOf(palavra.charAt(i)).equals("a")){
				QtdVogais++;
			}else if(String.valueOf(palavra.charAt(i)).equals("e")){
				QtdVogais++;
			}else if(String.valueOf(palavra.charAt(i)).equals("i")){
				QtdVogais++;
			}else if(String.valueOf(palavra.charAt(i)).equals("o")){
				QtdVogais++;
			}else if(String.valueOf(palavra.charAt(i)).equals("u")){
				QtdVogais++;


			}
		}
	}

	//Metodo para exibir
	public void Exibir(){
		JOptionPane.showMessageDialog(null, "A quantidade de vogais: "+QtdVogais);
	}

	//Laço
	public void laco(){

		do{

			Continuar();
			if(continuar == 1){break;}
			PedirPalavra();
			Verificar();
			Exibir();
			QtdVogais = 0;

		}while(continuar == 0);

	}


}
