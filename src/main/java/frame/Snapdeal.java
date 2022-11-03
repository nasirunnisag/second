package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.snapdeal.com/");

		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement a = w.findElement(By.xpath("//div[@class='accountInner']"));
		Actions a1=new Actions(w);
		a1.moveToElement(a).perform();
w.findElement(By.xpath("//a[text()='login']")).click();
		w.switchTo().frame(0);
		w.findElement(By.id("userName")).sendKeys("732468723478");
		w.findElement(By.id("close-pop")).click();
		w.switchTo().defaultContent();
		w.findElement(By.name("keyword")).sendKeys("Phones");
	}

}
