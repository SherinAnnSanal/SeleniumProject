package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import elementRepository.LoginPageFactory;
import elementRepository.WorkersTab;

public class Test1 {
	WebDriver driver;
	
	@Test
	public void editWorkersTab() throws InterruptedException 
	{
		WorkersTab wt=new WorkersTab(driver);
		wt.clickWorkerTab();
		wt.setNiNum("695581");
		wt.clickSearchBtn();
		
		
	}
	
	public void loginvalidation() throws InterruptedException {
		LoginPageFactory lf = new LoginPageFactory(driver);
		lf.performLogin();
	}
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  loginvalidation();
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  //driver.close();
	  
	  
	  
  }
}
