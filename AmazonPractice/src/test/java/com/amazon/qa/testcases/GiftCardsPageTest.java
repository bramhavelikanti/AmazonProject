package com.amazon.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.GiftCards;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class GiftCardsPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	GiftCards giftCards;
	public GiftCardsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		browserSetUp();
		loginpage = new LoginPage();
		giftCards=new GiftCards();
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
		giftCards.clickOnGiftCards();
}
	@Test(priority=0)
	public void singleOccassionTest() {
		giftCards.selectSingleOccassions();
		
	}
	@Test(priority=1)
	public void multipleOccassionTest() {
		giftCards.selectSingleOccassions();
		giftCards.selectmultipleOccassions();
	}
	@Test(priority=2,enabled=false)
	public void giftCardsPageClickTest() throws IOException  {
		giftCards.clickOnGiftCards();
		String gifttitle= driver.getTitle();
		Assert.assertEquals(gifttitle, "gift cards");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
