package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class VSS_LT04 extends Keywords{
	String url = TestNgXml.getdatafromExecution().get("Testcase1");
 	String username = Utils.getDataFromTestData("ESL", "Username","Long_Term_Creation");
 	String password = Utils.getDataFromTestData("ESL", "Password","Long_Term_Creation");
 	String longTermModule=Utils.getDataFromTestData("ESL","ModuleLongTerm","Long_Term_Creation");
 	String searchFrameText=Utils.getDataFromTestData("ESL","LtSearchFrameText","Long_Term_Creation");
 	String draftBackgroundColor=Utils.getDataFromTestData("ESL","LtDraftColor","Long_Term_Creation");
 	String ltRenameFrameText=Utils.getDataFromTestData("ESL","LtRenameFrameText","Long_Term_Creation");
 	String popupTitleLt=Utils.getDataFromTestData("ESL","LtPopupTitle","Long_Term_Creation");
 	
 	
	public void vSS_LT01(WebDriver driver){
//Login
	 WebDriverWait wait=new WebDriverWait(driver,40);
	 navigateUrl(driver, url);
	 //waitForElement(driver, username);
	 sendKeys(driver,Username_Input,username);
	 sendKeys(driver,Password_Input,password);
	 click(driver,Login);
//Home
	 waitForElement(driver, home_Logo);
	 if(isDisplayed(driver, home_Logo))
	 {
		 sendKeys(driver,Module_Search,longTermModule);
		 enter(driver);
		 Extent_pass(driver, "Home page is displayed", test);
	 }
	 else
	 {
		 Extent_fail(driver, "Home page is not displayed", test);
	 }
//Long Term Creation
	 waitForElement(driver, longTermTab);
	 if(isDisplayed(driver,longTermTab))
	 {
		click(driver,toolbarSearchLT);
		Extent_pass(driver, "Long Term Creation Page is displyed", test);
	 }
	 else
	 {
		 Extent_fail(driver, "Long Term Creation Page is not displyed", test);
	 }
	 waitForElement(driver, searchFrameLT);
	if(getText(driver,searchFrameLT).equalsIgnoreCase(searchFrameText)){
		click(driver,searchIconLT);
		click(driver,selectFirst);
		click(driver,selectButtonLT);
		click(driver,okButtonLT);
		Extent_pass(driver,"Long Term Schedule Search is displayed", test);
	}else{
		Extent_fail(driver,"Long Term Schedule Search is displayed", test);
	}
	 waitForElement(driver, toolbarEditLT);
	 click(driver,toolbarEditLT);
	 scrollBottom(driver);
	 waitForElement(driver, draftBlueLT);
	 if(getTextBackgroundColor(driver, draftBlueLT).equalsIgnoreCase(draftBackgroundColor)){
	//Future Cycles
		 Extent_pass(driver, "The background color is blue", test);
		 
		 click(driver,draftBlueLT);
		 RightClick(driver,draftBlueLT);
		 scrollUsingElement(driver, renameLT); 
		 waitForElement(driver, renameLT);
		 mouseOverToElement(driver, renameLT);
		 //click(driver,renameLT);
		 waitForElement(driver, renameVessel);
		//mouseOverToElement(driver, renameVessel);
		 click(driver, renameVessel);
		 waitForElement(driver, renameFrameLT);
		/* String Act=getText(driver,renameFrameLT);
		 System.out.println("ACt : "+Act);
		 System.out.println("Exp : "+ltRenameFrameText);*/

		 if(isDisplayed(driver, renameFrameLT)){
			 Extent_pass(driver, "Long Term Creation rename frame is displayed", test);
			 click(driver,renameFrameSearchIcon);
			 click(driver,selectFirst);
			 click(driver,selectButtonLT);
			 click(driver,futureCycles);
			 click(driver,okRename);
			 waitForElement(driver, longTermPopup);
			 //String ActValueP=getText(driver,futureCyclePopup);
			 if(isDisplayed(driver, futureCyclePopup)) {
				 Extent_pass(driver, "Long Term Creation text is matched", test);
				 click(driver,renamedOkButtonFuture);
			 }else{
				 Extent_fail(driver, "Long Term Creation text is not matched", test);
			 }
			 
		}else{
			 Extent_fail(driver, "Long Term Creation rename frame is not displayed", test);
		 }
	//Current Cycle
		 scrollBottom(driver);
		 waitForElement(driver, draftBlueLT);
		 click(driver,draftBlueLT);
		 RightClick(driver,draftBlueLT);
		 scrollUsingElement(driver, renameLT); 
		 waitForElement(driver, renameLT);
		 mouseOverToElement(driver, renameLT);
		// click(driver,renameLT);
		 waitForElement(driver, renameVessel);
		// mouseOverToElement(driver, renameVessel);
		 click(driver, renameVessel);
		 waitForElement(driver, renameFrameLT);

		 String ActRename=getText(driver,renameFrameLT);
		 System.out.println("ActRename : "+ActRename);
		 System.out.println("EXPName : "+ltRenameFrameText);

		 if(isDisplayed(driver, renameFrameLT)){
			
			 Extent_pass(driver, "Long Term Creation rename frame is displayed", test);
			 click(driver,renameFrameSearchIcon);
			 click(driver,selectFirst);
			 click(driver,selectButtonLT);
			 click(driver,currentCycle);
			 click(driver,okRename);
			 waitForElement(driver, longTermPopup);
			 if(isDisplayed(driver,cerrentCyclePopup)){
				 Extent_pass(driver, "Long Term Creation title is matched", test);
				 click(driver,renamedOkButtonCurrent);
			 }else{
				 Extent_fail(driver, "Long Term Creation title is not matched", test);
			 }
			 
		 }else{
			 Extent_fail(driver, "Long Term Creation rename frame is not displayed", test);
		 }
		 
	 }
	 else
	 {
		 Extent_fail(driver, "The background color is  not blue", test);
	 }
//Logout
	    click(driver,User_Logout);
		wait(driver,"2");
		verifyElementIsPresent(driver, Logout_Popup);
		click(driver,Logout_Yes);
	 
	 
	}

}
 