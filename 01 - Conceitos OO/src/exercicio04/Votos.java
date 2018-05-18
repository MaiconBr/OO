package exercicio04;

import javax.swing.JOptionPane;

public class Votos {

	Object[] votos={"Excelente","Otimo","Bom","Regular","Ruim"};
	Object[] idades={"Criança (0 à 9 anos)","Adolescente (10 à 17 anos)","Adulto (Acima de 17 anos)"};
	int QtdVotos = 0;
	double QtdExcelente = 0;
	double QtdOtimo = 0;
	double QtdBom = 0;
	double QtdRegular = 0;
	double QtdRuim = 0;
	double PExcelente = 0, POtimo = 0, PBom = 0, PRegular = 0, PRuim = 0;
	int QtdCriancas = 0;
	int QtdAdolescentes = 0;
	int QtdAdultos = 0;
	int continuar = 0;
	Object voto = ""; 
	Object idade = ""; 

	//continuar o programa
	public void Continuar(){
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Prosseguir", 0);
	}

	//obter idade
	public void ObterIdade(){
		idade = JOptionPane.showInputDialog(null, "Escolha sua faixa etária", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, idades, "");
	}

	//obter voto
	public void obterVoto(){
		voto =JOptionPane.showInputDialog(null, "Escolha seu voto", "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, votos, "");
		QtdVotos++;
	}

	//metodo para o laço de repeticao
	public void laco(){

		do{
			Continuar();
			if(continuar != 0){break;}
			obterVoto();
			ObterIdade();
			ContarIdade();
			ContarVotos();
			calcaularPorcentagem();

		}while(continuar == 0);

		Exibir();
	}

	//contabilizar idades
	public void ContarIdade(){
		if(idade.equals("Criança (0 à 9 anos)")){QtdCriancas++;
		}else if(idade.equals("Adolescente (10 à 17 anos)")){QtdAdolescentes++;
		}else{QtdAdultos++;
		}
	}

	//contabilizar votos
	public void ContarVotos(){
		if(voto.equals("Excelente")){QtdExcelente++;
		}else if(voto.equals("Otimo")){QtdOtimo++;
		}else if(voto.equals("Bom")){QtdBom++;
		}else if(voto.equals("Regular")){QtdRegular++;
		}else {QtdRuim++;
		}
	}

	//contabilizar votos
	public void calcaularPorcentagem(){
		PExcelente = ((QtdExcelente/QtdVotos)*100);
		POtimo = ((QtdOtimo/QtdVotos)*100);
		PBom = ((QtdBom/QtdVotos)*100);
		PRegular = ((QtdRegular/QtdVotos)*100);
		PRuim = ((QtdRuim/QtdVotos)*100);
	}

	//Mostar as informaçoes
	public void Exibir(){
		JOptionPane.showMessageDialog(null,"Quantidade de votos: "+QtdVotos+"\n % de Excelente: "+PExcelente+"\n % de Otimo: "+POtimo+
				"\n % de Bom: "+PBom+"\n % de Regular: "+PRegular+"\n % de Ruim: "+PRuim+"\n"+"\n Crianças: "+QtdCriancas+
				"\n Adolescentes: "+QtdAdolescentes+"\n Adultos: "+QtdAdultos);
	}

}
