package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninLocators {
	
	@FindBy(id="signin-loginid")
	public static WebElement email;
	
	@FindBy(id="signin-password")
	public static WebElement password;
	
	@FindBy(id="submitButton")
	public static WebElement signin;
	

}
