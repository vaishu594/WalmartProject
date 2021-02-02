package com.walmart.testcases;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.walmart.Base.Baseclass;
import com.walmart.pages.Loginpage1;
import com.walmart.pages.Myaccountpage;
import com.walmart.testutil.Testutil;

public class Loginpagetest extends Baseclass{
	
	Loginpage1 loginpage;
	Myaccountpage myaccountpage;
	Testutil testutil;
	
	public Loginpagetest() {     //constructor created immediately after class creation
		super();                //before initialization1 you have to call parent class by super
	}
@BeforeTest
	public void setup() {    //call browser setup method from baseclass
	initialization1();
		loginpage=new Loginpage1();
		
}
@Test(priority=1)
	public void loginpageTitleTest() {//gives you title
		String title=loginpage.validateloginpagetitle1();
		System.out.println(title);
		//assert.assertEquals(title, "Online Shopping Canada:Everyday Low Prices at Walmart.ca!");
}
@Test(priority=2)
	public void loginpageLogoTest() {
	boolean logo=loginpage.validatelogo();
	//Assert.assertTrue(logo);	
} 
//@Test(priority=3)
	//public void loginTest() {//it call myaccountpage class
	//	myaccountpage=loginpage.login("Vaishali","Gajjar","6393188565", prop.getProperty("username"), prop.getProperty("password"));
		//username=email here
	//	System.out.println("login successful");
//}
@Test(priority=4)
public void signinTest() throws InterruptedException  {//it call myaccountpage class
	myaccountpage=loginpage.signin(prop.getProperty("username"), prop.getProperty("password"));
	//username=email here
	System.out.println("login successful");
}

@AfterTest
	public void teardown() {
		driver.close();
}
}


