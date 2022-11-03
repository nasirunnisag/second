package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiN {
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="pass")

	private WebElement password;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public LogiN(WebDriver w)
	{
		PageFactory.initElements(w,this);
	}
	public void email(String us)
	{
		emailaddress.sendKeys(us);
		
	}
	public void pass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbt()
	{
		loginbtn.click();
	}

}
