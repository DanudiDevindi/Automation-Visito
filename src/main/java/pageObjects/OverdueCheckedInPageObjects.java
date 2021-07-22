package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

}
