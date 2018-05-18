package exercicio07;

import javax.swing.JOptionPane;

public class Forca {

	String palavraCorreta = "ESTUDAR";
	int vidas = 7;    
	String letra = "";
	String letrasD = "";
	Object[] menus = {"Arriscar uma palavra","Arriscar uma letra","Sair"};
	String palavra = "";
	Object menu = "";

	//Metodo para exibir menu
	public void ExibirMenu(){
		menu = JOptionPane.showInputDialog(null, "Escolha uma op��o \n numero de vidas: " + vidas, "jogo da forca", JOptionPane.PLAIN_MESSAGE, null, menus, "");
	}

	//Metodo para arriscar uma letra
	public void ArriscarLetra(){
		if(menu.equals("Arriscar uma letra")){
			letra = JOptionPane.showInputDialog(null, "Letras acertadas: "+letrasD+"\n Digite uma letra");
			letra = letra.toUpperCase().trim();
		}
	}

	//Metodo para arriscar uma palavra
	public void ArriscarPalavra(){
		if(menu.equals("Arriscar uma palavra")){
			palavra =JOptionPane.showInputDialog(null, "Digite uma palavra"+"\n Letras acertadas: "+letrasD);
			palavra = palavra.toUpperCase().trim();
		}
	}

	//Metodo para verificar se ganhou
	public void VerificarPalavra(){
		if(palavra.equals(palavraCorreta)){JOptionPane.showMessageDialog(null, "Par�bens voc� venceu! XD");}
		else{JOptionPane.showMessageDialog(null, "Voc� errou");vidas--;
		}
	}

	//Metodo para verificar se acertou a letra
	public void AcertouLetra(){
		switch (letra) {
		case "E":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" E";
		break;
		case "S":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" S";
		break;
		case "T":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" T";
		break;
		case "U":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" U";
		break;
		case "D":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" D";
		break;
		case "A":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" A";
		break;
		case "R":JOptionPane.showMessageDialog(null,"Voc� acertu uma letra");
		letrasD+=" R";
		break;
		default:
			vidas--;
			JOptionPane.showMessageDialog(null, "Voc� errou");
		}
	}

	//Metodo de bifurca�ao
	public void bifurcacao(){

		if(menu.equals("Arriscar uma letra")){
			AcertouLetra();
		}

		if(menu.equals("Arriscar uma palavra")){
			VerificarPalavra();
		}

	}

	//Metodo do la�o
	public void laco(){

		do{

			ExibirMenu();
			if(menu.equals("Sair")){break;}
			ArriscarLetra();
			ArriscarPalavra();
			bifurcacao();
			if(palavra.equals(palavraCorreta)){break;}

		}while(vidas > 0);

	}

}
