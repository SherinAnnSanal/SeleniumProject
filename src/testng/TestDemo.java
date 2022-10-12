package testng;

import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestDemo {

	WebDriver driver;

	@Test
	public void loginBtn() 
	{
		WebElement loginBtn=driver.findElement(By.id("w3loginbtn"));
		String loginText=loginBtn.getText();
		System.out.println(loginText);
		String actual=loginText;
		String expected ="Log in";
				Assert.assertEquals(actual,expected, "Login text is not as expected" );
		
		
	}
	@Test
	public void getColorLogin()
	{
		WebElement loginBtn=driver.findElement(By.id("w3loginbtn"));
		String actualLoginColor=loginBtn.getCssValue("background-color");
		//System.out.println("actualLoginColor:"+actualLoginColor);
		String expectedColor="rgba(4, 170, 109, 1)";
		
		Assert.assertEquals(actualLoginColor, expectedColor,"Login colors are not same");
		
	}
	
	@Test
	public void getBgColorLoginBtn()
	{
		
		WebElement loginBtn=driver.findElement(By.id("w3loginbtn"));
		String actualLoginColor=loginBtn.getCssValue("color");
		//System.out.println("actual Color:"+actualLoginColor);
		String expectedLoginColor="rgba(255, 255, 255, 1)";
		
		Assert.assertEquals(actualLoginColor, expectedLoginColor,"Login colors are not same");
		
	}
	
	@BeforeMethod
	@Parameters("Browser")
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/default.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
