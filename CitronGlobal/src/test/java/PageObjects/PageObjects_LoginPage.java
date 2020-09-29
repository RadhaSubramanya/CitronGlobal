package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjects_LoginPage extends base 
{
public PageObjects_LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement userNameTextField()
	{
		return driver.findElement(By.xpath(prop.getProperty("UserName_TextField")));
	}
	public WebElement passwordTextField()
	{
		return driver.findElement(By.xpath(prop.getProperty("Password_TextField")));
	}
	public WebElement signInButton()
	{
		return driver.findElement(By.xpath(prop.getProperty("SignIn_Button")));
	}
}
