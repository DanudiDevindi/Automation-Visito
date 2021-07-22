package VisitorManagement;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelComponents;
import testBase.TestBase;


public class EndToEndTest_visitorManagement extends TestBase{
	
	
	ExcelComponents excel = new ExcelComponents("visitorManage");
	ExcelComponents exChekout = new ExcelComponents("CheckedOut");
	ExcelComponents exChekIn = new ExcelComponents("CheckInVisitors");
	
	
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

	//login
	@Test(dataProvider = "loginData")
	public void visitorManagemet_Login(Object obj) throws Exception {
        HashMap<String, String>  testData = (HashMap<String, String>) obj;
		System.out.println("testdata" +testData);
		test.log(Status.INFO, "Test data execution from"+ testData);
		dashboard.clickLoginLink();
		login.enterLoginData(testData);
		login.clickloginButton();
	}
	
	
		
	//data provider method for login page
	@DataProvider (name="loginData")
	 public Object [][] testDataSupplier() throws Exception {
		Object[][] ob = new Object[excel.getRowCount()][1];
		for (int i = 1; i <excel.getRowCount(); i++) {
			HashMap<String, String> testData =excel.getTestDataInMap(i);
			ob[i-1][0] = testData;
		}
		
		return ob;
		 
	 }
	//data provider method for checked out page
		@DataProvider (name="checkedOutData")
		 public Object [][] testDataSupplier1() throws Exception {
			Object[][] ob = new Object[exChekout.getRowCount()][1];
			for (int i = 1; i <exChekout.getRowCount(); i++) {
				HashMap<String, String> testData1 =exChekout.getTestDataInMap(i);
				ob[i-1][0] = testData1;
			}
			
			return ob;
			 
		 }
		//data provider method for check in visitor page
				@DataProvider (name="checkInVisitor")
				 public Object [][] testDataSupplier2() throws Exception {
					Object[][] ob = new Object[exChekIn.getRowCount()][1];
					for (int i = 1; i <exChekIn.getRowCount(); i++) {
						HashMap<String, String> testData2 =exChekIn.getTestDataInMap(i);
						ob[i-1][0] = testData2;
					}
					
					return ob;
					 
				 }

	


	

	

}
