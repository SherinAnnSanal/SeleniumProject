package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientTab {
	WebDriver driver;

	public ClientTab(WebDriver driver)// driver arguement is to create relation b/w accessing class
	{
		this.driver = driver;

	}

	By clientTab = By.xpath("//a[@href=\"/payrollapp/client/index\"]");
	By clientId = By.id("clientsearch-id");
	By searchBtn = By.xpath("//button[@type='submit']");
   
	public void getClientTab() {
		driver.findElement(clientTab).click();

	}

	public void setClientID(String id) {
		driver.findElement(clientId).sendKeys(id);

	}

	public void clickSearchButton() {

		driver.findElement(searchBtn).click();
	}

	public void performLogin() {
		getClientTab();
		setClientID("1");
		clickSearchButton();

	}

}
