package controladores;
//classe responsavel por criar Jtables
import javax.swing.table.DefaultTableModel;

public class Tabelas {

	//cria a tabela de duvida no botao ? do login
	public DefaultTableModel AdicionarTabelaDuvida() {
		DefaultTableModel AdicionarTabelaDuvida = new DefaultTableModel();

		AdicionarTabelaDuvida.addColumn("ID");
		AdicionarTabelaDuvida.addColumn("Nome");
		AdicionarTabelaDuvida.addColumn("Sobrenome");
		AdicionarTabelaDuvida.addColumn("Usuário");
		AdicionarTabelaDuvida.addColumn("Senha");
		AdicionarTabelaDuvida.addColumn("Cargo");


		for(int i = 0; i < Arrays.dadosEmpregados.size(); i++){

			AdicionarTabelaDuvida.addRow(new Object[]{Arrays.dadosEmpregados.get(i).getID(), Arrays.dadosEmpregados.get(i).getNome(),Arrays.dadosEmpregados.get(i).getSobrenome(),Arrays.dadosEmpregados.get(i).getUsuario(),Arrays.dadosEmpregados.get(i).getSenha(),Arrays.dadosEmpregados.get(i).getCargo()});
		}

		return AdicionarTabelaDuvida;
	}

	//cria a tabela dos dados dos funcionarios
	public DefaultTableModel AdicionarTabelaFunc() {
		DefaultTableModel AdicionarTabelaFunc = new DefaultTableModel();

		AdicionarTabelaFunc.addColumn("ID");
		AdicionarTabelaFunc.addColumn("Nome");
		AdicionarTabelaFunc.addColumn("Sobrenome");
		AdicionarTabelaFunc.addColumn("Idade");
		AdicionarTabelaFunc.addColumn("Sexo");
		AdicionarTabelaFunc.addColumn("Cargo");
		AdicionarTabelaFunc.addColumn("Salário");
		AdicionarTabelaFunc.addColumn("Usuário");
		AdicionarTabelaFunc.addColumn("Senha");

		for(int i = 0; i < Arrays.dadosEmpregados.size(); i++){

			AdicionarTabelaFunc.addRow(new Object[]{Arrays.dadosEmpregados.get(i).getID(), Arrays.dadosEmpregados.get(i).getNome(),Arrays.dadosEmpregados.get(i).getSobrenome(),Arrays.dadosEmpregados.get(i).getIdade(),Arrays.dadosEmpregados.get(i).getSexo(),Arrays.dadosEmpregados.get(i).getCargo(),Arrays.dadosEmpregados.get(i).getSalario(),Arrays.dadosEmpregados.get(i).getUsuario(),Arrays.dadosEmpregados.get(i).getSenha()});

		}

		return AdicionarTabelaFunc;
	}
	
	//cria a tabela dos dados dos produtos
	public DefaultTableModel AdicionarTabelaProd() {
		DefaultTableModel AdicionarTabelaProd = new DefaultTableModel();

		AdicionarTabelaProd.addColumn("ID");
		AdicionarTabelaProd.addColumn("Produto");
		AdicionarTabelaProd.addColumn("Quandtidade");
		AdicionarTabelaProd.addColumn("Valor");
		AdicionarTabelaProd.addColumn("Custo de Encomenda");

		for(int i = 0; i < Produtos.dadosProdutos.size(); i++){

			AdicionarTabelaProd.addRow(new Object[]{Produtos.dadosProdutos.get(i).getIDp(),Produtos.dadosProdutos.get(i).getProduto(),Produtos.dadosProdutos.get(i).getQuantidade(),Produtos.dadosProdutos.get(i).getValor(),Produtos.dadosProdutos.get(i).getCusto()});
		}

		return AdicionarTabelaProd;

	}

	//cria a tabela dos dados dos combustiveis
	public DefaultTableModel AdicionarTabelaComb() {
		DefaultTableModel AdicionarTabelaComb = new DefaultTableModel();

		AdicionarTabelaComb.addColumn("ID");
		AdicionarTabelaComb.addColumn("Combustivel");
		AdicionarTabelaComb.addColumn("Quandtidade");
		AdicionarTabelaComb.addColumn("Valor");
		AdicionarTabelaComb.addColumn("Custo de Encomenda");

		for(int i = 0; i < Combustiveis.dadosCombustivels.size(); i++){

			AdicionarTabelaComb.addRow(new Object[]{Combustiveis.dadosCombustivels.get(i).getIDc(),Combustiveis.dadosCombustivels.get(i).getCombustivel(),Combustiveis.dadosCombustivels.get(i).getQuantidade(),Combustiveis.dadosCombustivels.get(i).getValor(),Combustiveis.dadosCombustivels.get(i).getCusto()});

		}

		return AdicionarTabelaComb;

	}

}
