package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Long_Term_Creation_LT03 extends Keywords {
	
	
	String URL = TestNgXml.getdatafromExecution().get("Long_Term_Creation_LT01");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username", "Long_Term_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password", "Long_Term_Creation");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input", "Long_Term_Creation");
	String Searchboxinput = Utils.getDataFromTestData("Datas_Details", "SearchBox", "Long_Term_Creation");
	String Searchboxinputlongterm = Utils.getDataFromTestData("Datas_Details", "Longtermsearchinput", "Long_Term_Creation");
	String Conformdarainput = Utils.getDataFromTestData("Datas_Details", "ConformData", "Long_Term_Creation");
	
	
	public void recordConform (WebDriver driver, ExtentTest test) throws Exception {
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

		wait(driver, "2");

		if (isDisplayed(driver, Home_Logo)) {
			System.out.println("Home page is displayed");
			Extent_pass(driver, "Home page is displayed", test);
		} else {
			Extent_fail(driver, "Home page is not displayed", test);
		}
		verifyElementIsPresent(driver, Search_Input);
		sendKeys(driver, Search_Input, Searchboxinput);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);
		
		waitForElement(driver, LongTermSearch);
		click(driver, LongTermSearch);
		waitForElement(driver, LongTermSearchinside);
		sendKeys(driver, LongTermSearchinside, Conformdarainput);
		wait(driver, "2");
		driver.findElement(By.id("SLT_SearchDialogform-SLT_SrchDialog_txtServiceCode_input")).sendKeys(Keys.ENTER);	
		waitForElement(driver, LongTermsearchOk);
		click(driver, LongTermsearchOk);
		waitForElement(driver, LongTermEDIT);
		click(driver, LongTermEDIT);
		wait(driver, "2");

}}
