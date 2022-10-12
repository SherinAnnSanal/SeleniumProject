package testng;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SampleTest {
	
	WebDriver driver;
  @Test
  @Parameters({"para1","para2","para3","para4"})
  public void sampleMethod(int a, int b,int c, String s) {
	  System.out.println(a);
	  System.out.println(b);System.out.println(c);
	  System.out.println(s);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

  }

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }
}
