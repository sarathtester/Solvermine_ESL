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

public class TC_Service_Creation_SC02 extends Keywords {

	String name = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String URL = TestNgXml.getdatafromExecution().get("TC_Service_Creation_SC02");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username", "Service_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password", "Service_Creation");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search", "Service_Creation");
	String Enter_Servicecode = Utils.getDataFromTestData("SOLVERMINDS", "Enter_Servicecode", "Service_Creation");
	String Service_Code = Utils.getDataFromTestData("SOLVERMINDS", "Service_Code", "Service_Creation");
	String Frequ = Utils.getDataFromTestData("SOLVERMINDS", "Frequency","Service_Creation");
	String NoShips = Utils.getDataFromTestData("SOLVERMINDS", "No_Ships","Service_Creation");

	public void EditServiceCreation(WebDriver driver, ExtentTest test) {

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
		sendKeys(driver, Module_Search, ModuleSearch);
		click(driver, Click_Service_Creation);
		waitForElement(driver, Search_Service_Button);
		click(driver, Search_Service_Button);
		wait(driver, "3");
		sendKeys(driver, Serach_ServiceCode, Service_Code);

		click(driver, Serach_Buton);
		wait(driver, "5");
		doubleClick(driver, Select_Searched_Value);
		click(driver, Edit_Button);
		LocalTime currentTime = LocalTime.now();
		LocalTime currentTime1 = LocalTime.now();
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime1 = currentTime.format(formatter1);
		String SerName = "SD" + formattedTime1;

		clearAndType(driver, Service_NameI, SerName);
		System.out.println("Service Name edited successfully");
		waitForElement(driver, No_of_Bound);
		click(driver, No_of_Bound);
		click(driver, Bound2);
		waitForElement(driver, Service_Type);
		click(driver, Service_Type);
		click(driver, Service_Type_MainLine);

		wait(driver, "5");
		waitForElement(driver, Freqency);
		new Actions(driver).sendKeys(Frequ).perform();
//		Robot robot;
//		try {
//			robot = new Robot();
//			robot.keyPress(KeyEvent.VK_3);
//			robot.keyRelease(KeyEvent.VK_3);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);		
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(isDisplayed(driver, Freqency)) {
			System.out.println("Freqency Edited successfully");
			Extent_pass(driver, "Freqency Edited successfully", test);
		}else {
			System.out.println("Unable to Edit Freqency");
			Extent_fail(driver, "Unable to Edit Freqency", test);
		}
		
		wait(driver, "3");
		waitForElement(driver, No_of_Ships1);
		new Actions(driver).sendKeys(NoShips).perform();
//		Robot robots;
//		try {
//			robots = new Robot();
//			robots.keyPress(KeyEvent.VK_1);
//			robots.keyRelease(KeyEvent.VK_1);
//			robots.keyPress(KeyEvent.VK_ENTER);
//			robots.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		wait(driver,"3");
//		if(isDisplayed(driver, No_of_Ships1)) {
//			System.out.println("No.Of.Ships Edited successfully");
//			Extent_pass(driver, "No.Of.Ships Edited successfully", test);
//		}else {
//			System.out.println("Unable to Edit No.Of.Ships");
//			Extent_fail(driver, "Unable to Edit No.Of.Ships", test);
//		}
		wait(driver, "3");
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
		
		String[] sDate = splitXpath(Start_Date);
		WebElement stdate = driver.findElement(By.xpath(sDate[1]));
		String strstdate = stdate.getAttribute("value");
		
		String[] eDate = splitXpath(End_Date);
		WebElement end_date = driver.findElement(By.xpath(eDate[1]));
		String endate = end_date.getAttribute("value");
		
		if(!strstdate.equals(endate)) {
			System.out.println("The start and end date is different");
			Extent_pass(driver, "The start and end date is different", test);
		}else {
			System.out.println("The start and end date is same or less");
			Extent_fail(driver, "The start and end date is same or less", test);
		}
		wait(driver,"3");
		if(isDisplayed(driver, No_of_Ships1)) {
			System.out.println("No.Of.Ships Edited successfully");
			Extent_pass(driver, "No.Of.Ships Edited successfully", test);
		}else {
			System.out.println("Unable to Edit No.Of.Ships");
			Extent_fail(driver, "Unable to Edit No.Of.Ships", test);
		}
		String ExpText = "Service Creation updated";
		click(driver,Save_Button); 
		if (isDisplayed(driver, Popup_ServiceC)) {
			System.out.println("Service Creation updated");
			Extent_pass(driver, "Service Creation updated Successfully", test);
			wait(driver,"2");
			String ActText = getText(driver,Success_Message);
			System.out.println(ExpText);
			System.out.println(ActText);
			if (ExpText.equals(ActText)) {
				Extent_pass(driver, "Service Creation updated", test);
			}else {
				Extent_fail(driver, "Service Creation not updated", test);
				
			}
		}else {
			System.out.println("No change to Update");
			Extent_fail(driver, "No change to Update", test);
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
