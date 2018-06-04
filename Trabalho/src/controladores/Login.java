package controladores;
//Classe responsavel pelo login
import formularios.FormularioLogin;

public class Login {

	FormularioLogin FL = new FormularioLogin();
	
	//metodo para cadastrar admin
	public void AdicionarAdm(){

		Arrays A = new Arrays();
		
		int ID = 0;
		A.setID(ID);
		A.setUsuario("admin");
		A.setSenha("admin");
		A.setCargo("Administrador");

		Arrays.dadosEmpregados.add(A);

	}
	//metodo que verifica o login
	public int VerificarLogin(String usuario,String senha,String cargo){

		int nivel = 0;
		String nomeUsuario, senhaUsuario, cargoUsuario;

		for (int i = 0; i < Arrays.dadosEmpregados.size(); i++) {

			nomeUsuario = Arrays.dadosEmpregados.get(i).getUsuario();
			senhaUsuario = Arrays.dadosEmpregados.get(i).getSenha();
			cargoUsuario = Arrays.dadosEmpregados.get(i).getCargo();

			if ((nomeUsuario.equals(usuario)) && (senhaUsuario.equals(senha)) && (cargoUsuario.equals("Administrador"))){

				nivel = 3;
				break;

			}else if ((nomeUsuario.equals(usuario)) && (senhaUsuario.equals(senha)) && (cargoUsuario.equals("Frentista"))){

				nivel = 2;
				break;

			}else if ((nomeUsuario.equals(usuario)) && (senhaUsuario.equals(senha)) && (cargoUsuario.equals("Caixa"))){

				nivel = 1;
				break;

			}else{

				nivel = 0;

			}

		}

		return nivel;

	}

}


