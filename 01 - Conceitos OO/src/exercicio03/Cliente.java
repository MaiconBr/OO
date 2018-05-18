package exercicio03;

import javax.swing.JOptionPane;

public class Cliente {

	/*
	 Uma lanchonete precisa de um sistema para calcular o troco que ser� dado aos clientes, para isso fa�a com que seja informado um c�digo
	 a quantidade pedida daquele produto (que pertence ao c�digo informado).
	 Crie um la�o onde o cliente ir� informar c�digos e quantidades infinitamente. 

	Ap�s informados os c�digos e suas respectivas quantidades informe o total consumido e pe�a o valor que o cliente ir� pagar
 	(Se o cliente tentar pagar menos que o total pe�a novamente o pagamento at� ele informar um valor igual ou superior consumido). 

	Ao t�rmino informe o troco que ser� dado ao cliente. 

	C�DIGO PEDIDO VALOR 1 Hamb�rguer + Suco de Laranja
 	R$ 5,00 2 Sandu�che natural + Suco de Uva R$ 4,50
  	3 Prato do dia R$ 8,00 4 Pizza R$12,00 5 Lasanha R$ 16,50 6 P�o de queijo R$ 1,00 7 Bolo R$ 2,50 

	 */

	int codigo = -1;
	int QtdPedido;
	double valor = 0;
	double Custo = 0;
	double valorPago = 0;
	double troco;

	//obter codigo
	public void Obtercodigo(){
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do produto ou 0 para finalizar"));
	}

	//obter quantidade do pedido
	public void ObterQtdPedido(){
		QtdPedido = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto"));
	}

	//metodo para o la�o de repeticao
	public void laco(){

		do{

			Obtercodigo();
			if(codigo == 0){break;}
			ObterQtdPedido();
			DefinirValor();
			DefinirCusto();
			VerifPag();
			calcTroco();
			inforTroco();

		}while(codigo != 0);

	}

	//definir o valor
	public void DefinirValor(){
		switch (codigo) {
		case 1: valor = 5.00; break;
		case 2: valor = 4.50; break;
		case 3: valor = 8.00; break;
		case 4: valor = 12.00; break;
		case 5: valor = 16.50; break;
		case 6: valor = 1.00; break;
		case 7: valor = 2.50;break;}
	}

	//definir o custo total
	public void DefinirCusto(){
		Custo = valor*QtdPedido;
	}

	//verificar se o pagamento � maior que o custo
	public void VerifPag(){
		while(valorPago < Custo ){
			valorPago = Double.parseDouble(JOptionPane.showInputDialog(null, "Total: "+Custo+"\n Informe o valor pago"));
		}
	}

	//calcular troco
	public void calcTroco(){
		troco = valorPago - Custo;
	}

	//informar troco
	public void inforTroco(){
		JOptionPane.showMessageDialog(null, "Troco: "+troco);
	}

}
