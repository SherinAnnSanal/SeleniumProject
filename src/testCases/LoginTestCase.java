package testCases;

import org.testng.annotations.Test;

import elementRepository.ClientTab;
import elementRepository.DashBoard;
import elementRepository.LoginPageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestCase {
	WebDriver driver;
	
	@Test
	public void getClientDetails() throws InterruptedException
	{
		 LoginPageFactory lpf=new LoginPageFactory(driver);
		  lpf.performLogin();
		Thread.sleep(3000);
		ClientTab ct=new ClientTab(driver);
		ct.performLogin();
		
	}
  @Test
  public void dashBoardProfile() throws InterruptedException
  {
	  LoginPageFactory lpf=new LoginPageFactory(driver);
	  lpf.performLogin();
	  DashBoard db=new DashBoard(driver);
	  String actual=db.getProfileName();
	  		String expected="CAROL THOMAS";
		Assert.assertEquals(actual, expected,"Name is not as expected");
  }
  @BeforeMethod(alwaysRun = true)
	@Parameters("Browser")
	public void beforeMethod(String browser) throws InterruptedException {
	
		if (browser.equals("chrome")) 
		{

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if(browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");

			driver = new EdgeDriver();
		}
		
		Thread.sleep(5000);
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
  
  @Test
  public void login() throws InterruptedException
  {
	  LoginPageFactory lpf=new LoginPageFactory(driver);
	  lpf.performLogin();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}

