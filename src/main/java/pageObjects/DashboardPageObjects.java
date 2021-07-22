package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class DashboardPageObjects extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[2]/ul[1]/li/a")
	WebElement li_checkinvisitor;
	
	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/nav/div/div[2]/div/ul[2]/li/a")
	WebElement li_login;
	
	@FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[2]/ul[3]/li/a")
	WebElement li_checkedOutVisitor;
	
	 //constructor- use init element method
        public DashboardPageObjects  () {
    	PageFactory.initElements(driver, this);
    	
    }
    
    //for click on check in visitor link
    public void clickCheckInVisitorLink() {
    	li_checkinvisitor.click();
    }
    
    public void clickLoginLink() {
    	li_login.click();
    }
    
    public void clickChekedOutVisitors() {
    	li_checkedOutVisitor.click();
    }
}
