package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.findElement(By.linkText("Create New Account")).click();
		
		WebElement s = w.findElement(By.id("month"));
		Select s1=new Select(s);
		s1.selectByValue("2");
		s1.selectByIndex(0);
		s1.selectByVisibleText("Aug");
		
		List<WebElement> all = s1.getOptions();
		System.out.println(all.size());
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
		
		System.out.println(s1.isMultiple());
		if(s1.isMultiple())
		{
			s1.deselectAll();
			System.out.println("It is multiple selection");
		}
		else 
		{
			System.out.println("It is SINGLE selection");
		}
		//sort by alphabetical order
	}

}
