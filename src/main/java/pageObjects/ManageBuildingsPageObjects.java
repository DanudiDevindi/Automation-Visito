package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ManageBuildingsPageObjects extends TestBase {
	

	@FindBy(xpath="//*[@id=\"visitor-building\"]")
	WebElement input_visitorBuildingSearch;
	
	@FindBy(xpath="//*[@id=\"building-visitor-search\"]")
	WebElement btn_building_visitor;
	
	@FindBy(xpath="//*[@id=\"btn-addbuilding\"]")
	WebElement btn_add_building;
	
	@FindBy(xpath="//*[@id=\"building-tbl\"]")
	WebElement tbl_building;
	
	@FindBy(xpath="//*[@id=\"btn-floor\"]")
	WebElement btn_floor;
	
	@FindBy(xpath="//*[@id=\"btn-building-edit\"]")
	WebElement btn_building_Edit;
	
	@FindBy(xpath="//*[@id=\"building-tbl\"]/tbody/tr/td[6]/button[1]")
	WebElement btn_EditRow1;
	
	@FindBy(xpath="//*[@id=\"building-tbl\"]/tbody/tr/td[6]/button[2]")
	WebElement btn_building_delete;
	
	@FindBy(xpath="//*[@id=\"building-tbl\"]/tbody/tr/td[6]/button[2]")
	WebElement btn_DeleteRow1;
	
	//add building modal
	
    @FindBy(xpath="//*[@id=\"buildingName\"]")
	WebElement input_buildingName;
    
    @FindBy(xpath="//*[@id=\"AddBuilding\"]/div/div/div[2]/form/div[2]/div[2]/div/div/button")
   	WebElement btn_add;
    
    //floor modal
 
    @FindBy(xpath="//*[@id=\"floorname\"]")
	WebElement input_floorName;
    
    @FindBy(xpath="//*[@id=\"add-floor-btn\"]")
 	WebElement btn_flooradd;
    
    @FindBy(xpath="//*[@id=\"floor-tbl\"]")
   	WebElement tbl_floor;
    
    @FindBy(xpath="//*[@id=\"editbtn\"]")
   	WebElement btn_floor_edit;
    
    @FindBy(xpath="//*[@id=\"floor-tbl\"]/tbody/tr/td[3]/button[1]")
   	WebElement btn_floor_editRow1;
    
    @FindBy(xpath="//*[@id=\"floor-tbl\"]/tbody/tr/td[3]/button[2]")
   	WebElement btn_floor_deleteROW1;
    
    @FindBy(xpath="//*[@id=\"update-floor-btn\"]")
   	WebElement btn_floor_update;
    
   //update building modal
    @FindBy(xpath="//*[@id=\"buildingNameupdate\"]")
   	WebElement input_buildingNameUpdate;
    
    @FindBy(xpath="//*[@id=\"building-updatebtn\"]")
   	WebElement btn_building_update;
    
  
  
  
    public ManageBuildingsPageObjects()throws Exception {
		PageFactory.initElements(driver, this);
     }
    	
    	
   //testing admin can search building
   	 public void enterDataForSearchBuilding(HashMap<String, String> testData5) throws Exception {
            input_visitorBuildingSearch.sendKeys(testData5.get("BuildingName"));   
   	    	
   	 }
   	 public void clicksearchButton()throws Exception {
   		 btn_building_visitor.click();
   		 
   	 }
   	 
   	 
   //testing add building
   	 public void clickaddBuildingButton()throws Exception {
   		btn_add_building.click();
   	 }
   	 public void enterDataforAddBuilding(HashMap<String, String> testData6)throws Exception{
   		 Thread.sleep(2000);
   		 input_buildingName.sendKeys(testData6.get("BuildingName"));
   		 
   	 }
   	 public void clickAddButton()throws Exception {
   		 Thread.sleep(2000);
   		btn_add.click();
   	 }
   	 
   	 
   	 //testing update building
   	 public void clickEditBuildingButton()throws Exception{
   		 btn_EditRow1.click();
   	 }
   	 public void enterDataforUpdateBuilding(HashMap<String, String>testData7)throws Exception{
   		 Thread.sleep(2000);
   		 input_buildingNameUpdate.clear();
   		 input_buildingNameUpdate.sendKeys(testData7.get("NewBuildingName"));
   		 
   	 }
   	 public void clickupdateButton()throws Exception {
   		 Thread.sleep(2000);
   		  btn_building_update.click();
   		 
   	 }
   	
   	 
   	 //testing add floor
   	 public void clickAddFloorButton()throws Exception {
   		 btn_floor.click();
   		 
   	 }
   	 public void enterDataAddFloor(HashMap<String, String>testData8)throws Exception {
   		 Thread.sleep(2000);
   		 input_floorName.sendKeys(testData8.get("floorName"));
   		 
   	 }
   	 public void clickaddButtonFloor() throws Exception {
   		 Thread.sleep(2000);
   		 btn_flooradd.click();
   		 
   	 }
   	 //testing update floor
   	 public void clickEditFloorButton()throws Exception {
   		 Thread.sleep(2000);
   		 btn_floor_editRow1.click();
     }
   	 public void enterDataUpdateFloor(HashMap<String, String>testData9)throws Exception{
   		 Thread.sleep(2000);
   		 input_floorName.clear();
   		 input_floorName.sendKeys(testData9.get("NewFloorname"));
   	 }
    public void clickUpdateFloorButton()throws Exception {
    	Thread.sleep(2000);
    	btn_floor_update.click();
    	
    }
	 //delete building
    public void clickDeleteBuildingButton()throws Exception {
    	btn_DeleteRow1.click();
    }
   	 //delete floor
	public void clickDeleteFloorButton()throws Exception {
		Thread.sleep(2000);
		btn_floor_deleteROW1.click();
	}
    
    


}
