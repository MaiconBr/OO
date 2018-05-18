package exercicio09;

import javax.swing.JOptionPane;

public class ano {

	int ano = 0;
	int prosseguir = 0;
	boolean verificar = false;

	//Metodo para prosseguir
	public void Prosseguir(){

		prosseguir = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Prosseguir", 0);

	}

	//Metodo para pedir o ano
	public void PedirAno(){

		do{
			try{
				ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano"));
				verificar=true;
			}catch(Exception e){JOptionPane.showMessageDialog(null, "Erro");verificar=false;}
		}while(verificar == false);
		verificar = false;
	}
	
	//Metodo para dizer se é bissexto ou nao
	public void Verificar(){
		if((ano % 4 == 0)||(ano % 400 == 0)){JOptionPane.showMessageDialog(null, "é ano bissexto");
		}else{JOptionPane.showMessageDialog(null, "não é ano bissexto");}
	}
	
	//Metodo  do laco
	public void laco(){
		
		do{
		
		Prosseguir();
		if(prosseguir == 1){break;}
		PedirAno();
		Verificar();
		
		}while(prosseguir == 0);
		
	}
	
}
