package provakeeggo.metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	static WebDriver driver;

	/**
	 * Metodo para abrir navegador Chrome, após maximizar a tela aguardará 10
	 * segundos para continuar
	 * 
	 * @author amos_
	 * @param site
	 */

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
