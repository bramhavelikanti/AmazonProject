package com.amazon.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		browserSetUp();
		loginpage = new LoginPage();	
		
	}
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title =loginpage.validatePageTitle();
		String expectedtitle=driver.getTitle();
		Assert.assertEquals(title, expectedtitle);
	}
	@Test(priority=2)
	public void logoTest() {
		boolean flag=loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=0)
	public void loginaccount() throws InterruptedException, IOException {
		loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
