package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skillrry {

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demoapp.skillrary.com/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement s = w.findElement(By.id("cars"));
		Select s1=new Select(s);
		s1.selectByValue("99");
		s1.selectByIndex(0);
		//s1.selectByVisibleText("Free ( 90 ) ");
		s1.selectByValue("299");
		s1.selectByIndex(5);
		List<WebElement> all = s1.getOptions();
		System.out.println(all.size());
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
	}
	}


