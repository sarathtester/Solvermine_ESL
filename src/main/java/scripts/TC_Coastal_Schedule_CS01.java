package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Coastal_Schedule_CS01 extends Keywords{

	String name = Utils.getDataFromTestData("SOLVERMINDS","Username","Coastal_Schedule");
	String URL = TestNgXml.getdatafromExecution().get("TC_Coastal_Schedule_CS01");
	String Username = Utils.getDataFromTestData("SOLVERMINDS", "Username","Coastal_Schedule");
	String Password = Utils.getDataFromTestData("SOLVERMINDS", "Password","Coastal_Schedule");
	String ModuleSearch = Utils.getDataFromTestData("SOLVERMINDS", "Module_Search","Coastal_Schedule");
	
	public void CoastalSchedule(WebDriver driver, ExtentTest test) {
		
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
		click(driver,Click_Coastal_Schedule);
		
	}

}
