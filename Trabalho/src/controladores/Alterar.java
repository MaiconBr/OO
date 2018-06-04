package controladores;
//Classe responsavel pelas açoes dos formularios de alteraçao

public class Alterar {

	//metodo para alterar dados dos funcionarios
	public void Alterar(int ID,String nome,String sobrenome,int idade,String sexo,String cargo,double salario,String usuario,String Senha){

		Arrays A = new Arrays();

		A.setID(ID);
		A.setNome(nome);
		A.setSobrenome(sobrenome);
		A.setIdade(idade);
		A.setSexo(sexo);
		A.setCargo(cargo);
		A.setSalario(salario);
		A.setUsuario(usuario);
		A.setSenha(Senha);

		Arrays.dadosEmpregados.set(ID, A);

	}
	
	//Metodo para excluir dados dos funcionarios
	public void excluir(int ID){

		Arrays.dadosEmpregados.remove(ID);

	}

	//Metodo para verificar se usuario ja existe no array
	public boolean AlterarVerficarRepetido(String usuario,int linha) {

		boolean valido = true;

		for (int i = 0; i < Arrays.dadosEmpregados.size(); i++) {

			if(Arrays.dadosEmpregados.get(linha).getUsuario().equals(usuario)){
				break;
			}

			if(Arrays.dadosEmpregados.get(i).getUsuario().equals(usuario)){

				valido = false;

			}

		}

		return valido;
	}
	
	//metodo para alterar dados dos produtos
	public void AlterarP(int IDp,String Produto,int quantidade,double Valor,double Custo){

		Produtos P = new Produtos();

		P.setIDp(IDp);
		P.setProduto(Produto);
		P.setQuantidade(quantidade);
		P.setValor(Valor);
		P.setCusto(Custo);

		Produtos.dadosProdutos.set(IDp, P);

	}

	//metodo pra excluir produto
	public void excluirP(int IDp){

		Produtos.dadosProdutos.remove(IDp);

	}

	//metodo para atualizar a quantidade de produto depois de uma encomenda
	public void QtdP(int IDp,String Produto,int NovaQtd,double Valor,double Custo){

		Produtos P = new Produtos();

		P.setIDp(IDp);
		P.setProduto(Produto);
		P.setQuantidade(NovaQtd);
		P.setValor(Valor);
		P.setCusto(Custo);

		Produtos.dadosProdutos.set(IDp, P);

	}
	
	//metodo para atualizar a quantidade de combustivel depois de uma encomenda
	public void QtdC(int IDc,String Combustivel,int NovaQtd,double Valor,double Custo){

		Combustiveis C = new Combustiveis();

		C.setIDc(IDc);
		C.setCombustivel(Combustivel);
		C.setQuantidade(NovaQtd);
		C.setValor(Valor);
		C.setCusto(Custo);

		Combustiveis.dadosCombustivels.set(IDc, C);

	}
	
}
