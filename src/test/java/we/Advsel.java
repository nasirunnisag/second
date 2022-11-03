package we;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advsel {
	public WebDriver d;
@BeforeMethod
public void openApp()
{
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://MycartTestEnv.com");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@Test
public void tc1()
{
	d.findElement(By.id("E1")).click();
	String parent=d.getWindowHandle();
	d.switchTo().newWindow(WindowType.TAB);
	Set<String> s = d.getWindowHandles();
	WebElement a = d.findElement(By.id("E2"));
	Actions a1=new Actions(d);
	a1.moveToElement(a).perform();
	d.findElement(By.id("E4")).click();
	d.switchTo().frame(0);
	d.findElement(By.id("E5")).click();
	Alert a2 = d.switchTo().alert();
	a2.accept();
	d.switchTo().defaultContent();
}
@AfterMethod
public void closeapp()
{
	d.close();
}
}
