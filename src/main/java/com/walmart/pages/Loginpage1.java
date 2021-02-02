package com.walmart.pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.Base.Baseclass;

public class Loginpage1 extends Baseclass{
	
	// page factory or Obj repository
	
	@FindBy(xpath="//*[@id=\"sparklogo_Layer_1\"]")
	WebElement walmartlogo;
	
	@FindBy(xpath="//span[contains(text(),'My account')]")
	WebElement myaccountlink;
	
	@FindBy(linkText="Sign in")
	WebElement signinlink;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement signinlinkbtn;
	
	@FindBy(linkText="Join now")
	WebElement joinnowlink;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"phoneNumber\"]")//optional ph no field
	WebElement phno;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement pswd;
	
	@FindBy(xpath="//input[@id=\"marketingPreference\"]") //optional checkbox
	WebElement chbox1;
	
	@FindBy(xpath="//input[@id=\"TAndC\"]")
	WebElement chbox2;
	
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement createaccountbtn;

	//create method now:
	public Loginpage1() {
		//super();
		PageFactory.initElements(driver, this);//above all pagefactory initialization with this driver
	}
	
	public String validateloginpagetitle1() {
			return driver.getTitle();
		}
	
	public boolean validatelogo() {
			return walmartlogo.isDisplayed();
		}
	
	public Myaccountpage login(String ftname,String ltname,String ph_no,String Email,String pwd) throws InterruptedException {
		 Actions action=new Actions(driver);
			
			action.moveToElement(driver.findElement(By.linkText("Sign in My account"))).build().perform();
			
			Thread.sleep(2000); //to add wait time
			joinnowlink.click();
			firstname.sendKeys(ftname);
			lastname.sendKeys(ltname);
			phno.sendKeys(ph_no);
			email.sendKeys(Email);
			pswd.sendKeys(pwd);
			chbox1.click();
			chbox2.click();
			createaccountbtn.click();
			
			return new Myaccountpage();
		}

	public Myaccountpage signin(String usnm, String pd) throws InterruptedException {
     Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Sign in My account"))).build().perform();
		//.build and .perform is used to implement action.
		Thread.sleep(2000); //to add wait time
	   driver.findElement(By.linkText("Sign in")).click();
		email.sendKeys(usnm);
		pswd.sendKeys(pd);
		signinlinkbtn.click();
		return new Myaccountpage();

	}
	
}
