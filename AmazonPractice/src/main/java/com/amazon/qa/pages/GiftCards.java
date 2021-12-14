package com.amazon.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.amazon.qa.base.TestBase;

public class GiftCards extends TestBase	 {


    @FindBy(xpath="//a[contains(text(),'Gift Cards')]")
    WebElement giftcards;
    
	@FindBy(xpath="//span[contains(text(),'Anniversary')]")
	WebElement Anniversary;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/"
			+ "span[1]/div[1]/span[1]/div[1]/"
			+ "div[1]/div[4]/ul[1]/li[3]/span[1]/a[1]/span[1]")
	WebElement Birthday;

	public GiftCards() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	public void selectSingleOccassions() {
		
		Anniversary.click();
	}
	public void selectmultipleOccassions() {
		
		Anniversary.click();
		Birthday.click();
	}
	public GiftCards clickOnGiftCards() throws IOException {
		giftcards.click();
		return new GiftCards();
		}
	
}
