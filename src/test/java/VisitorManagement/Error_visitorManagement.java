package VisitorManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class Error_visitorManagement extends TestBase {
	
	
       
		 @Test
		public void ErrorMsg_staffMember() throws Exception {
			//click on check in visitor link
			dashboard.clickCheckInVisitorLink();
			//enter value for searchable combo
			checkinvisitor.enterStaffMember("Abcdstt");
			//vertify error msg
			
			//report status
			test.log(Status.PASS, "staff member fill with data: Abcdstt");
		}
	    
	    @Test
	    public void verifyBuildgDropdownOptions() {
	    	
	    	dashboard.clickCheckInVisitorLink();
	    	List<String> actualValues = checkinvisitor.getDropdownOption_buildingDropdown();
	    	test.log(Status.INFO, "Actual contents for building dropdown:"+ actualValues);
	    	List<String> expectedValues = Arrays.asList("Choose...","abc","dfccc","hnb");
	    	test.log(Status.INFO, "Expected contents for building dropdown:"+ expectedValues);
	    	Assert.assertEquals(actualValues, expectedValues, "Error in dropdown options compare at building dropdown");
	    	
	    }
	    
	    @Test
	    public void verifyfloorDropdownOptions() {
	    	
	    	dashboard.clickCheckInVisitorLink();
	    	List<String> actualValues = checkinvisitor.getDropdownOption_floorDropdown();
	    	test.log(Status.INFO, "Actual contents for floor dropdown:"+ actualValues);
	    	List<String> expectedValues = Arrays.asList("Choose...","bcd");
	    	test.log(Status.INFO, "Expected contents for floor dropdown:"+ expectedValues);
	    	Assert.assertEquals(actualValues, expectedValues, "Error in dropdown options compare at floor dropdown");
	    	
	    }

}
