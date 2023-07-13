package seleniumWebdriverPractice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTestNG {
	
	WebDriver driver;

	//@BeforeSuite
	//@BeforeClass
	//@BeforeTest
	//@BeforeMethod
	//@Test --actual test scenario to be automated
	//@AfterMethod
	//@AfterTest
	//@AfterClass
	//@AfterSuite

	@BeforeMethod()
	public void amazonBrowserOpen() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5);
		String title=driver.getTitle();
		System.out.println(title);	
	}
   @Test(priority =0)
   public void amazonTest()
{
	   WebElement acc=driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span/span"));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']/span/span")));
		Actions accountList=new Actions(driver);
		accountList.moveToElement(acc).build().perform();
		//accountList.doubleClick(acc).build().perform();
		//accountList.dragAndDrop(acc, acc).build().perform();
       List<WebElement> menuOption=driver.findElements(By.tagName("a"));
	    
       for (int i=0;i<menuOption.size();i++)
       {
       	try {
       	if(menuOption.get(i).getText().equalsIgnoreCase("Your Prime Video"))
       	{
       		menuOption.get(i).click();
       	}}catch(StaleElementReferenceException e)
       	{
       		
       	}
       	
       }
	
	}
@Test(priority = 3)
public void homePageFunctionality()
{
	System.out.println("test case 2");
}
@Test(priority = 1)
public void homePageFunctionality2()
{
	System.out.println("test case 3");
}
@Test(priority = 2)
public void homePageFunctionality3()
{
	System.out.println("test case 4");
}
   @AfterMethod
   public void amazonBrowserClose()
{
	driver.close();
}
}
