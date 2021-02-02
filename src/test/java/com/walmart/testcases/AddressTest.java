package com.walmart.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.walmart.Base.Baseclass;
import com.walmart.pages.Addresspage;
import com.walmart.pages.Loginpage1;
import com.walmart.pages.Myaccountpage;
import com.walmart.testutil.Testutil;

public class AddressTest extends Baseclass{
	Addresspage address;
	Loginpage1 loginpage;
	Myaccountpage myaccountpage;
	Testutil testutil;
	
	public AddressTest() {     //constructor created immediately after class creation
		super();                //before initialization1 you have to call parent class by super
	}
@BeforeTest
	public void setup() {    //call browser setup method from baseclass
	initialization1();
		loginpage=new Loginpage1();		
}
@Test(priority=1)
	public void AddressTitleTest() throws InterruptedException {//gives you title
		String title=address.validateAddresspagetitle();
		System.out.println(title);
		//assert.assertEquals(title, "Online Shopping Canada:Everyday Low Prices at Walmart.ca!");
}
@Test(priority=2)
	public void AddresspagetitleTest() throws InterruptedException {
	boolean logo=address.validateaddresstitle();
	//Assert.assertTrue(logo);	
} 
@Test(priority=3)
public void AddresssigninTest() throws InterruptedException  {//it call myaccountpage class
	address.Address("Jatin", "Gajjar","6393188565", "Unit-103","286 Chandler Dr", "Kitchener", "N2E3J8", "Canada");
	//username=email here
	System.out.println("Address successfully saved");
}

@AfterTest
	public void teardown() {
		driver.close();
}
}

