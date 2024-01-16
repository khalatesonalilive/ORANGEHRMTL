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

	public PIMPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickPimLink() throws InterruptedException {
		
		Wait.click(PimPagelink);

	}

	public void clickAddEmployeeButton() throws InterruptedException {
		
		Wait.click(addEmployeeButton);

	}
	
	public void addFnameLname(String FirstName,String LastName) throws InterruptedException
	{
		
		Wait.sendKeys(fname, FirstName);
		Thread.sleep(2000);
		Wait.sendKeys(lname, LastName);
		Thread.sleep(2000);
		Wait.click(saveButton);
		
	}
	
	public String getPIMPageUrl()
	{
		
	return	driver.getCurrentUrl();
}	
	
	
	
	

}
