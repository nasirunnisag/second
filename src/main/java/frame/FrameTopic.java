package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTopic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://skillrary.com/search?q=core+java+for+selenium+training");

		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
w.findElement(By.linkText("Core Java For Selenium Trainin")).click();
w.switchTo().frame(0);
w.findElement(By.xpath("//div[@class='play-icon']")).click();
Thread.sleep(4000);
w.findElement(By.xpath("//div[@class='pause-icon']")).click();
w.switchTo().defaultContent();
w.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
	}

}
