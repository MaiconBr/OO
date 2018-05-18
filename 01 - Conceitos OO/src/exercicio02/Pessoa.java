package exercicio02;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	double altura, peso;
	int idade;
	double QtdJogadores = 0;
	String nomeMaior ="";
	double alturaMaior=0;
	String nomeVelho = "";
	int idadeMaior = 0;
	String nomePesado = "";
	double pesoMaior = 0;
	double SomaAltura = 0;
	double MediaAltura = 0;

	//obter nome
	public void ObterNome(){
		nome = JOptionPane.showInputDialog("Informe seu nome ou 'sair' para finalizar");
	}
	
	//obter dados
	public void obterDados(){

		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));

	}

	//metodo para o laço de repeticao
	public void laco(){

		do{
			ObterNome();
			if(nome.equals("sair")){break;}
			obterDados();
			QtdJogadores++;
			ObterMaiorAltura();
			ObterMaiorIdade();
			ObterMaiorPeso();
			somaAltura();
			

		}while(!nome.equals("sair"));

		ObterMedia();
		exibirDados();
	}

	//metodo para encontrar o jogador mais alto
	public void ObterMaiorAltura(){
		if(altura > alturaMaior){
			alturaMaior = altura;
			nomeMaior = nome;
		}
	}
	//metodo para encontrar o jogador mais velho
	public void ObterMaiorIdade(){

		if(idade > idadeMaior){
			idadeMaior = idade;
			nomeVelho = nome;
		}
	}
	//metodo para encontrar o jogador mais pesado
	public void ObterMaiorPeso(){

		if(peso > pesoMaior){
			pesoMaior = peso;
			nomePesado = nome;
		}

	}
	
	//Metodo para calcular media da altura dos jogadores
	public void somaAltura(){
		SomaAltura += altura;

	}
	
	public void ObterMedia(){
	MediaAltura += (SomaAltura/QtdJogadores);
	}
	
	
	//metodo para exibir dados
	public void exibirDados(){

		String msg = "Quantidade de jogadores: "+QtdJogadores+"\n Nome e altura do maior jogador: "+nomeMaior+" "
				+alturaMaior+"\n Nome e idade do jogador mais velho: "+nomeVelho+" "+idadeMaior+"\n Nome e peso do jogador mais Gordo: "+nomePesado+" "
				+pesoMaior+"\n Media da altura dos jogadores: "+MediaAltura;
		       
		JOptionPane.showMessageDialog(null, msg);

	}

}


