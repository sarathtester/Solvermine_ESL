package scripts;

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

public class Long_Term_Creation_LT02 extends Keywords {
	
	
	String URL = TestNgXml.getdatafromExecution().get("Long_Term_Creation_LT01");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username", "Long_Term_Creation");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password", "Long_Term_Creation");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input", "Long_Term_Creation");
	String Searchboxinput = Utils.getDataFromTestData("Datas_Details", "SearchBox", "Long_Term_Creation");
	String Searchboxinputlongterm = Utils.getDataFromTestData("Datas_Details", "Longtermsearchinput", "Long_Term_Creation");
	
	
	public void recordEdit (WebDriver driver, ExtentTest test) throws Exception {
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
		sendKeys(driver, LongTermSearchinside, Searchboxinputlongterm);
		wait(driver, "2");
		driver.findElement(By.id("SLT_SearchDialogform-SLT_SrchDialog_txtServiceCode_input")).sendKeys(Keys.ENTER);	
		waitForElement(driver, LongTermsearchOk);
		click(driver, LongTermsearchOk);
		waitForElement(driver, LongTermEDIT);
		click(driver, LongTermEDIT);
		wait(driver, "2");
		waitForElement(driver, editvesselsclick);
		click(driver, editvesselsclick);
		Actions actions = new Actions(driver);
		WebElement edit=driver.findElement(By.xpath("(//td[contains(text(),'CHENNAI')])[1]//following::td[1]"));
		actions.contextClick(edit).perform();
		waitForElement(driver, AddandRemove);
		mouseOverToElement(driver, AddandRemove);
		waitForElement(driver, AddVesselsss);
		click(driver, AddVesselsss);
		waitForElement(driver, Addvesseslssearch);
		click(driver, Addvesseslssearch);
		 WebElement DataA1 = driver.findElement(By.xpath("//div[contains(text(),'562')]//following::div[1]"));
			String portA=DataA1.getText();
		System.out.println(portA);
		waitForElement(driver, Grapes);
		click(driver, Grapes);
		waitForElement(driver, SelectOneselect);
		click(driver, SelectOneselect);
		waitForElement(driver, TabboxOK);
		click(driver, TabboxOK);
		waitForElement(driver, Grapes1);
		 WebElement DataA2 = driver.findElement(By.xpath("(//*[contains(text(),'ONCE TRY')])[1]//following::td[1]"));
			String portB=DataA2.getText();
		System.out.println(portB);
		
		  Set<String> arrset1 = new HashSet<String>(); 
		  arrset1.add(portA); 
	        System.out.println("First Set: "  + arrset1); 
	        
	       
	        Set<String> arrset2 = new HashSet<String>(); 
	        
	       
	        arrset2.add(portB); 
	
	        System.out.println("Second Set: "  + arrset2); 
	        boolean value = arrset1.equals(arrset2); 
	        System.out.println("Are both set equal? "
	                           + value); 
	    } 
		
	
	
	}

