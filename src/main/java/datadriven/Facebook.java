package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws IOException  {
Properties p=new Properties();
FileInputStream fis=new FileInputStream("./data.properties");
p.load(fis);
WebDriver w=new ChromeDriver();
w.manage().window().maximize();
w.get(p.getProperty("url"));
w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
w.findElement(By.id("email")).sendKeys(p.getProperty("username"));
w.findElement(By.id("pass")).sendKeys(p.getProperty("password"));
	}

}
