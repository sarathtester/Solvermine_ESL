package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Proforma_Service_Creation_PC07  extends Keywords{
	
	
	String URL = TestNgXml.getdatafromExecution().get("Proforma_Service_Creation_PC05");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username", "Sheet3");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password", "Sheet3");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input", "Sheet3");
	String ServiceCode = Utils.getDataFromTestData("Equipment_Details", "ServiceCode", "Sheet3");
	String Remarksinput = Utils.getDataFromTestData("Equipment_Details", "Remarks", "Sheet3");
	String PortCodein = Utils.getDataFromTestData("Equipment_Details", "PortCode", "Sheet3");
	String PortCodein1 = Utils.getDataFromTestData("Equipment_Details", "PortCode1", "Sheet3");
	String PortCodein2 = Utils.getDataFromTestData("Equipment_Details", "PortCode2", "Sheet3");
	String PortCodein3 = Utils.getDataFromTestData("Equipment_Details", "PortCode3", "Sheet3");
	String PortCodein5 = Utils.getDataFromTestData("Equipment_Details", "PortCode5", "Sheet3");
	String Buffertime = Utils.getDataFromTestData("Equipment_Details", "BufferTime", "Sheet3");
	String Timezone = Utils.getDataFromTestData("Equipment_Details", "TimeZone", "Sheet3");
	String Newaddport = Utils.getDataFromTestData("Equipment_Details", "NewAdd", "Sheet3");
	String ProformacodeInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCode", "Sheet3");
	String ExpectedActivityforDeployed = Utils.getDataFromTestData("Equipment_Details", "ValidationForDeployed", "Sheet3");
	String ProformaCodeDraftInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeDraft", "Sheet3");
	String ExpectedActivityforDraft = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Sheet3");
	String ProformaCodeConformInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeConform", "Sheet3");
	String ExpectedActivityforConform = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Sheet3");
	String SreviceImport = Utils.getDataFromTestData("Equipment_Details", "ServiceCodeImport", "Sheet3");
	String ExpectedActivity = Utils.getDataFromTestData("Equipment_Details", "INPUT", "Sheet3");
	String Speedvalue = Utils.getDataFromTestData("Equipment_Details", "Speed", "Sheet3");
	String servicecod = Utils.getDataFromTestData("Equipment_Details", "ServiceCODE1", "Sheet3");
	
	public void Creationimport(WebDriver driver, ExtentTest test) throws Exception {
		Actions action = new Actions(driver);

		WebDriverWait wait = new WebDriverWait(driver, 60);

		navigateUrl(driver, URL);

		if (wait.until(
				ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='nfr_login_btnlogin']"), "Login"))) {
			System.out.println("LogIn page is displayed");
			Extent_pass(driver, "LogIn in page is displayed", test);
		} else {
			Extent_fail(driver, "Sign in page is not displayed", test);
		}

		waitForElement(driver, Username_input);
		sendKeys(driver, Username_input, Username);

		waitForElement(driver, Password_input);
		sendKeys(driver, Password_input, Password);

		waitForElement(driver, Login);
		click(driver, Login);

		wait(driver, "6");

		if (isDisplayed(driver, Home_Logo)) {
			System.out.println("Home page is displayed");
			Extent_pass(driver, "Home page is displayed", test);
		} else {
			Extent_fail(driver, "Home page is not displayed", test);
		}
		verifyElementIsPresent(driver, Search_Input);
		sendKeys(driver, Search_Input, Search);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);
		waitForElement(driver, Newbtn);
		click(driver, Newbtn);
		waitForElement(driver, Newbtn);
		if (isDisplayed(driver, Newpop)) {
			click(driver, NwepopOK);
			System.out.println("New tap opened");
			Extent_pass(driver, "New tap opened", test);
		} else {
			Extent_fail(driver, "New tap not opened", test);
		}
		waitForElement(driver, ServiceSearch);
		click(driver, ServiceSearch);
		waitForElement(driver, Searcservicedetials);
		waitForElement(driver, ServiceCodeInput);
		sendKeys(driver, ServiceCodeInput, SreviceImport);
		waitForElement(driver, Alpha);
		click(driver, Alpha);
		waitForElement(driver, Selectservicebtn);
		click(driver, Selectservicebtn);
		waitForElement(driver, RemarksInput);
		sendKeys(driver, RemarksInput, Remarksinput);
		waitForElement(driver, QuickPerfoma);
		click(driver, QuickPerfoma);
		if (isDisplayed(driver, Importfromperfoma)) {
			System.out.println("Quick profoma page opened");
			Extent_pass(driver, "Quick profoma page opened", test);
		} else {
			Extent_fail(driver, "Quick profoma page not opened", test);
		}
		waitForElement(driver, Importperforma);
		click(driver, Importperforma);
		waitForElement(driver, ProformaDetials);
		click(driver, ProformaDetials);
		waitForElement(driver, Servicecodeimport);
		sendKeys(driver, Servicecodeimport,servicecod);
		waitForElement(driver, Rock);
		click(driver, Rock);
		waitForElement(driver, Selectservicebtn);
		click(driver, Selectservicebtn);
		waitForElement(driver, N);
		WebElement inputdata = driver.findElement(By.xpath("//*[@ID='quickProformaCreation_defaultDsGrid1-2-SPF_quic_boundmenu_label']"));
		String typeValue=inputdata.getText();
	System.out.println(typeValue);
        waitForElement(driver, N);
        click(driver, N);
        waitForElement(driver, S);
        click(driver, S);
        WebElement inputdata1 = driver.findElement(By.xpath("//*[@ID='quickProformaCreation_defaultDsGrid1-2-SPF_quic_boundmenu_label']"));
		String typeValue1=inputdata1.getText();
	System.out.println(typeValue1);
	  if(typeValue.equals(typeValue1)){
	        System.out.println("Fail");
	    }
	        else {
	            System.out.println("Pass");
	        }
	  waitForElement(driver, OkBtn);
		click(driver, OkBtn);	
		wait(driver, "2");
		   WebElement inputdata2 = driver.findElement(By.xpath("(//*[@col-id='bound'])[4]"));
			String typeValue2=inputdata2.getText();
		System.out.println(typeValue2);
		 if(typeValue1.equals(typeValue2)){
		        System.out.println("Pass");
		    }
		        else {
		            System.out.println("Fail");
		        }
	
//		waitForElement(driver, PortCodeInput);
//		sendKeys(driver, PortCodeInput, PortCodein);
//		wait(driver, "1");
//		action.sendKeys(Keys.ENTER).build().perform();
//		wait(driver, "1");
//		waitForElement(driver, Speed);
//		clear(driver, Speed);
//		sendKeys(driver, Speed, Speedvalue);
//		WebElement inputdata = driver.findElement(By.xpath("(//tbody[@id='quickProformaCreation_defaultDsGrid1_data']//td//label)[1]"));
//		String typeValue=inputdata.getText();
//		System.out.println(typeValue);
//		waitForElement(driver, OkBtn);
//		click(driver, OkBtn);	
//		wait(driver, "2");
//		 WebElement value = driver.findElement(By.xpath("(//span[contains(text(),'Port Code')])[1]//following::label[11]"));
//	        String ReportActivity = value.getText();
//	        System.out.println(ReportActivity);
//	        if (ExpectedActivity.equals(ReportActivity)) {
//				System.out.println(
//						"Matched || " + " Expected Report Activity is : " + ExpectedActivity + " || Actual Report Activity is : " + ReportActivity);
//				Extent_pass(driver,
//						"Matched || " + " Expected Report Activity is : " + ExpectedActivity + " || Actual Report Activity is : " + ReportActivity,test);
//			} else {
//				System.out.println(
//						"Not matched || " + " Expected Report Activity is : " + ExpectedActivity + " || Actual Report Activity is : " + ReportActivity);
//				Extent_fail(driver,
//						"Not matched || " + " Expected Report Activity is : " + ExpectedActivity + " || Actual Report Activity is : " + ReportActivity,test);
//			}
//		
//		
//		
//		
}
}