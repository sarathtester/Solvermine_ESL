package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
public class Booking_TC05 extends Keywords{


	String url = TestNgXml.getdatafromExecution().get("Testcase1");
	String username = Utils.getDataFromTestData("BOOKING", "Username","Sheet4");
	String password = Utils.getDataFromTestData("BOOKING", "Password","Sheet4");
	String Search = Utils.getDataFromTestData("BOOKING", "ModuleName","Sheet4");
	String orgin = Utils.getDataFromTestData("BOOKING", "Orgin","Sheet4");
	String Orgin_input_exp=Utils.getDataFromTestData("BOOKING", "OrginExp","Sheet4");
	String delivery = Utils.getDataFromTestData("BOOKING", "Delivery","Sheet4");
	String delivery_input_exp=Utils.getDataFromTestData("BOOKING", "DeliveryExp","Sheet4");
	String Agt = Utils.getDataFromTestData("BOOKING", "AgrParty","Sheet4");
	String Agt_Exp = Utils.getDataFromTestData("BOOKING", "AGRExp","Sheet4");
	String cskname = Utils.getDataFromTestData("BOOKING", "CSK_NAME","Sheet4");
	String container = Utils.getDataFromTestData("BOOKING", "Cointainer ","Sheet4");
	String containersearch = Utils.getDataFromTestData("BOOKING", "Searchinput","Sheet4");
	String dv20input = Utils.getDataFromTestData("BOOKING", "DV","Sheet4");
	String ninput = Utils.getDataFromTestData("BOOKING", "NINPUT","Sheet4");
	String dvnnumber = Utils.getDataFromTestData("BOOKING", "Equipmentinputsearch","Sheet4");
	String dvnnumber1 = Utils.getDataFromTestData("BOOKING", "Equipmentinputsearch1","Sheet4");
	String Cargowei = Utils.getDataFromTestData("BOOKING", "Cargoweight","Sheet4");
	
	public void booking_TC05(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);

		navigateUrl(driver, url);
		
		if(wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='nfr_login_btnlogin']"),
				"Login"))) {
			System.out.println("LogIn page is displayed");
			Extent_pass(driver, "LogIn in page is displayed", test);
		}else {
			Extent_fail(driver, "Sign in page is not displayed", test);
		}
		
		waitForElement(driver, username_l); 
		sendKeys(driver, username_l, username);

		waitForElement(driver, password_l);
		sendKeys(driver, password_l, password);

		waitForElement(driver, Login_btn_l);
		click(driver, Login_btn_l);

		wait(driver, "6");
		   
        /*if(isDisplayed(driver,Home_Logo)) {
        	System.out.println("Home page is displayed");
			Extent_pass(driver, "Home page is displayed", test);
		}else {
			Extent_fail(driver, "Home page is not displayed", test);
		}*/
        verifyElementIsPresent(driver, Switchprofile);
        click(driver, Switchprofile);
//        if(isDisplayed(driver,Switchtype)) {
//        	System.out.println("Switch tap is opened");
//			Extent_pass(driver, "Switch tap is opened", test);
//		}else {
//			Extent_fail(driver, "Switch tap is not opened", test);
//		}
        verifyElementIsPresent(driver, Assad);
        click(driver, Assad);
      verifyElementIsPresent(driver, SwitchBtn);
      click(driver, SwitchBtn);
		verifyElementIsPresent(driver,Search_Input);
		sendKeys(driver, Search_Input, Search);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);
//		if(isDisplayed(driver,BookingLogo)) {
//        	System.out.println("Booking Tab opened");
//			Extent_pass(driver, "Booking Tab opened", test);
//		}else {
//			Extent_fail(driver, "Booking Tab not opened", test);
//		}
//		verifyElementIsPresent(driver, Newbtn);
//	if(isElementClickable(driver, Newbtn)) {
//			click(driver, Newbtn);
//		
//			System.out.println("New button is clickable");
//			Extent_pass(driver, "New button is clickable", test);
//	}else {
//			
//			Extent_fail(driver, "Already in new tap ", test);
//	}
//		
verifyElementIsPresent(driver, Orgin);
verifyElementIsPresent(driver, OrginInput);
sendKeys(driver, OrginInput, orgin);
WebElement webElement = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOL111_input']"));
webElement.sendKeys(Keys.TAB);
/*if(verifyElementIsPresent(driver,OrginInput)) {
	String Orgin_input_Act=getText(driver,OrginInput);
	textValidation(driver,Orgin_input_exp,Orgin_input_Act,OrginInput);
}*/
verifyElementIsPresent(driver, Delivery);
verifyElementIsPresent(driver, DeliveryInput);
sendKeys(driver, DeliveryInput, delivery);
WebElement webElement1 = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOD111_input']"));
webElement1.sendKeys(Keys.TAB);
driver.manage().window().fullscreen();
/*if(verifyElementIsPresent(driver,DeliveryInput)) {
	String delivery_input_Act=getText(driver,DeliveryInput);
	textValidation(driver,delivery_input_exp,delivery_input_Act,DeliveryInput);
}*/	

verifyElementIsPresent(driver, AgrParty);
verifyElementIsPresent(driver, AgrPartyInput);
sendKeys(driver, AgrPartyInput, Agt);
WebElement webElement2 = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtAgrPartyName_input']"));
webElement2.sendKeys(Keys.TAB);

//if(verifyElementIsPresent(driver,DeliveryInput)) {
	//String Agt_Act=getText(driver,DeliveryInput);
	//textValidation(driver,Agt_Exp,Agt_Act,DeliveryInput);
//}	
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

//mouseOverToElement(driver, Okbtn);
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
if(isDisplayed(driver,RoutingSearch)) {
	System.out.println("Routing search table page opened");
	Extent_pass(driver, "Routing search table page opened", test);
}else {
	Extent_fail(driver, "Routing search table page not opened", test);
}
	verifyElementIsPresent(driver, Grid);
	click(driver, Grid);
	verifyElementIsPresent(driver, ConditionFilter);
	click(driver, ConditionFilter);
	verifyElementIsPresent(driver, ServiceInput);
	sendKeys(driver, ServiceInput, cskname);
	verifyElementIsPresent(driver, AEJEA06);
	click(driver, AEJEA06);
	verifyElementIsPresent(driver, RouteOK);
	click(driver, RouteOK);
	waitForElement(driver, NoSchedulePOP);
		click(driver, NoSchedulokbtn);
		
	verifyElementIsPresent(driver, FirstserviceInput);
	sendKeys(driver, FirstserviceInput, cskname);
	click(driver, Selectbtn);
//	verifyElementIsPresent(driver, Draft);
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
		mouseOverToElement(driver, Savebtninside);
		scrollTop(driver);
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
	
	WebElement booking_no = driver.findElement(By.xpath("//input[@id='BKG-BKG_txtBookingNo']"));
	String bookingNo_1 = booking_no.getAttribute("value");
	System.out.println(bookingNo_1);
//New booking	
	click(driver, Newbtn);
		navigateUrl(driver, url);
		
		if(wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("//*[@id='nfr_login_btnlogin']"),
				"Login"))) {
			System.out.println("LogIn page is displayed");
			Extent_pass(driver, "LogIn in page is displayed", test);
		}else {
			Extent_fail(driver, "Sign in page is not displayed", test);
		}
		
		waitForElement(driver, username_l); 
		sendKeys(driver, username_l, username);

		waitForElement(driver, password_l);
		sendKeys(driver, password_l, password);

		waitForElement(driver, Login_btn_l);
		click(driver, Login_btn_l);

		wait(driver, "6");
		   
       /*if(isDisplayed(driver,Home_Logo)) {
        	System.out.println("Home page is displayed");
			Extent_pass(driver, "Home page is displayed", test);
		}else {
			Extent_fail(driver, "Home page is not displayed", test);
		}*/
        verifyElementIsPresent(driver, Switchprofile);
        click(driver, Switchprofile);
//        if(isDisplayed(driver,Switchtype)) {
//        	System.out.println("Switch tap is opened");
//			Extent_pass(driver, "Switch tap is opened", test);
//		}else {
//			Extent_fail(driver, "Switch tap is not opened", test);
//		}
        verifyElementIsPresent(driver, Assad);
        click(driver, Assad);
      verifyElementIsPresent(driver, SwitchBtn);
      click(driver, SwitchBtn);
		verifyElementIsPresent(driver,Search_Input);
		sendKeys(driver, Search_Input, Search);
		driver.findElement(By.id("nfr_topbar_autocomp_input")).sendKeys(Keys.ENTER);
//		if(isDisplayed(driver,BookingLogo)) {
//        	System.out.println("Booking Tab opened");
//			Extent_pass(driver, "Booking Tab opened", test);
//		}else {
//			Extent_fail(driver, "Booking Tab not opened", test);
//		}
//		verifyElementIsPresent(driver, Newbtn);
//	if(isElementClickable(driver, Newbtn)) {
//			click(driver, Newbtn);
//		
//			System.out.println("New button is clickable");
//			Extent_pass(driver, "New button is clickable", test);
//	}else {
//			
//			Extent_fail(driver, "Already in new tap ", test);
//	}
//		
verifyElementIsPresent(driver, Orgin);
verifyElementIsPresent(driver, OrginInput);
sendKeys(driver, OrginInput, orgin);
WebElement webElement_Ori = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOL111_input']"));
webElement_Ori.sendKeys(Keys.TAB);
/*if(verifyElementIsPresent(driver,OrginInput)) {
	String Orgin_input_Act=getText(driver,OrginInput);
	textValidation(driver,Orgin_input_exp,Orgin_input_Act,OrginInput);
}*/
verifyElementIsPresent(driver, Delivery);
verifyElementIsPresent(driver, DeliveryInput);
sendKeys(driver, DeliveryInput, delivery);
WebElement webElement_Del = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtPOD111_input']"));
webElement_Del.sendKeys(Keys.TAB);
driver.manage().window().fullscreen();
/*if(verifyElementIsPresent(driver,DeliveryInput)) {
	String delivery_input_Act=getText(driver,DeliveryInput);
	textValidation(driver,delivery_input_exp,delivery_input_Act,DeliveryInput);
}*/	

verifyElementIsPresent(driver, AgrParty);
verifyElementIsPresent(driver, AgrPartyInput);
sendKeys(driver, AgrPartyInput, Agt);
WebElement webElement_Ag = driver.findElement(By.xpath("//*[@id='BKG-BKG_txtAgrPartyName_input']"));
webElement_Ag.sendKeys(Keys.TAB);

//if(verifyElementIsPresent(driver,DeliveryInput)) {
	//String Agt_Act=getText(driver,DeliveryInput);
	//textValidation(driver,Agt_Exp,Agt_Act,DeliveryInput);
//}	
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

//mouseOverToElement(driver, Okbtn);
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
if(isDisplayed(driver,RoutingSearch)) {
	System.out.println("Routing search table page opened");
	Extent_pass(driver, "Routing search table page opened", test);
}else {
	Extent_fail(driver, "Routing search table page not opened", test);
}
	verifyElementIsPresent(driver, Grid);
	click(driver, Grid);
	verifyElementIsPresent(driver, ConditionFilter);
	click(driver, ConditionFilter);
	verifyElementIsPresent(driver, ServiceInput);
	sendKeys(driver, ServiceInput, cskname);
	verifyElementIsPresent(driver, AEJEA06);
	click(driver, AEJEA06);
	verifyElementIsPresent(driver, RouteOK);
	click(driver, RouteOK);
	waitForElement(driver, NoSchedulePOP);
		click(driver, NoSchedulokbtn);
		
	verifyElementIsPresent(driver, FirstserviceInput);
	sendKeys(driver, FirstserviceInput, cskname);
	click(driver, Selectbtn);
//	verifyElementIsPresent(driver, Draft);
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
		mouseOverToElement(driver, Savebtninside);
		scrollTop(driver);
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
	WebElement id_2 = driver.findElement(By.xpath("(//*[@aria-colindex='1'])[3]"));
	String eqpNo=id.getText();
	System.out.println(eqpNo);

	verifyElementIsPresent(driver, SelectOKbtn);
	click(driver, SelectOKbtn);
	verifyElementIsPresent(driver, Switchtobooking);
	click(driver, Switchtobooking);
	//Actions actions=new Actions(driver);
	WebElement dd5a_1=	driver.findElement(By.id("mdl1_tablbl")); 
	actions.moveToElement(dd5a_1).perform();
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
	
	//WebElement booking_no = driver.findElement(By.xpath("//input[@id='BKG-BKG_txtBookingNo']"));
	String bookingNo_2 = booking_no.getAttribute("value");
	System.out.println(bookingNo_2);
	
	
	Assert.assertEquals(bookingNo_2, bookingNo_1);
	
	}
}
