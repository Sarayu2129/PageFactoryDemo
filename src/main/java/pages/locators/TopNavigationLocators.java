package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {

	
	
	@FindBy(xpath="//div[normalize-space()='Sign in']")
	public static WebElement account;
	
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	public static WebElement SignIn;
	
}
