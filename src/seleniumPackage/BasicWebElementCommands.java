package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("Sherin");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("Hello123");
		WebElement rememberMe=driver.findElement(By.id("loginform-rememberme"));
		rememberMe.click();
		WebElement login=driver.findElement(By.xpath("\\button[@class='btn btn-default"));
		login.click();
		
		

	}

}
