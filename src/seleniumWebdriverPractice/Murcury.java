package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Murcury {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(5);
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement frstname=driver.findElement(By.name("firstName"));
		frstname.sendKeys("Poonam");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("Gore");
		WebElement phoneno=driver.findElement(By.name("phone"));
		phoneno.sendKeys("8329242946");
		WebElement email=driver.findElement(By.name("userName"));
		email.sendKeys("poonamgore245@gmail.com");
		
		WebElement add=driver.findElement(By.name("address1"));
		add.sendKeys("Vaduth");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("Satara");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("Maharashtra");
		WebElement pcode=driver.findElement(By.name("postalCode"));
		pcode.sendKeys("415011");
		
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("poonam");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("rahul#1");
		WebElement pass1=driver.findElement(By.name("confirmPassword"));
		pass1.sendKeys("rahul#1");
		
		//WebElement sub=driver.findElement(By.name("submit"));
		//sub.click();
		}

	

	}


