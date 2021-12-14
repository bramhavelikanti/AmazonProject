package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Buy Again')]")
	WebElement buyagain;
	
	@FindBy(xpath="//a[contains(text(),'Coupons')]")
	WebElement coupens;
	
	@FindBy(xpath="//a[contains(text(),'Toys & Games')]")
	WebElement toys;
	
	@FindBy(xpath="//a[contains(text(),'Sports, Fitness & Outdoors')]")
	WebElement sports;
	
	@FindBy(xpath="//a[contains(text(),'Customer Service')]")
	WebElement cuscare;
	
	@FindBy(xpath="//a[contains(text(),'Health, Household & Personal Care')]")
	WebElement health;
	
	@FindBy(xpath="//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[2]/div[1]/a[1]")
	WebElement apay;
	
	@FindBy(xpath="//span[contains(text(), 'Hello, Bramha')]")
	WebElement userlable;
	
	
	
	public HomePage() throws IOException {
       PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
		
	}
    
    public CoupensPage clickOnCoupens() {
    	coupens.click();
    	return new CoupensPage();
    }
    public CCarePage clickOnCCare() {
    	cuscare.click();
    	return new CCarePage();
    }
    public HealthPage clickOnHealth() {
    	health.click();
    	return new HealthPage();
    }
    public APayPage clickOnAPay() {
    	apay.click();
    	return new APayPage();
    }
    public boolean lableverify() {
    	return userlable.isDisplayed();
    }
}



