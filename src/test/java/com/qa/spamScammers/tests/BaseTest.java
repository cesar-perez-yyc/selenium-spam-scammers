package com.qa.spamScammers.tests;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.spamScammers.pages.Page;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	public void SetUp() {
		if(driver==null) {
			//Chrome
			Map<String,Object> prefs = new HashMap<String, Object>();
			prefs.put ("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put( "profile. password _ manager _ enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);		//This only works for Chrome
			options.addArguments("--disable-extensions") ;
			options.addArguments("--disable-infobars") ;
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver(options);
			
			//Firefox
			/*FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference(“permissions.default.desktop-notification”, 1);
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver(capabilities);*/
			
			//Old way of declaring Waits and Maximize
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://movilcentral.com/wp-admin/Sgine");
			
			//New way of declaring Waits and Maximize
			//wait = new WebDriverWait(driver, 10);
			//driver.manage().window().fullscreen();
			//driver.get("https://movilcentral.com/wp-admin/Sgine");
			//try {
			//	Thread.sleep(5000);
			//} catch (InterruptedException e) {
			//	e.printStackTrace();
			//}
			
			//Creating the object of the page class: Instantiate Page Class
			page = new Page(driver, wait);
						
		}
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
}
