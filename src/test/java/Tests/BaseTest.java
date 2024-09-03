package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest 
{
	public WebDriver driver;
	public WebDriver intialize() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\globaldata.properties");
		prop.load(fis);
		String browserType = prop.getProperty("browser");
		if(browserType.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserType.equalsIgnoreCase("Edge"))
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public void navigateToapplication() throws IOException
	{
		intialize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
	
	
	
	

}
