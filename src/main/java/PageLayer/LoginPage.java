package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUnameAndPass(String UserName, String PassWord) throws InterruptedException {

		Thread.sleep(2000);
		Wait.sendKeys(uname, UserName);
		Thread.sleep(2000);
		Wait.sendKeys(pass, PassWord);

	}

	public void click() throws InterruptedException {
		Thread.sleep(2000);
		Wait.click(loginButton);

	}
}
