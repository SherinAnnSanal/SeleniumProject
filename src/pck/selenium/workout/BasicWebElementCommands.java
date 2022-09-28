package pck.selenium.workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("1q2w3e4r");
		WebElement remembermeCheckbox = driver.findElement(By.id("loginform-rememberme"));
	Boolean b=remembermeCheckbox.isSelected();
	System.out.println(b);
	remembermeCheckbox.click();
	Boolean c=remembermeCheckbox.isSelected();
	System.out.println(c);	
	String password1 = password.getTagName();
		System.out.println(password1);
		String attribute = password.getAttribute("type");
		System.out.println(attribute);
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		String logincolor = login.getCssValue("background-color");
		System.out.println(logincolor);
		String fontsize = login.getCssValue("font-size");
		System.out.println(fontsize);
		login.click();

	}

}
