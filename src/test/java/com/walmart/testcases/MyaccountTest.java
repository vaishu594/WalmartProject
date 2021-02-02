package com.walmart.testcases;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.walmart.Base.Baseclass;
import com.walmart.pages.Loginpage1;
import com.walmart.pages.Mainpage;
import com.walmart.pages.Myaccountpage;
//import com.walmart.pages.mainpage;
import com.walmart.testutil.Testutil;

public class MyaccountTest extends Baseclass{
	Mainpage mainpage;
	Loginpage1 loginpage;
	Myaccountpage myaccountpage;
	Testutil testutil;
	
	public MyaccountTest(){     //constructor created immediately after class creation
		super();                //before initialization1 you have to call parent class by super
	}
@BeforeTest
	public void setup() {    //call browser setup method from baseclass
		initialization1();
		loginpage=new Loginpage1();
		mainpage=new Mainpage();
}
@Test(priority=1)
	public void myaccountpageTitleTest() {//gives you title
		String title=myaccountpage.validatemyaccountpagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "Walmart Canada");
}
@Test(priority=2)
public void promocodeTest() {//it call myaccountpage class
	boolean title=myaccountpage.validatemyaccountpagepromocode();
	System.out.println(title);
	myaccountpage.validatemyaccountpagepromocodeenter("123456");
}
@Test(priority=3)
public void LogoutTest() {//gives you title
	myaccountpage.signout();
}
@Test(priority=4)
public void searchmainpageTest() {//it call myaccountpage class & also go to mainpage walmart.ca
Mainpage search=myaccountpage.Mainpage();
System.out.println(search);
}
@AfterTest
	public void teardown() {
		driver.close();
}

}
