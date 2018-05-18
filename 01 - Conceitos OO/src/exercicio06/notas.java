package exercicio06;

import javax.swing.JOptionPane;

public class notas {

	Object[] sexos ={"Masculino","Feminino"};
	String nome = "";
	double sexoM = 0;
	double sexoF = 0;
	double PsexoM = 0;
	double PsexoF = 0;
	double n1 = 0,n2 = 0,n3 = 0,n4 = 0;
	double media = 0;
	double m1 = 0,m2 = 0,m3 = 0,m4 = 0,m5 = 0,m6 = 0;
	double pm1 = 0,pm2 = 0,pm3 = 0,pm4 = 0,pm5 = 0,pm6 = 0;
	int QtdAlunos = 0;
	boolean zezinho = false;
	Object sexo = "";

	//Metodo para pedir nome
	public void PedirNome(){
		nome = JOptionPane.showInputDialog(null, "Informe seu nome ou 'sair' para finalizar");
	}

	//Metodo para pedir sexo
	public void PedirSexo(){
		sexo = JOptionPane.showInputDialog(null, "Escolha seu sexo", "Escolha", JOptionPane.PLAIN_MESSAGE, null, sexos,"");
	}

	//Metodo para pedir notas
	public void PedirNotas(){
		do{
			try{
				n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a primeira nota"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a segunda nota"));
				n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a terceira nota"));
				n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quarta nota"));
				zezinho = true;
			}catch(Exception erro){JOptionPane.showMessageDialog(null, "seu merda"); zezinho = false;}
		}while((((n1 < 0)||(n1>10)) || ((n2 < 0)||(n2>10)) ||((n3 < 0)||(n3>10)) ||((n4 < 0)||(n4>10)) && zezinho == false));

		zezinho = false;
		//Incrementar qtd alunos
		QtdAlunos++;
	}

	//Metodo laço
	public void laco(){

		do{
			PedirNome();
			if(nome.equals("sair")){break;}
			PedirSexo();
			PedirNotas();
			ContarSexo();
			CalcMedia();
			Classificar();
			CalcPSexo();
			CalcPStats();
			
		}while(!nome.equals("sair"));
		
		Exibir();
		
	}

	//Metodo para contar o sexo
	public void ContarSexo(){
		if(sexo.equals("Masculino")){sexoM ++;
		}else{sexoF ++;
		}
	}

	//Metodo para fazer a media
	public void CalcMedia(){
		media = ((n1 + n2 + n3 + n4)/4);
	}

	//Metodo para classificar stats
	public void Classificar(){
		if(media == 10){m1++;JOptionPane.showMessageDialog(null,"sua média é: "+media+" Parábens");
		}else if(media >= 9){m2++;JOptionPane.showMessageDialog(null,"sua média é: "+media+" Ótimo");
		}else if(media >= 8){m3++;JOptionPane.showMessageDialog(null,"sua média é: "+media+" Seu resultado foi Bom");
		}else if(media >= 7){m4++;JOptionPane.showMessageDialog(null,"sua média é: "+media+" Seu resultado foi Satisfatório");
		}else if(media >= 5){m5++;JOptionPane.showMessageDialog(null,"sua média é: "+media+" Você está em Recuperação");
		}else{m6++; JOptionPane.showMessageDialog(null,"sua média é: "+media+" Você está Reprovado");}
	}

	//Metodo para calcular % de pessoas de cada sexo
	public void CalcPSexo(){
		PsexoM = (sexoM/QtdAlunos)*100;
		PsexoF = (sexoF/QtdAlunos)*100;
	}

	//Metodo para calcular % de pessoas de cada sexo
	public void CalcPStats(){

		pm1 = (m1/QtdAlunos)*100;
		pm2 = (m2/QtdAlunos)*100;
		pm3 = (m3/QtdAlunos)*100;
		pm4 = (m4/QtdAlunos)*100;
		pm5 = (m5/QtdAlunos)*100;
		pm6 = (m6/QtdAlunos)*100;

	}

	//Metodo para exibir
	public void Exibir(){
		JOptionPane.showMessageDialog(null, "Quantidade de pessoas: "+QtdAlunos+"\n Quantidade de Homens: "+sexoM+"\n % de Homens: "+PsexoM+
				"\n Quantidade de Mulheres: "+sexoF+"\n % de Mulheres: "+PsexoF);
		JOptionPane.showMessageDialog(null, "Quantidade se pessoas: "+QtdAlunos+"\n Quantidade de alunos que tiraram 10: "+m1+
				"\n % de alunos que tiraram 10: "+pm1+"%"+"\n Quantidade de alunos que tiraram média entre 9.0 e 9.9: "+m2+
				"\n % de alunos que tiraram média entre 9.0 e 9.9: "+pm2+"%"+"\n Quantidade de alunos que tiraram média entre 8.0 e 8.9: "+m3+
				"\n % de alunos que tiraram média entre 8.0 e 8.9: "+pm3+"%"+"\n Quantidade de alunos que tiraram média entre 7.0 e 7.9: "+m4+
				"\n % de alunos que tiraram média entre 7.0 e 7.9: "+pm4+"%"+"\n Quantidade de alunos que tiraram média entre 5.0 e 6.9: "+m5+
				"\n % de alunos que tiraram média entre 5.0 e 6.9: "+pm5+"%"+"\n Quantidade de alunos que tiraram média abaixo de 5: "+m6+
				"\n % de alunos que tiraram média abaixo de 5: "+pm6+"%");
		
	}
}