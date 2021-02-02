package com.walmart.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.walmart.Base.Baseclass;

public class Myrecommendationpage extends Baseclass{
	
	@FindBy(xpath="//*[@id=\"my-account-nav\"]/section[1]/ul/li[1]/a")
	WebElement myrecmlink;
	
	@FindBy(xpath="//*[@id=\"my-account-content\"]/section/section[1]/div/h1")
	WebElement titlepage;
	
	@FindBy(xpath="//*[@id=\"thumb-6000199255079\"]/a/div[2]/div[2]/img")
	WebElement image;
	
	@FindBy(xpath="//*[@id=\"thumb-6000199255079\"]/a/div[3]")
	WebElement productdetail;
	
	@FindBy(xpath="//span[@class='btn-txt']")
	WebElement addtocart;
	
	public Myrecommendationpage() {
		PageFactory.initElements(driver, this);//above all pagefactory initialization with this driver
	}
	public String validatemyrecommendationpagetitle() throws InterruptedException {
		myrecmlink.click();
		Thread.sleep(3000);
		return driver.getTitle();
	}
	public String validatemyrecommendationvaishupagetitle() throws InterruptedException {
		//titlepage.isDisplayed();
		myrecmlink.click();
		Thread.sleep(3000);
		return driver.getTitle();
	}		
	public Checkoutpage validateimage() throws InterruptedException {
		//return image.isDisplayed();
		//return productdetail.isDisplayed();
		myrecmlink.click();
		Thread.sleep(3000);
		addtocart.click();
		return new Checkoutpage();
	}	
}
