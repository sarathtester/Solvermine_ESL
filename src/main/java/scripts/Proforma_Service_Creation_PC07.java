package scripts;

import java.util.HashSet;
import java.util.Set;

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
	
	
	String URL = TestNgXml.getdatafromExecution().get("Proforma_Service_Creation_PC07");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username", "Proforma_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password", "Proforma_Creation");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input", "Proforma_Creation");
	String ServiceCode = Utils.getDataFromTestData("Equipment_Details", "ServiceCode", "Proforma_Creation");
	String Remarksinput = Utils.getDataFromTestData("Equipment_Details", "Remarks", "Proforma_Creation");
	String PortCodein = Utils.getDataFromTestData("Equipment_Details", "PortCode", "Proforma_Creation");
	String PortCodein1 = Utils.getDataFromTestData("Equipment_Details", "PortCode1", "Proforma_Creation");
	String PortCodein2 = Utils.getDataFromTestData("Equipment_Details", "PortCode2", "Proforma_Creation");
	String PortCodein3 = Utils.getDataFromTestData("Equipment_Details", "PortCode3", "Proforma_Creation");
	String PortCodein5 = Utils.getDataFromTestData("Equipment_Details", "PortCode5", "Proforma_Creation");
	String Buffertime = Utils.getDataFromTestData("Equipment_Details", "BufferTime", "Proforma_Creation");
	String Timezone = Utils.getDataFromTestData("Equipment_Details", "TimeZone", "Proforma_Creation");
	String Newaddport = Utils.getDataFromTestData("Equipment_Details", "NewAdd", "Proforma_Creation");
	String ProformacodeInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCode", "Proforma_Creation");
	String ExpectedActivityforDeployed = Utils.getDataFromTestData("Equipment_Details", "ValidationForDeployed", "Proforma_Creation");
	String ProformaCodeDraftInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeDraft", "Proforma_Creation");
	String ExpectedActivityforDraft = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Proforma_Creation");
	String ProformaCodeConformInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeConform", "Proforma_Creation");
	String ExpectedActivityforConform = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Proforma_Creation");
	String SreviceImport = Utils.getDataFromTestData("Equipment_Details", "ServiceCodeImport", "Proforma_Creation");
	String ExpectedActivity = Utils.getDataFromTestData("Equipment_Details", "INPUT", "Proforma_Creation");
	String Speedvalue = Utils.getDataFromTestData("Equipment_Details", "Speed", "Proforma_Creation");
	String servicecod = Utils.getDataFromTestData("Equipment_Details", "ServiceCODE1", "Proforma_Creation");
	
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
	  WebElement DataA1 = driver.findElement(By.xpath("(//*[@aria-label='Port Code'])//following::label[1]"));
		String portA=DataA1.getText();
	System.out.println(portA);
	 WebElement DataA2 = driver.findElement(By.xpath("(//*[@aria-label='Port Code'])//following::label[4]"));
		String portB=DataA2.getText();
	System.out.println(portB);
	 WebElement DataA3 = driver.findElement(By.xpath("(//*[@aria-label='Port Code'])//following::label[7]"));
		String portC=DataA3.getText();
	System.out.println(portC);
	 WebElement DataA4 = driver.findElement(By.xpath("(//*[@aria-label='Port Code'])//following::label[10]"));
		String portD=DataA4.getText();
	System.out.println(portD);
	  waitForElement(driver, OkBtn);
		click(driver, OkBtn);	
		wait(driver, "1");
		 WebElement DataB1 = driver.findElement(By.xpath("(//div[@col-id='portsValue'])[2]"));
			String portE=DataB1.getText();
		System.out.println(portE);
		 WebElement DataB2 = driver.findElement(By.xpath("(//div[@col-id='portsValue'])[3]"));
			String portF=DataB2.getText();
		System.out.println(portF);
		 WebElement DataB3 = driver.findElement(By.xpath("(//div[@col-id='portsValue'])[4]"));
			String portG=DataB3.getText();
		System.out.println(portG);
		 WebElement DataB4 = driver.findElement(By.xpath("(//div[@col-id='portsValue'])[5]"));
			String portH=DataB4.getText();
		System.out.println(portH);
		   WebElement inputdata2 = driver.findElement(By.xpath("(//*[@col-id='bound'])[4]"));
			String typeValue2=inputdata2.getText();
		System.out.println(typeValue2);
		 if(typeValue1.equals(typeValue2)){
		        System.out.println("Pass");
		    }
		        else {
		            System.out.println("Fail");
		        }
		  Set<String> arrset1 = new HashSet<String>(); 
		  arrset1.add(portA); 
	        arrset1.add(portB); 
	        arrset1.add(portC); 
	        arrset1.add(portD); 
	        System.out.println("First Set: "  + arrset1); 
	        
	        Set<String> arrset2 = new HashSet<String>(); 
	        
	       
	        arrset2.add(portE); 
	        arrset2.add(portF); 
	        arrset2.add(portG); 
	        arrset2.add(portH); 
	
	        System.out.println("Second Set: "  + arrset2); 
	        boolean value = arrset1.equals(arrset2); 
	        System.out.println("Are both set equal? "
	                           + value); 
	    } 

	

}
