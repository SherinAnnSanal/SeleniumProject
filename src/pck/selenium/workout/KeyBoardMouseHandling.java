package pck.selenium.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouseHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Actions ac=new Actions(driver);		
		WebElement objDoubleClick=driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(objDoubleClick).perform();
		ac.contextClick().perform();
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.moveToElement(objDoubleClick).perform();
		
		

	}

}
