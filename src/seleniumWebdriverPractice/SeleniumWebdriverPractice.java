package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverPractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();

		
		
		
		

	}

}

