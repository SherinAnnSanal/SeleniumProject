package pck.selenium.workout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html";
	driver.get(url);
	driver.manage().window().maximize();
	//Thread.sleep(3000);
	System.out.println("Title: "+driver.getTitle());
	System.out.println("Title Length:"+driver.getTitle().length());
	String pageUrl=driver.getCurrentUrl();
	if(url.equalsIgnoreCase(pageUrl))
	
		System.out.println("Both URL are same");
	else
		System.out.println("Both URL are different");
	String pageSource=driver.getPageSource();
	int pageSourceLength=driver.getPageSource().length();
	//System.out.println(pageSource);
	System.out.println(pageSourceLength);
	
	driver.close();
	

	
	}

}
