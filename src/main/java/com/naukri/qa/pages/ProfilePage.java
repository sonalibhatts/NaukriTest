package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naukri.qa.base.TestBase;

public class ProfilePage  extends TestBase{ 

	
	
	@FindBy(xpath="//div[text()='My Naukri'])]")
	WebElement mynaukri;
	
	@FindBy(xpath="//a[(text()='Edit Profile')]")
	WebElement editprofile;
	
	@FindBy(xpath="//span[@title='Quality Analyst']//..//span[contains(text(), 'Edit')]")
	WebElement editicon;
	
	@FindBy(xpath="//a[(text()='DELETE')]")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	WebElement delete;
	
	
	
	
}	
	

