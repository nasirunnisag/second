package ActionsClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.findElement(By.xpath("(//a[@class='nav-a  '])[2]")).click();
		Thread.sleep(3000);
		WebElement a = w.findElement(By.xpath("(//span[@class='nav-a-content'])[3]"));
	Actions a1=new Actions(w);
	a1.moveToElement(a).perform();
		 w.findElement(By.xpath("//a[text()='Laptops']")).click();
		
	}

}
