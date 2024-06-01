package scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Proforma_Service_Creation_PC04 extends Keywords{
	
	String URL = TestNgXml.getdatafromExecution().get("TC_EMS_Contract_Registration_TS001");
	String Username = Utils.getDataFromTestData("EMS_Module", "Userid", "Proforma_Creation");
	String pass_word = Utils.getDataFromTestData("EMS_Module", "PassWord", "Proforma_Creation");
	String searchfield = Utils.getDataFromTestData("VSS_Module", "Search_modulename", "Proforma_Creation");
	String New_Service = Utils.getDataFromTestData("VSS_Module", "NewService_Creation", "Proforma_Creation");
	String servicecode = Utils.getDataFromTestData("VSS_Module", "Servicecode_Name", "Proforma_Creation");
	String Port_Value = Utils.getDataFromTestData("VSS_Module", "Portvalue", "Proforma_Creation");
	String Port_Value1 = Utils.getDataFromTestData("VSS_Module", "Portvalue1", "Proforma_Creation");
	String Port_Value2 = Utils.getDataFromTestData("VSS_Module", "Portvalue2", "Proforma_Creation");
	String update_Timezone = Utils.getDataFromTestData("VSS_Module3", "Updated_TimeZone", "Proforma_Creation");
	String Change_BoundsValue = Utils.getDataFromTestData("VSS_Module2", "Change_BoundValue", "Proforma_Creation");
	String Updatedterminal_code = Utils.getDataFromTestData("VSS_Module2", "Updated_terminal", "Proforma_Creation");
	String addnew_portcode = Utils.getDataFromTestData("VSS_Module3", "Add_Portcode", "Proforma_Creation");
	String editexe_portcode = Utils.getDataFromTestData("VSS_Module3", "Edit_Portcode", "Proforma_Creation");
	
	public void Proformacreation04(WebDriver driver) {
		
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
	    
		click(driver,newtoolbar_button);
		

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
	    
	    click(driver,quickproforma);
	    
	    sendKeys(driver, quickproforma_portcode, Port_Value);
	    
	    enter(driver);
	    
	    wait(driver,"1");
	    
	    sendKeys(driver, quickproforma_portcode, Port_Value1);
	    
	    enter(driver);
	    
	    wait(driver,"1");
	    
	    sendKeys(driver, quickproforma_portcode, Port_Value2);
	    
	    enter(driver);
	    
	    wait(driver,"1");
	    
        sendKeys(driver, quickproforma_portcode, Port_Value);
	    
	    enter(driver);
	    
	    wait(driver,"2");
	    
	    doubleClick(driver, editport);
	    
	    wait(driver, "3");
	    
	    clear(driver, quickproforma_portcode);
	    
	    sendKeys(driver, quickproforma_portcode, editexe_portcode);
	    
	    enter(driver);
	    
	    String Update_portcode = getText(driver, updatedportcode);
	   
	   if(!Update_portcode.equals(Port_Value2)) {
		   Extent_pass(driver, "The portcode verification test is not equal : "+Port_Value2, test);
	   }else {
		   Extent_fail(driver, "The portcode verification test is equal : "+Port_Value2, test);
		
	}
	   
	   
	   click(driver,changetimezone);
	   
	   Newclear_Type(driver);
	  
	   waitForElement5(driver, changetimezone);
	   click(driver,changetimezone);
	   wait(driver,"2");
	   
	   Actionsendkeys(driver,changetimezone,"3");
	   
	   click(driver,timezonechangetime);
	   
        Newclear_Type(driver);

	   waitForElement5(driver, timezonechangetime);
	   click(driver,timezonechangetime);
	   wait(driver,"2");
	   
	   Actionsendkeys(driver,timezonechangetime,"3.3");
	   
	   click(driver,Boundvalue);
	   
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[text()='"+Change_BoundsValue+"'])[2]")));
		driver.findElement(By.xpath("(//li[text()='"+Change_BoundsValue+"'])[2]")).click();
		
		wait(driver,"1");
		
		String boundDropdownoption = driver.findElement(By.xpath("//*[@id='quickProformaCreation_defaultDsGrid1-0-SPF_quic_boundmenu_label']")).getText();
		
		System.out.println(boundDropdownoption);
		
		if(boundDropdownoption.equals(Change_BoundsValue)) {
			System.out.println("Expected dropdown option is selected");
			Extent_pass(driver, "Expected dropdown option was selected and the selected option was : "+boundDropdownoption, test);
		}else {
			System.out.println("Different dropdown option was not selected and the selected option was : "+boundDropdownoption);
			Extent_fail(driver, "Different dropdown option was not selected and the selected option was : "+boundDropdownoption, test);
		}  
	   
		String quickproformaterminalcode =getText(driver, quickproforma_terminalcode);
		
		System.out.println(quickproformaterminalcode);
		
		click(driver, click_terminalcodesearchicon);
		
		click(driver,search_terminalcode);
		
		click(driver, leasekind_selectbutton);
		
		 if(!quickproformaterminalcode.equals(Updatedterminal_code)) {
			   Extent_pass(driver, "The portcode verification test is not equal : "+quickproformaterminalcode, test);
		   }else {
			   Extent_fail(driver, "The portcode verification test is equal : "+quickproformaterminalcode, test);
			
		}
		   
		String beforemoving = getText(driver, Quickproforma_portname);
		
		click(driver,click_moveup);
		
		String aftermoving =getText(driver, aftermove_portname);
		
		if(aftermoving.equals(beforemoving)) {
			System.out.println("selected port was moved up");
			  Extent_pass(driver, "selected port was moved up and moved port name was: "+aftermoving, test);
		}else {
			System.out.println("Selected port was not moved");
			Extent_fail(driver, "selected port was not moved up and port name was: "+aftermoving, test);
		}
		
		
		click(driver,editport);
		
		click(driver,quickproforma_portcode);
		
		sendKeys(driver, quickproforma_portcode, addnew_portcode);
		
		enter(driver); 
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='"+addnew_portcode+"']")))!= null){
		
			System.out.println("Given port was added in the proforma port list");
			Extent_pass(driver, "Given port was added in the proforma port list",test);
		}else {
			System.out.println("Given port was not added in the proforma port list");
			Extent_fail(driver, "Given port was added in the proforma port list",test);
		}
		
		String portname1 =getText(driver, aftermove_portname);
		
		String portname2 =getText(driver,Quickproforma_portname);
		
		String portname3=getText(driver,Quickproforma_portname3);
		
		String portname4=getText(driver,Quickproforma_portname4);
		
		String portname5=getText(driver,Quickproforma_portname5);
		
//		String Addedportname[]= {portname1,portname2,portname3,portname4,portname5};
		
		List<String> Addedportname = new ArrayList<>();
		Addedportname.add(portname1);
		Addedportname.add(portname2);
		Addedportname.add(portname3);
		Addedportname.add(portname4);
		Addedportname.add(portname5);
		
		click(driver,quickproforma_okbtn);
		
		wait(driver,"2");
		
		List<String> Newaddedportname = new ArrayList<>(); // Create an ArrayList to store strings

		for (int i = 0; i <= 4; i++) {
		    String proformaportname = driver.findElement(By.xpath("((//div[@row-id='"+i+"'])[2]//following::div)[2]")).getText();
		    Newaddedportname.add(proformaportname); // Add each element to the ArrayList
		}
		
		System.out.println("Newaddedportname:" +Newaddedportname );
		
		System.out.println("Addedportname:" +Addedportname);
		
		if(Addedportname.equals(Newaddedportname)) {
			System.out.println("Quick proforma ports added in the proforma port list");
			Extent_pass(driver, "Quick proforma ports added in the proforma port list",test);
		}else {
			System.out.println("Quick proforma ports are not added in the proforma port list");
			Extent_fail(driver, "Quick proforma ports are not added in the proforma port list",test);
		}
	}
	
	
}
