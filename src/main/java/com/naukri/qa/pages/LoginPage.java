package com.naukri.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naukri.qa.base.TestBase;

public class LoginPage extends TestBase{
	  
	
	
	
	
	//Page Factory or Object Repository
	
	@FindBy(xpath="//div[(text()='Login')]")
	WebElement login;
	
	@FindBy(xpath="//a[(@class='socialBtn fb processed')]")
	public
			WebElement facebookicon;
	
	@FindBy(xpath="//a[(@class='socialBtn goog processed')]")
	WebElement googleicon;
	
	@FindBy(xpath="//input[(@name='email')]")
	WebElement Username;
	
	@FindBy(xpath="//input[(@name='PASSWORD')]")
	WebElement password;
	
	@FindBy(xpath="//button[(text()='Login')]")
	WebElement loginbutton;
	

//initializing webelements or objects

      public LoginPage(){
    	  
		PageFactory.initElements(driver, this);
      }
    	  
//Actions

     public String ValidateLoginPageTitle(){
    	System.out.println("test");
    	return driver.getTitle();
     }
      
      
     public void LoginPopup(){ 	
    	 login.click();
    	 /*Alert alert=driver.switchTo().alert();
    	 System.out.println(alert.getText());
    	 alert.accept();*/
    	 
     }  

/*
        public boolean FBLoginLink(){
        	if(driver.findElement(By.xpath("facebookicon")).getSize() != null)
        	{
        		return true; 
        		}
        		    } 
        

        public boolean GoogleLoginLink(){
        	
            return googleicon.isDisplayed();
*/
        
        //As it is landing to ProfilePage, make return time as ProfilePage and method type as ProfilePage type , 
       // so that it returns all ProfilePage class objects
        public ProfilePage Login(String UN, String Pwd) throws InterruptedException{
        	Thread.sleep(3000);
        	Username.sendKeys(UN);
        	Thread.sleep(3000);
        	password.sendKeys(Pwd);
        	Thread.sleep(3000);
        	loginbutton.click();
        	return new ProfilePage();
        }	
       }