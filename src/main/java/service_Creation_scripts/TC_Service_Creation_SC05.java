package service_Creation_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;



public class TC_Service_Creation_SC05 extends Keywords {
	
	String name = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String URL = TestNgXml.getdatafromExecution().get("TC_Service_Creation_SC02");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password", "Service_Creation");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search", "Service_Creation");
	String Enter_Servicecode = Utils.getDataFromTestData("SOLVERMINDS", "Enter_Servicecode", "Service_Creation");
	String Service_Code = Utils.getDataFromTestData("SOLVERMINDS", "Service_Code", "Service_Creation");
	String Service_Name = Utils.getDataFromTestData("SOLVERMINDS", "Service_Name", "Service_Creation");
	String Start_Date3 = Utils.getDataFromTestData("SOLVERMINDS", "Start_Date3", "Service_Creation");
	String End_Date3 = Utils.getDataFromTestData("SOLVERMINDS", "End_Date3", "Service_Creation");
	String Frequ = Utils.getDataFromTestData("SOLVERMINDS", "Frequency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("SOLVERMINDS", "No_Ships","Service_Creation");
	
	

	public void DuplicateRecordsCheck(WebDriver driver, ExtentTest test) {
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

		} else {
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
		click(driver,Service_CodeI);
		sendKeys(driver, Service_CodeI, Service_Code);
		click(driver,Service_NameI);
		sendKeys(driver, Service_NameI, Service_Name);
		waitForElement(driver,No_of_Bound);
		click(driver,No_of_Bound);
		click(driver,Bound4);
		waitForElement(driver,Service_Type);
		click(driver,Service_Type);
		click(driver,Service_Type_Feeder);
		wait(driver,"5");
		waitForElement(driver, Freqency);
		click(driver,Freqency);
		new Actions(driver).sendKeys(Frequ).perform();
//		Robot robot;
//		try {
//			robot=new Robot();
//			robot.keyPress(KeyEvent.VK_7);
//			robot.keyRelease(KeyEvent.VK_7);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(isDisplayed(driver, Freqency)) {
			System.out.println("Freqency Entered successfully");
			Extent_pass(driver, "Freqency Entered successfully", test);
		}else {
			System.out.println("Unable to Enter Freqency");
			Extent_fail(driver, "Unable to Enter Freqency", test);
		}
		wait(driver, "5");
		waitForElement(driver, No_of_Ships1);
		click(driver, No_of_Ships1);
		new Actions(driver).sendKeys(NoShips).perform();
		
//		Robot robots;
//		try {
//			robots=new Robot();
//			robots.keyPress(KeyEvent.VK_3);
//			robots.keyRelease(KeyEvent.VK_3);
//			robots.keyPress(KeyEvent.VK_ENTER);
//			robots.keyRelease(KeyEvent.VK_ENTER);;
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		wait(driver,"5");
//		if(isDisplayed(driver, No_of_Ships1)) {
//			System.out.println("No.Of.Ships Entered successfully");
//			Extent_pass(driver, "No.Of.Ships Entered successfully", test);
//		}else {
//			System.out.println("Unable to Enter No.Of.Ships");
//			Extent_fail(driver, "Unable to Enter No.Of.Ships", test);
//		}
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
		String ExpTextD = "This Service Code already exists";
		click(driver,Save_Button);
		
		if (isDisplayed(driver, Popup_ServiceC)) {
			System.out.println("Service code already exists popup displayed");
			Extent_pass(driver, "Service code already exists popup displayed", test);
			wait(driver,"2");
			String ActTextD = getText(driver,Success_Message);
			System.out.println(ExpTextD);
			System.out.println(ActTextD);
			if (ExpTextD.equals(ActTextD)) {
				Extent_pass(driver, "Service code already exists Message Displayed successfully", test);
			}else {
				Extent_fail(driver, "Service Creation not saved due to duplicate service code", test);
				
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
