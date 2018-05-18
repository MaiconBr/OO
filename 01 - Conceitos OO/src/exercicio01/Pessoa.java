package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	int idade, QtdMasculino, QtdFeminino, QtdMaior, QtdMenor;
	Object[] sexos = {"Masculino","Feminino"};
	Object[] cargos = {"Gerente","Atendente","A�ougueiro","Secret�ria","Almoxarife","Padeiro","Estagi�rio"};
	int QtdGerente,QtdAtendente,QtdA�ougueiro,QtdSecret�ria,QtdAlmoxarife,QtdPadeiro,QtdEstagi�rio;
	Object sexo = "";
	Object cargo = "";


	//obter dados
	public void obterDados(){

		nome = JOptionPane.showInputDialog("Informe seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		sexo = JOptionPane.showInputDialog(null, "Informe seu sexo", "titulo", JOptionPane.PLAIN_MESSAGE, null, sexos, "");
		cargo = JOptionPane.showInputDialog(null, "Informe seu cargo", "titulo", JOptionPane.PLAIN_MESSAGE, null, cargos, "");

	}

	//metodo para o la�o de repeticao
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
		}else if(cargo.equals("A�ougueiro")){
			QtdA�ougueiro++;
		}else if(cargo.equals("Secret�ria")){
			QtdSecret�ria++;
		}else if(cargo.equals("Almoxarife")){
			QtdAlmoxarife++;
		}else if(cargo.equals("Padeiro")){
			QtdPadeiro++;
		}else if(cargo.equals("Estagi�rio")){
			QtdEstagi�rio++;
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
			       msg+= "Quantidade de Gerentes: "+QtdGerente+"\nQuantidade de atendentes: "+QtdAtendente+"\nQuantidade de a�ougueiros: "+QtdA�ougueiro+
			    	     "\nQuantidade de secret�rias: "+QtdSecret�ria+"\nQuantidade de almoxarifes: "+QtdAlmoxarife+"\nQuantidade de padeiro: "+QtdPadeiro+
			    	     "\nQuantidade de estagi�rio: "+QtdEstagi�rio;
			       msg+= "\nMaiores de 18: "+QtdMaior+"\nMenores de 18: "+QtdMenor;
			       
			JOptionPane.showMessageDialog(null, msg);

		}

}
