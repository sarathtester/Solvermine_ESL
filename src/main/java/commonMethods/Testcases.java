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
import proforma_creation_scripts.Proforma_Service_Creation_PC05;
import proforma_creation_scripts.Proforma_Service_Creation_PC07;
import proforma_creation_scripts.Proforma_Service_Creation_PC08;
import longtermCreation_scripts.TC_Long_Term_Creation_LT04;
import proforma_creation_scripts.TC_Proforma_Service_Creation_PC01;
import proforma_creation_scripts.TC_Proforma_Service_Creation_PC02;
import proforma_creation_scripts.TC_Proforma_Service_Creation_PC04;
import proforma_creation_scripts.TC_Proforma_Service_Creation_PC09;
import service_Creation_scripts.TC_Service_Creation_SC01;
import service_Creation_scripts.TC_Service_Creation_SC02;
import service_Creation_scripts.TC_Service_Creation_SC03;
import service_Creation_scripts.TC_Service_Creation_SC04;
import service_Creation_scripts.TC_Service_Creation_SC05;
import service_Creation_scripts.TC_Service_Creation_SC06;
import service_Creation_scripts.TC_Service_Creation_SC07;


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

	
	TC_Service_Creation_SC01 testc1 = new TC_Service_Creation_SC01();
	TC_Service_Creation_SC02 testc2 = new TC_Service_Creation_SC02();
	TC_Service_Creation_SC03 testc3 = new TC_Service_Creation_SC03();
	TC_Service_Creation_SC04 testc4 = new TC_Service_Creation_SC04();
	TC_Service_Creation_SC05 testc5 = new TC_Service_Creation_SC05();
	TC_Proforma_Service_Creation_PC01  pc1 = new TC_Proforma_Service_Creation_PC01();
	TC_Proforma_Service_Creation_PC02  pc2 = new TC_Proforma_Service_Creation_PC02();
	TC_Proforma_Service_Creation_PC04  pc4 = new TC_Proforma_Service_Creation_PC04();
	Proforma_Service_Creation_PC05 d4=new Proforma_Service_Creation_PC05();
	Proforma_Service_Creation_PC07 d5=new  Proforma_Service_Creation_PC07();
	Proforma_Service_Creation_PC08 d6=new Proforma_Service_Creation_PC08();
	
	TC_Service_Creation_SC06 scd=new TC_Service_Creation_SC06();
	TC_Service_Creation_SC07 inAct=new TC_Service_Creation_SC07();
	TC_Proforma_Service_Creation_PC09 inActPro=new TC_Proforma_Service_Creation_PC09();
	TC_Long_Term_Creation_LT04 renameVessel=new TC_Long_Term_Creation_LT04();
	
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
		System.out.println("******************Script Execution completed******************");
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
	
	@Test
	public void TC_Service_Creation_SC01() throws Exception {
		test = extent.createTest("Solvermind_VSS01").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			testc1.ServiceCreation(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void TC_Service_Creation_SC02() throws Exception {
		test = extent.createTest("Solvermind_VSS02").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			testc2.EditServiceCreation(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void TC_Service_Creation_SC03() throws Exception {
		test = extent.createTest("Solvermind_VSS03").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			testc3.ServiceCreationValidations(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void TC_Service_Creation_SC04() throws Exception {
		test = extent.createTest("Solvermind_VSS04").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			testc4.SCInvalidData(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void TC_Service_Creation_SC05() throws Exception {
		test = extent.createTest("Solvermind_VSS05").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
	    driver = null;
		driver = getWebDriver1(browser);
		try {
			testc5.DuplicateRecordsCheck(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void Proforma_Service_Creation_PC05() throws Exception {
		test = extent.createTest("Proforma_creation05").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			d4.Creationedit(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void  Proforma_Service_Creation_PC07() throws Exception {
		test = extent.createTest("Proforma_creation07").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			d5.Creationimport(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void  Proforma_Service_Creation_PC08() throws Exception {
		test = extent.createTest("Proforma_creation08").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try {
			d6.Creationdelete(driver,test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void TC_Service_Creation_SC06() throws Throwable
	{
		test = extent.createTest("Solvermind_VSS06").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
	   try
	   {
		   scd.vSS_SC06(driver);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
	
	@Test
	public void TC_Service_Creation_SC07() throws Throwable
	{
		test = extent.createTest("Solvermind_VSS07").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
	   try
	   {
		   inAct.vSS_SC07(driver);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
	
	@Test
	public void TC_Proforma_Service_Creation_PC09() throws Throwable
	{
		test = extent.createTest("Proforma_creation09").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
	   try
	   {
		   inActPro.vSS_PC09(driver);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	}
	
	@Test
	public void TC_Long_Term_Creation_LT04() throws Throwable
	{
		test = extent.createTest("longterm_LT04").assignAuthor("TD").assignCategory("E2E");
		Keywords.ActionTest(test);
		driver = null;
		driver = getWebDriver1(browser);
		try
		{
			renameVessel.vSS_LT04(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
