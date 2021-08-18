package provakeeggo.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By menuUser = By.id("menuUser");
	private By signInResultMessage = By.id("signInResultMessage");
	private By menuUserLink = By.id("menuUserLink");

	public By getMenuUser() {
		return menuUser;
	}

	public By getSignInResultMessage() {
		return signInResultMessage;
	}

	public By getMenuUserLink() {
		return menuUserLink;
	}


}
