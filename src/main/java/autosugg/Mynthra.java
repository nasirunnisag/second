package autosugg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mynthra {
	public static void  main(String[] args) throws InterruptedException {
		
	
	WebDriver w=new FirefoxDriver();
	w.manage().window().maximize();
	w.get("https://www.myntra.com/");
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	w.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input")).sendKeys("dress");
	Thread.sleep(3000);
	List<WebElement> ele = w.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
	System.out.println(ele.size());
	for(WebElement b:ele)
	{
		System.out.println(b.getText());
	}
	
	}
}
