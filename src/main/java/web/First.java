package web;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
WebDriver w=new FirefoxDriver();
w.manage().window().maximize();
w.get("http://localhost:9999");

w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}

}
