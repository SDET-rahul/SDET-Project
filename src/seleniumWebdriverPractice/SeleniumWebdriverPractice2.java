package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class SeleniumWebdriverPractice2 {

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
		
		WebElement mobileNum=driver.findElement(By.name("reg_email__"));
		mobileNum.sendKeys("deb@yahoo.com");
		
		WebElement passWrd=driver.findElement(By.name("reg_passwd__"));
		passWrd.sendKeys("debashish@123");
		
		WebElement sexMale=driver.findElement(By.xpath("//span[2]/input"));
		sexMale.click();
		
		Select selDay=new Select(driver.findElement(By.name("birthday_day")));
		selDay.selectByIndex(2);
		
		Select selMonth=new Select(driver.findElement(By.name("birthday_month")));
		selMonth.selectByVisibleText("Jun");
		
		Select selYear=new Select(driver.findElement(By.name("birthday_year")));
		selYear.selectByIndex(1);
		
		String expectedResult=driver.findElement(By.cssSelector(".\\_52lq")).getText();
				
		Assert.assertEquals(expectedResult, "Sign Up");
		
		//driver.close();
		//Locators of selenium: id, name, xpath, css selector, linktext, partial linktext,tag name, class name
		//xpath syntax would be //<html tag>[@classname/id/name='<value>']
		//click method is for clicking operation
		//sendkeys method is for entering text in webdriver;
		
		

	}

}
