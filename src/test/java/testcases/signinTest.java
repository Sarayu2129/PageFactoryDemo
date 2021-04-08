package testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Page;
import pages.action.HomePage;
import pages.action.signinPage;
import utilities.TestUtil;

public class signinTest {

	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void signinTest(Hashtable<String,String> data) {
		
		
		if(data.get("runmode").equalsIgnoreCase("N")){
		
			throw new SkipException("Skipping the test as the Run mode is NO ");
		}
		Page.initConfiguration(); 
		signinPage signin = Page.TopNav.gotoSignin();
		signin.doLogin(data.get("username"),data.get("password"));
		
		
		

	}
    
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
		
	}
}
