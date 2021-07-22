package pageObjects;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBase;

public class CheckInVisitorPageObjects extends TestBase {
	
//WebDriver driver = new ChromeDriver();
	
	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-check-in-visitors/div[2]/div/div[1]/form/div[2]/div/div/ng-autocomplete/div/div[1]/input")
	public WebElement searchbleCombo_staffMember;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement input_staffname;
	
	@FindBy(xpath="//*[@id=\"telephoneNo\"]")
	WebElement input_tpno;
	
	@FindBy(xpath="//*[@id=\"designation\"]")
	WebElement input_designation;
	
	@FindBy(xpath="//*[@id=\"email-staff\"]")
	WebElement input_employeeEmail;
	
	@FindBy(xpath="//*[@id=\"building\"]")
	WebElement select_building;
	
    @FindBy(xpath="//*[@id=\"floor\"]")
	WebElement select_floor;
    
    @FindBy(id="visitPurpose")
   	WebElement select_purpose;
    
    @FindBy(id="visitor")
   	WebElement search_visitor;
    
    @FindBy(xpath="//*[@id=\"search-btn\"]")
   	WebElement btn_visitorsearch;
    
    @FindBy(id="firstName")
   	WebElement input_firstName;
    
    @FindBy(id="lastName")
   	WebElement input_lastName;
    
    @FindBy(id="nicPassport")
   	WebElement input_nicPassport;
    
    @FindBy(id="mobile")
   	WebElement input_mobile;
    
    @FindBy(id="email-visitor")
   	WebElement input_visitorEmail;
    
    @FindBy(id="card")
   	WebElement select_curd;
    
    @FindBy(id="add-to-list-btn")
   	WebElement btn_addToList;
    
    @FindBy(id="visitor-details-table")
   	WebElement tble_visitorDetails;
    
    @FindBy(xpath="//*[@id=\"visitor-submit-button\"]")
   	WebElement btn_submit;
    
    
    
   //constructor- use init element method
    public CheckInVisitorPageObjects () {
    	PageFactory.initElements(driver, this);
    	
    }
    
    public void enterStaffMember(String staffMember) {
    	searchbleCombo_staffMember.sendKeys(staffMember);
    	
    }
    
    public List<String> getDropdownOption_buildingDropdown() {
    	return cm.getDropdownOptionsAsList(select_building);
    }
    public List<String> getDropdownOption_floorDropdown() {
    	return cm.getDropdownOptionsAsList(select_floor);
    }
	
    //enter visitors data
    public void enterCheckInVisitorsData(HashMap<String, String> testData2 ) throws Exception {
//      searchbleCombo_staffMember.sendKeys(testData2.get("staffMember"));
//	     input_staffname.sendKeys(testData2.get("staffName"));
//	    input_tpno.sendKeys(testData2.get("staffTP"));
//	    input_designation.sendKeys(testData2.get("designation"));
//	    input_employeeEmail.sendKeys(testData2.get("staffEmail"));
    	cm.selectDropdownData(select_building, testData2.get("building"));
//    	cm.selectDropdownData(select_floor, testData2.get("floor"));
//    	cm.selectDropdownData(select_purpose, testData2.get("purpose"));
//    	input_nicPassport.sendKeys(testData2.get("visitorNIC"));
//    	input_firstName.sendKeys(testData2.get("Firstname"));
//    	input_lastName.sendKeys(testData2.get("Lastname"));
//    	input_nicPassport.sendKeys(testData2.get("NIC"));
//    	input_mobile.sendKeys(testData2.get("mobile"));
//    	input_visitorEmail.sendKeys(testData2.get("email"));
//    	cm.selectDropdownData(select_curd, testData2.get(""));
    	
    }
    
    public void clickOnAddToListButton()throws Exception {
    	btn_addToList.click();
    }
    public void clickOnSubmitButton()throws Exception {
    	btn_submit.click();
    }
	
	

}
