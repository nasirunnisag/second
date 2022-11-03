package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFacebook {
	public static void main(String [] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./we.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String user=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String pass=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		w.get(url);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.findElement(By.id("email")).sendKeys(user);
		w.findElement(By.id("pass")).sendKeys(pass);
	}

}
 