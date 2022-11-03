package makemytrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMytrip {
@Test
public void makemytrip() throws InterruptedException
{
	WebDriver w=new ChromeDriver();
	w.manage().window().maximize();
	w.get("https://www.makemytrip.com/");
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	w.switchTo().frame(0);
	w.switchTo().defaultContent();
	w.findElement(By.xpath("//label[@for='departure']")).click();
}
}
