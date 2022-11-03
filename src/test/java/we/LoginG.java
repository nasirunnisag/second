package we;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginG {
	  @Test
	  public void login()
	    {
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	  driver.get("https://www.gmail.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("identifierId")).sendKeys("kbasith336@gmail.com");
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
	  driver.findElement(By.name("password")).sendKeys("guru123@");
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	  
	  
	 
	    }
}
