package com.walmart.testcases;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.walmart.Base.Baseclass;
import com.walmart.pages.Loginpage1;
import com.walmart.pages.Myaccountpage;
import com.walmart.pages.Mylistpage;
import com.walmart.testutil.Testutil;
public class MylistTest extends Baseclass{
	Mylistpage mylistpage;
	Loginpage1 loginpage;
	Myaccountpage myaccountpage;
	CommunicationPreferencespage communicationpreferencespage;
	Testutil testutil;
	
	public  MylistTest() {     //constructor created immediately after class creation
		super();                //before initialization1 you have to call parent class by super
	}
@BeforeTest
	public void setup() {    //call browser setup method from baseclass
	initialization1();
		loginpage=new Loginpage1();
		mylistpage=new Mylistpage();
}
@Test(priority=1)
	public void MylistpageTitleTest() throws InterruptedException {//gives you title
		String title=mylistpage.validateMylistpagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "Walmart Canada");
}
@Test(priority=2)
	public void MylistpageLogoTest() throws InterruptedException {//actual title display
	boolean logo=mylistpage.validatetitleofMylistpage();
	//Assert.assertTrue(logo);	
} 
@Test(priority=3)
public void wincardTest() throws InterruptedException  {//it call myaccountpage class
	mylistpage.listcreate("babyfood", "kids", "toys");
	System.out.println("list created successfully");
}
@AfterTest
	public void teardown() {
		driver.close();
}
}
