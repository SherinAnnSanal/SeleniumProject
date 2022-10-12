package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement dropdown_menu = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropdown_menu.click();
		Select s = new Select(dropdown_menu);

		// Display selected option
		WebElement firstElement = s.getFirstSelectedOption();
		String firstElementValue = firstElement.getText();
		System.out.println(firstElementValue);
		s.selectByValue("Red");
		s.selectByIndex(2);
	

		// Multiselect
		WebElement multiSelect = driver.findElement(By.id("multi-select-field"));
		Select obj = new Select(multiSelect);
		obj.selectByIndex(1);
		obj.selectByIndex(2);

		List<WebElement> value = obj.getAllSelectedOptions();
		for (int i = 0; i < value.size(); i++) {
			System.out.println(value.get(i).getText());
		}

	}

}
