package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;


public class FluentWait {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(2000);
		Wait <WebDriver>wait=new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		
		
		wait.until(new ExpectedCondition<WebElement>() {
		    @Override
		    public WebElement apply(WebDriver driver) {
		        return driver.findElement(By.name("q"));
		    }
		});

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		    	
		    if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
		    {
		    	 return driver.findElement(By.cssSelector("[id='finish'] h4")); 
		    } 
		    else
		    	return null;
		    
		    }
		  });

		System.out.print(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText());


		}}
