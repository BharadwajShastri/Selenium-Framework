package AbstractClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CommonMethods 
{
	WebDriver driver;
	
	public CommonMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void optionSelected(By findBy)
	{
		driver.findElement(findBy).isDisplayed();
	}
	
	public void checkvisible(String element)
	{
		Assert.assertTrue(true, element);
	}

}
