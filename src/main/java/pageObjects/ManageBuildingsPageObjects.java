package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(xpath="//*[@id=\"building-tbl\"]/tbody/tr/td[6]/button[2]")
	WebElement btn_building_delete;
	
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
    
    @FindBy(xpath="//*[@id=\"floor-delete-btn\"]")
   	WebElement btn_floor_delete;
    
    @FindBy(xpath="//*[@id=\"update-floor-btn\"]")
   	WebElement btn_floor_update;
    
   //update building modal
    @FindBy(xpath="//*[@id=\"buildingNameupdate\"]")
   	WebElement input_buildingNameUpdate;
    
    @FindBy(xpath="//*[@id=\"building-updatebtn\"]")
   	WebElement btn_building_update;
    
    
    
    
    


}
