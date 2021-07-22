package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.CheckInVisitorPageObjects;
import pageObjects.CheckedOutVisitorsPageObjects;
import pageObjects.DashboardPageObjects;
import pageObjects.LoginPageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static DashboardPageObjects dashboard ;
	public static CheckInVisitorPageObjects checkinvisitor;
	public static LoginPageObjects login;
	public static CheckedOutVisitorsPageObjects checkedout;
	
	public CommonMethods cm = new CommonMethods();

}
