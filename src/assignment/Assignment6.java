
/*QTN:6 URL : https://www.qabible.in/payrollapp/site/login
1. Login to the application —> Navigate to "Workers" page --> Verify the text of the "Search", and "Reset" buttons.
2. log in to the application —> Navigate to the "Clients" page --> Verify the background color of the "Search" button. 
3. log in to the application --> Navigate to the "Deductions" tab --> Verify the tooltip in the eye icon in the last column of the grid.
*/

package assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Assignment6 {

	WebDriver driver;

	@BeforeClass
	@Parameters("Browser")
	public void beforeClass(String browser) throws InterruptedException {
		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		Thread.sleep(5000);
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	@Parameters({ "UserName", "Password" })
	public void login(String userName, String passWrd) throws InterruptedException {

		WebElement uName = driver.findElement(By.id("loginform-username"));
		uName.sendKeys(userName);
		WebElement pWord = driver.findElement(By.id("loginform-password"));
		pWord.sendKeys(passWrd);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);

	}

	@Test
	public void getWorkers() {
		WebElement workersTab = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		workersTab.click();

		WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		String actualSearch = SearchBtn.getText();
		String expectedSearch = "Search";
		Assert.assertEquals(actualSearch, expectedSearch, "Search button text is not same as expected");

		WebElement resetBtn = driver.findElement(By.xpath("//button[@type='reset']"));
		String actualReset = resetBtn.getText();
		String expectedReset = "Reset";
		Assert.assertEquals(actualReset, expectedReset, "Reset button text is not same as expected");

	}

	@Test
	public void getClients() {
		WebElement clientsTab = driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		clientsTab.click();

		WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		String actualColor = searchBtn.getCssValue("background-color");
		// System.out.println("bg color "+bgColor);
		String expectedColor = "rgba(51, 122, 183, 1)";
		Assert.assertEquals(actualColor, expectedColor, "Bacground color of same is not as per the requirement");

	}

	@Test
	public void getDeduction() {
		WebElement clientsTab = driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/index']"));
		clientsTab.click();

		WebElement eyeIcon = driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/view?id=5725']"));
		String toolTip = eyeIcon.getAttribute("title");
		System.out.println("Tooltip of eyeicon is " + toolTip);

	}

	@AfterMethod
	public void afterMethod() {
		WebElement profileName = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		profileName.click();
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='logout-btn']"));
		loginBtn.click();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
