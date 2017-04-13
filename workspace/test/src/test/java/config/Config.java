package config;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Config {
	
	
//	private static final String CHROME_DRIVER_URL = "/resources/chromedriver.exe";
	private static final String CHROME_DRIVER = "webdriver.chrome.driver";
	private WebDriver driver;
	private String baseUrl;
	
	File chromeDriver = new File("resources/chromedriver.exe");
	String absolutePath = chromeDriver.getAbsolutePath();
	
	public Boolean SetUp(String baseUrl)
	{
		System.setProperty(CHROME_DRIVER, absolutePath);
		//FirefoxDriver driverFirefox = new FirefoxDriver();
		ChromeDriver driverChrome = new ChromeDriver();
	    this.baseUrl = baseUrl;
	    //this.driver = driverFirefox;
	    this.driver = driverChrome;
	    //driverFirefox.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driverFirefox.get(baseUrl);	  
	   // this.driver = driverChrome;
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.get(baseUrl);	    
	    return true;
	}
	
	public String getValueUrl(){
		
		return baseUrl;
	}
	
	public WebDriver getValueDriver(){
		
		return driver;
	}

}
