package controladores;

import javax.swing.table.DefaultTableModel;

public class Tabelas {

	public DefaultTableModel AdicionarTabelaRanking() {
		DefaultTableModel AdicionarTabelaRanking = new DefaultTableModel();

		AdicionarTabelaRanking.addColumn("Nome");
		AdicionarTabelaRanking.addColumn("Acertos");
		AdicionarTabelaRanking.addColumn("Data");

		for(int i = 0; i < Jogadores.Dados.size(); i++){

			AdicionarTabelaRanking.addRow(new Object[]{Jogadores.Dados.get(i).getNome(),Jogadores.Dados.get(i).getAcertos(),Jogadores.Dados.get(i).getData()});
		}

		return AdicionarTabelaRanking;
	}
	
}
