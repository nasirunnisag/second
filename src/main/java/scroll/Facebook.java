package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://m.facebook.com/gswshelper/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("windows.scrollBy(0,5000)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-5000)");
		
	}

}
