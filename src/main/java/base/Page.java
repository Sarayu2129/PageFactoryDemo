 package base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.action.TopNavigation;
import utilities.ExcelReader;
import utilities.ExtentReportTest;

public class Page {
	
	/*WebDriver
	 * 
	 * 
	 * 
	 * 
	 */

	
	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\PageObjectTest.xlsx");
   public static  Logger log =Logger.getLogger("devpinoyLogger");
   public static FileInputStream fis;
   public static WebDriverWait wait;
   public static ExtentTest test;
   public ExtentReports Report = ExtentReportTest.getInstance();
   public static String browser;
   public static TopNavigation TopNav;
   
   public static void initConfiguration(){
	   if(Constants.browser.equals("chrome")){
		  // driver = new ChromeDriver();
		   System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir"+"\\src\\test\\resources\\executables\\chromedriver.exe")); 
			 Map<String,Object> prefix = new HashMap<String,Object>();
			  prefix.put("profile.default_content_setting_values.notification",2);
			  prefix.put("credentials_enable_service",false);
			  prefix.put("profile.password_manager_enable", false);
			  ChromeOptions options = new ChromeOptions();
			  options.setExperimentalOption("prefix", prefix);
			  options.addArguments("--disable-entensions");
			  options.addArguments("--disable-infobars");
			  driver = new ChromeDriver(options);
		   log.debug("Launched Chrome Driver ");
		   
	   }else if(Constants.browser.equals("firefox")){
		   WebDriverManager.firefoxdriver().setup();
			System.getProperty("webdriver.firefox.driver",System.getProperty("user.dir"+"\\src\\test\\resources\\executables\\geckodriver.exe")); 
			driver = new FirefoxDriver();
			log.debug("Firefox Browser Launched!!!");
	   }else if(Constants.browser.equals("edge")){
		   WebDriverManager.edgedriver().setup();
			  System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\Excecutables\\msedgedriver.exe");
			 
			  Map<String,Object> prefix = new HashMap<String,Object>();
			  prefix.put("profile.default_content_setting_values.notification",2);
			  prefix.put("credentials_enable_service",false);
			  prefix.put("profile.password_manager_enable", false);
			  EdgeOptions options = new EdgeOptions();
			//  options.setExperimentalOption("prefix", prefix);
			//  options.addArguments("--disable-entensions");
			////  options.addArguments("--disable-infobars");
			 // driver = new ChromeDriver(options);
			  driver = new EdgeDriver(options);
			  log.debug("Edge  Browser Launched!!!");
	   }
	   driver.get(Constants.testsiteurl);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
	   
	   TopNav = new TopNavigation(driver);
   }
      public static void quitBrowser(){
	   driver.quit();
	   
   }
   public static void click(WebElement element){
	   
	   element.click();
	   log.debug("Clicking on the element :"+element);
		test.log(LogStatus.INFO, "Clicking on :"  +element);
	   
   }
   public static void type(WebElement element,String value){
	   
	   element.sendKeys(value);
	   log.debug("Typing in an element:"+element+"Entered values as :" +value);
	   test.log(LogStatus.INFO, "Typing in :"+element + "Entered value as :"+value);
   }
   


}
