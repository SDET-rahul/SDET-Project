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

public class Amaz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5);
		String title=driver.getTitle();
		System.out.println(title);
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

}
