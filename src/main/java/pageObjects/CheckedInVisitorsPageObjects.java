package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath="//*[@id=\"CheckedInVisitor-table\"]/tbody[1]/tr[1]/td/button")
	WebElement btn_firstRowCheckout;
	
	 public CheckedInVisitorsPageObjects() {
	   PageFactory.initElements(driver, this);
    }
	
	//receptionist can checkout visitors
	 public void enterCheckedIndata(HashMap<String , String> testData3) throws Exception {
		 input_CheckedInVisitor_search.sendKeys(testData3.get("visitor_NIC"));

	 }
		 
		//click search button
		 public void clickCheckedSearchButton() throws Exception  {
			 btn_CheckedInVisitor_search.click();
		 }
		 
		 public void clickCheckoutButton()throws Exception{
			 btn_checkoutbtn_checkedInVisitor.click();
		 }

}
