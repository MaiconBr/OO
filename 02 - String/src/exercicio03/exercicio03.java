package exercicio03;

import javax.swing.JOptionPane;


public class exercicio03 {

	public static void main(String[] args) {

		String palavra = "";
		String novaPalavra = "";
		int QtdLetras = 0;
		int continuar = 0;
		boolean verbo = false;

		do{

			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Continuar", 0);
			if(continuar == 1){break;}
			
			do{

				palavra = JOptionPane.showInputDialog("Digite um verbo terminado em AR");
				palavra = palavra.toLowerCase();
				QtdLetras = palavra.length();

				if(palavra.endsWith("ar")){
					novaPalavra = palavra.substring(0, QtdLetras - 2);
					verbo = true;
				}else{
					JOptionPane.showMessageDialog(null, "Não é um verbo terminado em AR");
				}

			}while(verbo == false);

			verbo = false;
			
			JOptionPane.showMessageDialog(null, "Eu "+novaPalavra+"o\n"+"Tu "+novaPalavra+"as\n"+"Ele "+novaPalavra+"a\n"+"Nós "+novaPalavra+"amos\n"+
			"Vós "+novaPalavra+"áis\n"+"Eles "+novaPalavra+"am");
			
		}while(continuar == 0);
		
	}
}
