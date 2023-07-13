package seleniumWebdriverPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbdriverApplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fdeals%2F%3Fpf_rd_r%3DJPRY9H8S0M76AYEW6M9Y%26pf_rd_p%3D83914c9f-d541-4cb8-94db-462b5a55e715%26pd_rd_r%3D535b05e7-edfd-4f17-b7a4-7e417d7c971e%26pd_rd_w%3DHBBdS%26pd_rd_wg%3Dztby8%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		//String title=driver.getTitle();
	//	System.out.println(title);
     
		
		//river.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(5);
		//String title=driver.getTitle();
		//System.out.println(title);
	//	WebElement Signin=driver.findElement(By.linkText("Sign in"));
		//Signin.click();
		
	}

}
