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
	
	@FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[2]/ul[2]/li/a")
	WebElement li_checkedInVisitor;
	
	@FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[2]/ul[4]/li/a")
	WebElement li_overdueChekedIn;
	
	@FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[1]/ul[4]/li/a")
	WebElement li_manageBuildings;
	
    @FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[1]/ul[2]/li/a")
	WebElement li_manageStaff;
    
    @FindBy(xpath="//*[@id=\"main_navbar\"]/div[2]/perfect-scrollbar/div/div[1]/div[1]/ul[3]/li/a")
	WebElement li_mangeSystemUser;
    
  
	
	
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
    public void clickCheckedInVisitors() {
    	li_checkedInVisitor.click();
    }
    public void clickOverdueCheckedInVisitors() {
    	li_overdueChekedIn.click();
    }
    public void clickManageBuildings() {
    	li_manageBuildings.click();
    }
    public void clickManageStaff() {
    	li_manageStaff.click();
    }
    public void clickManageSystemUsers() {
    	li_mangeSystemUser.click();
    }
}
