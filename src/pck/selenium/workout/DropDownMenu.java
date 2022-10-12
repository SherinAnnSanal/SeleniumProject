package pck.selenium.workout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.obsqurazone.com/select-input.php");
			driver.manage().window().maximize();
			
			//locating dropdown menu using xpath
			
			WebElement dropDownMenuObject=driver.findElement(By.xpath("//select[@id='single-input-field']"));
			
			//declare Select object for selecting and fetching element selected.
			Select s=new Select(dropDownMenuObject);
			
			
			//selecting drop down by value, index, visible text
			s.selectByValue("Red");
			//Display selected option 
			
			WebElement selectedElement=s.getFirstSelectedOption();
			System.out.println(selectedElement.getText());
			
			//check selected option is mentioned.
			if(s.getFirstSelectedOption().getText().equals("Yellow"))
					System.out.println("Selected is yellow");
			else
				System.out.println(" Selected are different");
			
			//Fetching element from multilist to list
			WebElement multiList=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
			Select sOb=new Select(multiList);
			List<WebElement> li=s.getAllSelectedOptions();
			/*
			 * sOb.selectByVisibleText("Yellow"); sOb.selectByVisibleText("Red");
			 */
			List<WebElement> options = s.getOptions();

			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}
			
			
			
			
			
			

	}

}
