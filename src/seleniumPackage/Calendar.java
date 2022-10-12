package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		WebElement date= driver.findElement(By.id("datepicker"));
		date.click();
		Thread.sleep(3000);
		String month=driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
		System.out.println(month);
		
		while(!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("April"))//also can use equalsIgnoreCase instead of contains
		{
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

		int count=driver.findElements(By.className("ui-state-default")).size();
		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
		if(text.equalsIgnoreCase("27"))
		{
		driver.findElements(By.className("ui-state-default")).get(i).click();
		break;
		}

		
		

		

	}

}
}
