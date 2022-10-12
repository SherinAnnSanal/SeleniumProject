package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//li[@data-id='5']//a[@class='button button-orange']"));
WebElement target=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
Actions a=new Actions(driver);
a.dragAndDrop(source, target).perform();
WebElement source1=driver.findElement(By.xpath("//li[@data-id='6']//a[@class='button button-orange']"));
WebElement target1=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
a.dragAndDrop(source1, target1).perform();
	}

}
