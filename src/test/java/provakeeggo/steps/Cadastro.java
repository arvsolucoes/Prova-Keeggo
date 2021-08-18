package provakeeggo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import provakeeggo.elementos.Elementos;
import provakeeggo.metodos.Browser;
import provakeeggo.metodos.FormularioPage;
import provakeeggo.metodos.HPage;
import provakeeggo.metodos.Metodos;

public class Cadastro {
	
	Browser browser = new Browser();
	Metodos metodos = new Metodos();
	FormularioPage form = new FormularioPage();
	HPage hpage = new HPage();
	Elementos el = new Elementos();
	String nome;

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) {
		browser.abrirNavegador(url);

	}

	@Given("acessar o formulario de cadastro")
	public void acessar_o_formulario_de_cadastro() {

		hpage.acessarFormulario();

	}

	@When("enviar formulario preenchido")
	public void enviar_formulario_preenchido() throws InterruptedException {
		this.nome = metodos.getNome("Keeggo");
		form.registrar(this.nome, metodos.getEmail(), "Arv112233", "Arv112233");

	}

	@Then("conta sera cadastrada")
	public void conta_sera_cadastrada() {
		metodos.validarTexto(el.getMenuUserLink(), this.nome, " validando o nome apos cadastro");
		metodos.screenShot("Cadastro concluido", "Cliente cadastrado");

	}

	@When("preencher formulario com dados invalidos")
	public void preencher_formulario_com_dados_invalidos() throws InterruptedException {
		form.registrar("joaomarcosdasilva", "523987526asd", "Arv112233", "Arv112233");
	

	}

	@Then("conta nao sera cadastrada")
	public void conta_nao_sera_cadastrada() {
	metodos.screenShot("Não sai da tela de cadastro", "Não foi efetuado o cadastro");
	}


}
