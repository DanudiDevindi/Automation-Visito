package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class OverdueCheckedInPageObjects extends TestBase {
	
	@FindBy(xpath="//*[@id=\"overdue-serch-input\"]")
	WebElement input_overdueSearch;
	
	@FindBy(xpath="//*[@id=\"overdue-search-btn\"]")
	WebElement btn_overdueSearch;
	
    @FindBy(xpath="//*[@id=\"overdue-table\"]")
	WebElement tbl_overdue;
    
    @FindBy(xpath="//*[@id=\"overdue-checkout-btn\"]")
   	WebElement btn_overdue_checkout;
    
    @FindBy(xpath="//*[@id=\"overdue-table\"]/tbody[1]/tr/td[1]/button")
   	WebElement btnCheckout_row1;
    
    
    public OverdueCheckedInPageObjects() {
 	   PageFactory.initElements(driver, this);
     }
 	
 	//receptionist can checkout visitors
 	 public void enterCheckedIndata(HashMap<String , String> testData4) throws Exception {
 		 input_overdueSearch.sendKeys(testData4.get("visitor_NIC"));
 		 
 	 }
 		 
 		//click search button
 		 public void clickCheckedSearchButton() throws Exception  {
 			 btn_overdueSearch.click();
 		 }
 		 
 		 public void clickCheckoutButton()throws Exception{
 			 btnCheckout_row1.click();
 		 }


}
