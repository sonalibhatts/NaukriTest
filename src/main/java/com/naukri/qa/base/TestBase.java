package com.naukri.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.naukri.qa.util.TestUtil;

public  class TestBase {
//	WebDriver driver; 
// 
//  Properties prop=new Properties();
//	
//	public TestBase(){
//	 try{
//	 
//     
//	 FileInputStream ip=new FileInputStream("C:/Selenium/SeleniumProject/NaukriTest/src/main/java/com/naukri"+"/qa/config/config.properties");
//	 prop.load(ip);
//	 }
//	 catch(FileNotFoundException e){
//		 e.printStackTrace();
//	 }
//		 catch(IOException e){
//			 e.printStackTrace();
//		 }
//	 }
//	 
//	 
//	public void initialization(){
//		
//String BrowserName=prop.getProperty("Browser");
//if(BrowserName.equals("chrome")){
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\sbhattacharjee\\OneDrive\\Selenium\\chrome\\chromedriver.exe");
//	driver=new ChromeDriver();
//}
//else if(BrowserName.equals("FF")){
//	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.23.0-win64\\geckodriver.exe");
//    driver=new FirefoxDriver();
//}
//	 
//	 
//	 
//     driver.manage().window().maximize();
//     driver.manage().deleteAllCookies();
//     driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//     driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
//	 
//	 driver.get(prop.getProperty("URL"));
//	 
//	 
//
// 
// 
// 
// }
//}
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/Selenium/SeleniumProject/NaukriTest/src/main/java/com/naukri"+"/qa/config/config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	public static void initialization() {
		String browserName=prop.getProperty("Browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbhattacharjee\\OneDrive\\Selenium\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.geco.driver", "C:\\Program Files\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
//		driver.manage().timeouts().pageLoadTimeout(Util.Page_Load_Timeout, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Util.Implicit_Wait, TimeUnit.SECONDS);
//		
	}

}

