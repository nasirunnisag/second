package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement a = w.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement a1 =w.findElement(By.xpath("//h1[text()='Block 4']"));Thread.sleep(40000);
		Actions a2=new Actions(w);
		a2.dragAndDrop(a,a1).perform();
		
	}

}
