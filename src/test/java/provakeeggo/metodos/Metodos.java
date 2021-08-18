package provakeeggo.metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {

	/**
	 * Metodo para clicar num elemento web
	 * 
	 * @author amos_
	 * @param elemento
	 */

	public void clicar(By elemento) {

		try {
			// Thread.sleep(1000);
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("----------- erro ao clicar ----------" + e.getMessage());
		}

	}

	/**
	 * Metodo para preencher com texto
	 * 
	 * @author amos_
	 * @param elemento
	 * @param texto
	 */
	public void preencher(By elemento, String texto) {

		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {

			System.err.println("----------- erro ao preencher ----------" + e.getMessage());

		}
	}

	/**
	 * Metodo para clicar usando um texto especifico e uma tag
	 * 
	 * @author amos_
	 * @param texto
	 * @param tag
	 */

	public void clicarPorTexto(String texto, String tag) {

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();

		} catch (Exception e) {

			System.err.println("-----------erro ao clicarPorTexto -------" + e.getMessage());
		}
	}

	/**
	 * Gerador de nome com Keeggo e 5 letras aleatórias
	 * 
	 * @author amos_
	 * @param nome
	 * @return
	 */
	public String getNome(String nome) {
		String geradorNome = RandomStringUtils.randomAlphabetic(5);
		return "keeggo" + geradorNome;
	}

	/**
	 * Gerador de email com Keeggo e mais 5 letras aleatórias
	 * 
	 * @author amos_
	 * @return
	 */
	public String getEmail() {
		String geradorEmail = RandomStringUtils.randomAlphabetic(5);
		return geradorEmail + "@keeggo.com";
	}

	/**
	 * Metodo para tirar screenshot da tela
	 * 
	 * @author amos_
	 * @param nome
	 * @param passo
	 */

	public void screenShot(String nome, String passo) {
		try {
			Thread.sleep(3000);
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Relatorios Screen/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + passo + " " + e.getMessage());
		}

	}

	/**
	 * Metodo para validar se dois textos são iguais
	 * 
	 * @author amos_
	 * @param elemento
	 * @param textoEsperado
	 * @param passo
	 */

	public void validarTexto(By elemento, String textoEsperado, String passo) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto -------" + passo + " " + e.getMessage());
		}

	}
}
