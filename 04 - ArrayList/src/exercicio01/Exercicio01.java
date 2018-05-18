package exercicio01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio01 {

	Object[] opcoes = {"Depositar","Sacar","Extrato","Saldo","Sair"};
	double deposito = 0;
	double saque = 0;
	double saldo = 0;
	ArrayList<String> extrato = new ArrayList<String>();
	String sair = "";
	String texto = "";
	Object opcao = "";

	//Metodo para escolha
	public void Escolha(){
		opcao = JOptionPane.showInputDialog(null, "Opções", "Banco", JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
	}

	//Metodo para deposito
	public void Deposito(){
		deposito =Integer.parseInt(JOptionPane.showInputDialog("Deposito"));
		saldo += deposito;
		extrato.add("Deposito:"+deposito);
	}

	//Metodo para saque
	public void Saque(){
		saque = Integer.parseInt(JOptionPane.showInputDialog("Saque"));
		if(saque <= saldo){
			saldo -= saque;
			extrato.add("Saque:"+saque);
		}else{
			JOptionPane.showMessageDialog(null, "Erro");
		}
	}

	//Metodo para saldo
	public void Saldo(){
		JOptionPane.showMessageDialog(null, saldo);
	}

	//Metodo para listar extratos
	public void Extratos(){
		for (int i = 0; i < extrato.size(); i++) {

			texto += extrato.get(i)+"\n";

		}

		JOptionPane.showMessageDialog(null, texto);

	}


	//laço
	public void laco(){

		do{
			Escolha();
			if(opcao.equals("Sair")){
				break;
			}
			if(opcao.equals("Depositar")){
				Deposito();
			}
			if(opcao.equals("Sacar")){
				Saque();
			}
			if(opcao.equals("Extrato")){
				Extratos();
			}
			if(opcao.equals("Saldo")){
				Saldo();
			}

		}while(sair.equals(""));

	}








}

