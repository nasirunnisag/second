import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Notification {
@Test
public void Notifi()
{
	ChromeOptions s=new ChromeOptions();
	s.addArguments("--disable-notificatoins");
	WebDriver w=new ChromeDriver(s);
	w.manage().window().maximize();
	w.get("https://webcamtests.com/");
	w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	w.findElement(By.id("webcam-launcher")).click();
}
}
