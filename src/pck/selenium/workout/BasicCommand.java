package pck.selenium.workout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sanal\\Desktop\\Selenium Java\\edgedriver_win64\\msedgedriver.exe");
		// Instantiate a ChromeDriver class.
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.javatpoint.com/aggregation-in-java\r\n");
		driver.navigate().to("https://www.javatpoint.com/aggregation-in-java\r\n");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();//for maximising
		//driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		driver.quit();

	}

}
