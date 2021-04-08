package testcases;


import java.util.Hashtable;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;
import errorcollector.ErrorCollector;
import pages.action.HomePage;
import utilities.TestUtil;

public class flightSearchTest {
    
	@BeforeTest
	public void setUp(){
		
		
		Page.initConfiguration();
		
	}
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void flightSearchTest(Hashtable<String,String> data) throws InterruptedException {
		
	 HomePage home = new HomePage();
	 
	 home.gotoFlights();
	 //Assert.assertEquals( home.finfTabCount(),8);
	// ErrorCollector.verifyEquals(home.finfTabCount(),8);
	  ErrorCollector.verifyEquals(home.finfTabCount(),8);
	 //ErrorCollector.verifyEquals(home.finfTabCount(),5);
	  home.bookAFlight(data.get("fromCity"),data.get("toCity"),data.get("checkIn"),data.get("checkOut"));
	  
	 
}
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null)
		Page.quitBrowser();
	}
}