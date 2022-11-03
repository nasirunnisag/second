package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement s = w.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(s);
		s1.selectByValue("search-alias=baby");
		s1.selectByIndex(6);
		s1.selectByVisibleText("Books");
		List<WebElement> all = s1.getOptions();
		System.out.println(all.size());
		for(WebElement a:all)
		{
			System.out.println(a.getText());
		}
	}

}
