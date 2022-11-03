package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	 
	public WebDriver d;
public Test1 t=new Test1();
	
@BeforeMethod
public void openApp()
{
	ChromeOptions op=new ChromeOptions();
	op.addArguments("disable-notificatoins");
	d=new ChromeDriver(op);
	d.manage().window().maximize();
	d.get("https://online.qspiders.com/user");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
@Test
public void tc2() throws InterruptedException
{
	d.findElement(By.xpath("//input[@type='email']")).sendKeys("nasirunnisag@gmail.com");
	d.findElement(By.xpath("//input[@type='search']")).sendKeys("+91");
	d.findElement(By.xpath("//input[@type='tel']")).sendKeys("7995644160");
	d.findElement(By.xpath("//div[@class='mt-10 mb-16 ml-12 mr-9']")).click();
	d.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("guru123@");
	d.findElement(By.xpath("//button[@type='submit']")).click();
	d.findElement(By.xpath("//a[@href='/classes/64a46def-4d5c-4f06-a8a7-b1c10779942e']")).click();
	Thread.sleep(4000);
	d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
}
	
	

@AfterMethod
public void closeApp()
{
	d.close();
}
}
