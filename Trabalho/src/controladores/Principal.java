package controladores;

import formularios.FormularioLogin;

public class Principal {

	public static void main(String[] args) {
		//adiciona o admin
		Login L = new Login();
		
		L.AdicionarAdm();
		
		//adiciona os combustiveis
		Combustiveis C = new Combustiveis();
		C.AdicionarCombustiveis1();
		C.AdicionarCombustiveis2();
		C.AdicionarCombustiveis3();
		C.AdicionarCombustiveis4();
		
		//mostra o formulario login
		FormularioLogin FL = new FormularioLogin();
		
		FL.setVisible(true);
		
	}

}
