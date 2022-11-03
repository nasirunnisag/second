import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cal {
	@Test
	public void selectAnyDateInDOM() throws InterruptedException
	{
		//Set the web driver manager to chrome
		WebDriverManager.chromedriver().setup();
				
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
				
		Thread.sleep(1000);
				
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
				
		//driver.findElement(By.xpath("//a[@class='close']")).click();
				
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
				
		//Navigate to From and To Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
				
				
		src.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
				
		Thread.sleep(2000);
				
		dst.sendKeys("chennai");
		driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
				
		Thread.sleep(2000);
			
		//navigate to departure
		driver.findElement(By.xpath("//label[@for='departure']")).click();
				
		//navigate to desired date in calender
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 03 2022']")).click();
	}

	
	
	@Test
	public void selectAnyFutureDateNotInDOM() throws InterruptedException
	{
		//Set the web driver manager to chrome
				WebDriverManager.chromedriver().setup();
						
				//Launch the browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.makemytrip.com/");
						
				Thread.sleep(1000);
						
				Actions act = new Actions(driver);
				act.moveByOffset(10, 10).click().perform();
						
				//driver.findElement(By.xpath("//a[@class='close']")).click();
						
				driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
						
				//Navigate to From and To Elements
				WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
				WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
						
						
				src.sendKeys("mumbai");
				driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
						
				Thread.sleep(2000);
						
				dst.sendKeys("chennai");
				driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
						
				Thread.sleep(2000);
					
				//navigate to departure
				driver.findElement(By.xpath("//label[@for='departure']")).click();
						
				//navigate to desired date in calender
				Thread.sleep(1000);
				
				for(;;)
				{
					try {
						
						driver.findElement(By.xpath("//div[@aria-label='Sat Dec 03 2022']")).click();
						break;
						
					    } 
					catch (Exception e) 
					{
						driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
					}
				}
				
	}
	
	@Test
	public void selectCurrentDate() throws InterruptedException
	{
		//Sat Dec 03 2022
		//Wed Sep 28 20:39:40 IST 2022
		// 0   1  2      3     4    5 inside array
		Date d = new Date();
		String dStr = d.toString();
		String[] dArr = dStr.split(" ");
		String day = dArr[0];
		String month = dArr[1];
		String date = dArr[2];
		String year = dArr[5];
		String travelDate = day+" "+month+" "+date+" "+year;
		System.out.println(travelDate);
		
		//Set the web driver manager to chrome
		WebDriverManager.chromedriver().setup();
				
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
				
		Thread.sleep(1000);
				
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
				
		//driver.findElement(By.xpath("//a[@class='close']")).click();
				
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
				
		//Navigate to From and To Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
				
				
		src.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
				
		Thread.sleep(2000);
				
		dst.sendKeys("chennai");
		driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
				
		Thread.sleep(2000);
			
		//navigate to departure
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
				
		//navigate to desired date in calender
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='"+travelDate+"']")).click();
		                             //div[@aria-label='wed sep 28 2022']
        							 //div[@aria-label='Thu sep 29 2022']
		
		js.executeScript("window.scrollBy(0,-200)", "");
			
		
	}
}
