package com.SalesForceLoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForceBase.BasePage;
import com.SalesForceLoginPages.LoginPage;

public class NegativeLoginTest extends BasePage {
	LoginPage lp;
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=getDriver();
		
	}
	
	@Test(priority=0)
	public void userNameButton() {
		 //getDriver();
		lp=new LoginPage(driver); 
		lp.getUserName("Simin");
	}
	
	@Test(priority=1)
	public void passwordButton() {
		 //getDriver();
		lp=new LoginPage(driver); 
		lp.getPassword("1234");
	}
	
	@Test(priority=2)
	public void signinButton() {
		 //getDriver();
		lp=new LoginPage(driver); 
		lp.getLogin();
	}
	
	@AfterTest
	public void teardownTests() {
		closeDriver();
	}


}
