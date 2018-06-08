package controladores;

public class Gerais extends Padrao{

	@Override
	public void PerguntasTema() {
		
PerguntasTemaEscolhido PTE = new PerguntasTemaEscolhido();
		
		int ID = 0;
		PTE.setID(ID);
		PTE.setPergunta("De quem é a famosa frase “Penso, logo existo”?");
		PTE.setA("Platão");
		PTE.setB("Galileu Galilei");
		PTE.setC("Descartes");
		PTE.setD("Sócrates");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 1;
		PTE.setID(ID);
		PTE.setPergunta("De onde é a invenção do chuveiro elétrico?");
		PTE.setA("França");
		PTE.setB("Inglaterra");
		PTE.setC("Brasil");
		PTE.setD("Austrália");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 2;
		PTE.setID(ID);
		PTE.setPergunta("Quais o menor e o maior país do mundo?");
		PTE.setA("Vaticano e Rússia");
		PTE.setB("Nauru e China");
		PTE.setC("Mônaco e Canadá");
		PTE.setD("Malta e Estados Unidos");
		PTE.setCorreta("A");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 3;
		PTE.setID(ID);
		PTE.setPergunta("Qual o livro mais vendido no mundo a seguir à Bíblia?");
		PTE.setA("O Senhor dos Anéis");
		PTE.setB("Dom Quixote");
		PTE.setC("O Pequeno Príncipe");
		PTE.setD("Ela, a Feiticeira");
		PTE.setCorreta("B");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 4;
		PTE.setID(ID);
		PTE.setPergunta("Quantas casas decimais tem o número pi?");
		PTE.setA("Duas");
		PTE.setB("Centenas");
		PTE.setC("Trilhares");
		PTE.setD("Vinte");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 5;
		PTE.setID(ID);
		PTE.setPergunta("Quais os países que têm a maior e \na menor expectativa de vida do mundo?");
		PTE.setA("Japão e Serra Leoa");
		PTE.setB("Austrália e Afeganistão");
		PTE.setC("Itália e Chade");
		PTE.setD("Brasil e Congo");
		PTE.setCorreta("A");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 6;
		PTE.setID(ID);
		PTE.setPergunta("O que a palavra legend significa em português?");
		PTE.setA("Legenda");
		PTE.setB("Conto");
		PTE.setC("Legendário");
		PTE.setD("Lenda");
		PTE.setCorreta("D");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 7;
		PTE.setID(ID);
		PTE.setPergunta("Qual o número mínimo de jogadores numa partida de futebol?");
		PTE.setA(" 8");
		PTE.setB("10");
		PTE.setC("9");
		PTE.setD("7");
		PTE.setCorreta("D");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 8;
		PTE.setID(ID);
		PTE.setPergunta("Quanto tempo a luz do Sol demora para chegar à Terra?");
		PTE.setA("12 minutos");
		PTE.setB("1 dia");
		PTE.setC("12 horas");
		PTE.setD("8 minutos");
		PTE.setCorreta("D");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 9;
		PTE.setID(ID);
		PTE.setPergunta("Qual a altura da rede de vôlei nos jogos masculino e feminino?");
		PTE.setA("2,4 para ambos");
		PTE.setB("2,45 m e 2,15");
		PTE.setC("2,43 m e 2,24 m");
		PTE.setD("2,5 m e 2,0 m");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 10;
		PTE.setID(ID);
		PTE.setPergunta("Em que ordem surgiram os modelos atômicos?");
		PTE.setA("Thomson, Dalton, Rutherford, Rutherford-Bohr");
		PTE.setB("Dalton, Thomson, Rutherford, Rutherford-Bohr");
		PTE.setC("Dalton, Rutherford-Bohr, Thomson, Rutherford");
		PTE.setD("Dalton, Thomson, Rutherford-Bohr, Rutherford");
		PTE.setCorreta("B");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 11;
		PTE.setID(ID);
		PTE.setPergunta("Em que período da pré-história o fogo foi descoberto?");
		PTE.setA("Neolítico");
		PTE.setB("Paleolítico");
		PTE.setC("Idade dos Metais");
		PTE.setD("Período da Pedra Polida");
		PTE.setCorreta("B");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 12;
		PTE.setID(ID);
		PTE.setPergunta("Qual a velocidade da luz?");
		PTE.setA("300 000 000 metros por segundo (m/s)");
		PTE.setB("199 792 458 metros por segundo (m/s)");
		PTE.setC("299 792 458 metros por segundo (m/s)");
		PTE.setD("150 000 000 metros por segundo (m/s)");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 13;
		PTE.setID(ID);
		PTE.setPergunta("Em qual local da Ásia o português é língua oficial?");
		PTE.setA("Macau");
		PTE.setB("Índia");
		PTE.setC("Moçambique");
		PTE.setD("Portugal");
		PTE.setCorreta("A");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 14;
		PTE.setID(ID);
		PTE.setPergunta("Qual destes países é transcontinental?");
		PTE.setA("Rússia");
		PTE.setB("Filipinas");
		PTE.setC("Istambul");
		PTE.setD("Groenlândia");
		PTE.setCorreta("A");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 15;
		PTE.setID(ID);
		PTE.setPergunta("Qual foi o recurso utilizado inicialmente pelo homem para explicar a origem das coisas?");
		PTE.setA("A Filosofia");
		PTE.setB("A Biologia");
		PTE.setC("A Mitologia");
		PTE.setD("A Matemática");
		PTE.setCorreta("C");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 16;
		PTE.setID(ID);
		PTE.setPergunta("Júpiter e Plutão são os correlatos romanos de quais deuses gregos?");
		PTE.setA("Ares e Hermes");
		PTE.setB("Zeus e Ares");
		PTE.setC("Dionísio e Deméter");
		PTE.setD("Zeus e Hades");
		PTE.setCorreta("D");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 17;
		PTE.setID(ID);
		PTE.setPergunta("Qual o maior animal terrestre?");
		PTE.setA("Baleia Azul");
		PTE.setB("Elefante africano");
		PTE.setC("Tubarão Branco");
		PTE.setD("Girafa");
		PTE.setCorreta("B");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 18;
		PTE.setID(ID);
		PTE.setPergunta("Quais os nomes dos três Reis Magos?");
		PTE.setA("Gaspar, Nicolau e Natanael");
		PTE.setB("Belchior, Gaspar e Baltazar");
		PTE.setC("Belchior, Gaspar e Nataniel");
		PTE.setD("Melchior, Noé e Galileu");
		PTE.setCorreta("B");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		PTE = new PerguntasTemaEscolhido();
		
		ID = 19;
		PTE.setID(ID);
		PTE.setPergunta("Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?");
		PTE.setA("Neils Armstrong, em 1969");
		PTE.setB("Buzz Aldrin, em 1969");
		PTE.setC("Charles Conrad, em 1969");
		PTE.setD("Charles Duke, em 1971");
		PTE.setCorreta("A");
		
		PerguntasTemaEscolhido.Perguntas.set(ID,PTE);
		
	}

}
