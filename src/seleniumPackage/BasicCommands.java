package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		//driver.get("https://www.javatpoint.com/aggregation-in-java\r\n");
				driver.navigate().to("https://www.javatpoint.com/aggregation-in-java\r\n");
				String title=driver.getTitle();
				System.out.println(title);
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.manage().window().maximize();//for maximising
				//driver.navigate().back();
				driver.navigate().refresh();
				driver.manage().deleteAllCookies();
				driver.quit();

		
	}

}
