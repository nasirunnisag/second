package llel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Llel {
	public WebDriver d;
	@Parameters({"BrowserName"})
	@Test
public void demo(String browser)
{
	if(browser.equals("chrome"))
	{
		d=new ChromeDriver();
	}
	else
	{
		
		d=new FirefoxDriver();
	}
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.findElement(By.id("email")).sendKeys("9441806071");
	d.findElement(By.id("password")).sendKeys("rohakowsar");
	d.findElement(By.name("login")).click();
	String a = d.getTitle();
	Reporter.log(a,true);
	String a1 = d.getCurrentUrl();
	Reporter.log(a1);
		
}
}
