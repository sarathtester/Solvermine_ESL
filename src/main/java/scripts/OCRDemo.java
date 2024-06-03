package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class OCRDemo extends Keywords {
	
	String name = Utils.getDataFromTestData("DISTILL","Username","Sheet1");
	 
	public void ocrDemo(WebDriver driver) {
		
//		
		navigateUrl(driver, "https://lrpv2atesting.solverminds.net/main");

		waitForElement1(driver, username);
		sendKeys(driver, username, "v2atesting");

		waitForElement(driver, password);
		sendKeys(driver, password, "P@ssw0rd");

		click(driver, Login_btn);
       
	}
}