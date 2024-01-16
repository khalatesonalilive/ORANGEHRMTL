package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseClass {
	public static HomePage homePage;

	@Given("user is on HomePage and validate the Home Page Title")
	public void user_is_on_home_page_and_validate_the_home_page_title() throws InterruptedException {

		homePage = new HomePage();
		String actualTitle = homePage.getHomePageTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Given("validate the Home Page URL")
	public void validate_the_home_page_url() throws InterruptedException {
		String actualURL = homePage.getCurrentUrl();
		boolean c = actualURL.contains("index");
		Assert.assertEquals(c, true);

	}

	@Given("validate the Home Page Logo")
	public void validate_the_home_page_logo() throws InterruptedException {

		boolean actualLogo = homePage.getHomePageLogo();
		Assert.assertEquals(actualLogo, true);
	}

}
