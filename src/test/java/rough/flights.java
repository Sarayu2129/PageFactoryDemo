package rough;


import base.Page;
import pages.action.HomePage;

public class flights {

	public static void main(String[] args) throws InterruptedException {
		Page.initConfiguration();
	 HomePage home = new HomePage();
	 home.gotoFlights();
	home.bookAFlight("Delhi (DEL - Indira Gandhi Intl.)","Hyderabad (HYD - Rajiv Gandhi Intl.)", "04/02/2021", "04/03/2021");
	 Page.quitBrowser();
	 
}
}