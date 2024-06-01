package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Vss_PC09 extends Keywords{
	String url = TestNgXml.getdatafromExecution().get("Testcase1");
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
 		//click(driver,createOk);
 		click(driver,serviceTextfield);
 		sendKeys(driver,serviceTextfield,proformaServiceName);
 		enter(driver);
 		click(driver, remarkTextBox);
 		sendKeys(driver,remarkTextBox,remarkText);
 		click(driver,portSearchButton);
 		if(isDisplayed(driver, selectPort))
 		{
 			click(driver,selectPort);
 	 		click(driver,clickSelect);
 			Extent_pass(driver, "Port selection is displayed", test);
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
 		if(isDisplayed(driver, proformaServicePopup))
 		{
 			verifyElementIsPresent(driver, savedOkButton);
 			click(driver,savedOkButton);
 			Extent_pass(driver, "Proforma Service Popup is displayed", test);
 		}
 		else
 		{
 			Extent_fail(driver, "Proforma Service Popup is not displayed", test);
 		}
 		waitForElement(driver, proformaCode);
 		WebElement proCode=driver.findElement(By.xpath("//input[@id='SPF-SPF_txtProformaCde']"));
 		String actualProformaCode=proCode.getAttribute("value");
 		System.out.println(proCode);
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
 			click(driver,proformaSCOk);
 			Extent_pass(driver, "Proforma Service popup is displayed", test);
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
	
	
	
	
	
	
	
//	
//	
//	WebDriverWait wait = new WebDriverWait(driver, 60);
//	navigateUrl(driver, URL);
//	
//	waitForElementtopresent(driver, loginpage);
//	
//	click(driver,username);
//	
//    sendKeys(driver, username, Username);
//    
//    click(driver,password);
//    
//    sendKeys(driver, password, pass_word);
//    
//    click(driver,Login_btn);
//    
//    if(isDisplayed(driver,Home_page)){
//      click(driver,search_bar);	
//      pass(driver, "Homepage icon is isdisplayed and click searchbar");
//  }else {
//	  fail(driver, "Homepage icon is not isdisplayed");
// }
//    
//    sendKeys(driver, search_bar, searchfield);
//    
//    String  element= getText(driver, proformaservicecrationtext);
//  
//    System.out.println(element);
//    System.out.println(searchfield);
//	if(element.equalsIgnoreCase(searchfield)) {
//		System.out.println("Expected dropdown option is selected");
//		Extent_pass(driver, "Expected dropdown option was selected and the selected option was : "+element, test);
//		click(driver,proformaservicecrationtext);
//	}else {
//		System.out.println("Different dropdown option was not selected and the selected option was : "+element);
//		Extent_fail(driver, "Different dropdown option was not selected and the selected option was : "+element, test);
//	}
//    
//	click(driver, newtoolbar_button);
//	
//	String newproforma = getText(driver, newproformacreation);
//	
//	if(newproforma.equals(New_Service)){
//	    System.out.println("verification text is equal");
//		
//     }else { 
//    	System.out.println("verification text is not equal,"+" Recived: "+newproforma+ " Expected: "+New_Service); 
//     }
//	
//	verifyElementIsPresent(driver, performayes_button);
//	
//	click(driver,performayes_button);
//	
//    click(driver,servicecode_field);
//    
//    sendKeys(driver, servicecode_field, servicecode);
//    
//    enter(driver);
//    
//    click(driver, remark_field);  
//    
//    sendKeys(driver,remark_field, "Test");
//    
//    click(driver,AGgrid_plusicon);
//    
//    click(driver,portsearch_icon);
//    
//    click(driver,click_searchbar);
//    
//    sendKeys(driver, click_searchbar, Port_Value);
//    
//    click(driver,click_searchvalue);
//    
//    click(driver, click_selectbutton);
//    
//    click(driver,clickterminal_searchicon);
//    
//    click(driver,terminalcode_searchbar);
//    
//    sendKeys(driver, terminalcode_searchbar, Terminal_value);
//    
//    click(driver,terminalcode_value);
//    
//    click(driver,click_selectbutton);
//    
//    
//    for(int i=0; i<1; i++) {
//    	
//    	click(driver,AGgrid_plusicon);
//    	
//    }
//    
//    click(driver,proforma_startdate);
//    
//    click(driver,proforma_selectdate);
//    
//    click(driver,portsearch_icon2);
//    
//    click(driver,click_searchbar);
//    
//    sendKeys(driver, click_searchbar, Port_Value1);
//    
//    click(driver,click_searchvalue2);
//    
//    click(driver, click_selectbutton);
//    
//    click(driver,click_aftersearchok_btn);
//    
//    click(driver,clickterminal_searchicon2);
//    
//    click(driver,terminalcode_searchbar);
//  
//     click(driver,terminalcode_value2);
//    
//    click(driver,click_selectbutton);
//    
//   click(driver,portsearch_icon3);
//    
//    click(driver,click_searchbar);
//    
//   sendKeys(driver, click_searchbar, Port_Value);
//    
//   verifyElementIsPresent(driver, click_searchvalue);
//   
//    click(driver,click_searchvalue3);
//    
//    click(driver, click_selectbutton);
//    
//    click(driver,click_aftersearchok_btn);
//
//     click(driver,clickterminal_searchicon3);
//    
//    click(driver,terminalcode_searchbar);
//    
//    sendKeys(driver, terminalcode_searchbar, Terminal_value);
//    
//    verifyElementIsPresent(driver, terminalcode_value3);
// 
//    click(driver,terminalcode_value3);
//    
//    click(driver,click_selectbutton);
//    
//    click(driver,proforma_savebtn);
//    
//    String saveproforma =getText(driver, proforma_creationsave);
//    
//    if(saveproforma.equals(New_savepopup)) {
//		Extent_pass(driver, "Expected text is displayed: "+saveproforma, test);
//    }else {
//		Extent_fail(driver, "Expected text is displayed: "+saveproforma, test);
//	}
//    
//    
//    click(driver,click_saveokbtn);
//    
//   String textcolor = getTextBackgroundColor(driver, proforma_code);
//    
//    System.out.println(textcolor);
//    
//    
//    
//    wait(driver, "2");
//    
//    String[] value = splitXpath(proforma_code);
//	
//	WebElement proformatest = driver.findElement(By.xpath(value[1]));
//	
//	String newproforma_code = proformatest.getAttribute("value");
//    
//    write_data("Proforma_Code", newproforma_code);
//    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
