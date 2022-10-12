  package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newWindow=driver.findElement(By.id("tabButton"));
		newWindow.click();
		String parrentwindow = driver.getWindowHandle();//trace parent window id,return type String
		System.out.println(parrentwindow);
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
		for (String childwindow : Allwindows) {
			if (!parrentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				String m = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(m);
			}
			System.out.println(driver.getWindowHandle());
		}


  

	}

}
