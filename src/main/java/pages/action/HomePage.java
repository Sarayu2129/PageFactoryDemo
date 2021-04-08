package pages.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pages.locators.HomePageLocators;

public class HomePage extends Page {

	public HomePageLocators home;
	public HomePage(){
		this.home= new HomePageLocators(); 
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
	}
	 
	public void gotoFlights(){
		click(home.flightTab);
		
	}
	public void gotoHotels(){
		
	}
	public void bookAFlight(String from,String to,String checkIn,
			String checkOut) throws InterruptedException{
		
		type(home.leavingFrom,from);
		//home.leavingFrom.sendKeys(from,Keys.ENTER);
		//home.goingTo.sendKeys(to,Keys.ENTER);
		type(home.goingTo,to);
		type(home.departing,checkIn);
		
		//home.departing.sendKeys(checkIn,Keys.ENTER);
		type(home.returning,checkOut);
		//home.returning.sendKeys(checkOut,Keys.ENTER);
		//home.travellers.sendKeys(travellers);
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ESCAPE).perform();
		//action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		click(home.search);
		
		
	}
	
	public int finfTabCount(){
		return home.tabCount.size();
	}
	
}
