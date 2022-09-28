/*QTN:1 URL: https://selenium.obsqurazone.com/check-box -demo.php 
 1. Open the application --> Select the checkbox 'Check Box One' --> Verify the same is selected. 
 2. Select 'Check Box Two' --> Verify the same is selected. 
3. Verify the background and font color for the "Select All" button. 
4. Verify the tag name for the "Select All" button.
5. Verify any attribute values for the "Select All" button.
6. Click on the link "Radio Buttons Demo" --> Click on the "Male" radio button --> Verify the same is selected. ? */


package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox1 = driver.findElement(By.id("check-box-one"));
		checkBox1.click();
		if (checkBox1.isSelected() == true)
			System.out.println("Checkbox1 is selected");
		WebElement checkBox2 = driver.findElement(By.id("check-box-two"));
		checkBox2.click();
		if (checkBox2.isSelected() == true)
			System.out.println("Checkbox2 is selected");
		
		System.out.println("*****************Select All Button*******************");
		WebElement selectAll = driver.findElement(By.xpath("//input[@id='button-two']"));
		String bgColor = selectAll.getCssValue("background-color");
		System.out.println("Background color: "+bgColor);
		String fontColor = selectAll.getCssValue("color");
		System.out.println("Font color: "+fontColor);
		System.out.println("Tag name: " + selectAll.getTagName());
		String attr = selectAll.getAttribute("type");
		System.out.println("Attribute: " + attr);
		WebElement radioButtonDemo = driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radioButtonDemo.click();
		WebElement radioButtonMale = driver.findElement(By.id("inlineRadio1") );
		radioButtonMale.click();
		boolean status = radioButtonMale.isSelected();
		if(status==true)
		{
			System.out.println("Status of Radio button: Male is selected");
		}
		else
			System.out.println("Status of Radio button: Female is selected");
			
	}

}
