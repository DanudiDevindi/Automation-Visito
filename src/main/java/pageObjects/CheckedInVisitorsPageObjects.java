package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.TestBase;

public class CheckedInVisitorsPageObjects extends TestBase {
	
	@FindBy(xpath="//*[@id=\"visitor-checkedIn\"]") 
	WebElement input_CheckedInVisitor_search;
	
	@FindBy(xpath="//*[@id=\"checked-in-search-btn\"]")
	WebElement btn_CheckedInVisitor_search;
	
	@FindBy(xpath="//*[@id=\"CheckedInVisitor-table\"]")
	WebElement tbl_checkedInVisitor;
	
	@FindBy(xpath="//*[@id=\"checkoutbtn-checkedInVisitor\"]")
	WebElement btn_checkoutbtn_checkedInVisitor;
	
	
	

}
