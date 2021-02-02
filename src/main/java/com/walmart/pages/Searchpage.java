package com.walmart.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.walmart.Base.Baseclass;

public class Searchpage extends Baseclass {
	
	@FindBy(xpath="//*[@id=\"global-search\"]")
	WebElement searchtext;
	
	@FindBy(xpath="//*[@id=\"product-results\"]/div[1]/div/a/div/div[1]/img")
	WebElement click1stitem;
	
	@FindBy(xpath="//html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")
	WebElement insideaddtocart;
	// id=*[@id='search_a']
	@FindBy(xpath="//*[@class='css-f72ea9 e1xoeh2i4']")
	WebElement searchbtn;
	
	@FindBy(xpath="//label[contains(text(),'Category')]")
	WebElement category;
	
	@FindBy(xpath="//label[contains(text(),'Brand')]")
	WebElement Brand;
	
	@FindBy(xpath="//button[@class='css-17gzmsn ebt416s2']")
	WebElement sortby;
	
	@FindBy(xpath="//*[contains(text(),'Price: Low to High')]")
	WebElement lowtohigh;
	
	@FindBy(xpath="//*[@class='css-1baqlt1 edzik9p0']")
	WebElement addtocart;
	//checkout
	@FindBy(xpath="//button[contains(text(),'Checkout')]")//optional ph no field
	WebElement checkoutbtn;
	
	@FindBy(xpath="//button[@class='e5qqw234 css-1gezpl6 edzik9p0']")
	WebElement incitem;
	
	@FindBy(xpath="//button[@class='e5qqw233 css-1xgiecc edzik9p0']")//optional ph no field
	WebElement decitem;
	
	@FindBy(xpath="//button[@class='css-d4je81 ei50f4d14']")
	WebElement removeitem;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement proceedcheckout;
	
	public Searchpage()  {
		PageFactory.initElements(driver, this);//above all pagefactory initialization with this driver
	}
	public String validateSearchpagetitle() {
		return driver.getTitle();
	}
	public String validateSearchpage(String search) throws InterruptedException {
		searchtext.sendKeys(search);
		searchbtn.click();
		Thread.sleep(3000);
		category.click();
		sortby.click();
		lowtohigh.click();
		return search;
	}	
	public String validateCheckoutpage(String search) throws InterruptedException {
		searchtext.sendKeys(search);
		searchbtn.click();
		Thread.sleep(3000);
		click1stitem.click();
		insideaddtocart.click();
		checkoutbtn.click();
		incitem.click();
		decitem.click();
		removeitem.click();
		proceedcheckout.click();
		return null;
	
}
}