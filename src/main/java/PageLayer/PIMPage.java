package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PimPagelink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmployeeButton;

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement captureEmployeeID;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement clickEmployeeListbutton;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement empid;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;

	public PIMPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickPimLink() throws InterruptedException {

		Wait.click(PimPagelink);

	}

	public void clickAddEmployeeButton() throws InterruptedException {

		Wait.click(addEmployeeButton);

	}

	public void addFnameLname(String FirstName, String LastName) throws InterruptedException {

		Wait.sendKeys(fname, FirstName);
		Thread.sleep(2000);
		Wait.sendKeys(lname, LastName);
		Thread.sleep(2000);
		Wait.click(saveButton);

	}

	public String getPIMPageUrl() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}

	public String captureEmployeeID() throws InterruptedException {
		Thread.sleep(2000);
		return Wait.getAttribute(captureEmployeeID, "value");
	}

	public void clickEmployeeList() throws InterruptedException {
		Thread.sleep(2000);
		Wait.click(clickEmployeeListbutton);

	}

	public void enterCapturedEmpID(String EmpID) throws InterruptedException {
		Thread.sleep(2000);
		Wait.sendKeys(empid, EmpID);
	}

	public void click() throws InterruptedException {
		Thread.sleep(2000);
		Wait.click(searchButton);

	}
}
