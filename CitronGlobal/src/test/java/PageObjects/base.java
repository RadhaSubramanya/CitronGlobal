package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base 
{
	public static Logger log = Logger.getLogger(base.class);
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public base() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("B:\\Tuition\\Radha WS\\CitronGlobal\\Config.properties");
		prop.load(fis);
		log.info("Config property file is loaded");
	}
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java Library\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		log.info("Chrome driver instance is created and browser is launched");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Waiting for page load");
		driver.manage().window().maximize();
		log.info("Window maximized");
	}
}