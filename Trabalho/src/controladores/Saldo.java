package controladores;
//array que guarda lucros e despesas
import java.util.ArrayList;

public class Saldo {

	//metodo que calcula despesas com salarios
	public double GastoSalarios(double GastoS){

		for (int i = 0; i < Arrays.dadosEmpregados.size(); i++) {


			GastoS += Arrays.dadosEmpregados.get(i).getSalario();

		}

		return GastoS;

	}

	//metodo que calcula despesas com encomendas
	public double GastoEncomendas(double GastoE){

		for (int i = 0; i < saldo.size(); i++) {

			GastoE += saldo.get(i).getGastoEncomendas();

		}

		return GastoE;

	}

	//metodo que calcula lucros com vendas
	public double Ganhos(double Ganho){


		for (int i = 0; i < saldo.size(); i++) {

			Ganho += saldo.get(i).getGanho();

		}

		return Ganho;

	}

	//metodo que calcula o saldo
	public double Saldo(double saldos){

		double Ganho = 0;
		double GastoE = 0;
		double GastoS = 0;

		Ganho = Ganhos(Ganho);
		GastoE = GastoEncomendas(GastoE);
		GastoS = GastoSalarios(GastoS);

		saldos = Ganho - GastoE - GastoS;

		return saldos;

	}


	private double GastoEncomendas;
	private double Ganho;

	public static ArrayList<Saldo> saldo = new ArrayList<>();

	public double getGastoEncomendas() {
		return GastoEncomendas;
	}

	public void setGastoEncomendas(double gastoEncomendas) {
		GastoEncomendas = gastoEncomendas;
	}

	public double getGanho() {
		return Ganho;
	}

	public void setGanho(double ganho) {
		Ganho = ganho;
	}

}
