package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Long_Term_Creation_LT01  extends Keywords{
	
	
	String URL = TestNgXml.getdatafromExecution().get("Long_Term_Creation_LT01");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username", "Long_Term_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password", "Long_Term_Creation");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input", "Long_Term_Creation");
	String Searchservicecode1 = Utils.getDataFromTestData("Datas_Details", "ServiceName", "Long_Term_Creation");
	String ServiceCode = Utils.getDataFromTestData("Equipment_Details", "ServiceCode", "Long_Term_Creation");
	String Remarksinput = Utils.getDataFromTestData("Equipment_Details", "Remarks", "Long_Term_Creation");
	String PortCodein = Utils.getDataFromTestData("Equipment_Details", "PortCode", "Long_Term_Creation");
	String PortCodein1 = Utils.getDataFromTestData("Datas_Details", "SearchBoxSecond", "Long_Term_Creation");
	String PortCodein2 = Utils.getDataFromTestData("Datas_Details", "Servicecodeinputfill", "Long_Term_Creation");
	String PortCodein3 = Utils.getDataFromTestData("Equipment_Details", "PortCode3", "Long_Term_Creation");
	String PortCodein5 = Utils.getDataFromTestData("Equipment_Details", "PortCode5", "Long_Term_Creation");
	String Buffertime = Utils.getDataFromTestData("Equipment_Details", "BufferTime", "Long_Term_Creation");
	String Tocycles = Utils.getDataFromTestData("Datas_Details", "ToCycle", "Long_Term_Creation");
	String Newaddport = Utils.getDataFromTestData("Equipment_Details", "NewAdd", "Long_Term_Creation");
	String ProformacodeInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCode", "Long_Term_Creation");
	String ExpectedActivityforDeployed = Utils.getDataFromTestData("Equipment_Details", "ValidationForDeployed", "Long_Term_Creation");
	String ProformaCodeDraftInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeDraft", "Long_Term_Creation");
	String ExpectedActivityforDraft = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Long_Term_Creation");
	String ProformaCodeConformInput = Utils.getDataFromTestData("Equipment_Details", "ProformaCodeConform", "Long_Term_Creation");
	String ExpectedActivityforConform = Utils.getDataFromTestData("Equipment_Details", "ValidationForDraft", "Long_Term_Creation");
	String Searchboxinput = Utils.getDataFromTestData("Datas_Details", "SearchBox", "Long_Term_Creation");
	String ServiceCreationsearch = Utils.getDataFromTestData("Datas_Details", "ServiceCreation", "Long_Term_Creation");
	String serviceinputCode = Utils.getDataFromTestData("Datas_Details", "ServiceCode", "Long_Term_Creation");
	String Serviceinputname = Utils.getDataFromTestData("Datas_Details", "ServiceName", "Long_Term_Creation");
	String Freque = Utils.getDataFromTestData("Datas_Details", "Frequency", "Long_Term_Creation");
	String Shipnoenter = Utils.getDataFromTestData("Datas_Details", "ShipsNO", "Long_Term_Creation");
	String TBNNumber = Utils.getDataFromTestData("Datas_Details", "TBMVESSELS", "Long_Term_Creation");
	String Voyageinput1 = Utils.getDataFromTestData("Datas_Details", "VoyageInput1", "Long_Term_Creation");
	String Voyageinput2 = Utils.getDataFromTestData("Datas_Details", "VoyageInput2", "Long_Term_Creation");
	String Voyageinput3 = Utils.getDataFromTestData("Datas_Details", "VoyageInput3", "Long_Term_Creation");
	String Voyageinput4 = Utils.getDataFromTestData("Datas_Details", "VoyageInput4", "Long_Term_Creation");
	String Voyageinputinc1 = Utils.getDataFromTestData("Datas_Details", "VoyageInputIncrease1", "Long_Term_Creation");
	String Voyageinputinc2 = Utils.getDataFromTestData("Datas_Details", "VoyageInputIncrease2", "Long_Term_Creation");
	String Voyageinputinc3 = Utils.getDataFromTestData("Datas_Details", "VoyageInputIncrease3", "Long_Term_Creation");
	String Voyageinputinc4 = Utils.getDataFromTestData("Datas_Details", "VoyageInputIncrease4", "Long_Term_Creation");
	String Blankvessels = Utils.getDataFromTestData("Datas_Details", "BLANKVESSELS", "Long_Term_Creation");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Createrecord (WebDriver driver, ExtentTest test) throws Exception {
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
		
//		verifyElementIsPresent(driver, Search_Input);
//		sendKeys(driver, Search_Input, ServiceCreationsearch);
//		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);
//		waitForElement(driver, Servicecode_input);
//	sendKeys(driver, Servicecode_input, serviceinputCode);
//	waitForElement(driver, Servicename_input);
//	sendKeys(driver, Servicename_input, Serviceinputname);
//	waitForElement(driver, NoofboundDD);
//	click(driver, NoofboundDD);
//	waitForElement(driver, NoofboundDDselect);
//	click(driver, NoofboundDDselect);
//	waitForElement(driver, Frequevency);
//	sendKeys(driver, Frequevency, Freque);
//	waitForElement(driver, Serach_ServiceType);
//	click(driver,Serach_ServiceType);
//	waitForElement(driver, Serach_ServiceTypeselect);
//	click(driver, Serach_ServiceTypeselect);
//	waitForElement(driver, Statuscheck);
//	click(driver, Statuscheck);
//	waitForElement(driver, Statuscheckok);
//	click(driver, Statuscheckok);
//	waitForElement(driver, Noofships);
//	doubleClick(driver, Noofships);
//	
//	Robot robots;
//	try {
//		robots=new Robot();
//		robots.keyPress(KeyEvent.VK_3);
//		wait(driver, "1");
//		robots.keyRelease(KeyEvent.VK_3);
//		robots.keyPress(KeyEvent.VK_ENTER);
//		robots.keyRelease(KeyEvent.VK_ENTER);;
//	} catch (AWTException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
////	waitForElement(driver, Noofships);
////	sendKeys(driver, Noofships,Shipnoenter);
//	waitForElement(driver, SerCreSAVE);
//	click(driver, SerCreSAVE);
//	waitForElement(driver, Savedpop);
//click(driver, OKK);
//	
//	
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		sendKeys(driver, ServiceCodeInput, Searchservicecode1);
		wait(driver, "1");
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
		waitForElement(driver, PortCodeInput);
		sendKeys(driver, PortCodeInput, PortCodein);
		wait(driver, "2");
		action.sendKeys(Keys.ENTER).build().perform();
		wait(driver, "1");
		waitForElement(driver, PortCodeInput);
		sendKeys(driver, PortCodeInput, PortCodein1);
		wait(driver, "2");
		action.sendKeys(Keys.ENTER).build().perform();
		wait(driver, "2");
		waitForElement(driver, PortCodeInput);
		sendKeys(driver, PortCodeInput, PortCodein);
		wait(driver, "1");
		action.sendKeys(Keys.ENTER).build().perform();
		waitForElement(driver, OkBtn);
		click(driver, OkBtn);
		
		waitForElement(driver, Mainsave);
		click(driver, Mainsave);
		waitForElement(driver, Savedpop);
	click(driver, OKK);
		
		waitForElement(driver, Editbarmain);
		click(driver, Editbarmain);
		
		 waitForElement(driver, Splitbound)  ;
		 click(driver, Splitbound);
		waitForElement(driver, Select1Colm);
		click(driver, Select1Colm);
		waitForElement(driver, Select1Colmadd);
		click(driver, Select1Colmadd);
		wait(driver, "1");
		waitForElement(driver, Select1Colmaddsave);
		click(driver, Select1Colmaddsave);
		waitForElement(driver, Splitupdatedpop);
		click(driver, SplitupdatedpopOK);
		waitForElement(driver, Statuscli);
		click(driver, Statuscli);
		waitForElement(driver, Statusconformcli);
		click(driver, Statusconformcli);
		waitForElement(driver, Mainsave);
		click(driver, Mainsave);
		waitForElement(driver, Splitpop);
		click(driver, SplitpopOK);
		 WebElement DataA1 = driver.findElement(By.xpath("//input[@id='SPF-SPF_txtProformaCde']"));
			String portA=DataA1.getAttribute("Value");
		System.out.println(portA);
		waitForElement(driver, Search_Input1);
		sendKeys(driver, Search_Input1, Searchboxinput);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);	
		waitForElement(driver, Newbtn1);
		click(driver, Newbtn1);
		waitForElement(driver, Newbtn1);
		if (isDisplayed(driver, Newbtn1pop)) {
			click(driver, Newbtn1popOK);
			System.out.println("New tap opened");
			Extent_pass(driver, "New tap opened", test);
		} else {
			Extent_fail(driver, "New tap not opened", test);
		}
		waitForElement(driver, ServiceInputFill);
		sendKeys(driver, ServiceInputFill, Searchservicecode1);
		wait(driver, "1");
		driver.findElement(By.id("SLT-SLT_txtServiceName_input")).sendKeys(Keys.ENTER);	
		 waitForElement(driver, Allproformabox);
		 click(driver, Allproformabox);
		 waitForElement(driver, PerformaCodeSearch);
		 click(driver, PerformaCodeSearch);
		 waitForElement(driver, PerformaCodeSearchfilter);
		sendKeys(driver, PerformaCodeSearchfilter, portA);
		wait(driver, "1");
		waitForElement(driver, Selectservicebtn);
		click(driver, Selectservicebtn);
		waitForElement(driver, ToCycle);
		clear(driver, ToCycle);
		sendKeys(driver, ToCycle, Tocycles);
	
		waitForElement(driver, AddVessels);
		click(driver, AddVessels);
		waitForElement(driver, SelectOne);
		click(driver, SelectOne);
		waitForElement(driver, Selecttwo);
		click(driver, Selecttwo);
		waitForElement(driver, SelectOnetwoSelect);
		click(driver, SelectOnetwoSelect);
		waitForElement(driver, NOOFTBM);
		click(driver, NOOFTBM);
		waitForElement(driver, NOOFTBMInput);
		clear(driver, NOOFTBMInput);
		sendKeys(driver, NOOFTBMInput, TBNNumber);
		waitForElement(driver, NOOFTBMInputAdd);
		click(driver, NOOFTBMInputAdd);
		
		click(driver, NOOFTBMEMTY);
		waitForElement(driver, NOOFTBMEMTY);
		clear(driver, NOOFTBMInputEMTY);
		sendKeys(driver, NOOFTBMInputEMTY, TBNNumber);
		waitForElement(driver, NOOFTBMInputAddEMTY);
		click(driver, NOOFTBMInputAddEMTY);
		waitForElement(driver, Voyageinput1fill);
		sendKeys(driver, Voyageinput1fill, Voyageinput1);
		waitForElement(driver, Voyageinput2fill);
		click(driver, Voyageinput2fill);
		sendKeys(driver, Voyageinput2fill, Voyageinput2);
		waitForElement(driver, Voyageinput3fill);
		click(driver, Voyageinput3fill);
		sendKeys(driver, Voyageinput3fill, Voyageinput3);
		waitForElement(driver, Voyageinput4fill);
		click(driver, Voyageinput4fill);
		sendKeys(driver, Voyageinput4fill, Voyageinput4);
		
		waitForElement(driver, Incrementvoyageinput1);
		doubleClick(driver, Incrementvoyageinput1);
		new Actions(driver).sendKeys("Voyageinputinc2").perform();
		
		waitForElement(driver, Incrementvoyageinput2);
		doubleClick(driver, Incrementvoyageinput2);
		new Actions(driver).sendKeys("deleteAllCookies").perform();
		new Actions(driver).sendKeys("Voyageinputinc2").perform();
		
		waitForElement(driver, Incrementvoyageinput3);
		doubleClick(driver, Incrementvoyageinput3);
		new Actions(driver).sendKeys("deleteAllCookies").perform();
		new Actions(driver).sendKeys("Voyageinputinc3").perform();
		
		
		waitForElement(driver, Incrementvoyageinput4);
		doubleClick(driver, Incrementvoyageinput4);
		new Actions(driver).sendKeys("Voyageinputinc4").perform();
		click(driver, Voyageinput1fill);
		waitForElement(driver, Makelongterm);
		click(driver, Makelongterm);
		
		
//		driver.findElement(By.xpath("(//*[@col-id='incVoyage'])[2]")).sendKeys(Keys.ENTER);	
//		Actions action1 = new Actions(driver);
//		action1.sendKeys(Keys.1").build().perform();
//		sendKeys(driver, Incrementvoyageinput1,Voyageinputinc1);
	//	sendKeys(driver, Incrementvoyageinput1, Voyageinputinc1);
//		waitForElement(driver, Incrementvoyageinput2);
//		doubleClick(driver, Incrementvoyageinput2);
//		clear(driver, Incrementvoyageinput2);
//		sendKeys(driver, Incrementvoyageinput2, Voyageinputinc2);
//		waitForElement(driver, Incrementvoyageinput3);
//		doubleClick(driver, Incrementvoyageinput3);
//		clear(driver, Incrementvoyageinput3);
//		sendKeys(driver, Incrementvoyageinput3, Voyageinputinc3);
//		waitForElement(driver, Incrementvoyageinput4);
//		doubleClick(driver, Incrementvoyageinput4);
//		clear(driver, Incrementvoyageinput4);
//		sendKeys(driver, Incrementvoyageinput4, Voyageinputinc4);
//		waitForElement(driver, Makelongterm);
//		click(driver, Makelongterm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}


	
	
	
	
	
	

}
