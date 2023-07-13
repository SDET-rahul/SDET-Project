package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverPractice1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement createnewacc=driver.findElement(By.linkText("Create New Account"));
		createnewacc.click();
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Debashish");
		//Or
		//driver.findElement(By.name("firstname")).sendKeys("Debashish");
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("Chakraborty");
		driver.close();

		//Locators of selenium: id, name, xpath, css selector, linktext, partial linktext,tag name, class name
		//xpath syntax would be //<html tag>[@classname/id/name='<value>']
		//click method is for clicking operation
		//sendkeys method is for entering text in webdriver;
		
		
 
	}

}