package proforma_creation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Proforma_Service_Creation_PC09 extends Keywords{
	String url = TestNgXml.getdatafromExecution().get("TC_Proforma_Service_Creation_PC09");
 	String username = Utils.getDataFromTestData("ESL", "Username","Proforma_Creation");
 	String password = Utils.getDataFromTestData("ESL", "Password","Proforma_Creation");
 	String proformaModuleSearch = Utils.getDataFromTestData("ESL", "ModuleProforma","Proforma_Creation");
 	String proformaServiceCode=Utils.getDataFromTestData("ESL", "ProformaSearchCode", "Proforma_Creation");
	String serviceCodeColor=Utils.getDataFromTestData("ESL","ServiceCodeColor","Proforma_Creation");
	String proformaCodeColor=Utils.getDataFromTestData("ESL","ProformaCodeColor","Proforma_Creation");
	String proformaServiceName=Utils.getDataFromTestData("ESL", "ProformaServiceName", "Proforma_Creation");
	String remarkText=Utils.getDataFromTestData("ESL", "RemarkText", "Proforma_Creation");
	
	public void vSS_PC09(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,60);
		navigateUrl(driver,url);
//Login
		waitForElement(driver, Username_Input);
 		click(driver,Username_Input);
 		sendKeys(driver, Username_Input, username);
 		waitForElement(driver, Password_Input);
 		click(driver,Password_Input);
 		sendKeys(driver, Password_Input, password);
 		waitForElement(driver, Login);
 		click(driver, Login);
//Home 
 		waitForElement(driver, Module_Search);
 		click(driver,Module_Search);
 		sendKeys(driver,Module_Search,proformaModuleSearch);
 		enter(driver);
//Proforma service creation
 		waitForElement(driver, toolbarNewButton);
 		click(driver,toolbarNewButton);
 		//String createPopup=getText(driver,proformaServicePopup);
 		
 		if(isDisplayed(driver, proformaServicePopup))
 		{
 			click(driver,createOk);
 		}
 		click(driver,serviceTextfield);
 		sendKeys(driver,serviceTextfield,proformaServiceName);
 		enter(driver);
 		click(driver, remarkTextBox);
 		sendKeys(driver,remarkTextBox,remarkText);
 		click(driver,portSearchButton);
 		if(isDisplayed(driver, selectPort))
 		{
 			Extent_pass(driver, "Port selection is displayed", test);
 			click(driver,selectPort);
 	 		click(driver,clickSelect);
 			
 		}
 		else
 		{
 			Extent_fail(driver, "Port selection is not displayed", test);
 		}
 		click(driver,terminalSearchButton);
 		if(isDisplayed(driver, terminalSearchButton))
 		{			
 	 		click(driver,selectTerminal);
 	 		click(driver,clickSelect);
 	 		Extent_pass(driver, "Terminal selection is displayed", test);
 		}
 		else
 		{
 			Extent_fail(driver, "Terminal selection is not displayed", test);
 		}
 		waitForElement(driver, toolbarSaveButton);
 		click(driver,toolbarSaveButton);
 		
 		wait(driver,"4");
 		
 		if(isDisplayed(driver, proformaServicePopup))
 		{
 			Extent_pass(driver, "Proforma Service Popup is displayed", test);
 			verifyElementIsPresent(driver, savedOkButton);
 			click(driver,savedOkButton);
 		}
 		else
 		{
 			Extent_fail(driver, "Proforma Service Popup is not displayed", test);
 		}
 		waitForElement(driver, proformaCode);
 		WebElement proCode=driver.findElement(By.xpath("//input[@id='SPF-SPF_txtProformaCde']"));
 		String actualProformaCode=proCode.getAttribute("value");
 		click(driver,closeButton_1);
 		
 		click(driver,Module_Search);
 		sendKeys(driver,Module_Search,proformaModuleSearch);
 		enter(driver);
 		
 		
 	
//Proforma service creation status to Inactive
 		
 		click(driver,toolbarSearchButton);
 		if(isDisplayed(driver, searchbyCode))
 	 	{
 			waitForElement(driver, searchbyCode);
 	 		sendKeys(driver,searchbyCode,actualProformaCode);
 	 		click(driver,clickSearch);
 	 		click(driver,selectCode);
 	 		click(driver,selectButton);
 		}
 		
 		
 		waitForElement(driver, toolbarEditButton);
 		click(driver,toolbarEditButton);
 		if(isElementAccessible(driver, proformaStatus))
 		{
 			click(driver,proformaStatus);
 	        if(isDisplayed(driver, selectStatus));
 	        {
 	        	click(driver,selectStatus);
 	        }
 	       Extent_pass(driver, "Proforma Service Status is accessible", test);
 		}
 		else
 		{
 			Extent_fail(driver, "Proforma Service Status is not accessible", test);
 		}
 		click(driver,toolbarSaveButton);
 		waitForElement(driver, proformaSCPopup);
 		if(isDisplayed(driver, proformaSCPopup))
 		{
 			
 			Extent_pass(driver, "Proforma Service popup is displayed", test);
 			click(driver,proformaSCOk);
 		}
 		else
 		{
 			Extent_fail(driver, "Proforma Service popup is not displayed", test);
 		}
 				
//Color Verification
 	
 	if(getTextBackgroundColor(driver, proformaCode).equalsIgnoreCase(proformaCodeColor))
 	{
 	  System.out.println("The background is red");
 	  Extent_pass(driver, "The background color is red", test);
 	}
 	else
 	{
 		System.out.println("The background color is not red");
 		Extent_fail(driver, "The background is not red", test);
 	}
 	
//Logout
 	    click(driver,User_Logout);
		wait(driver,"2");
		verifyElementIsPresent(driver, Logout_Popup);
		click(driver,Logout_Yes);
		
	}
	

	
	
}
