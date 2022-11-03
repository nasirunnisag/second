package stage2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {
public WebDriver d;
	@BeforeMethod
public void openapp()
{
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.flipkart.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test
	public void tc1()
	{
		d.findElement(By.name("q")).sendKeys("redmi");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
