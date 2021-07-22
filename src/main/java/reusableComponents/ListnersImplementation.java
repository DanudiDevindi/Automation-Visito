package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testBase.ObjectsRepo;

public class ListnersImplementation extends ObjectsRepo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//before each test case
		 test = extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Test Case:" + result.getMethod().getMethodName()+ "is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,"Test Case:" + result.getMethod().getMethodName()+ "is failed");
		test.log(Status.FAIL, result.getThrowable());
		
		//screenshots for failed tests
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//get currunt date
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
				Date date = new Date();
				String actualDate= dateformat.format(date);
				
		String screenshotPath = System.getProperty("user.dir")+"/Reports/ScreenShots/"+actualDate+".jpeg";
		File dest = new File(screenshotPath);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(screenshotPath,"Test case fil screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		//setup method call
		extent = ExtentSetup.setupExtentReports();
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//close report
		extent.flush();
		
	}
	
	

}
