package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.makemytrip.com/");

		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(8000);

w.switchTo().frame(0);
	
	//w.findElement(By.xpath("//a[@class='close']")).click();
	
		w.switchTo().defaultContent();
		Thread.sleep(3000);
		w.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("(//p[text()='28'])[2]")).click();
	
	}

}
