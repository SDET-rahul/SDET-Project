package seleniumWebdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("userName");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		String exptitle="Welcome: Mercury Tours";
		String acttitle=driver.getTitle();
		
		if(exptitle.equals(acttitle)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is not passed");
		}
		
		driver.quit(); 

	}

}
