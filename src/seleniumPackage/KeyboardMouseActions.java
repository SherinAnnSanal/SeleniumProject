package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions actObj = new Actions(driver);
		WebElement objDoubleClick = driver.findElement(By.id("doubleClickBtn"));

//		actObj.doubleClick(objDoubleClick).perform();
//		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
//		actObj.contextClick(rightClick).perform();
		actObj.contextClick().perform();//Fo.r right clicking
		
		
		
		actObj.sendKeys(Keys.ARROW_DOWN).perform();
		actObj.sendKeys(Keys.ARROW_RIGHT).perform();
		actObj.moveToElement(objDoubleClick).perform();//Mouse hover

		

	}

}
