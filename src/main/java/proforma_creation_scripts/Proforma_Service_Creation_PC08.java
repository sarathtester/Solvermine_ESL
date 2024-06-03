package proforma_creation_scripts;

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

public class Proforma_Service_Creation_PC08 extends Keywords{

	String URL = TestNgXml.getdatafromExecution().get("Proforma_Service_Creation_PC05");
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
	String Servicenamein = Utils.getDataFromTestData("Equipment_Details", "Servicenameinput", "Proforma_Creation");
	String Portcodefilter = Utils.getDataFromTestData("Datas_Details", "PortCodeFilter", "Proforma_Creation");
	String Portcodefilter1 = Utils.getDataFromTestData("Datas_Details", "Portcodesearch", "Proforma_Creation");
	String Portcodefilter2 = Utils.getDataFromTestData("Datas_Details", "Portcodesearch1", "Proforma_Creation");
	
	public void Creationdelete(WebDriver driver, ExtentTest test) throws Exception {
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
		waitForElement(driver, SearchMain);
		click(driver, SearchMain);
		
		if (isDisplayed(driver, ProformaDetials)) {
			System.out.println("Search page opned");
			Extent_pass(driver, "Search page opned", test);
		} else {
			Extent_fail(driver, "Search page not opned", test);
		}
		waitForElement(driver, ProformaCodeInput);
		sendKeys(driver, ProformaCodeInput, ProformacodeInput);
		
		waitForElement(driver, Searchtable);
		click(driver, Searchtable);
		wait(driver, "1");
		waitForElement(driver, nUMBERCODE);
		click(driver, nUMBERCODE);
		waitForElement(driver, SelectOkBtn);
		click(driver, SelectOkBtn);
		wait(driver, "2");
		verifyElementIsPresent(driver, Deployed);
		if (isDisplayed(driver, Deployed)) {
			System.out.println("Status is Deployed");
			Extent_pass(driver, "Status is Deployed", test);
		} else {
			Extent_fail(driver, "Status is not Deployed", test);
		}
		waitForElement(driver, Delete);
		click(driver, Delete);
		waitForElement(driver, Performaservicecreation);
		String ReportActivityforDeployed = driver.findElement(By.xpath("(//*[contains(text(),'Proforma Service Creation')])[7]//following::span[2]")).getText();
		System.out.println(ReportActivityforDeployed);

		if (ExpectedActivityforDeployed.equals(ReportActivityforDeployed)) {
			System.out.println(
					"Matched || " + " Expected Report Activity is : " + ExpectedActivityforDeployed + " || Actual Report Activity is : " + ReportActivityforDeployed);
			Extent_pass(driver,
					"Matched || " + " Expected Report Activity is : " + ExpectedActivityforDeployed + " || Actual Report Activity is : " + ReportActivityforDeployed,test);
		} else {
			System.out.println(
					"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforDeployed + " || Actual Report Activity is : " + ReportActivityforDeployed);
			Extent_fail(driver,
					"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforDeployed + " || Actual Report Activity is : " + ReportActivityforDeployed,test);
		}
		waitForElement(driver, PerformaservicecreationPopOK);
		click(driver, PerformaservicecreationPopOK);
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
		waitForElement(driver, Servicenameinpit);
		sendKeys(driver, Servicenameinpit, Servicenamein);
		waitForElement(driver, Vishnu);
		click(driver, Vishnu);
		waitForElement(driver, Selectservicebtn);
		click(driver, Selectservicebtn);
		waitForElement(driver, RemarksInput);
		sendKeys(driver, RemarksInput, Remarksinput);
		waitForElement(driver, AddbUTTON);
		click(driver, AddbUTTON);
		waitForElement(driver, Firstsearch);
		click(driver, Firstsearch);
		waitForElement(driver, Postcodefilterinput);
	sendKeys(driver, Postcodefilterinput, Portcodefilter);
	waitForElement(driver, Nlaer);
	click(driver, Nlaer);
	waitForElement(driver, Selectservicebtn);
	click(driver, Selectservicebtn);
	waitForElement(driver, Firstsearch);
	click(driver, Firstsearch);
	waitForElement(driver, Postcodefilterinput);
sendKeys(driver, Postcodefilterinput, Portcodefilter);
wait(driver, "2");
waitForElement(driver, Selectservicebtn);
click(driver, Selectservicebtn);
waitForElement(driver, Mainsave);
click(driver, Mainsave);
waitForElement(driver, Savedpop);
click(driver, OKK);
	WebElement te=driver.findElement(By.id("SPF-SPF_txtProformaCde"));
	String word=te.getAttribute("Value");
	System.out.println(word);
	
		waitForElement(driver, SearchMain);
		click(driver, SearchMain);
		
		if (isDisplayed(driver, ProformaDetials)) {
			System.out.println("Search page opned");
			Extent_pass(driver, "Search page opned", test);
		} else {
			Extent_fail(driver, "Search page not opned", test);
		}
		waitForElement(driver, ProformaCodeInput);
		sendKeys(driver, ProformaCodeInput, word);		
		waitForElement(driver, Searchtable);
		click(driver, Searchtable);
		wait(driver, "1");
		waitForElement(driver, SelectOkBtn);
		click(driver, SelectOkBtn);
		wait(driver, "2");
		verifyElementIsPresent(driver, DraftStatus);
		if (isDisplayed(driver, DraftStatus)) {
			System.out.println("Status is Draft");
			Extent_pass(driver, "Status is Draft", test);
		} else {
			Extent_fail(driver, "Status is not Draft", test);
		}
		waitForElement(driver, Delete);
		click(driver, Delete);
		waitForElement(driver, Performaservicecreation);
		String ReportActivityforDraft = driver.findElement(By.xpath("(//*[contains(text(),'Proforma Service Creation')])[7]//following::span[2]")).getText();
		System.out.println(ReportActivityforDraft);

		if (ExpectedActivityforDraft.equals(ReportActivityforDraft)) {
			System.out.println(
					"Matched || " + " Expected Report Activity is : " + ExpectedActivityforDraft + " || Actual Report Activity is : " + ReportActivityforDraft);
			Extent_pass(driver,
					"Matched || " + " Expected Report Activity is : " + ExpectedActivityforDraft + " || Actual Report Activity is : " + ReportActivityforDraft,test);
		} else {
			System.out.println(
					"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforDraft + " || Actual Report Activity is : " + ReportActivityforDraft);
			Extent_fail(driver,
					"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforDraft + " || Actual Report Activity is : " + ReportActivityforDraft,test);
		}
		waitForElement(driver, PerformaservicecreationDraftPopok);
		click(driver, PerformaservicecreationDraftPopok);
	
	waitForElement(driver, PerformaDeletedMSG);
	if (isDisplayed(driver, PerformaDeletedMSG)) {
		click(driver, PerformaservicecreationDeletedOK);
	
		System.out.println("Proforma Creation Is Deleted");
		Extent_pass(driver, "Proforma Creation Is Deleted", test);
	} else {
		Extent_fail(driver, "Proforma Creation Is not Deleted", test);
	}
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
	waitForElement(driver, Servicenameinpit);
	sendKeys(driver, Servicenameinpit, Servicenamein);
	waitForElement(driver, Vishnu);
	click(driver, Vishnu);
	waitForElement(driver, Selectservicebtn);
	click(driver, Selectservicebtn);
	waitForElement(driver, RemarksInput);
	sendKeys(driver, RemarksInput, Remarksinput);
	waitForElement(driver, AddbUTTON);
	click(driver, AddbUTTON);
	click(driver, AddbUTTON);
	waitForElement(driver, Firstsearch);
	click(driver, Firstsearch);
	waitForElement(driver, Postcodefilterinput);
sendKeys(driver, Postcodefilterinput, Portcodefilter2);
waitForElement(driver, Selectservicebtn);
click(driver, Selectservicebtn);
waitForElement(driver, Firstsearch1);
click(driver, Firstsearch1);
waitForElement(driver, Postcodefilterinput);
sendKeys(driver, Postcodefilterinput, Portcodefilter1);
wait(driver, "2");
waitForElement(driver, Selectservicebtn);
click(driver, Selectservicebtn);
waitForElement(driver, DistancePop);
click(driver, DistancePopok);
waitForElement(driver, Firstsearch2);
click(driver, Firstsearch2);
waitForElement(driver, Postcodefilterinput);
sendKeys(driver, Postcodefilterinput, Portcodefilter2);
wait(driver, "2");
waitForElement(driver, Selectservicebtn);
click(driver, Selectservicebtn);
waitForElement(driver, DistancePop);
click(driver, DistancePopok);
waitForElement(driver, Statuscli);
click(driver, Statuscli);
waitForElement(driver, Statusconformcli);
click(driver, Statusconformcli);
waitForElement(driver, Wcli);
doubleClick(driver, Wcli);
waitForElement(driver, Wcliselect);
click(driver, Wcliselect);
waitForElement(driver, Mainsave);
click(driver, Mainsave);
waitForElement(driver, Subbound);
click(driver, SubboundOK);
	WebElement te1=driver.findElement(By.id("SPF-SPF_txtProformaCde"));
	String word1=te1.getAttribute("Value");
	System.out.println(word1);
	waitForElement(driver, Savedpop);
	click(driver, OKKK);
	waitForElement(driver, SearchMain);
	click(driver, SearchMain);
	
	if (isDisplayed(driver, ProformaDetials)) {
		System.out.println("Search page opned");
		Extent_pass(driver, "Search page opned", test);
	} else {
		Extent_fail(driver, "Search page not opned", test);
	}
	waitForElement(driver, ProformaCodeInput);
	sendKeys(driver, ProformaCodeInput, word1);
	
	waitForElement(driver, Searchtable);
	click(driver, Searchtable);
	wait(driver, "1");
	waitForElement(driver, SelectOkBtn);
	click(driver, SelectOkBtn);
	waitForElement(driver, ConformStatus);
	verifyElementIsPresent(driver, ConformStatus);
	if (isDisplayed(driver, ConformStatus)) {
		System.out.println("Status is Conform");
		Extent_pass(driver, "Status is Conform", test);
	} else {
		Extent_fail(driver, "Status is not Conform", test);
	}
	waitForElement(driver, Delete);
	click(driver, Delete);
	waitForElement(driver, Performaservicecreation);
	String ReportActivityforConform = driver.findElement(By.xpath("(//*[contains(text(),'Proforma Service Creation')])[7]//following::span[2]")).getText();
	System.out.println(ReportActivityforConform);

	if (ExpectedActivityforConform.equals(ReportActivityforConform)) {
		System.out.println(
				"Matched || " + " ReportActivityforConform Report Activity is : " + ExpectedActivityforConform + " || Actual Report Activity is : " + ReportActivityforConform);
		Extent_pass(driver,
				"Matched || " + " Expected Report Activity is : " + ExpectedActivityforConform + " || Actual Report Activity is : " + ReportActivityforConform,test);
	} else {
		System.out.println(
				"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforConform + " || Actual Report Activity is : " + ReportActivityforConform);
		Extent_fail(driver,
				"Not matched || " + " Expected Report Activity is : " + ExpectedActivityforConform + " || Actual Report Activity is : " + ReportActivityforConform,test);
	}
	waitForElement(driver, PerformaservicecreationDraftPopok);
	click(driver, PerformaservicecreationDraftPopok);

waitForElement(driver, PerformaDeletedMSG);
if (isDisplayed(driver, PerformaDeletedMSG)) {
	click(driver, PerformaservicecreationDeletedOK);

	System.out.println("Proforma Creation Is Deleted");
	Extent_pass(driver, "Proforma Creation Is Deleted", test);
} else {
	Extent_fail(driver, "Proforma Creation Is not Deleted", test);
}
waitForElement(driver, SearchMain);
click(driver, SearchMain);

if (isDisplayed(driver, ProformaDetials)) {
	System.out.println("Search page opned");
	Extent_pass(driver, "Search page opned", test);
} else {
	Extent_fail(driver, "Search page not opned", test);
}
waitForElement(driver, ProformaCodeInput);
sendKeys(driver, ProformaCodeInput, word);

waitForElement(driver, Searchtable);
click(driver, Searchtable);
waitForElement(driver, DataNotFound);
WebElement msg = driver.findElement(By.id("lrp_cust_growl_container"));
String result= msg.getText();
System.out.println(result);
wait(driver, "2");
clear(driver, ProformaCodeInput);
sendKeys(driver, ProformaCodeInput, word1);
waitForElement(driver, Searchtable);
click(driver, Searchtable);
waitForElement(driver, DataNotFound);
WebElement msg1 = driver.findElement(By.id("lrp_cust_growl_container"));
String result1= msg1.getText();
System.out.println(result1);
waitForElement(driver, CloseX);
click(driver, CloseX);

}

}


