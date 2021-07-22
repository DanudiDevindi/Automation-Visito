package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelComponents {
	
	String filepath;
	Sheet sh;
	public ExcelComponents(String sheetName) {
	 try {
		filepath = System.getProperty("user.dir")+PropertiesOperations.getPropertyValueByKey("testDataLocation");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		//location in excel file
	    //open file	
	File testDataFile = new File(filepath);	
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(testDataFile);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
		
	 sh = wb.getSheet(sheetName);
	}

	//get test data in hash map
	public HashMap<String, String> getTestDataInMap(int rowNo) throws Exception {
	
	//sh.getRow(0).getCell(0).toString();
		
		//read data row by row and put in map
	HashMap<String, String> hm = new HashMap<>();
	for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
		sh.getRow(rowNo).getCell(i).setCellType(CellType.STRING);;
		hm.put(sh.getRow(0).getCell(i).toString(),sh.getRow(rowNo).getCell(i).toString());
		
	}
	return hm;
	}
	
	//get row count
	public int getRowCount() {
		
		return sh.getLastRowNum();
	}
	
	//get coloum count
	public int getColoumCount() {
		return sh.getRow(0).getLastCellNum();
		
	}
}
