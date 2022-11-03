import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ChildBrowser {
@Test
public void chaild()
{
	WebDriver w=new ChromeDriver();
	w.manage().window().maximize();
	w.get("http://www.facebook.com");
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String par = w.getWindowHandle();
	System.out.println(par);
	w.switchTo().newWindow(WindowType.TAB);
	w.navigate().to("http://www.amazon.com");
Set<String> a = w.getWindowHandles();
System.out.println(a);
w.quit();
	
}
}
