package com.naukri.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naukri.qa.base.TestBase;

public class AddEmploymentPage extends TestBase{  

	
	@FindBy(xpath="//span[(text()='ADD EMPLOYMENT')]")
	WebElement addemployment;
	
	@FindBy(id="designationSugg")
	WebElement yourDesignation;
	
	@FindBy(id="companySugg")
	WebElement yourOrganization;
	
	@FindBy(xpath="//label[(text()='Yes')]")
	WebElement currentCompany;
	
	@FindBy(xpath="//input[@id='startedYearFor']")
	WebElement startedYear;
	
	@FindBy(xpath="//input[@id='startedMonthFor']")
	WebElement startedMonth;
	
	@FindBy(xpath="//div[text()='Present'])]")
	WebElement worrkedtill;
	
	@FindBy(xpath="//textarea [@id='jobDescription']")
	WebElement jobDescription;
	
	@FindBy(xpath="//input [@id='noticePeriodFor']")
	WebElement noticePeriod;
	
	@FindBy(xpath="//button [@id='submitEmployment']")
	WebElement submitEmployment;
	
	
	
	
	
			
}
