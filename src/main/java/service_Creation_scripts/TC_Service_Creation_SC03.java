package service_Creation_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;


public class TC_Service_Creation_SC03 extends Keywords {
	
	String name = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String URL = TestNgXml.getdatafromExecution().get("TC_Service_Creation_SC03");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password", "Service_Creation");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search", "Service_Creation");
	String Enter_Servicecode = Utils.getDataFromTestData("SOLVERMINDS", "Enter_Servicecode", "Service_Creation");
	String Service_Code = Utils.getDataFromTestData("SOLVERMINDS", "Service_Code", "Service_Creation");
	String Service_Name = Utils.getDataFromTestData("SOLVERMINDS", "Service_Name", "Service_Creation");
	String Start_Date1 = Utils.getDataFromTestData("SOLVERMINDS", "Start_Date1", "Service_Creation");
	String End_Date1 = Utils.getDataFromTestData("SOLVERMINDS", "End_Date1", "Service_Creation");
	String Start_Date2 = Utils.getDataFromTestData("SOLVERMINDS", "Start_Date2", "Service_Creation");
	String End_Date2 = Utils.getDataFromTestData("SOLVERMINDS", "End_Date2", "Service_Creation");
	String Frequ = Utils.getDataFromTestData("SOLVERMINDS", "Frequency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("SOLVERMINDS", "No_Ships","Service_Creation");
	
	LocalTime currentTime = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
	String formattedTime = currentTime.format(formatter);
	String SerInc = "DC"+formattedTime;
	
	public void ServiceCreationValidations(WebDriver driver, ExtentTest test) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		navigateUrl(driver, URL);
		waitForElement(driver, Username_Input);
		sendKeys(driver, Username_Input, Username);
		waitForElement(driver, Password_Input);
		sendKeys(driver, Password_Input, Password);
		waitForElement(driver, Login);
		click(driver, Login);
		if (isDisplayed(driver, Home_Logo)) {
			System.out.println("User Logged Successfully");
			Extent_pass(driver, "User Logged Successfully", test);
			
		}else {
			System.out.println("User Unable to Login");
			Extent_fail(driver, "User Unable to Login", test);
		}
		
		waitForElement(driver, Module_Search);
		click(driver, Module_Search);
		sendKeys(driver, Module_Search,ModuleSearch);
		click(driver,Click_Service_Creation);
		if (isElementAccessible(driver, New_Service_Creation)) {
			click(driver,New_Service_Creation);			
		}else {
			click(driver,Cancel_button);
			click(driver,New_Service_Creation);
		}
		String ExpectedSC = "Do you want to create a new Service ?";
		if (isDisplayed(driver, Pop_upSC)) {
			System.out.println("New Service Creation popup displayed");
			Extent_pass(driver, "New Service Creation popup displayed", test);
			wait(driver,"2");
			String ActualText = getText(driver,Pop_confirmcheck);
			if(ExpectedSC.equals(ActualText)) {
				Extent_pass(driver, "Service Creation for New Service Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for New Service Not Displayed", test);
			}		
		}else {
			Extent_fail(driver, "Acceptance is Not Required", test);
		}
		click(driver,New_Service_Creation_Yes);
		click(driver,Save_Button);
		String ExpectedSCI = "Enter the Service Code";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Enter the service code popup Displayed");
			Extent_pass(driver, "Enter the service code popup Displayed", test);
			String ActualTextS = getText(driver,Pop_confirmcheck);
			if(ExpectedSCI.equals(ActualTextS)){
				Extent_pass(driver, "Service Creation for Enter Service Code Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Enter Service Code not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Service Code");
			Extent_fail(driver, "Unable to Display Service Code", test);
		}
		wait(driver,"3");
		click(driver,Service_CodeI);		
		waitForElement(driver, Service_CodeI);
		System.out.println("Service Code " + SerInc);
		sendKeys(driver, Service_CodeI, SerInc);
		
		
		
		click(driver,Save_Button);
		String ExpectedSCN = "Enter the Service Name";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Enter the service Name popup Displayed");
			Extent_pass(driver, "Enter the service Name popup Displayed", test);
			String ActualTextSN = getText(driver,Pop_confirmcheck);
			if(ExpectedSCN.equals(ActualTextSN)){
				Extent_pass(driver, "Service Creation for Enter Service Name Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Enter Service Name not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Service Name");
			Extent_fail(driver, "Unable to Display Service Name", test);
		}
		wait(driver,"5");
		click(driver,Service_NameI);
		sendKeys(driver, Service_NameI, Service_Name);
		click(driver,Save_Button);
		String ExpectedSCB = "Select the No. of Bound";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Select the No. of Bound Popup Displayed");
			Extent_pass(driver, "Select the No. of Bound popup Displayed", test);
			String ActualTextSB = getText(driver,Pop_confirmcheck);
			if(ExpectedSCB.equals(ActualTextSB)){
				Extent_pass(driver, "Service Creation for Select the No. of Bound Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Select the No. of Bound not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Select the No. of Bound");
			Extent_fail(driver, "Unable to Display Select the No. of Bound", test);
		}
		wait(driver,"3");
		waitForElement(driver,No_of_Bound);
		click(driver,No_of_Bound);
		click(driver,Bound3);
		click(driver,Save_Button);
		String ExpectedSCT = "Select the Service Type";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Select the Service Type Popup Displayed");
			Extent_pass(driver, "Select the Service Type popup Displayed", test);
			String ActualTextST = getText(driver,Pop_confirmcheck);
			if(ExpectedSCT.equals(ActualTextST)){
				Extent_pass(driver, "Service Creation for Select the Service Type Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Select the Service Type not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Select the Service Type");
			Extent_fail(driver, "Unable to Display Select the Service Type", test);
		}
		waitForElement(driver,Service_Type);
		click(driver,Service_Type);
		click(driver,Service_Type_Feeder);
		click(driver,Save_Button);
		String ExpectedSCF = "Enter the Frequency";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Enter the Frequency Popup Displayed");
			Extent_pass(driver, "Enter the Frequency popup Displayed", test);
			String ActualTextSF = getText(driver,Pop_confirmcheck);
			if(ExpectedSCF.equals(ActualTextSF)){
				Extent_pass(driver, "Service Creation for Enter the Frequency Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Enter the Frequency not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Enter the Frequency");
			Extent_fail(driver, "Unable to Display Enter the Frequency", test);
		}
				
		waitForElement(driver, Freqency);
		click(driver,Freqency);
		new Actions(driver).sendKeys(Frequ).perform();

		if(isDisplayed(driver, Freqency)) {
			System.out.println("Freqency Entered successfully");
			Extent_pass(driver, "Freqency Entered successfully", test);
		}else {
			System.out.println("Unable to Enter Freqency");
			Extent_fail(driver, "Unable to Enter Freqency", test);
		}
		click(driver,Save_Button);
		String ExpectedSCNShips = "Number of Ships must be greater than Zero";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("Number of Ships must be greater than Zero Popup Displayed");
			Extent_pass(driver, "Number of Ships must be greater than Zero", test);
			String ActualTextSNships = getText(driver,Pop_confirmcheck);
			if(ExpectedSCNShips.equals(ActualTextSNships)){
				Extent_pass(driver, "Service Creation for Number of Ships must be greater than Zero Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Service Creation for Number of Ships must be greater than Zero not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display Number of Ships must be greater than Zero");
			Extent_fail(driver, "Unable to Display Number of Ships must be greater than Zero", test);
		}
		wait(driver, "5");
		waitForElement(driver, No_of_Ships1);
		doubleClick(driver, No_of_Ships1);
		new Actions(driver).sendKeys(NoShips).perform();
		
		
		waitForElement(driver, Ext_Fdr);
		click(driver,Ext_Fdr);
		click(driver,Ext_Fdr_Y);
		
		waitForElement(driver,Start_Date);
		click(driver,Start_Date);
		if(isDisplayed(driver, Calender)) {
			System.out.println("Start Date Calender is Available");
			Extent_pass(driver, "Start Date Calender is Available", test);
		}else {
			System.out.println("Start Date Calender is not Available");
			Extent_fail(driver, "Start Date Calender is Available", test);
		}
		click(driver,Start_Date_Select);
		
		waitForElement(driver,End_Date);
		click(driver,End_Date);
		if(isDisplayed(driver, Calender)) {
			System.out.println("End Date Calender is Available");
			Extent_pass(driver, "End Date Calender is Available", test);
		}else {
			System.out.println("End Date Calender is not Available");
			Extent_fail(driver, "End Date Calender is Available", test);
		}
		click(driver,End_Date_Select);
		
		
		//No ships failure script
		wait(driver,"5");
		if(isDisplayed(driver, No_of_Ships1)) {
			System.out.println("No.Of.Ships Entered successfully");
			Extent_pass(driver, "No.Of.Ships Entered successfully", test);
		}else {
			System.out.println("Unable to Enter No.Of.Ships");
			Extent_fail(driver, "Unable to Enter No.Of.Ships", test);
		}
		
		waitForElement(driver,Status);
		click(driver,Status);
		waitForElement(driver,Status_Active);
		click(driver,Status_Active);
		String ExpText = "Service Creation saved";
		click(driver,Save_Button);
		
		if (isDisplayed(driver, Popup_ServiceC)) {
			System.out.println("Service Creation popup displayed");
			Extent_pass(driver, "Service Creation popup displayed", test);
			wait(driver,"2");
			String ActText = getText(driver,Success_Message);
			System.out.println(ExpText);
			System.out.println(ActText);
			if (ExpText.equals(ActText)) {
				Extent_pass(driver, "Service Creation saved successfully", test);
			}else {
				Extent_fail(driver, "Service Creation not saved", test);
				
			}
		}else {
			System.out.println("Unable to Save Service Creation");
			Extent_fail(driver, "Unable to Save Service Creation", test);
		}
		wait(driver,"2");
		click(driver,ServiceCreation_OK);
		
		wait(driver,"5");
		String ExpLogout = "Are you sure want to logout?";
		click(driver,User_Logout);
		if(isDisplayed(driver,Logout_Popup)) {
			System.out.println("Logout Pop up Displayed Successfully");
			Extent_pass(driver, "Logout Pop up Displayed Successfully", test);
			wait(driver,"2");
			String ActTextL = getText(driver,Logout_Text);
			if(ExpLogout.equals(ActTextL)) {
				Extent_pass(driver, "Logout Message Displayed Successfully", test);
			}else {
				Extent_fail(driver, "Unable to Display Logout Message", test);
			}
		}else {
			System.out.println("Unable to Display Log Out Popup");
			Extent_fail(driver, "Unable to Display Log 	Out Popup", test);
		}
		wait(driver,"3");
		click(driver,Logout_Yes);
		driver.quit();
		
	}

}
