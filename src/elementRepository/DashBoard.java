package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashBoard {
	
	
		WebDriver driver;

		public DashBoard(WebDriver driver)// driver arguement is to create relation b/w accessing class
		{
			this.driver = driver;

		}
		By profileName=By.cssSelector("a.dropdown-toggle");
		

		public String getProfileName() throws InterruptedException {
			Thread.sleep(3000);
			String actual=driver.findElement(profileName).getText();
						return actual;
		
		}

	
		
		

	

}
