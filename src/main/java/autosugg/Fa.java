package autosugg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("http://www.facebook.com");
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.findElement(By.id("email")).sendKeys("9441806071");
		w.findElement(By.id("pass")).sendKeys("rohakowsar123");
		w.findElement(By.name("login")).click();

    w.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("guru");
	//	w.findElement(By.xpath("//input[contain[@class='qi72231t s3jn8y49 k14qyeqv mz1h5j5e ztn2w49o s19c0p35 febi1ev9 pccvoycu c84hr6m5 losq46hw qgrdou9d nu7423ey n3hqoq4p r86q59rh b3qcqh3k fq87ekyn f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l pbevjfx6 tgm57n0e cgu29s5g i15ihif8 no6h3tfh k1z55t6l aeinzg81 icdlwmnq om3e55n1 rh5b4hnh gy87pps4 b0eko5f3 r9fxt90l fwlpnqze nq2b4knc adj1mh9s h7nzrzxv gl9yfm1p ap9gnrge k4z0jo6w']]")).sendKeys("guru");
		Thread.sleep(3000);
		 List<WebElement> s1 = w.findElements(By.xpath("//li[@class='mfclru0v']"));
		 System.out.println(s1.size());
		 for(WebElement b:s1)
		 {
			 System.out.println(b.getText());
		 }
		
		

	}

}
