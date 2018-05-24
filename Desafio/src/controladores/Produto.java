package controladores;

import java.util.ArrayList;

public class Produto {

	public String produto;
	public double  valor;
	public int quantidade;
	
	//ArrayList
	static ArrayList<Produto> dados = new ArrayList<>();
	
	//Métodos Mágicos
		public String getNomeProduto() {
			return produto;
		}
		public void setNomeProduto(String nomeProduto) {
			this.produto = nomeProduto;
		}
		public double getValorProduto() {
			return valor;
		}
		public void setValorProduto(double valorProduto) {
			this.valor = valorProduto;
		}
		public int getQuantidadeProduto() {
			return quantidade;
		}
		public void setQuantidadeProduto(int quantidadeProduto) {
			this.quantidade = quantidadeProduto;
		}
	
}
