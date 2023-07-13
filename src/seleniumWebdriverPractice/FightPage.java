package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FightPage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(5);
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		WebElement sub=driver.findElement(By.xpath("//input[@value='oneway']"));
		sub.click();
		
		//Select passengers=new Select(driver.findElement(By.xpath("passCount")));
	   // passengers.selectByIndex(2);
		
	    Select DepartingFrom=new Select(driver.findElement(By.name("fromPort")));
		DepartingFrom.selectByIndex(2);
		
		 Select On=new Select(driver.findElement(By.name("fromMonth")));
		On.selectByIndex(5);
		
		Select On1=new Select(driver.findElement(By.name("toDay")));
		On1.selectByIndex(5);
		
		Select ArrivingIn =new Select(driver.findElement(By.name("toPort")));
		ArrivingIn.selectByIndex(5);
		
		Select Returning =new Select(driver.findElement(By.name("toMonth")));
		Returning.selectByIndex(7);
		
		Select Returning1 =new Select(driver.findElement(By.name("toDay")));
		Returning1.selectByIndex(7);
		
		WebElement first=driver.findElement(By.xpath("//input[@value='First']"));
		first.click();
		
		
		
		
		//WebElement ServiceClass=driver.findElement(By.name("servClass"));
		//ServiceClass.click();
		
		Select Airline =new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		Airline.selectByIndex(2);
		
		WebElement CONTINUE=driver.findElement(By.xpath("//input[@src='images/continue.gif']"));
		CONTINUE.click();
	}

}
