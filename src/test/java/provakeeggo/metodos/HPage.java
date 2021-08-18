package provakeeggo.metodos;

import provakeeggo.elementos.Elementos;

public class HPage {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void acessarFormulario() {

		metodos.clicar(el.getMenuUser());
		metodos.clicarPorTexto("CREATE NEW ACCOUNT", "a");

	}

	public void acessarTelaLogin() {

		metodos.clicar(el.getMenuUser());

	}


}
