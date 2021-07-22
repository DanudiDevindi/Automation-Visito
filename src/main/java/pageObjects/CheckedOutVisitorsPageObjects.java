package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class CheckedOutVisitorsPageObjects extends TestBase {
	
	@FindBy(xpath="//*[@id=\"checkoutvisitor-datepicker\"]")
	WebElement datepicker_checkoutVisitor;
	
	@FindBy(xpath="//*[@id=\"checkedoutvisitor-search-input\"]")
	WebElement input_checkedoutvisitor_search;
	
	@FindBy(xpath="//*[@id=\"checkoutvisitor-serch-btn\"]")
	WebElement btn_checkedout_search;
	
	@FindBy(xpath="//*[@id=\"checkedout-visitor-table\"]/tbody[1]/tr")
	WebElement tbl_checkedout_row;
	
	@FindBy(xpath="//*[@id=\"checkedout-visitor-table\"]/thead/tr/th[1]")
	WebElement tbl_checkedout_coloum;
	

	 //constructor- use init element method
     public CheckedOutVisitorsPageObjects()throws Exception {
    	PageFactory.initElements(driver, this);
		
	}
     
    //receptionist can check visit History
	 public void enterCheckedOutData(HashMap<String , String> testData1) throws Exception {
	       datepicker_checkoutVisitor.sendKeys(testData1.get("visitDate"));
		   input_checkedoutvisitor_search.sendKeys(testData1.get("VisitorNIC"));
		   
	 }
	 
	//click search button
	 public void clickCheckedSearchButton() throws Exception  {
		 btn_checkedout_search.click();
	 }
	 
}
