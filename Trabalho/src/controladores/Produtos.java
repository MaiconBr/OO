package controladores;
//array que guarda dados dos produtos
import java.util.ArrayList;

public class Produtos {

	private int IDp;
	private String produto;
	private int quantidade;
	private double valor;
	private double custo;
	
	public static ArrayList<Produtos> dadosProdutos = new ArrayList<>();

	public int getIDp() {
		return IDp;
	}
	public void setIDp(int IDp) {
		this.IDp = IDp;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;

	}

}
