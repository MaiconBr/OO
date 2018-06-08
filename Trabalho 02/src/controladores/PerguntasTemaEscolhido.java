package controladores;

import java.util.ArrayList;

public class PerguntasTemaEscolhido {

	private int ID;
	private String Pergunta;
	private String A;
	private String B;
	private String C;
	private String D;
	private String Correta;
	
	public static int qtdJ = 0;
	public static int qtdA = 0;
	public static int qtdP = 0;
	public static int qtdR = 0;
	public static int qtdPulos = 0;
	public static int qtdDicas = 0;
	
	public static ArrayList<PerguntasTemaEscolhido> Perguntas = new ArrayList<>();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getPergunta() {
		return Pergunta;
	}

	public void setPergunta(String pergunta) {
		Pergunta = pergunta;
	}

	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public String getC() {
		return C;
	}

	public void setC(String c) {
		C = c;
	}

	public String getD() {
		return D;
	}

	public void setD(String d) {
		D = d;
	}

	public String getCorreta() {
		return Correta;
	}

	public void setCorreta(String Correta) {
		this.Correta = Correta;
	}

	
	
	
}
