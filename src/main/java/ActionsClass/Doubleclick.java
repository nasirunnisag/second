package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement a = w.findElement(By.id("add"));
		Actions a1=new Actions(w);
		a1.doubleClick(a).perform();
		Thread.sleep(40000);
		
		
	}

}
