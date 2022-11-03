package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://m.facebook.com/");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TakesScreenshot ts=(TakesScreenshot) w; 
		File ramloc = ts.getScreenshotAs(OutputType.FILE);
		File s = new File("./photo/facebook.png");
		FileUtils.copyFile(ramloc, s);
		w.close();

	}

}
