package controladores;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Acao {

	Produto p = new Produto();

	public void cadastrar(String produto, double valor, int quantidade) {

		p.produto = produto;
		p.quantidade = quantidade;
		p.valor = valor;

		Produto.dados.add(p);

		System.out.println(Produto.dados.size());

	}

	public JTable exibirDados() {
		DefaultTableModel exibirDados = new DefaultTableModel();

		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Quantidade");
		exibirDados.addColumn("Valor");
		
		for(int i = 0; i < Produto.dados.size(); i++){
			exibirDados.addRow(new Object[]{Produto.dados.get(i).produto, Produto.dados.get(i).quantidade, Produto.dados.get(i).valor});
		}

		JTable tabela = new JTable(exibirDados);
		
		return tabela;
	}

}
