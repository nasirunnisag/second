package script;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Main1 {

	public static void main(String[] args) {
WebDriver w=(WebDriver) new FirefoxDriver();
	 w.manage().window().maximize();
		w.get("https://wwww.facebook.com");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LogiN s=new LogiN(w);
		s.email("admin");
		s.pass("manager");
		s.loginbt();

	}

}
