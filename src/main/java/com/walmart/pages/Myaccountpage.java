package com.walmart.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.walmart.Base.Baseclass;

public class Myaccountpage extends Baseclass{
	

	@FindBy(xpath="//h1[contains(text(),'My Account')]")
	WebElement myaccount;
	//*[@id="redeem-promo-container"]/h2
	@FindBy(xpath="//h2[contains(text(),'Redeem promo code')]")
	WebElement titleredeempromocode;
	
	@FindBy(xpath="//*[@id=\"redeem-promo-container\"]/input")
	WebElement enterpromocode;
	
	@FindBy(xpath="//*[@id=\"redeem-promo-code-btn\"]")
	WebElement clickpromocodebtn;
	
	@FindBy(xpath="//a[@class='view-all-orders gicon-chevron-right']")
	WebElement clicklinkviewallorders;
	//signout from here
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	WebElement signoutlink;
	//search for item from mainpage
	@FindBy(xpath="//input[@class='e1xoeh2i1 css-ymj5ct eesbt950']")
	WebElement editsearch;
	//signout from here
	@FindBy(xpath="//*[@id=\"search_a\"]")
	WebElement searchbtn;
	public Myaccountpage() {//create constructor and call pagefactory objects
		PageFactory.initElements(driver, this);//above all pagefactory initialization with this driver
	}

public String validatemyaccountpagetitle() {
		return driver.getTitle();
	}
public boolean validatemyaccountpagepromocode() {
	clicklinkviewallorders.click();
	return titleredeempromocode.isDisplayed();
	
//	String title=driver.getTitle();
//	System.out.println(title);	
}
public void validatemyaccountpagepromocodeenter(String promocode) {
	enterpromocode.sendKeys(promocode);
	clickpromocodebtn.click();	
}
public Mainpage signout() {
	signoutlink.click();
	return Mainpage();
}
public Mainpage Mainpage() {
	editsearch.sendKeys("shoes");
	searchbtn.click();
	return null;
}
}
