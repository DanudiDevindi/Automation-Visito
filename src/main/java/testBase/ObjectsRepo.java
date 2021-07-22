package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.CheckInVisitorPageObjects;
import pageObjects.CheckedInVisitorsPageObjects;
import pageObjects.CheckedOutVisitorsPageObjects;
import pageObjects.DashboardPageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.ManageBuildingsPageObjects;
import pageObjects.OverdueCheckedInPageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static DashboardPageObjects dashboard ;
	public static CheckInVisitorPageObjects checkinvisitor;
	public static LoginPageObjects login;
	public static CheckedOutVisitorsPageObjects checkedout;
	public static CheckedInVisitorsPageObjects checkedIn;
	public static OverdueCheckedInPageObjects overdue;
	public static ManageBuildingsPageObjects building;
	
	public CommonMethods cm = new CommonMethods();

}
