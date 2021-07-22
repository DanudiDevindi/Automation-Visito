package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CheckInVisitorPageObjects;
import pageObjects.CheckedInVisitorsPageObjects;
import pageObjects.CheckedOutVisitorsPageObjects;
import pageObjects.DashboardPageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.ManageBuildingsPageObjects;
import pageObjects.OverdueCheckedInPageObjects;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo {
	
	
	public void LaunchBrowserAndNAvigation() throws Exception {
		//read property file and get browser and url
		
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url  = PropertiesOperations.getPropertyValueByKey("url");
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			     driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
			     driver = new InternetExplorerDriver();
			}
				
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
				
	}
	
	// it will get execute before each test methods within currunt class 
		@BeforeMethod
		public void setupMethod() throws Exception {
			LaunchBrowserAndNAvigation();
			dashboard = new  DashboardPageObjects();
			checkinvisitor = new CheckInVisitorPageObjects();
			login = new LoginPageObjects();
			checkedout = new CheckedOutVisitorsPageObjects();
			checkedIn = new CheckedInVisitorsPageObjects();
			overdue = new OverdueCheckedInPageObjects();
			building = new ManageBuildingsPageObjects();
		}
		
		//ending test close window 
		@AfterMethod
		public void cleanUp () {
			driver.quit();
		}
		 

}
