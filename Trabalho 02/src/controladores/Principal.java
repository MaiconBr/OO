package controladores;

import formularios.FormularioMenu;

public class Principal {

	public static void main(String[] args) {
		
		Acoes A = new Acoes();
		A.IniciaArray();
		
		FormularioMenu fm = new FormularioMenu();
		fm.setVisible(true);
		
	}
	
}
