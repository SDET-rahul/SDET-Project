 package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		WebElement Create_New_Account = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
		Create_New_Account.click();
		Thread.sleep(5000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Poonam");
		Thread.sleep(2000);
		
		WebElement SurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		SurName.sendKeys("Gore");
		Thread.sleep(2000);
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("poonamgore23@gmail.com");
		Thread.sleep(2000);
		
		//WebElement Email1 = driver.findElement(By.xpath("//input[@id='u_3_j_Sy']"));
		//Email1.sendKeys("poonamgore23@gmail.com");
		//Thread.sleep(2000);
		
		WebElement New_Password = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		New_Password.sendKeys("Poonam@112233");
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(Day);
		s.selectByIndex(22);
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select y = new Select(Month);
		y.selectByIndex(5);
		Thread.sleep(2000);
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select p = new Select(Year);
		p.deselectByValue("1998");
		Thread.sleep(2000);
		
		WebElement Gender = driver.findElement(By.xpath("//input[@id='u_3_2_Yn']"));
		Gender.click();
		Thread.sleep(2000);
		
		WebElement SignUp = driver.findElement(By.xpath("//button[@id='u_3_s_/n']"));
		SignUp.click();
		Thread.sleep(2000);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
