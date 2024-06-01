package scripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

import commonMethods.Keywords;

public class Vss_SC06 extends Keywords {
	String url = TestNgXml.getdatafromExecution().get("Testcase1");
 	String username = Utils.getDataFromTestData("ESL", "Username","Service_Creation");
 	String password = Utils.getDataFromTestData("ESL", "Password","Service_Creation");
 	String ModuleSearch = Utils.getDataFromTestData("ESL", "ModuleName","Service_Creation");
 	String serviceCode = Utils.getDataFromTestData("ESL", "ServiceCode","Service_Creation");
 	String ServiceName = Utils.getDataFromTestData("ESL", "ServiceName","Service_Creation");
 	String Frequ = Utils.getDataFromTestData("ESL", "Freqency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("ESL", "NoOfShips","Service_Creation");
	String ServiceDelete = Utils.getDataFromTestData("ESL", "ServiceDelete","Service_Creation");

     public void vSS_SC06(WebDriver driver)
     {
    
    	WebDriverWait wait = new WebDriverWait(driver, 60);
 		navigateUrl(driver, url);
 //Login page
 		waitForElement(driver, Username_Input);
 		click(driver,Username_Input);
 		sendKeys(driver, Username_Input, username);
 		waitForElement(driver, Password_Input);
 		click(driver,Password_Input);
 		sendKeys(driver, Password_Input, password);
 		waitForElement(driver, Login);
 		click(driver, Login);
 //Home page	
 		waitForElement(driver, Module_Search);
 		click(driver,Module_Search);
 		sendKeys(driver,Module_Search,ModuleSearch);
 		enter(driver);
 		
 //Service creation	
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
 		waitForElement(driver, Service_Code);
 		//System.out.println("Service Code " + SerInc);
 		sendKeys(driver, Service_Code, serviceCode);
 		
 		waitForElement(driver, Service_Name);
 		//System.out.println("Service Name " + ServiceName);
 		sendKeys(driver, Service_Name, ServiceName);
 		waitForElement(driver,No_of_Bound);
 		click(driver,No_of_Bound);
 		click(driver,Bound1);
 		waitForElement(driver,Service_Type); 
 		click(driver,Service_Type);
 		click(driver,Service_Type_Feeder);
 		wait(driver,"5");
 		waitForElement(driver, Freqency);
 		click(driver,Freqency);
 		Robot robot;
 		try {
 			robot=new Robot();
 			robot.keyPress(KeyEvent.VK_7);
 			robot.keyRelease(KeyEvent.VK_7);
 		} catch (AWTException e) 
 		{
 			e.printStackTrace();
 		}
 		
 		waitForElement(driver, No_of_Ships);
 		click(driver,No_of_Ships);
 		Robot robots;
 		try {
 			robots=new Robot();
 			robots.keyPress(KeyEvent.VK_7);
 			robots.keyRelease(KeyEvent.VK_7);
 		} catch (AWTException e) 
 		{
 			e.printStackTrace();
 		}
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
//Delete service		
 		waitForElement(driver,selectService);
 		click(driver,selectService);
 		doubleClick(driver,selectService);
 		click(driver,deleteButton);
 		if(isDisplayed(driver,servicePopup)) 
 		{ 		
 		click(driver,confirmationPopup);
 		}
 		
 		waitForElement(driver, filterOption);
 		click(driver,filterOption);
 		waitForElement(driver, conditionFilter);
 		click(driver,conditionFilter);
 		sendKeys(driver,serviceCodeTextbox,serviceCode);
 		String actualServiceCode=getText(driver,selectService);
 		if(actualServiceCode.equals(serviceCode))
 		{
		  Extent_pass(driver, "Searched value correctly displayed", test);
 		}else {
 			Extent_fail(driver, "Searched value incorrectly displayed", test);
 		}
 		waitForElement(driver,selectService);
 		doubleClick(driver,selectService);
 		click(driver,deleteButton);
 		
 		String deletPopupExp="Do you want to delete this record permanently?";
 		
 		if(isDisplayed(driver,servicePopup)) {
 			System.out.println("Service delete popup displayed");
 			
 			String deletPopupAct = getText(driver,Success_Message);
 			if(deletPopupAct.equals(deletPopupExp))
 			{
 				
 				Extent_pass(driver, "Service delete popup displayed", test);
 				click(driver,deleteOk);
 			}
 			else
 			{
 				click(driver,confirmationPopup);
 			}
 			
 		}else {
 			Extent_fail(driver, "Service delete popup not displayed", test);
 		}
	 	click(driver,confirmationPopup);
//Logout
	 	click(driver,User_Logout);
	 	wait(driver,"2");
	 	verifyElementIsPresent(driver, Logout_Popup);
 		click(driver,Logout_Yes);
    	 

     }
}
