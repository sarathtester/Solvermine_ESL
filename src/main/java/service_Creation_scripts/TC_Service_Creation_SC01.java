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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

//Create New Service Creation: 
public class TC_Service_Creation_SC01 extends Keywords{
	
	String name = Utils.getDataFromTestData("SOLVERMINDS","Username","Service_Creation");
	String URL = TestNgXml.getdatafromExecution().get("TC_Service_Creation_SC01");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username","Service_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password","Service_Creation");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search","Service_Creation");
	String ServiceCode = Utils.getDataFromTestData("SOLVERMINDS", "Service_Code","Service_Creation");
	String ServiceName = Utils.getDataFromTestData("SOLVERMINDS", "Service_Name","Service_Creation");
	String Frequ = Utils.getDataFromTestData("SOLVERMINDS", "Frequency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("SOLVERMINDS", "No_Ships","Service_Creation");
	
	
	LocalTime currentTime = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
	String formattedTime = currentTime.format(formatter);
	String SerInc = "AZ"+formattedTime;
	
	LocalTime currentTime1 = LocalTime.now();
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHmmss");
	String formattedTime1 = currentTime.format(formatter1);
	String SerName = "TD"+formattedTime1;

	public void ServiceCreation(WebDriver driver, ExtentTest test) {
		
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
		waitForElement(driver, Service_CodeI);
		System.out.println("Service Code " + SerInc);
		sendKeys(driver, Service_CodeI, SerInc);
		
		waitForElement(driver, Service_NameI);
		System.out.println("Service Name " + SerName);
		sendKeys(driver, Service_NameI, SerName);
		waitForElement(driver,No_of_Bound);
		click(driver,No_of_Bound);
		click(driver,Bound1);
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
		if (isDisplayed(driver, Freqency)) {
			System.out.println("Freqency Entered successfully");
			Extent_pass(driver, "Freqency Entered successfully", test);
		}else {
			System.out.println("Unable to Enter Freqency");
			Extent_fail(driver, "Unable to Enter Freqency", test);
		}
		
//		waitForElement(driver, No_of_Ships);
//		click(driver,No_of_Ships);
		
		waitForElement(driver, No_of_Ships1);
		doubleClick(driver, No_of_Ships1);
		new Actions(driver).sendKeys(NoShips).perform();
		
//		Robot robots;
//		try {
//			robots=new Robot();
//			robots.keyPress(KeyEvent.VK_3);
//			robots.keyRelease(KeyEvent.VK_3);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		wait(driver,"3");
//		if(isDisplayed(driver, No_of_Ships)) {
//			System.out.println("No.Of.Ships Entered successfully");
//			Extent_pass(driver, "No.Of.Ships Entered successfully", test);
//		}else {
//			System.out.println("Unable to Enter No.Of.Ships");
//			Extent_fail(driver, "Unable to Enter No.Of.Ships", test);
//		}
//		wait(driver,"10");
//		String Expected_value = "3";
//		String Actual_value = getAttribute1(driver, Entered_ShipValue, "value");
//		System.out.println(Expected_value + " " + Actual_value);
//		if(Expected_value.equals(Actual_value)) {
//			System.out.println("No.Of.Ships Entered successfully");
//			Extent_pass(driver, "No.Of.Ships Entered successfully", test);
//			
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
		String Expected_value = "2";
		String Actual_value = getAttribute1(driver, Entered_ShipValue, "value");
		System.out.println(Expected_value + " " + Actual_value);
		if(Expected_value.equals(Actual_value)) {
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
		
		String[] savesercode = splitXpath(Edit_Service_Code); 
		WebElement createdValue = driver.findElement(By.xpath(savesercode[1]));
		String savedValue = createdValue.getAttribute("value");
		System.out.println(savedValue);
		if(savedValue.equals(SerInc)) {
			Extent_pass(driver, "Service Code Entered Captured Successfully", test);
		}else {
			Extent_fail(driver, "Service Code Entered is not Captured", test);
		}
		
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
