package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
public class HomePageLocators {
	
	
	
	@FindBy(xpath="//*[@id='uitk-tabs-button-container']/li[2]/a")
	public static WebElement flightTab;
	
	@FindBy(xpath="//button[@aria-label='Leaving from']")
	public static WebElement leavingFrom;
	
	@FindBy(xpath="//button[@aria-label='Going to']")
	public static WebElement goingTo;
	
	@FindAll({
		
	   @FindBy(id="d1-btn"),
	   @FindBy(xpath="//button[normalize-space()='14 Apr']")
	})
	public static WebElement departing;
	
	   
	   @FindBys({
		@FindBy(xpath="//div[@class='uitk-layout-grid uitk-layout-grid-gap-three uitk-layout-grid-columns-small-4 uitk-layout-grid-columns-medium-6 uitk-layout-grid-columns-large-12 uitk-spacing uitk-spacing-padding-block-three']"),
		@FindBy(id="d2-btn")
	})
	
	public static WebElement returning;
	
	
	
	@FindBy(xpath="//button[@data-testid='submit-button']")
	public static WebElement search;
	
	@FindBy(xpath="//a[@role='tab']")
	public static List<WebElement> tabCount;
	
	

}
