package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TC_Proforma_Service_Creation_PC02 extends Keywords{
	
	String URL = TestNgXml.getdatafromExecution().get("TC_Proforma_Service_Creation_PC02");
	String Username = Utils.getDataFromTestData("EMS_Module", "Userid", "Proforma_Creation");
	String pass_word = Utils.getDataFromTestData("EMS_Module", "PassWord", "Proforma_Creation");
	String searchfield = Utils.getDataFromTestData("VSS_Module", "Search_modulename", "Proforma_Creation");
	String globalsearchfield = Utils.getDataFromTestData("VSS_Module2", "Global_Searchvalue", "Proforma_Creation");
	String status_dropdowns = Utils.getDataFromTestData("VSS_Module2", "Status_DropdownValue", "Proforma_Creation");
    String servicecode = Utils.getDataFromTestData("VSS_Module", "Servicecode_Name", "Proforma_Creation");
	String New_Service = Utils.getDataFromTestData("VSS_Module", "NewService_Creation", "Proforma_Creation");
	String New_savepopup = Utils.getDataFromTestData("VSS_Module", "Savepopup", "Proforma_Creation");
	String Bound_Valueerror = Utils.getDataFromTestData("VSS_Module2", "Bound_Value", "Proforma_Creation");
	String Change_BoundsValue = Utils.getDataFromTestData("VSS_Module2", "Change_BoundValue", "Proforma_Creation");
	String proforma_updated = Utils.getDataFromTestData("VSS_Module2", "Proforma_Updated", "Proforma_Creation");
	String color_verification = Utils.getDataFromTestData("VSS_Module2", "Green_color", "Proforma_Creation");
	
	
	
	public void Proformacreation02(WebDriver driver) throws Exception{
		
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
		
        click(driver,global_searchicon);
		
		click(driver,global_searchbox);
		
	    String newproformacode = Readdata("Proforma_Code");
		
		sendKeys(driver, global_searchbox, newproformacode);
		
		click(driver,search_btn);
		
		click(driver,global_searchvalue);
			
        click(driver,global_selectbtn);
		
	   click(driver, edit_btn);
		
		
		click(driver,status_dropdown);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[text()='"+status_dropdowns+"'])")));
		driver.findElement(By.xpath("(//li[text()='"+status_dropdowns+"'])")).click();
		
		wait(driver,"1");
		
		
		String StatusDropdownoption = driver.findElement(By.xpath("//*[@id='SPF-SPF_proformastatus_label']")).getText();
		
		System.out.println(StatusDropdownoption);
		
		if(StatusDropdownoption.equals(status_dropdowns)) {
			System.out.println("Expected dropdown option is selected");
			Extent_pass(driver, "Expected dropdown option was selected and the selected option was : "+StatusDropdownoption, test);
		}else {
			System.out.println("Different dropdown option was not selected and the selected option was : "+StatusDropdownoption);
			Extent_fail(driver, "Different dropdown option was not selected and the selected option was : "+StatusDropdownoption, test);
		}  
		
		
		click(driver,proforma_savebtn);
		
		if(bound_errormsg.equals(Bound_Valueerror)) {
			System.out.println("Expected text is present");
		    Extent_pass(driver, "Expected text is present : "+Bound_Valueerror, test);
	    }else {
		System.out.println("Different text is not  present : "+Bound_Valueerror);
		Extent_fail(driver, "Different text is not  present : "+Bound_Valueerror, test);
	}  
	    
		click(driver,click_saveokbtn);
		
		doubleClick(driver, change_boundvalue);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='"+Change_BoundsValue+"'])[1]")));
		driver.findElement(By.xpath("(//*[text()='"+Change_BoundsValue+"'])[1]")).click();
		
		wait(driver,"1");
		
		String boundDropdownoption = driver.findElement(By.xpath("(//*[text()='E'])[1]")).getText();
		
		System.out.println(boundDropdownoption);
		
		if(boundDropdownoption.equals(Change_BoundsValue)) {
			System.out.println("Expected dropdown option is selected");
			Extent_pass(driver, "Expected dropdown option was selected and the selected option was : "+boundDropdownoption, test);
		}else {
			System.out.println("Different dropdown option was not selected and the selected option was : "+boundDropdownoption);
			Extent_fail(driver, "Different dropdown option was not selected and the selected option was : "+boundDropdownoption, test);
		}  
		
		click(driver,proforma_savebtn);
		
		if(proforma_updated.equals(proforma_updated)) {
			System.out.println("Expected text is present and equal");
		    Extent_pass(driver, "Expected text is present : "+proforma_updated, test);
	    }else {
		System.out.println("Different text is not  present : "+proforma_updated);
		Extent_fail(driver, "Different text is not  present : "+proforma_updated, test);
	}  
		
		click(driver,click_saveokbtn);	
		
         String textcolor = getTextBackgroundColor(driver, proforma_code);
	    
	    System.out.println(textcolor);
	    
	    if(textcolor.equals(color_verification)) {
	    	Extent_pass(driver, "proforma code field color was showing as green and the color code was : "+textcolor, test);
	    	}else {
	    	Extent_fail(driver, "proforma code field color was not showing as green and the color code was : "+textcolor, test);
	    }
	} 

}
