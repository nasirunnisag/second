package ActionsClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mynthra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.myntra.com/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement a1 = w.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[5]/div/a"));
		Thread.sleep(3000);
		Actions a=new Actions(w);
		a.moveToElement(a1).perform();
		w.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/nav/div/div[5]/div/div/div/div/li[3]/ul/li[9]/a")).click();
		
		

	}

}
