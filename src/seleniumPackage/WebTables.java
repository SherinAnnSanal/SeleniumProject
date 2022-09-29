package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		System.out.println("********************2nd Row Data******************");
		List<WebElement>li=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]/td"));
		for(int i = 0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		System.out.println("*************4th Col data************");
		List<WebElement>li2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr/td[4]"));
		for(int i = 0;i<li2.size();i++)
		{
			System.out.println(li2.get(i).getText());
		}

	}

}
