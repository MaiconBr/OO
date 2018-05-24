package controladores;

import javax.swing.table.DefaultTableModel;

public class Acao {

	public void cadastrar(String produto, double valor, int quantidade) {

		Produto p = new Produto();
		p.produto = produto;
		p.quantidade = quantidade;
		p.valor = valor;

		Produto.dados.add(p);

	}

	public DefaultTableModel exibirDados() {
		DefaultTableModel exibirDados = new DefaultTableModel();

		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");

		for(int i = 0; i < Produto.dados.size(); i++){

			exibirDados.addRow(new Object[]{Produto.dados.get(i).produto, Produto.dados.get(i).valor, Produto.dados.get(i).quantidade});
		}

		return exibirDados;
	}

	// Método para excluir
	public void excluir(int linha) {
		Produto.dados.remove(linha);
	}

	// Método para alterar
	public void alterar(String nomeProduto, double valorProduto,int quantidadeProduto, int linha) {

		// Criar objeto
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		p.setQuantidadeProduto(quantidadeProduto);

		// Realizar a alteração
		Produto.dados.set(linha, p);

	}


}


