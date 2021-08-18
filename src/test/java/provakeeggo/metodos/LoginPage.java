package provakeeggo.metodos;

import org.openqa.selenium.By;

public class LoginPage {
	
	Metodos metodos = new Metodos();

	private By username = By.name("username");
	private By password = By.name("password");
	private By sign_in_btnundefined = By.id("sign_in_btnundefined");

	public void entrar(String nomeCad, String senha) throws InterruptedException {

		metodos.preencher(username, nomeCad);
		metodos.preencher(password, senha);
		Thread.sleep(3000);
		metodos.clicar(sign_in_btnundefined);
	}


}
