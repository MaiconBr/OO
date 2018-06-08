package controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Jogadores {

	private String nome;
	private int Acertos;
	private String data;
	
	public static String jgdr;
	public static LocalDateTime Data1;
	
	public static ArrayList<Jogadores> Dados = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAcertos() {
		return Acertos;
	}

	public void setAcertos(int acertos) {
		Acertos = acertos;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
