package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PIMPageSteps extends BaseClass {
	public static PIMPage pIMPage;
	public static String empid;

	@Given("user is on PIM Page and validate PIM Page URL")
	public void user_is_on_pim_page_and_validate_pim_page_url() throws InterruptedException {

		pIMPage = new PIMPage();
		pIMPage.clickPimLink();

		String actualUrl = pIMPage.getPIMPageUrl();
		boolean ac = actualUrl.contains("pim");
		Assert.assertEquals(ac, true);

	}

	@Given("user click on Add Employee button and enter firstname , lastname and click on save button")
	public void user_click_on_add_employee_button_and_enter_firstname_lastname_and_click_on_save_button()
			throws InterruptedException {
		pIMPage.clickAddEmployeeButton();
		pIMPage.addFnameLname("Shivay", "Mahadevan");

	}

	@When("user capture Employee Id")
	public void user_capture_employee_id() throws InterruptedException {
		empid = pIMPage.captureEmployeeID();
	}

	@When("user click on Employee List button")
	public void user_click_on_employee_list_button() throws InterruptedException {
		pIMPage.clickEmployeeList();
	}

}
