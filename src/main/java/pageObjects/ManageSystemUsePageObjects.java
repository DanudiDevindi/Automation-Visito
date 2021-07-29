package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ManageSystemUsePageObjects extends TestBase {
	
	@FindBy(xpath="//*[@id=\"visitor\"]")
	WebElement input_searchSystemUser;
	
	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-system-users/div[2]/div[1]/form/div/div[2]/button")
	WebElement btn_SearchSystemUser;

	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-system-users/div[2]/div[2]/button")
	WebElement btn_addReceptionist;
	
	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-system-users/div[3]/div/table")
	WebElement tbl_SystemUser;
	
	@FindBy(xpath="/html/body/app-root/app-admin/div/div[2]/div[3]/div/div/div/div/div/div/app-manage-system-users/div[3]/div/table/tbody[1]/tr/td[9]/button")
	WebElement btn_edit;
	
	//add receptionist
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement input_firstNameAdd;
	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement input_mobileAdd;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement input_lastNameAdd;
	
	@FindBy(xpath="//*[@id=\"u_email\"]")
	WebElement input_emailAdd;
	
	@FindBy(xpath="//*[@id=\"nic\"]")
	WebElement input_nicAdd;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	WebElement input_userNameAdd;
	
	@FindBy(xpath="//*[@id=\"u_password\"]")
	WebElement input_passwordAdd;

    @FindBy(xpath="//*[@id=\"AddReceptionist\"]/div/div/div[2]/form/div[4]/div[2]/div/div/button")
	WebElement btn_Add;
	
    //edit system user 
    @FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement input_FirstNameUpdate;
    
    @FindBy(xpath="//*[@id=\"tel\"]")
	WebElement input_telephoneUpate;
  
    @FindBy(xpath="//*[@id=\"lastName\"]")
   	WebElement input_lastNameUpdate;

    @FindBy(xpath="//*[@id=\"email\"]")
   	WebElement input_emailUpdate;

    @FindBy(xpath="//*[@id=\"nicpassport\"]")
   	WebElement input_nicUpdate;
  
    @FindBy(xpath="//*[@id=\"flexCheckDefault\"]")
   	WebElement checkbox_usernamepw;
    
    @FindBy(xpath="//*[@id=\"update-username\"]")
   	WebElement input_usernameUpdate;
  
    @FindBy(xpath="//*[@id=\"password\"]")
   	WebElement input_passwordUpdate;
    
    @FindBy(xpath="//*[@id=\"customSwitch1\"]")
   	WebElement switch_active;
    
    @FindBy(xpath="//*[@id=\"editReceptionist\"]/div/div/div[2]/form/div[4]/div[2]/div/div[2]/div/div/button")
   	WebElement btn_update;
    
    
    public ManageSystemUsePageObjects() {
		 PageFactory.initElements(driver, this);
    }
 //user search
   public void enterDataSearchUser(HashMap<String, String> testData13)throws Exception{
   	input_searchSystemUser.sendKeys(testData13.get("Telephone"));
   }
  public void clicksearchButton()throws Exception {
	  btn_SearchSystemUser.click();
   }
   
  //add receptionist
  public void clickAddReceptionistButton()throws Exception {
	  btn_addReceptionist.click();
	  
  }
  public void addReceptionistData(HashMap<String, String> testData14) throws Exception {
	  Thread.sleep(2000);
	  input_firstNameAdd.sendKeys(testData14.get("FirstName"));
	  input_mobileAdd.sendKeys(testData14.get("Telephone"));
	  input_lastNameAdd.sendKeys(testData14.get("LastName"));
	  input_emailAdd.sendKeys(testData14.get("Email"));
	  input_nicAdd.sendKeys(testData14.get("NIC"));
	  input_userNameAdd.sendKeys(testData14.get("userName"));
	  input_passwordAdd.sendKeys(testData14.get("password"));
  }
  public void clickAddButton() throws Exception {
	  Thread.sleep(2000);
	  btn_Add.click();
  }
  
  //update receptionist
  public void clickEditReceptionistButton()throws Exception {
	 btn_edit.click();
	  
  }
  public void UpdateReceptionistData(HashMap<String, String> testData15) throws Exception{
	  Thread.sleep(2000);
	  input_FirstNameUpdate.clear();
	  input_FirstNameUpdate.sendKeys(testData15.get("UpdatedFName"));
  }
  public void clickUpdateButton() throws Exception {
	  Thread.sleep(2000);
	  btn_update.click();
	  
  }
 
  
	
	
	
	
	
}

