package pages.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.SigninLocators;

public class signinPage extends Page{
	
	public SigninLocators signLocator;
	public signinPage(){
		
		this.signLocator = new SigninLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signLocator);
	}
	
	
	public void doLogin(String username,String password){
		
		type(signLocator.email,username);
		
		//signLocator.email.sendKeys(username);
		
		type(signLocator.password,password);
		//signLocator.password.sendKeys(password);
		click(signLocator.signin);
		
		
		
		
		
	}

}
