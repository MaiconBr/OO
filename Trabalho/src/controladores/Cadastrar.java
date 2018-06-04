package controladores;
//Classe responsavel por fazer cadastros
public class Cadastrar {

	Arrays A = new Arrays();
	Produtos P = new Produtos();
	
	//metodo para definir ID dos funcionarios
	public int DefinirID(){

		int ID =  Arrays.dadosEmpregados.size();
		return ID;

	}

	//metodo para definir ID dos produtos
	public int DefinirIDp(){

		int IDp = Produtos.dadosProdutos.size();

		return IDp;
	}
	//metodo para cadastrar funcionarios
	public void Cadastra(int ID,String nome,String sobrenome,int idade,String sexo,String cargo,double salario,String usuario,String Senha){

		A.setID(ID);
		A.setNome(nome);
		A.setSobrenome(sobrenome);
		A.setIdade(idade);
		A.setSexo(sexo);
		A.setCargo(cargo);
		A.setSalario(salario);
		A.setUsuario(usuario);
		A.setSenha(Senha);

		Arrays.dadosEmpregados.add(A);

	}
	//metodo para cadastrar produtos
	public void CadastraP(int IDp,String produto,int quantidade,double valor,double custo){

		P.setIDp(IDp);
		P.setProduto(produto);
		P.setQuantidade(quantidade);
		P.setValor(valor);
		P.setCusto(custo);

		Produtos.dadosProdutos.add(P);

	}
	//metodo para verificar usuario repetido quando cadastrar
	public boolean VerficarRepetido(String usuario){

		boolean valido = true;

		for (int i = 0; i < Arrays.dadosEmpregados.size(); i++) {

			if(Arrays.dadosEmpregados.get(i).getUsuario().equals(usuario)){

				valido = false;

			}

		}

		return valido;
	}

	//metodo para verificar produto repetido quando cadastrar
	public boolean VerficarProdutoRepetido(String Produto){

		boolean valido = true;

		for (int i = 0; i < Produtos.dadosProdutos.size(); i++) {

			if(Produtos.dadosProdutos.get(i).getProduto().equals(Produto)){

				valido = false;

			}

		}

		return valido;
	}
	
	//metodo para cadastrar ganhos e gastos no array saldo
	public void CadastrarValores(double Gasto,double Ganho){

		Saldo S = new Saldo();

		S.setGastoEncomendas(Gasto);
		S.setGanho(Ganho);

		Saldo.saldo.add(S);

	}

}




