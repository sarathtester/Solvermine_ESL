package proforma_creation_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Proforma_Service_Creation_PC01 extends Keywords{

	String URL = TestNgXml.getdatafromExecution().get("TC_Proforma_Service_Creation_PC01");
	String Username = Utils.getDataFromTestData("EMS_Module", "Userid", "Proforma_Creation");
	String pass_word = Utils.getDataFromTestData("EMS_Module", "PassWord", "Proforma_Creation");
	String searchfield = Utils.getDataFromTestData("VSS_Module", "Search_modulename", "Proforma_Creation");
	String servicecode = Utils.getDataFromTestData("VSS_Module", "Servicecode_Name", "Proforma_Creation");
	String New_Service = Utils.getDataFromTestData("VSS_Module", "NewService_Creation", "Proforma_Creation");
	String New_savepopup = Utils.getDataFromTestData("VSS_Module", "Savepopup", "Proforma_Creation");
	String Port_Value = Utils.getDataFromTestData("VSS_Module", "Portvalue", "Proforma_Creation");
	String Terminal_value = Utils.getDataFromTestData("VSS_Module", "Terminalvalue", "Proforma_Creation");
	String Port_Value1 = Utils.getDataFromTestData("VSS_Module", "Portvalue1", "Proforma_Creation");
	String color_verification = Utils.getDataFromTestData("VSS_Module", "Yellow_color", "Proforma_Creation");
	String remarks_field = Utils.getDataFromTestData("VSS_Module", "Remark_name", "Proforma_Creation");
	String exceptedstartdate = Utils.getDataFromTestData("VSS_Module", "Proforma_Date", "Proforma_Creation");
	
	
	public void Proformacreation01(WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		navigateUrl(driver, URL);
		
		waitForElementtopresent(driver, loginpage);
		
		click(driver,username);
		
	    sendKeys(driver, username, Username);
	    
	    click(driver,password);
	    
	    sendKeys(driver, password, pass_word);
	    
	    click(driver,Login_btn);
	    
	    if(isDisplayed(driver,Home_page)){
	      click(driver,search_bar);	
	      pass(driver, "Homepage icon is isdisplayed and click searchbar");
      }else {
    	  fail(driver, "Homepage icon is not isdisplayed");
	 }
	    
	    sendKeys(driver, search_bar, searchfield);
	    
	    String  element= getText(driver, proformaservicecrationtext);
	  
        System.out.println(element);
        System.out.println(searchfield);
		if(element.equalsIgnoreCase(searchfield)) {
			System.out.println("Expected dropdown option is selected");
			Extent_pass(driver, "Expected dropdown option was selected and the selected option was : "+element, test);
			click(driver,proformaservicecrationtext);
		}else {
			System.out.println("Different dropdown option was not selected and the selected option was : "+element);
			Extent_fail(driver, "Different dropdown option was not selected and the selected option was : "+element, test);
		}
	    
		click(driver, newtoolbar_button);
		
		String newproforma = getText(driver, newproformacreation);
		
		if(newproforma.equals(New_Service)){
		    System.out.println("verification text is equal");
			
	     }else { 
	    	System.out.println("verification text is not equal,"+" Recived: "+newproforma+ " Expected: "+New_Service); 
	     }
		
		verifyElementIsPresent(driver, performayes_button);
		
		click(driver,performayes_button);
		
        click(driver,servicecode_field);
	    
	    sendKeys(driver, servicecode_field, servicecode);
	    
	    enter(driver);
	    
	    click(driver, remark_field);  
	    
	    sendKeys(driver,remark_field,remarks_field);
	    
	    click(driver,AGgrid_plusicon);
	    
	    click(driver,portsearch_icon);
	    
	    click(driver,click_searchbar);
	    
	    sendKeys(driver, click_searchbar, Port_Value);
	    
	    click(driver,click_searchvalue);
	    
	    click(driver, click_selectbutton);
	    
	    String port_codefield =getText(driver, portcode_field);
	    
	    if(port_codefield.equals(Port_Value)) {
	    	Extent_pass(driver, "Expected port code was selected and the port code was: "+port_codefield, test);
	    }else {
	    	Extent_fail(driver, "Expected port code was not selected and the port code was: "+port_codefield, test);
	    }
	    
	 
	    click(driver,clickterminal_searchicon);
	    
	    click(driver,terminalcode_searchbar);
	    
	    sendKeys(driver, terminalcode_searchbar, Terminal_value);
	    
	    click(driver,terminalcode_value);
	    
	    click(driver,click_selectbutton);
	    
	    
	    for(int i=0; i<1; i++) {
	    	
	    	click(driver,AGgrid_plusicon);
	    	
	    }
	    
	    click(driver,proforma_startdate);
	    
	    click(driver,proforma_selectdate);
		
	    click(driver,portsearch_icon2);
	    
        click(driver,click_searchbar);
	    
	    sendKeys(driver, click_searchbar, Port_Value1);
	    
	    click(driver,click_searchvalue2);
	    
	    click(driver, click_selectbutton);
	    
	    click(driver,click_aftersearchok_btn);
	    
	    String portcode1 = getText(driver, portcode_field1);
	    
	    if(portcode1.equals(Port_Value1)) {
	    	Extent_pass(driver, "Expected port code was selected and the port code was: "+portcode1, test);
	    }else {
	    	Extent_fail(driver, "Expected port code was not selected and the port code was: "+portcode1, test);
	    }
	    
	    click(driver,clickterminal_searchicon2);
	    
        click(driver,terminalcode_searchbar);
	  
	     click(driver,terminalcode_value2);
	    
	    click(driver,click_selectbutton);
	    
       click(driver,portsearch_icon3);
	    
        click(driver,click_searchbar);
	    
       sendKeys(driver, click_searchbar, Port_Value);
	    
       verifyElementIsPresent(driver, click_searchvalue);
       
	    click(driver,click_searchvalue3);
	    
	    click(driver, click_selectbutton);
	    
	    click(driver,click_aftersearchok_btn);
	    
	    String portcode2 = getText(driver, portcode_field2);
	    
	    if(portcode2.equals(Port_Value)) {
	    	Extent_pass(driver, "Expected port code was selected and the port code was: "+portcode2, test);
	    }else {
	    	Extent_fail(driver, "Expected port code was not selected and the port code was: "+portcode2, test);
	    }

	     click(driver,clickterminal_searchicon3);
	    
	    click(driver,terminalcode_searchbar);
	    
	    sendKeys(driver, terminalcode_searchbar, Terminal_value);
	    
	    verifyElementIsPresent(driver, terminalcode_value3);
	 
	    click(driver,terminalcode_value3);
	    
	    click(driver,click_selectbutton);
	    
	    click(driver,proforma_savebtn);
	    
	    wait(driver,"4");
	    
	    String saveproforma =getText(driver, proforma_creationsave);
	    
	    if(saveproforma.equals(New_savepopup)) {
			Extent_pass(driver, "Expected text is displayed and text was: "+saveproforma, test);
	    }else {
			Extent_fail(driver, "Expected text is not displayed and text was: "+saveproforma, test);
		}
	    
	    
	    click(driver,click_saveokbtn);
	    
	    wait(driver,"4");
	    
	   String textcolor = getTextBackgroundColor(driver, proforma_code);
	    
	    System.out.println(textcolor);
	    
	    if(textcolor.equals(color_verification)) {
	    	Extent_pass(driver, "proforma code field color was showing as yellow and the color code was : "+textcolor, test);
	    	}else {
	    	Extent_fail(driver, "proforma code field color was not showing as yellow and the color code was : "+textcolor, test);
	    }
	    
	    wait(driver, "2");
	    
	    String[] values = splitXpath(proforma_code);
		
		WebElement proformatest = driver.findElement(By.xpath(values[1]));
		
		String newproforma_code = proformatest.getAttribute("value");
	    
	    write_data("Proforma_Code", newproforma_code);
	    
	    
	}
}
