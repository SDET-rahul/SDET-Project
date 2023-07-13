package seleniumWebdriverPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();//ok operation
		//driver.switchTo().alert().dismiss();//cancel operation
	}

}
