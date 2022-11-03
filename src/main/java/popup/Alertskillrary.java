package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertskillrary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demoapp.skillrary.com/");

		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement e = w.findElement(By.id("course"));
		Actions a=new Actions(w);
		a.moveToElement(e).perform();
		w.findElement(By.xpath("//a[text()='munit testing ']")).click();
		w.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Alert a1 = w.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();//a1.dismiss();
		Thread.sleep(3000);
		//w.close();
		


	}

}
