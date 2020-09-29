package com.cucmber.citronglobal.CitronGlobal.Logic;

import java.io.IOException;
import org.testng.annotations.Test;
import PageObjects.PageObjects_LoginPage;


public class Java_LoginPage extends PageObjects_LoginPage
{
public Java_LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void loginToCitronGlobal() throws IOException, InterruptedException
	{
		launchBrowser();
		driver.get(prop.getProperty("URL"));
		log.debug("Entered URL from property file");
		userNameTextField().sendKeys(prop.getProperty("UserName"));
		log.debug("Username entered");
		passwordTextField().sendKeys(prop.getProperty("Password"));
		log.debug("password entered");
		signInButton().click();
		log.debug("Signin button clicked");
	}
}
