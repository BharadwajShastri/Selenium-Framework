package Pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.CommonMethods;

public class LoginPage extends CommonMethods
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="signin")
	WebElement Submit;
	
	By Admin = By.xpath("//input[@id='usertype']");
	
	String terms = "//a[text()='terms and conditions']";
	
	public void loginapplication(String Un, String Pw)
	{
		Username.sendKeys(Un);
		Password.sendKeys(Pw);
		Submit.click();
		
	}
	
	public void loginPageCheck()
	{
		checkvisible(terms);
		optionSelected(Admin);
	}
	
	
	

}
