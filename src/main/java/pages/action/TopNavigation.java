package pages.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators TopNavigation;
	public TopNavigation(WebDriver driver){
		this.TopNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.TopNavigation);
	}
	
	
	public void goEnglish(){
		
	}
	
	public void gotoSupport(){
		
		
	}
	public void findTabCount(){
		
	}
    public signinPage gotoSignin(){
    	
    	Page.click(TopNavigation.account);
    	Page.click(TopNavigation.SignIn);
    	
    	return new signinPage();
    	 
    }
}
