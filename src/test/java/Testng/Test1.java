package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver d;
@BeforeMethod
public void openApp()
{
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://online.qspiders.com/user");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
@Test
public void tc1()
{
d.findElement(By.xpath("//input[@type='email']")).sendKeys("nasirunnisag@gmail.com");
d.findElement(By.xpath("//input[@type='search']")).sendKeys("+91");
d.findElement(By.xpath("//input[@type='tel']")).sendKeys("7995644160");
d.findElement(By.xpath("//div[@class='mt-10 mb-16 ml-12 mr-9']")).click();
d.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("guru123@");
d.findElement(By.xpath("//button[@type='submit']")).click();
}

@AfterMethod
public void closeApp()
{
	d.close();
}
}
