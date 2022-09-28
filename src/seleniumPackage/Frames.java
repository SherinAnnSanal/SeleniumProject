package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		// driver.switchTo().frame("frame1");//Tracked using id
		
		
		WebElement childFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		// by iframe
		 driver.switchTo().frame(childFrame);
		

		String k = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(k);
		
		//return to parent frame from child frame
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//return to parent frame from child frame
		//driver.switchTo().defaultContent();


	}

}
