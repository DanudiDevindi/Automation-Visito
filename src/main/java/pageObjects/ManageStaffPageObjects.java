package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class ManageStaffPageObjects extends TestBase {
	

	@FindBy(xpath="//*[@id=\"visitor\"]")
	WebElement input_searchStaff;
	
    @FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-staff/div[2]/div[1]/form/div/div[2]/button")
	WebElement btn_searchStaff;
	
    @FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-staff/div[2]/div[2]/button")
	WebElement btn_AddEmployee;
    
    @FindBy(xpath="//*[@id=\"staff-table\"]/tbody[1]/tr/td[7]/button")
	WebElement btn_EditStaff;
    
   
	
    //add employee modal
    
    @FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement input_FirstNameAdd;
    
    @FindBy(xpath="//*[@id=\"telephone\"]")
	WebElement input_tpAdd;
    
    @FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement input_lastNameAdd;
    
    @FindBy(xpath="//*[@id=\"emp_email\"]")
	WebElement input_emailAdd;
    
    @FindBy(xpath="//*[@id=\"emp_designation\"]")
  	WebElement input_designationAdd;
    
    @FindBy(xpath="//*[@id=\"emp_nic\"]")
  	WebElement input_nicAdd;
    
    @FindBy(xpath="//*[@id=\"AddEmployee\"]/div/div/div[2]/form/div[4]/div[2]/div/div/button")
  	WebElement btn_Add;
    
    //edit employee modal
    @FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement input_FirstNameedit;
    
    @FindBy(xpath="//*[@id=\"tel\"]")
  	WebElement input_tpdit;
    
    @FindBy(xpath="//*[@id=\"lastName\"]")
  	WebElement input_lastnameedit;
    
    @FindBy(xpath="//*[@id=\"email\"]")
  	WebElement input_emailedit;
    
    @FindBy(xpath="//*[@id=\"designation\"]")
  	WebElement input_designationedit;
    
    @FindBy(xpath="//*[@id=\"nicpassport\"]")
  	WebElement input_nicedit;
    
    @FindBy(xpath="//*[@id=\"editemployee\"]/div/div/div[2]/form/div[4]/div[2]/div/div[2]/div/div/button")
  	WebElement btn_edit;
    
    public ManageStaffPageObjects() {
		 PageFactory.initElements(driver, this);
     }
  //staff search
    public void enterDataSearch(HashMap<String, String> testData10)throws Exception{
    	input_searchStaff.sendKeys(testData10.get("Telephone"));
    }
    public void clickstaffSearchbutton()throws Exception {
//    	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn next-btn p-btn'][normalize-space()='Add Project']"))).click();
    	btn_searchStaff.click();
    }
    
    //add new employee
    public void clickAddEmployeeButton()throws Exception {
    	btn_AddEmployee.click();
    }
    public void enterDataAdd(HashMap<String, String> testData11)throws Exception{
    	Thread.sleep(2000);
    	input_FirstNameAdd.sendKeys(testData11.get("FirstName"));
    	input_tpAdd.sendKeys(testData11.get("Telephone"));
    	input_lastNameAdd.sendKeys(testData11.get("LastName"));
    	input_emailAdd.sendKeys(testData11.get("Email"));
    	input_designationAdd.sendKeys(testData11.get("Designation"));
    	input_nicAdd.sendKeys(testData11.get("NIC"));
    }
    public void clickAddButton()throws Exception {
    	Thread.sleep(2000);
    	btn_Add.click();
    	
    }
    
    //update employee
    public void clickeditButton()throws Exception {
    	Thread.sleep(2000);
    	btn_EditStaff.click();
    }
    
    public void enterDataUpdate(HashMap<String, String> testData12) throws Exception{
    	Thread.sleep(2000);
   	    input_FirstNameedit.clear();
    	input_FirstNameedit.sendKeys(testData12.get("UpdatedFName"));
   	    input_designationedit.clear();
    	input_designationedit.sendKeys(testData12.get("UpdatedDesignation"));
    }
    public void clickUpdateButton()throws Exception {
    	Thread.sleep(2000);
    	btn_edit.click();
    	
    }
 
    
    
    
    
    
    
    
    
    
    
}