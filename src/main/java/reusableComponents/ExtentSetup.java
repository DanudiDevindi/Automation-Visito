package reusableComponents;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectsRepo;

public class ExtentSetup extends ObjectsRepo {
	
	public static ExtentReports setupExtentReports() {
		
		//get currunt date
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();
		String actualDate= dateformat.format(date);
		
		String reportPath = System.getProperty("user.dir")+"/Reports/ExecutionReport_"+actualDate+".html";
		ExtentSparkReporter sprkreport = new ExtentSparkReporter(reportPath);
		
	    extent = new ExtentReports();
		extent.attachReporter(sprkreport);
		
		sprkreport.config().setDocumentTitle("Document Title");
		sprkreport.config().setTheme(Theme.DARK);
		sprkreport.config().setReportName("Visitor_Management");
		
		return extent;
	}

}
