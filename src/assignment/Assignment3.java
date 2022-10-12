
/*QTN:3 URL : https://www.qabible.in/payrollapp/site/login 
	1. Open the application Login to application 
	2. Click TimeSheet tab --> Click "Create TimeSheet" side tab. 
	3. Click Browse button --> Upload file using robot class. username : carol password : 1q2w3e4r
	(Add a Thread.Sleep(3000) after logging in)*/

package assignment;

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

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

		WebElement uName = driver.findElement(By.id("loginform-username"));
		uName.sendKeys("carol");
		WebElement pWord = driver.findElement(By.id("loginform-password"));
		pWord.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);

		WebElement timeSheetTab = driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/index']"));
		timeSheetTab.click();

		WebElement createTab = driver.findElement(By.xpath("//a[@href=\'/payrollapp/timesheet/create\']"));
		createTab.click();

		WebElement browseButton = driver.findElement(By.id("file-logo"));

		Robot rob = new Robot();
		Actions ac = new Actions(driver);
		ac.moveToElement(browseButton).click().perform();

		StringSelection ss = new StringSelection("C:\\Users\\sanal\\Desktop\\image.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rob.delay(400);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(400);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement uploadButton = driver.findElement(By.xpath("//button[@title='Upload selected files']"));
		uploadButton.click();
		Thread.sleep(3000);
		//ac.doubleClick(uploadButton).perform();
		System.out.println("Uploaded file ");
		//driver.close();

	}

}
