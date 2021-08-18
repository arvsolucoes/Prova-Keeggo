package provakeeggo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import provakeeggo.elementos.Elementos;
import provakeeggo.metodos.Browser;
import provakeeggo.metodos.FormularioPage;
import provakeeggo.metodos.HPage;
import provakeeggo.metodos.LoginPage;
import provakeeggo.metodos.Metodos;

public class Login {
	
	Browser browser = new Browser();
	Metodos metodos = new Metodos();
	FormularioPage form = new FormularioPage();
	HPage hpage = new HPage();
	LoginPage lpage = new LoginPage();
	Elementos el = new Elementos();

	String nome;

	@Given("eu esteja no site {string}")
	public void eu_esteja_no_site(String url) {
		browser.abrirNavegador(url);
	}

	@Given("acesse a tela de login")
	public void acesse_a_tela_de_login() {
		hpage.acessarTelaLogin();

	}

	@When("preencher os campos")
	public void preencher_os_campos() throws InterruptedException {
		lpage.entrar("mmarciomario", "Arv556677");
		metodos.validarTexto(el.getMenuUserLink(), "mmarciomario", " validando o nome apos cadastro");

	}

	@Then("entro no sistema")
	public void entro_no_sistema() {
		metodos.screenShot("Login Efetuado", "Login efetuado com sucesso");

	}

	@When("preencher com dados invalidos")
	public void preencher_com_dados_invalidos() throws InterruptedException {
		lpage.entrar("mmarciomario", "Arv556678");

	}

	@Then("não entra no sistema")
	public void não_entra_no_sistema() {
		metodos.screenShot("Login com dados invalidoss", "Não entra na conta");
	}


}
