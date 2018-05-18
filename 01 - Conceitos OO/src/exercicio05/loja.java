package exercicio05;

import javax.swing.JOptionPane;

public class loja {

	String produto = "";
	double valor = 0;

	//Metodo para pedir o produto
	public void PedirProduto(){
		produto = JOptionPane.showInputDialog("Informe o Produto, Ou 'sair' para finalizar");
	}
	//Metodo para informar o valor do produto
	public void ObterValor(){
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor"));
	}

	//Metodo do laço
	public void laco(){

		do{

			PedirProduto();
			if(produto.equals("sair")){break;}
			ObterValor();
			ObterCusto();

		}while(!produto.equals("sair"));

	}

	//calcular o custo
	public void ObterCusto(){
		JOptionPane.showMessageDialog(null,"\nProduto : "+produto+ "\nValor : "+valor+ "\n1 x "+(valor*0.95)+" = "+(1*(valor*0.95))
				+"\n2 x "+(valor*0.90)+" = "+(2*(valor*0.90))+"\n3 x "+(valor*0.85)+ " = " +(3*(valor*0.85))
				+"\n4 x "+(valor*0.80)+" = "+(4*(valor*0.80))+ "\n5 x "+(valor*0.75)+ " = " + (5*(valor*0.75))
				+"\n6 x "+(valor*0.70)+" = "+(6*(valor*0.70))+ "\n7 x "+(valor*0.65)+ " = " + (7*(valor*0.65))
				+"\n8 x "+(valor*0.60)+" = "+(8*(valor*0.60))+ "\n9 x "+(valor*0.55)+ " = " + (9*(valor*0.55))
				+"\n10 x "+(valor*0.50)+" = "+(10*(valor*0.50)));
	}

}
