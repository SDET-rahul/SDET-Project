package seleniumWebdriverPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en&source=auth_switcher");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement signup=driver.findElement(By.xpath("//div[@id='react-root']/section/main/div/div/div[2]/div/p/a/span"));
		signup.click();

	}

}
