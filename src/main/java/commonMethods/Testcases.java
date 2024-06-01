package commonMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;


import scripts.TC_Proforma_Service_Creation_PC01;
import scripts.TC_Proforma_Service_Creation_PC02;
import scripts.TC_Proforma_Service_Creation_PC04;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Config {
	{
		System.setProperty("atu.reporter.config", System.getProperty("user.dir") + "/atu.properties");
	}
	public String appURL;
	public String appURL1;
	public String appURL2;
	public String prurl;
	public String mailinatorurl;
	public String proxy;
	public String usernameValue;
	public String passwordValue;
	public String project_Name;
	public String version_Name;
	public String environment;
	public String browser;
	public WebDriver driver;
	public String search;

	public ChromeOptions options = null;
	String Userflowurl = null;
	File f = new File(report_folder_create + "\\reports");
	public String Execution = "null";
	public String buildname = "null";

	TC_Proforma_Service_Creation_PC01  pc1 = new TC_Proforma_Service_Creation_PC01();
	TC_Proforma_Service_Creation_PC02  pc2 = new TC_Proforma_Service_Creation_PC02();
	TC_Proforma_Service_Creation_PC04  pc4 = new TC_Proforma_Service_Creation_PC04();
	
	
	static ExtentSparkReporter spark;
	static ExtentTest test;
	static ExtentReports extent;
	
	static ExtentSparkReporter spark1;
	static ExtentTest test1;
	static ExtentReports extent1;
	
	String resultReoprtpath;
	boolean log = false;


	@BeforeClass
	public void getDataFromConfig() throws Exception {

		System.out.println("******************Script Execution Started******************");
		appURL = Utils.getDataFromTestConfig("URL");
		browser = Utils.getDataFromTestConfig("AppBrowser");
        
		
	}
	
	@BeforeTest
	
	public void Extentreport() throws IOException {
		
		extent = ATUReports.reportsetup();
	}
	
	
	@AfterMethod
	public void Teardown(ITestResult result) throws Throwable {
		ATUReports.teardown(driver, result, test);
		driver.quit();
	}
	
	@AfterTest
	public void aftertest() throws Throwable {
		ATUReports.Aftertest(test);
	}

	
	@Test
	public void TC_Proforma_Service_Creation_PC01() throws Exception {
		test = extent.createTest("Proforma_creation01").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			pc1.Proformacreation01(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TC_Proforma_Service_Creation_PC02() throws Exception {
		test = extent.createTest("Proforma_creation02").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			pc2.Proformacreation02(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void TC_Proforma_Service_Creation_PC04() throws Exception {
		test = extent.createTest("Proforma_creation04").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			pc4.Proformacreation04(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
