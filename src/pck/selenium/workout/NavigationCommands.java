package pck.selenium.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.lambdatest.com/blog/perform-mouse-actions-in-selenium-webdriver/");
		threadSleep(3000);
		driver.findElement(By.className("category_name_blog")).click();
		threadSleep(3000);
		driver.navigate().back();
		threadSleep(3000);
		driver.navigate().forward();
		threadSleep(3000);
		driver.navigate().refresh();
		

	}

	private static void threadSleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
