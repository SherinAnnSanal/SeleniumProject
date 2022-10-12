package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)// driver arguement is to create relation b/w accessing class
	{
		this.driver = driver;

	}

	By username = By.id("loginform-username");
	By password = By.id("loginform-password");
	By loginbutton = By.xpath("//button[@type='submit']");

	public void getUserName(String name) {
		driver.findElement(username).sendKeys(name);

	}

	public void getpassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
//"1q2w3e4r"

	}

	public void clickloginButton() {

		driver.findElement(loginbutton).click();
	}
	
	public void performLogin()
	{
		getUserName("carol");
		getpassword("1q2w3e4r");
		clickloginButton();
		
	}

}
