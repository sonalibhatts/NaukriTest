package com.naukri.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.pages.ProfilePage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		 loginpage=new LoginPage();
	}
	
	
		@Test(priority=1)
		public void LoginPageTitleTest() throws InterruptedException {
			System.out.println("test1");
			String title=loginpage.ValidateLoginPageTitle();
			Thread.sleep(3000);
			Assert.assertEquals(title, "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		
		}
	
		@Test(priority=2)
		public void LoginPopupTest(){
			loginpage.LoginPopup();
		}
		
	/*	@Test(priority=3)
		public void FBLoginLinkTest(){
			//boolean flag=loginpage.GoogleLoginLink();
			Assert.assertTrue(loginpage.facebookicon);
		}
		
		@Test(priority=4)
		public void GoogleLoginLinkTest(){
			boolean flag=loginpage.GoogleLoginLink();
			Assert.assertTrue(flag);
		}*/
		
		@Test(priority=5)
		
		
			
		public void  LoginTest() throws InterruptedException{
			loginpage.LoginPopup();
			 ProfilePage profilepage = loginpage.Login(prop.getProperty("UN"),prop.getProperty("Pwd"));
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//before calling Initialization i have to initialize properties class as we are using 'prop' in  Initialization method, 
//hence create a constructor and call the parent method with super keyword.	
//	WebDriver driver;
////	LoginPage loginpage;
//	ProfilePage profilepage;
//	Properties prop;
//	public LoginPageTest(){
//		super();//properties will be defined
//	}	
//	
//	
//	LoginPage loginpage=new LoginPage();
//		@BeforeMethod
//		public void setup(){
//			initialization();//launch browser n dlt cookies etc
//		System.out.println("before method")	;
//			
//	}
//		@Test
//		public void test1(){
//			System.out.println("test");
//		}
//
//		@Test(priority=1)
//		
//		public void LoginPageTitleTest() {
//			System.out.println("test1");
//			String title=loginpage.ValidateLoginPageTitle();
//			Assert.assertEquals(title, "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
//		}
//		
//		@Test(priority=2)
//		public void LoginPopupTest(){
//			loginpage.LoginPopup();
//		}
//		
//		@Test(priority=3)
//		public void FBLoginLinkTest(){
//			boolean flag=loginpage.GoogleLoginLink();
//			Assert.assertTrue(flag);
//		}
//		
//		@Test(priority=4)
//		public void GoogleLoginLinkTest(){
//			boolean flag=loginpage.GoogleLoginLink();
//			Assert.assertTrue(flag);
//		}
//		
//		@Test(priority=5)
//		public void  LoginTest(){
//			profilepage=loginpage.Login(prop.getProperty("UN"),prop.getProperty("Pwd"));
//		}
//		@AfterMethod
//		public void tearDown(){
//			driver.quit();
//		}


