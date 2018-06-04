package controladores;
//Array que guarda dados dos combustiveis (são adicionados manualmente)
import java.util.ArrayList;

public class Combustiveis {
	
	public void AdicionarCombustiveis1(){

		Combustiveis C = new Combustiveis();
		
		int IDc = 0;
		double valor = 3.60;
		C.setIDc(IDc);
		C.setCombustivel("Gasolina C");
		C.setQuantidade(0);
		C.setValor(valor);
		C.setCusto(valor - valor*0.2);
		
		Combustiveis.dadosCombustivels.add(C);
	}
	
	public void AdicionarCombustiveis2(){
		
		Combustiveis C = new Combustiveis();
		
		int IDc = 1;
		double valor = 3.70;
		C.setIDc(IDc);
		C.setCombustivel("Gasolina A");
		C.setQuantidade(0);
		C.setValor(valor);
		C.setCusto(valor - valor*0.2);
		
		Combustiveis.dadosCombustivels.add(C);
	}
	
	public void AdicionarCombustiveis3(){
		
		Combustiveis C = new Combustiveis();
		
		int IDc = 2;
		double valor = 3.30;
		C.setIDc(IDc);
		C.setCombustivel("Ethanol");
		C.setQuantidade(0);
		C.setValor(valor);
		C.setCusto(valor - valor*0.2);
		
		Combustiveis.dadosCombustivels.add(C);
	}
	
	public void AdicionarCombustiveis4(){
		
		Combustiveis C = new Combustiveis();
		
		int IDc = 3;
		double valor = 3.00;
		C.setIDc(IDc);
		C.setCombustivel("Diesel");
		C.setQuantidade(0);
		C.setValor(valor);
		C.setCusto(valor - valor*0.2);

		Combustiveis.dadosCombustivels.add(C);
	}
	
	private int IDc;
	private String combustivel;
	private int quantidade;
	private double valor;
	private double custo;
	
	public static ArrayList<Combustiveis> dadosCombustivels = new ArrayList<>();

	public int getIDc() {
		return IDc;
	}

	public void setIDc(int IDc) {
		this.IDc = IDc;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getCombustivel() {
		return combustivel;
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
