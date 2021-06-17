package com.inetbanking.utilities;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	
	ReadConfig readConfig = new ReadConfig();
	public String url= readConfig.getSiteURL();
	public static WebDriver driver;
	public static Logger logger;
	
	/* work on it
	 * HashMap<String, By> elements = new HashMap<String, By>();
	 * 
	 * public void element(String name, By property) {
	 * elements.put(name.toLowerCase(), property); }
	 */
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser){
		
		logger = Logger.getLogger("SeleniumAutomationV1");
        BasicConfigurator.configure();
        
        if (browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
	        driver=new ChromeDriver();	
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
	        driver=new FirefoxDriver();
		}
		else 
		{
			logger.info("Wrong parameter for browser is passed");
		}
        
        driver.manage().window().maximize();
        
    }
	
	public boolean waitForElementToBeVisible(WebElement element, Long timeout) {
		//WebDriver
		return true;
	}
	
	@AfterClass
	public void  tearDown() {
		driver.quit();
	}

}
