package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersTab {
	WebDriver driver;
	public WorkersTab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath = "//a[@href='/payrollapp/worker/index']")
	WebElement workerTab;
	
	@FindBy(id="workersearch-ni_number")
	WebElement niNumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchBtn;
	
	
	public void clickWorkerTab() throws InterruptedException
	{
		Thread.sleep(3000);
		workerTab.click();
		
	}
	
	public void setNiNum(String num)
	{
		niNumber.sendKeys(num);
	}
	
	public void clickSearchBtn() throws InterruptedException
	{
		searchBtn.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
}
