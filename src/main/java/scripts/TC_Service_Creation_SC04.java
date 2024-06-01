package scripts;

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

public class TC_Service_Creation_SC04 extends Keywords {
	
	String name = Utils.getDataFromTestData("SOLVERMINDS","Username","Service_Creation");
	String URL = TestNgXml.getdatafromExecution().get("TC_Service_Creation_SC01");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username","Service_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password","Service_Creation");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search","Service_Creation");
	String ServiceCode = Utils.getDataFromTestData("SOLVERMINDS", "Service_Code","Service_Creation");
	String ServiceName = Utils.getDataFromTestData("SOLVERMINDS", "Service_Name","Service_Creation");
	String Frequ = Utils.getDataFromTestData("SOLVERMINDS", "Freqency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("SOLVERMINDS", "No_Ships","Service_Creation");
	String Start_Date1 = Utils.getDataFromTestData("SOLVERMINDS", "Start_Date1", "Service_Creation");
	String End_Date1 = Utils.getDataFromTestData("SOLVERMINDS", "End_Date1", "Service_Creation");
	
	
	LocalTime currentTime = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss");
	String formattedTime = currentTime.format(formatter);
	String SerInc = "HD"+formattedTime;
	
	LocalTime currentTime1 = LocalTime.now();
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHmmss");
	String formattedTime1 = currentTime.format(formatter1);
	String SerName = "TD"+formattedTime1;
	
	public void SCInvalidData(WebDriver driver, ExtentTest test) {
		
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
//			robot = new Robot();
//			robot.delay(1000);
//			robot.keyPress(KeyEvent.VK_MINUS);
//			robot.keyRelease(KeyEvent.VK_MINUS);
//			robot.delay(1000);
//			robot.keyPress(KeyEvent.VK_3);
//			robot.keyRelease(KeyEvent.VK_3);
//		} catch (AWTException e) {
//			
//		}    
		
		if(isDisplayed(driver, Freqency)) {
			System.out.println("Freqency Entered successfully");
			Extent_pass(driver, "Freqency Entered successfully", test);
		}else {
			System.out.println("Unable to Enter Freqency");
			Extent_fail(driver, "Unable to Enter Freqency", test);
		}
		
		waitForElement(driver, No_of_Ships1);
		click(driver,No_of_Ships1);
		new Actions(driver).sendKeys(NoShips).perform();
		
//		Robot robots;
//		try {
//			robots = new Robot();
//			robots.delay(1000);
//			robots.keyPress(KeyEvent.VK_MINUS);
//			robots.keyRelease(KeyEvent.VK_MINUS);
//			robots.delay(1000);
//			robots.keyPress(KeyEvent.VK_2);
//			robots.keyRelease(KeyEvent.VK_2);
//			robots.keyPress(KeyEvent.VK_ENTER);
//			robots.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			
//		}
//		wait(driver,"3");
//		String Expected_value = "2";
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
		doubleClick(driver,Start_Date);
		sendKeys(driver, Start_Date, Start_Date1);
		
		wait(driver,"3");
		waitForElement(driver,End_Date);
		doubleClick(driver,End_Date);
		sendKeys(driver, End_Date, End_Date1);
		click(driver,Save_Button);
		String EndDateStart = "End Date must be greater than or equal to Start Date";
		if(isDisplayed(driver,Pop_upSC )) {
			System.out.println("End Date must be greater than or equal to Start Date Popup Displayed");
			Extent_pass(driver, "End Date must be greater than or equal to Start Date Popup Displayed", test);
			String ActualSE = getText(driver,Pop_confirmcheck);
			if(EndDateStart.equals(ActualSE)){
				Extent_pass(driver, "End Date must be greater than or equal to Start Date Displayed Successfully", test);
			}else {
				Extent_fail(driver, "End Date must be greater than or equal to Start Date not Displayed", test);
			}
			click(driver,ServiceCreation_OK);
		}else {
			System.out.println("Unable to Display End Date must be greater than or equal to Start Date Popup Displayed");
			Extent_fail(driver, "Unable to Display End Date must be greater than or equal to Start Date Popup Displayed", test);
		}
		
		wait(driver,"3");
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
