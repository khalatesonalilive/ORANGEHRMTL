package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {

	public static LoginPage LoginPage;

	@Given("user is on Login Page")
	public void user_is_on_login_page() {

		BaseClass.initialization();
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {

		LoginPage = new LoginPage();
		LoginPage.enterUnameAndPass("Admin", "admin123");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		LoginPage.click();
	}

}
