package controladores;

import java.util.Random;

public class Acoes{

	public void IniciaArray(){

		for (int i = 0; i < 20; i++) {

			PerguntasTemaEscolhido PTE = new PerguntasTemaEscolhido();

			PTE.setID(i);
			PTE.setPergunta("");
			PTE.setA("");
			PTE.setB("");
			PTE.setC("");
			PTE.setD("");
			PTE.setCorreta("");

			PerguntasTemaEscolhido.Perguntas.add(PTE);

		}

	}

	public int[] PegarPergunta(){

		int[] random = new int[13];
		int indiceP = 0;

		while(indiceP < 13){

			int rnd = new Random().nextInt(20);
			boolean repetido = false;

			for (int j = 0; j < random.length; j++) {
				if(random[j] == rnd){
					repetido = true;
				}
			}

				if(repetido == false){
					random[indiceP] = rnd;
					indiceP++;
					
				}
			}

		return random;

	}
	
	public void CadastrarJogador(){
	
		int Dia = Jogadores.Data1.getDayOfMonth();
		int Mes = Jogadores.Data1.getMonthValue();
		int Ano = Jogadores.Data1.getYear();
		
		String Data = Dia+"/"+Mes+"/"+Ano;
		
		Jogadores J = new Jogadores();
		
		J.setNome(Jogadores.jgdr);
		J.setData(Data);
		J.setAcertos(PerguntasTemaEscolhido.qtdA);
		
		Jogadores.Dados.add(J);
		
	}
	


}
