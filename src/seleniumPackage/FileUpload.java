package seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		Robot rob=new Robot();
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		Actions ac=new Actions(driver);
		ac.moveToElement(upload).click().perform();
		//upload.click();

		StringSelection ss = new StringSelection("C:\\Users\\sanal\\Desktop\\image.jpg");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     rob.delay(300);
	     rob.keyPress(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_V);
	     rob.keyRelease(KeyEvent.VK_CONTROL);
	     rob.keyPress(KeyEvent.VK_ENTER);
	     rob.delay(300);
	     rob.keyRelease(KeyEvent.VK_ENTER);




	}

}
