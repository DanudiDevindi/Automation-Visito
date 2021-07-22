package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPageObjects extends TestBase{
	
	@FindBy(xpath="//*[@id=\"login-username\"]")
	WebElement input_username;
	
	@FindBy(xpath="//*[@id=\"login-password\"]")
	WebElement input_password;
	
	@FindBy(xpath="//*[@id=\"login-btn\"]")
	WebElement btn_loginbtn;
	
	@FindBy(xpath="//*[@id=\"link-fogotpass\"]")
	WebElement link_fogotPW;
	
	
	 //constructor- use init element method
     public LoginPageObjects() {
		// TODO Auto-generated constructor stub
    	 PageFactory.initElements(driver, this);
     }
    	
    	
   //Testing admin can login using valid username and password
   	 public void enterLoginData(HashMap<String, String> testData) throws Exception {
               input_username.sendKeys(testData.get("userName"));
   	    	   input_password.sendKeys(testData.get("Password"));
   	    	
   	}
    
	 //click login button
	 public void clickloginButton() {
		 btn_loginbtn.click();
	 }
	 

}
