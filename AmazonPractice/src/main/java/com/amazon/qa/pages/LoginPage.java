package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement gotologin;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement next;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
    WebElement signinbtn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement register;
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
		
	public String validatePageTitle() {
		return driver.getTitle();
	}
		// TODO Auto-generated constructor stub
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	public HomePage login(String ur,String pwd) throws InterruptedException, IOException {
		gotologin.click();
		email.clear();
		email.sendKeys(ur);
		next.click();
		password.clear();
		password.sendKeys(pwd);
		signinbtn.click();
		Thread.sleep(3000);
		return new HomePage();
		
	}

}
