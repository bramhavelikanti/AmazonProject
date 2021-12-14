package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

import junit.framework.Assert;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		browserSetUp();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
}
	@Test(enabled=false,priority=0)
	public void verifyHomePageTitleTest() {
		String hometitle=homepage.validatePageTitle();
		
		Assert.assertEquals(hometitle,"amazon");
	}
	@Test(enabled=true,priority=1)
	public void verifyHealthPageTest() {
		homepage.clickOnHealth();
	}
	@Test(enabled=true,priority=2)
	public void verifycoupensPageTest() {
		homepage.clickOnCoupens();
	}
	@Test(enabled=true,priority=3)
	public void verifyApayPageTest() {
		homepage.clickOnAPay();
		String apaytitle = driver.getTitle();
		Assert.assertEquals(apaytitle, "Amazon Pay");
	}
	@Test(enabled=true,priority=4)
	public void verifyuserlableTest() {
		Assert.assertTrue(homepage.lableverify());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
