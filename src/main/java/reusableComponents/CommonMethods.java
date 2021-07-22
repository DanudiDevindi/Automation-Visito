package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	//common method for select dropdown value
	public void selectDropdownData(WebElement element, String valueToBeSelected) throws Exception {
		Select os = new Select(element);
    	try{
    		os.deselectByVisibleText(valueToBeSelected);
    	}catch(Exception e) {
    		throw new Exception("value is not presentin dropdown for webelement" +element+ "value to be selected is"+ valueToBeSelected);
    	}
		
	}
	//get dropdown option as list of string for compare
	public List<String> getDropdownOptionsAsList( WebElement webelemet) {
		Select os = new Select(webelemet);
    	List<WebElement> list_WebElement_Building = os.getOptions();
    	List<String> actualcontent = new ArrayList<String>();
    	for (WebElement ref : list_WebElement_Building) {
    		actualcontent.add(ref.getText());
			
		}
    	return actualcontent;
	}
	
	

}
