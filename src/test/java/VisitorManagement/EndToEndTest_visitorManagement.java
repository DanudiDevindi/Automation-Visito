package VisitorManagement;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelComponents;
import testBase.TestBase;


public class EndToEndTest_visitorManagement extends TestBase{
	
	private static final By Rowtable = null;
	ExcelComponents excel = new ExcelComponents("visitorManage");
	ExcelComponents exChekout = new ExcelComponents("CheckedOut");
	ExcelComponents exChekIn = new ExcelComponents("CheckInVisitors"); 
	ExcelComponents exChekedIn = new ExcelComponents("CheckedIn");
	ExcelComponents exOverdue = new ExcelComponents("Overdue");
	ExcelComponents exBuilding = new ExcelComponents("manageBuilding");
	ExcelComponents exStaff = new ExcelComponents("Staff");
	ExcelComponents exsysuser = new ExcelComponents("SystemUser");
	
	
	
	//login
		@Test(dataProvider = "loginData" , priority = 1)
		public void visitorManagemet_Login(Object obj) throws Exception {
	        HashMap<String, String>  testData = (HashMap<String, String>) obj;
			System.out.println("testdata" +testData);
			test.log(Status.INFO, "Test data execution from"+ testData);
			dashboard.clickLoginLink();
			login.enterLoginData(testData);
			login.clickloginButton();
			String actualUrl="http://localhost:4200/dashboard"; 
			String expectedUrl= driver.getCurrentUrl(); if(actualUrl.equalsIgnoreCase(expectedUrl)) { 
			System.out.println("Test passed"); } else { System.out.println("Test failed"); }    
			
    }
		
    //manage staff 
	@Test(dataProvider = "managestaff" , priority = 2)
	public void visitorManagement_SearchStaff(Object obj10)throws Exception{
		HashMap<String, String>  testData10 = (HashMap<String, String>) obj10;
		System.out.println("testdata" +testData10);
		test.log(Status.INFO, "Test data execution from"+ testData10);
		dashboard.clickManageStaff();
	    staff.enterDataSearch(testData10);
		staff.clickstaffSearchbutton();
	}
	
	@Test(dataProvider = "managestaff")
	public void visitorManagement_AddStaff(Object obj11)throws Exception{
		HashMap<String, String>  testData11 = (HashMap<String, String>) obj11;
		System.out.println("testdata" +testData11);
		test.log(Status.INFO, "Test data execution from"+ testData11);
		dashboard.clickManageStaff();
		staff.clickAddEmployeeButton();
		staff.enterDataAdd(testData11);
		staff.clickAddButton();
	}
	@Test(dataProvider = "managestaff")
	public void visitormanagement_EditStaff(Object obj12)throws Exception{
		HashMap<String, String>  testData12 = (HashMap<String, String>) obj12;
		System.out.println("testdata" +testData12);
		test.log(Status.INFO, "Test data execution from"+ testData12);
		dashboard.clickManageStaff();
		staff.clickeditButton();
		staff.enterDataUpdate(testData12);
		staff.clickUpdateButton();
		
	}
	
	//manage system user
	@Test(dataProvider = "managesystemuser" , priority = 2)
	public void visitManagement_SearchSystemUser(Object obj13) throws Exception{
		HashMap<String, String>  testData13 = (HashMap<String, String>) obj13;
		System.out.println("testdata" +testData13);
		test.log(Status.INFO, "Test data execution from"+ testData13);
		dashboard.clickManageSystemUsers();
		sysuser.enterDataSearchUser(testData13);
		sysuser.clicksearchButton();
	}
	
	@Test(dataProvider = "managesystemuser")
	public void visitManagement_AddReceptionist(Object obj14) throws Exception{
		HashMap<String, String>  testData14 = (HashMap<String, String>) obj14;
		System.out.println("testdata" +testData14);
		test.log(Status.INFO, "Test data execution from"+ testData14);
		dashboard.clickManageSystemUsers();
		sysuser.clickAddReceptionistButton();
		sysuser.addReceptionistData(testData14);
		sysuser.clickAddButton();
	}
	
	@Test(dataProvider = "managesystemuser")
	public void visitManagemet_UpdateReceptionist(Object obj15) throws Exception{
		HashMap<String, String>  testData15 = (HashMap<String, String>) obj15;
		System.out.println("testdata" +testData15);
		test.log(Status.INFO, "Test data execution from"+ testData15);
		dashboard.clickManageSystemUsers();
		sysuser.clickEditReceptionistButton();
		sysuser.UpdateReceptionistData(testData15);
		sysuser.clickUpdateButton();
		
	}
	
	//manage buildings
	@Test(dataProvider = "manageBuildings")
	public void visitmanagement_ManageBuildings(Object obj5)throws Exception{
		HashMap<String, String>  testData5 = (HashMap<String, String>) obj5;
		System.out.println("testdata5" +testData5);
		test.log(Status.INFO, "Test data execution from"+ testData5);
		dashboard.clickManageBuildings();
		building.enterDataForSearchBuilding(testData5);
        building.clicksearchButton();
		
	}
	
	@Test(dataProvider = "manageBuildings" )
	public void VisitorManagement_AddBuilding(Object obj6)throws Exception{
		HashMap<String, String>  testData6 = (HashMap<String, String>) obj6;
		System.out.println("testdata6" +testData6);
    	test.log(Status.INFO, "Test data execution from"+ testData6);
    	dashboard.clickManageBuildings();
    	building.clickaddBuildingButton();
    	building.enterDataforAddBuilding(testData6);
     	building.clickAddButton();
	}
	@Test(dataProvider = "manageBuildings")
	public void VisitorManagement_UpdateBuilding(Object obj7)throws Exception{
		HashMap<String, String>  testData7 = (HashMap<String, String>) obj7;
		System.out.println("testdata7" +testData7);
    	test.log(Status.INFO, "Test data execution from"+ testData7);
    	dashboard.clickManageBuildings();
    	building.clickEditBuildingButton();
    	building.enterDataforUpdateBuilding(testData7);
    	building.clickupdateButton();
		
	}
	@Test(dataProvider = "manageBuildings")
	public void VisitorManagement_AddFloor(Object obj8)throws Exception{
		HashMap<String, String>  testData8 = (HashMap<String, String>) obj8;
		System.out.println("testdata8" +testData8);
    	test.log(Status.INFO, "Test data execution from"+ testData8);
    	dashboard.clickManageBuildings();
    	building.clickAddFloorButton();
    	building.enterDataAddFloor(testData8);
    	building.clickaddButtonFloor();
    	
		
	}
	@Test(dataProvider = "manageBuildings")
	public void VisitorManagement_UpdateFloor(Object obj9)throws Exception{
		HashMap<String, String>  testData9 = (HashMap<String, String>) obj9;
		System.out.println("testdata8" +testData9);
    	test.log(Status.INFO, "Test data execution from"+ testData9);
    	dashboard.clickManageBuildings();
    	building.clickAddFloorButton();
    	building.clickEditFloorButton();
    	building.enterDataUpdateFloor(testData9);
    	building.clickUpdateFloorButton();
    	
		
	}
	@Test
	public void VisitorManagement_DeleteBuilding()throws Exception{
		dashboard.clickManageBuildings();
    	building.clickDeleteBuildingButton();
    }
	@Test
	public void VisitorManagement_DeleteFloor()throws Exception{
		dashboard.clickManageBuildings();
    	building.clickAddFloorButton();
    	building.clickDeleteFloorButton();
    }
//	
	//overdue visitors
		@Test(dataProvider = "overduecheckedInVisitor")
		public void visitManagement_OverdueCheckedIn(Object obj4)throws Exception{
			HashMap<String, String>  testData4 = (HashMap<String, String>) obj4;
			System.out.println("testdata4" +testData4);
			test.log(Status.INFO, "Test data execution from"+ testData4);
			dashboard.clickOverdueCheckedInVisitors();
			overdue.enterCheckedIndata(testData4);
			overdue.clickCheckedSearchButton();
			overdue.clickCheckoutButton();
	}
		
	
	
	//checked in visitors
	@Test(dataProvider = "checkedInVisitor")
	public void visitorManagement_CheckedInVisitors(Object obj3) throws Exception{
		HashMap<String, String>  testData3 = (HashMap<String, String>) obj3;
		System.out.println("testdata3" +testData3);
		test.log(Status.INFO, "Test data execution from"+ testData3);
		dashboard.clickCheckedInVisitors();
		checkedIn.enterCheckedIndata(testData3);
		checkedIn.clickCheckedSearchButton();
		checkedIn.clickCheckoutButton();
	}
	
	//testing checked in visitors table 
	
	@Test
	public void visitorManagement_CheckedInVisitorTable() throws Exception {
	//Finding number of Rows
	List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id=\"checkedout-visitor-table\"]/tbody[1]/tr[1]/td[1]"));
	int rowCount = rowsNumber.size();
	System.out.println("No of rows in checked in visitors table : " + rowCount);
	//Finding number of Columns
    List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id=\"checkedout-visitor-table\"]/thead/tr/th[1]"));
	int columnCount = columnsNumber.size();
	System.out.println("No of columns in this table : " + columnCount);
	WebElement cellAdress = Rowtable.findElement((SearchContext) By.xpath("//*[@id=\"checkedout-visitor-table\"]/tbody[1]/tr/td[3]"));
	String value = cellAdress.getText();
	System.out.println("The Cell value is:"+value);
	}
	
	//check in visitors
	@Test(dataProvider = "checkInVisitor")
	public void visitorManagement_CheckInVisitors(Object obj2) throws Exception{
		HashMap<String, String>  testData2 = (HashMap<String, String>) obj2;
		System.out.println("testdata1" +testData2);
		test.log(Status.INFO, "Test data execution from"+ testData2);
		dashboard.clickCheckInVisitorLink();
		checkinvisitor.enterCheckInVisitorsData(testData2);
		checkinvisitor.clickOnAddToListButton();
		checkinvisitor.clickOnSubmitButton();
	}
	//checked out visitors
    @Test(dataProvider = "checkedOutData")
	public void visitorManagement_CheckedOutVisitors(Object obj1) throws Exception{
		HashMap<String, String>  testData1 = (HashMap<String, String>) obj1;
		System.out.println("testdata1" +testData1);
		test.log(Status.INFO, "Test data execution from"+ testData1);
		dashboard.clickChekedOutVisitors();
		checkedout.enterCheckedOutData(testData1);
		checkedout.clickCheckedSearchButton();
	}

   
    
	
	
	
	
                                                           // Data providers for pages 
		
	//data provider method for login page
	@DataProvider (name="loginData")
	 public Object [][] testDataSupplier() throws Exception {
		Object[][] ob = new Object[excel.getRowCount()][1];
		for (int i = 1; i <=excel.getRowCount(); i++) {
			HashMap<String, String> testData =excel.getTestDataInMap(i);
			ob[i-1][0] = testData;
		}
		
		return ob;
		 
	 }
	//data provider method for checked out page
		@DataProvider (name="checkedOutData")
		 public Object [][] testDataSupplier1() throws Exception {
			Object[][] ob = new Object[exChekout.getRowCount()][1];
			for (int i = 1; i <=exChekout.getRowCount(); i++) {
				HashMap<String, String> testData1 =exChekout.getTestDataInMap(i);
				ob[i-1][0] = testData1;
			}
			
			return ob;
			 
		 }
		//data provider method for check in visitor page
				@DataProvider (name="checkInVisitor")
				 public Object [][] testDataSupplier2() throws Exception {
					Object[][] ob = new Object[exChekIn.getRowCount()][1];
					for (int i = 1; i <=exChekIn.getRowCount(); i++) {
						HashMap<String, String> testData2 =exChekIn.getTestDataInMap(i);
						ob[i-1][0] = testData2;
					}
					
					return ob;
					 
				 }
	  //data provider method for checked in visitor page
       @DataProvider (name="checkedInVisitor")
	   public Object [][] testDataSupplier3() throws Exception {
		 Object[][] ob = new Object[exChekedIn.getRowCount()][1];
			for (int i = 1; i <=exChekedIn.getRowCount(); i++) {
				HashMap<String, String> testData3 =exChekedIn.getTestDataInMap(i);
				ob[i-1][0] = testData3;
			}
					
			return ob;
					 
			}
     
     //data provider method for overdue checked in visitor page
      @DataProvider (name="overduecheckedInVisitor")
	   public Object [][] testDataSupplier4() throws Exception {
		 Object[][] ob = new Object[exOverdue.getRowCount()][1];
			for (int i = 1; i <=exOverdue.getRowCount(); i++) {
				HashMap<String, String> testData4 =exOverdue.getTestDataInMap(i);
				ob[i-1][0] = testData4;
			}
					
			return ob;
					 
			}
       
     //data provider method for manage building page
       @DataProvider (name="manageBuildings")
	   public Object [][] testDataSupplier5() throws Exception {
		 Object[][] ob = new Object[exBuilding.getRowCount()][1];
			for (int i = 1; i <=exBuilding.getRowCount(); i++) {
				HashMap<String, String> testData5 =exBuilding.getTestDataInMap(i);
				ob[i-1][0] = testData5;
			}
					
			return ob;
					 
			}
       
     //data provider method for manage staff page
       @DataProvider (name="managestaff")
	   public Object [][] testDataSupplier6() throws Exception {
		 Object[][] ob = new Object[exStaff.getRowCount()][1];
			for (int i = 1; i <=exStaff.getRowCount(); i++) {
				HashMap<String, String> testData6 =exStaff.getTestDataInMap(i);
				ob[i-1][0] = testData6;
			}
					
			return ob;
					 
			}
       //data provider method for manage system user page
       @DataProvider (name="managesystemuser")
	   public Object [][] testDataSupplier7() throws Exception {
		 Object[][] ob = new Object[exsysuser.getRowCount()][1];
			for (int i = 1; i <=exsysuser.getRowCount(); i++) {
				HashMap<String, String> testData7 =exsysuser.getTestDataInMap(i);
				ob[i-1][0] = testData7;
			}
					
			return ob;
					 
			}
       
	
	
}
