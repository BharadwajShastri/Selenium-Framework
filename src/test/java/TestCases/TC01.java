package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pomclasses.LoginPage;
import Tests.BaseTest;

public class TC01 extends BaseTest
{
  @Test
  public void validLogin() throws IOException 
  {
	  
	  navigateToapplication();
	  
	  LoginPage lp = new LoginPage(driver);
	  lp.loginPageCheck();
	  lp.loginapplication("rahulshettyacademy", "learning");
	  
	  
  }
  
  @Test 
  public void InvalidLogin()
  {
	  System.out.println("Push the updated code from cloned Repo");
  }

@Test 
	public void RepoCode()
	{
		System.out.println("pull the updated code from Repo");
	}


@Test 
public void Enchancments()
{
	System.out.println("Branched the repo for enchancements ");

	System.out.println("Updated");
}


}	
