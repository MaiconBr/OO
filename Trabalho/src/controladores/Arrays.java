package controladores;
//Array que guarda dados dos funcionarios
//era pra ter todos os arrays aqui mas eu acabei separando eles e deixei o nome
import java.util.ArrayList;

public class Arrays {
	
	private int ID;
	private String usuario;
	private String senha;
	private String nome;
	private String sobrenome;
	private int idade;
	private String sexo;
	private String cargo;
	private double salario;
	
	public static ArrayList<Arrays> dadosEmpregados = new ArrayList<>();
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String Senha) {
		this.senha = Senha;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
}
