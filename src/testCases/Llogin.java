package testCases;

import java.time.Duration;
//import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elementRepository.ClientTab;
import elementRepository.DashBoard;
import elementRepository.LoginPage;
import elementRepository.LoginPageFactory;

public class Llogin {
	WebDriver driver;

	@Test
	public void verifyProfileName() throws InterruptedException {
		DashBoard db = new DashBoard(driver);
		String actual = db.getProfileName();
		String expected = "CAROL THOMAS";
		Assert.assertEquals(actual, expected, "Profile name is not correct");

	}

	@Test
	public void loginvalidation() {
		LoginPageFactory lf = new LoginPageFactory(driver);
		lf.performLogin();
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod()
	{
		driver.close();
	}
	@BeforeMethod(alwaysRun = true)
	@Parameters("Browser")
	public void beforeMethod(String browser) throws InterruptedException 
	{
		if (browser.equals("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");

			driver = new EdgeDriver();
		}
		Thread.sleep(5000);
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	


       