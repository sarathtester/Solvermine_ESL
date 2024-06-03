package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.google.common.base.Verify;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import net.bytebuddy.asm.Advice.Enter;

public class TC_Booking_SC01_SC02 extends Keywords {
	

	String URL = TestNgXml.getdatafromExecution().get("TC_Booking_SC01_SC02");
	String Username = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Username","Sheet3");
	String Password = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Password","Sheet3");
	String Search = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Search_input","Sheet3");
	String orgin = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Orgin","Sheet3");
	String Orgin_input_exp=Utils.getDataFromTestData("SOLVERMINE_BOOKING", "OrginExp","Sheet3");
	String delivery = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Delivery","Sheet3");
	String delivery_input_exp=Utils.getDataFromTestData("SOLVERMINE_BOOKING", "DeliveryExp","Sheet3");
	String Agt = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "AGR_Party","Sheet3");
	String Agt_Exp = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "AGRExp","Sheet3");
	String cskname = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "CSK_NAME","Sheet3"); 
	String container = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Cointainer ","Sheet3");
	String containersearch = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Searchinput","Sheet3");
	String dv20input = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "DV","Sheet3");
	String ninput = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "NINPUT","Sheet3");
	String dvnnumber = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Equipmentinputsearch","Sheet3");
	String dvnnumber1 = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Equipmentinputsearch1","Sheet3");
	String Cargowei = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Cargoweight","Sheet3");
	String editinput = Utils.getDataFromTestData("SOLVERMINE_BOOKING", "Equipmentinputsearchedit","Sheet3");
	String caninput = Utils.getDataFromTestData("Equipment_Details", "Canequipnum","Sheet3");
	String bookingErrorColorexp = Utils.getDataFromTestData("Equipment_Details", "Greencolour","Sheet3");
	String bookingErrorColorexp1 = Utils.getDataFromTestData("Equipment_Details", "Yelloecolour","Sheet3");
	
	
	public void Booking(WebDriver driver, ExtentTest test) throws Exception {
	
		WebDriverWait wait = new WebDriverWait(driver, 60);

		navigateUrl(driver, URL);
		
		if(wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='nfr_login_btnlogin']"),
				"Login"))) {
			System.out.println("LogIn page is displayed");
			Extent_pass(driver, "LogIn in page is displayed", test);
		}else {
			Extent_fail(driver, "Sign in page is not displayed", test);
		}
		
		waitForElement(driver, Username_input); 
		sendKeys(driver, Username_input, Username);

		waitForElement(driver, Password_input);
		sendKeys(driver, Password_input, Password); 

		waitForElement(driver, Login);
		click(driver, Login);

		wait(driver, "6");
		   
        if(isDisplayed(driver,Home_Logo)) {
        	System.out.println("Home page is displayed");
			Extent_pass(driver, "Home page is displayed", test);
		}else {
			Extent_fail(driver, "Home page is not displayed", test);
		}
        verifyElementIsPresent(driver, Switchprofile);
        click(driver, Switchprofile);
	
        verifyElementIsPresent(driver, Assad);
        click(driver, Assad);
      verifyElementIsPresent(driver, SwitchBtn);
      click(driver, SwitchBtn);
		verifyElementIsPresent(driver,Search_Input);
		sendKeys(driver, Search_Input, Search);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);	
verifyElementIsPresent(driver, Orgin);
verifyElementIsPresent(driver, OrginInput);
sendKeys(driver, OrginInput, orgin);
WebElement webElement = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOL111_input']"));
webElement.sendKeys(Keys.TAB);
if(verifyElementIsPresent(driver,OrginInput)) {
	String Orgin_input_Act=getText(driver,OrginInput);
	textValidation(driver,Orgin_input_exp,Orgin_input_Act,OrginInput);
}
verifyElementIsPresent(driver, Delivery);
verifyElementIsPresent(driver, DeliveryInput);
sendKeys(driver, DeliveryInput, delivery);
WebElement webElement1 = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOD111_input']"));
webElement1.sendKeys(Keys.TAB);
driver.manage().window().fullscreen();
if(verifyElementIsPresent(driver,DeliveryInput)) {
	String delivery_input_Act=getText(driver,DeliveryInput);
	textValidation(driver,delivery_input_exp,delivery_input_Act,DeliveryInput);
}	

verifyElementIsPresent(driver, AgrParty);
verifyElementIsPresent(driver, AgrPartyInput);
sendKeys(driver, AgrPartyInput, Agt);
WebElement webElement2 = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtAgrPartyName_input']"));
webElement2.sendKeys(Keys.TAB);

if(verifyElementIsPresent(driver,DeliveryInput)) {
	String Agt_Act=getText(driver,DeliveryInput);
	textValidation(driver,Agt_Exp,Agt_Act,DeliveryInput);
}	
verifyElementIsPresent(driver, RatedBtn);
click(driver, RatedBtn);
verifyElementIsPresent(driver, $Rates);
click(driver, $Rates);
waitForElement(driver, RaterefreshTap);
if(isDisplayed(driver,RaterefreshTap)) {
	System.out.println("Rate Tab opened");
	Extent_pass(driver, "Rate Tab opened", test);
}else {
	Extent_fail(driver, "Rate Tab not opened", test);
}
verifyElementIsPresent(driver, SelectBox);
click(driver, SelectBox);

click(driver, Okbtn);
waitForElement(driver, NoSchedulepop);
if(isDisplayed(driver,NoSchedulepop)) {
	click(driver, NoSchedulokbtn);
	System.out.println("NoSchedule Tab opened");

	Extent_pass(driver, "NoSchedule Tab opened", test);
}else {
	Extent_fail(driver, "NoSchedule Tab not opened", test);
}

verifyElementIsPresent(driver, Editbtn1);
click(driver, Editbtn1);
	verifyElementIsPresent(driver, Grid);
	click(driver, Grid);
	verifyElementIsPresent(driver, ConditionFilter);
	click(driver, ConditionFilter);
	verifyElementIsPresent(driver, ServiceInput1);
	sendKeys(driver, ServiceInput1, cskname);
	verifyElementIsPresent(driver, AEJEA06);
	click(driver, AEJEA06);
	verifyElementIsPresent(driver, RouteOK);
	click(driver, RouteOK);
	waitForElement(driver, NoSchedulePOP);
		click(driver, NoSchedulokbtn);
		
	verifyElementIsPresent(driver, FirstserviceInput);
	sendKeys(driver, FirstserviceInput, cskname);
	click(driver, Selectbtn);
	mouseOverToElement(driver, Home);
	click(driver, Savebtn);
	waitForElement(driver, BookingSavedpop);
		click(driver, BookingSavedOK);
	
		mouseOverToElement(driver, Charges);
	click(driver, Charges);
	verifyElementIsPresent(driver, Editbtn);
	click(driver, Editbtn);
	waitForElement(driver, AutoRated);
	click(driver, AutoRated);
	waitForElement(driver, Savebtn);
	click(driver, Savebtn);
	waitForElement(driver, BookingUpdated);
	click(driver, BookingSavedOK);
	String bookingErrorColorAct1=getTextBackgroundColor(driver,Cancletopbtnclr);
	System.out.println(bookingErrorColorAct1);
	colorValidation(driver,bookingErrorColorexp,bookingErrorColorAct1,Cancletopbtnclr);
	verifyElementIsPresent(driver, Container);
	click(driver, Container);
	waitForElement(driver, Editbtn);
	click(driver, Editbtn);
	mouseOverToElement(driver, Containeredit);
	
	verifyElementIsPresent(driver, Containeredit);
	click(driver, Containeredit);
	
	verifyElementIsPresent(driver, Searchbtninside);
	sendKeys(driver, Searchbtninside,containersearch);
	driver.findElement(By.xpath("//*[@placeholder='Module Search']")).sendKeys(Keys.ENTER);
	scrollTop(driver);
	mouseOverToElement(driver, Savebtninside);
	
	verifyElementIsPresent(driver, Searchinside);
	click(driver, Searchinside);
	verifyElementIsPresent(driver, EquipmentNumber);
	click(driver, EquipmentNumber);
	verifyElementIsPresent(driver, SOC);
	click(driver, SOC);
	verifyElementIsPresent(driver, Dv20);
sendKeys(driver, Dv20,dv20input);
verifyElementIsPresent(driver, Ninput);
sendKeys(driver, Ninput,ninput);
verifyElementIsPresent(driver, SearchbtnTABLE);
click(driver, SearchbtnTABLE);
verifyElementIsPresent(driver, equipmentnumberinput1);
sendKeys(driver, equipmentnumberinput1,dvnnumber);
mouseOverToElement(driver, Dv20number);
verifyElementIsPresent(driver, Dv20number);
click(driver, Dv20number);
WebElement id = driver.findElement(By.xpath("(//*[@aria-colindex='1'])[3]"));
String typeValue=id.getText();
System.out.println(typeValue);

verifyElementIsPresent(driver, SelectOKbtn);
click(driver, SelectOKbtn);
verifyElementIsPresent(driver, Switchtobooking);
click(driver, Switchtobooking);
Actions actions=new Actions(driver);
WebElement dd5a=	driver.findElement(By.id("mdl1_tablbl")); 
actions.moveToElement(dd5a).perform();
verifyElementIsPresent(driver, Containeredit);

click(driver, Containeredit);
verifyElementIsPresent(driver, Equipmentinput);
clearAndType(driver, Equipmentinput,typeValue);
verifyElementIsPresent(driver, Cargoinput);
clearAndType(driver, Cargoinput, Cargowei);
verifyElementIsPresent(driver, equipmentnumberinputedit);
click(driver, equipmentnumberinputedit);
verifyElementIsPresent(driver, Containerpop);
click(driver, ContainerpopOK);
scrollTop(driver);
mouseOverToElement(driver, Containersavebtn);
verifyElementIsPresent(driver, Containersavebtn);
click(driver, Containersavebtn);
verifyElementIsPresent(driver, Containerbookingupdate);
click(driver, Containerbookingupdateok);
verifyElementIsPresent(driver, Switchtomaster);
click(driver, Switchtomaster);
verifyElementIsPresent(driver, Editbtn);
click(driver, Editbtn);

verifyElementIsPresent(driver, Conformed);
click(driver, Conformed);
verifyElementIsPresent(driver, Containersavebtn);
click(driver, Containersavebtn);
verifyElementIsPresent(driver, Conformedsavepop);
click(driver, ConformedOk);
String bookingErrorColorAct=getTextBackgroundColor(driver,Cancletopbtnclr);
System.out.println(bookingErrorColorAct);
colorValidation(driver,bookingErrorColorexp,bookingErrorColorAct,Cancletopbtnclr);
verifyElementIsPresent(driver, Newbtn);
click(driver, Newbtn);
waitForElement(driver, Newsearch);
click(driver, Newsearch);

if(isDisplayed(driver,Searchbookingdetials)) {
	System.out.println("Searchbookingdetials Tab opened");

	Extent_pass(driver, "Searchbookingdetials Tab opened", test);
}else {
	Extent_fail(driver, "Searchbookingdetials Tab not opened", test);
}

verifyElementIsPresent(driver, Inputequpmentforedit);
sendKeys(driver, Inputequpmentforedit, editinput);
verifyElementIsPresent(driver, Inputequpmentforeditsearch);
click(driver, Inputequpmentforeditsearch);
waitForElement(driver, Inputequpmentforeditselect);
click(driver, Inputequpmentforeditselect);
verifyElementIsPresent(driver, Editbtn);
click(driver, Editbtn);
waitForElement(driver, Container);
click(driver, Container);
mouseOverToElement(driver, Containeredit);

verifyElementIsPresent(driver, Containeredit);
click(driver, Containeredit);
scrollTop(driver);
waitForElement(driver, EquipmentProfile);
click(driver, EquipmentProfile);
verifyElementIsPresent(driver, Searchinside);
click(driver, Searchinside);
verifyElementIsPresent(driver, EquipmentNumber);
click(driver, EquipmentNumber);
verifyElementIsPresent(driver, SOC);
click(driver, SOC);
verifyElementIsPresent(driver, Dv20);
sendKeys(driver, Dv20,dv20input);
verifyElementIsPresent(driver, Ninput);
sendKeys(driver, Ninput,ninput);
verifyElementIsPresent(driver, SearchbtnTABLE);
click(driver, SearchbtnTABLE);
verifyElementIsPresent(driver, equipmentnumberinput1);
sendKeys(driver, equipmentnumberinput1,dvnnumber1);
mouseOverToElement(driver, Dv20number);
verifyElementIsPresent(driver, Dv20number);
click(driver, Dv20number);
WebElement id1 = driver.findElement(By.xpath("(//*[@aria-colindex='1'])[3]"));
String typeValue1=id1.getText();
System.out.println(typeValue1);

verifyElementIsPresent(driver, SelectOKbtn);
click(driver, SelectOKbtn);
verifyElementIsPresent(driver, Switchtobooking);
click(driver, Switchtobooking);
verifyElementIsPresent(driver, Containeredit);
click(driver, Containeredit);
waitForElement(driver, Equipmentinput);
clearAndType(driver, Equipmentinput,typeValue1);

verifyElementIsPresent(driver, equipmentnumberinputedit);
click(driver, equipmentnumberinputedit);
scrollTop(driver);
verifyElementIsPresent(driver, Containersavebtn);
click(driver, Containersavebtn);
verifyElementIsPresent(driver, Containerbookingupdate);
click(driver, Containerbookingupdateok);
verifyElementIsPresent(driver, Switchtomaster);
click(driver, Switchtomaster);
verifyElementIsPresent(driver, Editbtn);
click(driver, Editbtn);

verifyElementIsPresent(driver, Conformed);
click(driver, Conformed);
verifyElementIsPresent(driver, Containersavebtn);
click(driver, Containersavebtn);
verifyElementIsPresent(driver, editlastpop);
click(driver, editlastpopOK);

					
			
		
		
		
	
		
	
		
	
	}}
	
