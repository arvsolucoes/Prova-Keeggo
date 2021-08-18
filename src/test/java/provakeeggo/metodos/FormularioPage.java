package provakeeggo.metodos;

import org.openqa.selenium.By;

public class FormularioPage {
	
	Metodos metodos = new Metodos();

	By usernameRegisterPage = By.name("usernameRegisterPage");
	By emailRegisterPage = By.name("emailRegisterPage");
	By passwordRegisterPage = By.name("passwordRegisterPage");
	By confirmPasswordRegisterPage = By.name("confirm_passwordRegisterPage");
	By i_agree = By.name("i_agree");
	By register_btnundefined = By.id("register_btnundefined");

	public void registrar(String username, String email, String password, String confPassword) throws InterruptedException {

		metodos.preencher(confirmPasswordRegisterPage, confPassword);
		metodos.preencher(passwordRegisterPage, password);
		metodos.preencher(emailRegisterPage, email);
		metodos.preencher(usernameRegisterPage, username);
		Thread.sleep(3000);
		metodos.screenShot("Formulario Preenchido com dados invalidos", "Cadastro não concluído");
		metodos.clicar(i_agree);
		metodos.clicar(register_btnundefined);

	}

}
