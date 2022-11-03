package we;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
  @Test
public void login()
  {
    WebDriver driver=new FirefoxDriver();
    driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("pass")).sendKeys("manager");
WebElement w=driver.findElement(By.name("login"));
if(w.isEnabled())
{
  System.out.println("element is enabled");
  w.click();
}
else
{
  System.out.println("element is not enabled");
}

  }}
