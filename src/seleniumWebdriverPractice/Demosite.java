package seleniumWebdriverPractice;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demosite {

			public static void main(String[] args) throws Exception {
				System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("http://demo.automationtesting.in/Register.html");
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				Thread.sleep(5);
				String title=driver.getTitle();
				System.out.println(title);
				
				WebElement firstname=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div/div/input"));
				firstname.sendKeys("Rahul");
				
				WebElement lastname=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div/div[2]/input"));
				lastname.sendKeys("Gore");
				
				WebElement add=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea"));
				add.sendKeys("Vaduth Satara");
				
				WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("poonamgore245@gmail.com");
				
				WebElement phone=driver.findElement(By.xpath("//div[4]/div/input"));
				phone.sendKeys("8796242980");
				
				WebElement gender=driver.findElement(By.xpath("//input[@name='radiooptions']"));
				gender.click();
				
				WebElement hobbi1=driver.findElement(By.xpath("//div[6]/div/div/input"));
				hobbi1.click();
				
				WebElement hobbi2=driver.findElement(By.xpath("//div[6]/div/div[2]/input"));
				hobbi2.click();
				
				/*Select lang=new Select(driver.findElement(By.id("msdd")));
				lang.*/
				
				/*Select lang=new Select(driver.findElement(By.xpath("//div[@id='msdd']/div")));
				lang.selectByVisibleText("English");
				driver.findElement(By.xpath("//div[@id='msdd']")).click();
				 List<WebElement> menuOption=driver.findElements(By.tagName("a"));
				    
			        for (int i=0;i<menuOption.size();i++)
			        {
			        	try {
			        	if(menuOption.get(i).getText().equalsIgnoreCase("English"))
			        	{
			        		menuOption.get(i).click();
			        	}}catch(StaleElementReferenceException e)
			        	{
			        		
			        	}*/
				
				Select skill=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
				skill.selectByIndex(20);
				
				/*Select country=new Select(driver.findElement(By.id("select2-country-container")));
				country.selectByIndex(7);*/
				
			//	driver.findElement(By.xpath("//div[@id='msdd']")).click();
				//List<WebElement> sel=driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
			//	for(int i=0;i<sel.size();i++)
				//{
				//	if(sel.get(i).getText().equalsIgnoreCase("English"))
				//	{
				//		sel.get(i).click();
				//	}
							
				//}
				
				/*driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
				List<WebElement> cou=driver.findElements(By.xpath("//span[@id='select2-country-container']"));
				for(int i=0;i<cou.size();i++)
				{
					if(cou.get(i).getText().equalsIgnoreCase("India"))
					{
						cou.get(i).click();
					}
							
				}*/
				
				
				
				
				Select selYear=new Select(driver.findElement(By.id("yearbox")));
				selYear.selectByIndex(99);
				
				Select selMonth=new Select(driver.findElement(By.xpath("(//select[@type='text'])[4]")));
				selMonth.selectByIndex(5);
				
				Select selDay=new Select(driver.findElement(By.id("daybox")));
				selDay.selectByIndex(5);
				
				WebElement pass=driver.findElement(By.id("firstpassword"));
				pass.sendKeys("Rahul#1");
				
				WebElement secpass=driver.findElement(By.id("secondpassword"));
				secpass.sendKeys("rahul#1");
				
				//WebElement sub=driver.findElement(By.name("signup"));
				//sub.click();
				
				
				WebElement sub=driver.findElement(By.id("submitbtn"));
				sub.click();
				
				//xpath("//input[@name='radiooptions']")
				
	}

}
