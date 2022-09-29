/*URL:https://demo.guru99.com/test/newtours /reservation.php 
1. Open the URL --> Select any value from the Departing From, Passengers, Airline drop-downs & verify the selected values.*/

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();

		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("window.scrollBy(0,350)");
		WebElement DropDownDepartFrom = driver.findElement(By.name("fromPort"));
		DropDownDepartFrom.click();

		Select s = new Select(DropDownDepartFrom);
		s.selectByIndex(2);
		System.out.println("Selected Depart from: " + s.getFirstSelectedOption().getText());

		WebElement passenger = driver.findElement(By.name("passCount"));
		Select sPassenger = new Select(passenger);
		passenger.click();
		sPassenger.selectByValue("2");
		System.out.println("Selected Passenger count: " + sPassenger.getFirstSelectedOption().getText());

		WebElement airLine = driver.findElement(By.name("airline"));
		Select sAirline = new Select(airLine);
		airLine.click();
		// sAirline.selectByVisibleText("Blue Skies Airlines");
		sAirline.selectByIndex(1);
		System.out.println("Selected Airline: " + sAirline.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		driver.close();

	}

}
