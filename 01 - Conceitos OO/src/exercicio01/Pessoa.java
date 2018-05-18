package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	int idade, QtdMasculino, QtdFeminino, QtdMaior, QtdMenor;
	Object[] sexos = {"Masculino","Feminino"};
	Object[] cargos = {"Gerente","Atendente","Açougueiro","Secretária","Almoxarife","Padeiro","Estagiário"};
	int QtdGerente,QtdAtendente,QtdAçougueiro,QtdSecretária,QtdAlmoxarife,QtdPadeiro,QtdEstagiário;
	Object sexo = "";
	Object cargo = "";


	//obter dados
	public void obterDados(){

		nome = JOptionPane.showInputDialog("Informe seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		sexo = JOptionPane.showInputDialog(null, "Informe seu sexo", "titulo", JOptionPane.PLAIN_MESSAGE, null, sexos, "");
		cargo = JOptionPane.showInputDialog(null, "Informe seu cargo", "titulo", JOptionPane.PLAIN_MESSAGE, null, cargos, "");

	}

	//metodo para o laço de repeticao
	public void laco(){

		//variavel continuar
		int continuar = 0;

		do{
			obterDados();
			contabilizarSexo();
			contabilizarCargo();
			contabilizarIdade();
		
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");

		}while(continuar == 0);
		
		exibirDados();

	}

	//Metodo para contabilizar sexo
	public void contabilizarSexo(){

		if(sexo.equals("Masculino")){
			QtdMasculino++;
		}else if(sexo.equals("Feminino")){
			QtdFeminino++;
		}

	}

	//Metodo para contabilizar cargo
	public void contabilizarCargo(){

		if(cargo.equals("Gerente")){
			QtdGerente++;
		}else if(cargo.equals("Atendente")){
			QtdAtendente++;
		}else if(cargo.equals("Açougueiro")){
			QtdAçougueiro++;
		}else if(cargo.equals("Secretária")){
			QtdSecretária++;
		}else if(cargo.equals("Almoxarife")){
			QtdAlmoxarife++;
		}else if(cargo.equals("Padeiro")){
			QtdPadeiro++;
		}else if(cargo.equals("Estagiário")){
			QtdEstagiário++;
		}

	}

	//Metodo para contabilizar idade
	public void contabilizarIdade(){

		if(idade >= 18){
			QtdMaior++;
		}else{
			QtdMenor++;
		}
		
	}
	
	//metodo para exibir dados
		public void exibirDados(){

			String msg = QtdMasculino+" homens e "+QtdFeminino+" mulheres\n";
			       msg+= "Quantidade de Gerentes: "+QtdGerente+"\nQuantidade de atendentes: "+QtdAtendente+"\nQuantidade de açougueiros: "+QtdAçougueiro+
			    	     "\nQuantidade de secretárias: "+QtdSecretária+"\nQuantidade de almoxarifes: "+QtdAlmoxarife+"\nQuantidade de padeiro: "+QtdPadeiro+
			    	     "\nQuantidade de estagiário: "+QtdEstagiário;
			       msg+= "\nMaiores de 18: "+QtdMaior+"\nMenores de 18: "+QtdMenor;
			       
			JOptionPane.showMessageDialog(null, msg);

		}

}
