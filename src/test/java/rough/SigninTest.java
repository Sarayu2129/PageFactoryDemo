package rough;

import base.Page;
import pages.action.HomePage;
import pages.action.signinPage;

public class SigninTest {

	public static void main(String[] args)  {
		
		Page.initConfiguration();
		
		signinPage signin = Page.TopNav.gotoSignin();
		signin.doLogin("buddy150515@gmail.com", "sarayu2129");
		
		
		Page.quitBrowser();
		

	}

}
