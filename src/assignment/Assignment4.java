//QTN:4 URL : https://demo.guru99.com/test/drag_drop.html 
//Complete drag & drop as discussed. SALES to Credit Side -- Account column//

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		// finding source and target by relative xpath
		WebElement source1 = driver.findElement(By.xpath("//li[@data-id='6']//a[@class='button button-orange']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		a.dragAndDrop(source1, target1).perform();
		//driver.close();
	}

}
