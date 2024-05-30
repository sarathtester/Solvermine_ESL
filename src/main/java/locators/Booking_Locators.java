package locators;

public interface Booking_Locators extends Booking_Locators1, EMS_Locators,VSS_Locator {
	
	public static String Username_input="UserName>//input[@id='nfr_login_authname']";
	public static String Password_input="Password>//input[@id='nfr_login_authid']";
	public static String Login="Login>//*[@id='nfr_login_btnlogin']";
	public static String Home_Logo="Home_Logo>//*[@id='nfr_topbar_graphicimg']";
	public static String Search_Input="Search_Input>//*[@aria-autocomplete='listbox']";
	public static String Newbtn="Newbtn>//*[@id='BKG-tbl-btnTblNew']";
	public static String Savebtn="Savebtn>//*[contains(text(),'Save  \"ALT+S\"')]";
	public static String Searchbtn="Searchbtn>//*[@id='SER-tbl-btnTblJdlgSearch']";
	public static String Searchbtninside="Searchbtninside>//*[@placeholder='Module Search']";
	public static String Searchinside="Searchinside>//*[@id='CNP-CNP_toolbar-btnTblJdlgSearch']";
	public static String Dv20="Dv20>//*[@id='var_condition2']//following::input[1]";
	public static String DV20N="DV20N>//*[@id='var_condition2']//following::input[4]";
	public static String SearchbtnTABLE="SearchbtnTABLE>//*[@id='myBtn']";
	public static String Dv20number="Dv20number>(//*[@col-id='C1'])[2]";
	public static String SelectOKbtn="SelectOKbtn>//*[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String Switchtobooking="Switchtobooking>//*[@id='mdl1_tablbl']";
	public static String Equipmentinput="Equipmentinput>//*[@id='BKG-BKG_txtEquipID']";
	public static String Cargoinput="Cargoinput>//*[@id='BKG-BKG_txtCargoWt']";
	public static String Savebtninside="Searchbtn>//*[@id='CNP-CNP_toolbar-btnsave']";
	public static String Editbtn="Editbtn>//*[@id='BKG-tbl-btnTblEdit']";
	public static String Deletebtn="Deletebtn>//*[@id='SER-tbl-btnTblDelete']";
	public static String Canclebtn="Canclebtn>//*[@id='SER-tbl-btnTblCancel']";
	public static String Cancelled="Cancelled>//*[contains(text(),'Cancelled')]";
	
	public static String Switchprofile="Switchprofile>//*[@id='nfr_topbar_switchprofile_link']";
	public static String Switchtype="Switchprofile>//*[@id='SWP-SWP_lblSwitchType']";
	public static String Assad="Assad>//*[contains(text(),'AEESAD')]";
	public static String SwitchBtn="SwitchBtn>//*[@id='SWP-SWP_btnSwitchProfile']";
	public static String BookingLogo="SwitchBtn>//*[@id='mdl1_tablbl']";
	public static String Home="Home>//*[@id='nfr_tab_dashboard_title']";
	public static String Orgin="Orgin>//*[@id='BKG-BKG_jLabel1554']";
	public static String OrginInput="OrginInput>//*[@id='BKG-BKG_txtPOL111_input']";
	public static String Delivery="Delivery>//*[@id='BKG-BKG_jLabel1555']";
	public static String DeliveryInput="DeliveryInput>//*[@id='BKG-BKG_txtPOD111_input']";
	public static String AgrParty="AgrParty>//*[@id='BKG-BKG_jLabel137']";
	public static String AgrPartyInput="AgrPartyInput>//*[@id='BKG-BKG_txtAgrPartyName_input']";
	public static String RatedBtn="RatedBtn>//*[@id='BKG-BKG_cmbBooking_button']";
	public static String $Rates="$Rates>//*[@id='BKG-BKG_miRate']";
	public static String RaterefreshTap="$RaterefreshTap>//*[@id='BKG_JDlgRateMaster_title']";
	public static String SelectBox="SelectBox>(//*[contains(text(),'20243371')])[1]";
	public static String Okbtn="Okbtn>//*[@id='JDlgRateMasterform-RateBKG_btnOk']";
	public static String NoSchedulepop="NoSchedulepop>//*[contains(text(),'No Schedule available')]";
	public static String  NoSchedulokbtn="NoSchedulokbtn>//*[contains(text(),'No Schedule available')]//following::button[1]";
	public static String  Editbtn1="Editbtn>//*[@id='BKG-BKG_btnRouting']";
	public static String  RoutingSearch="RoutingSearch>//*[@id='BKG_JdlgRouting_title']";
	public static String  Grid="Grid>//*[@id='JdlgRoutingform-BKG_routingGrid_nfr_toolpanel_li_id']";
	public static String  ConditionFilter="ConditionFilter>//*[@id='JdlgRoutingform-BKG_routingGrid_conditionFilter_id']";
	public static String  ServiceInput="ServiceInput>(//*[@aria-label='Service Filter Input'])[2]";
	public static String  ServiceInput1="ServiceInput1>(//*[@aria-label='Service Filter Input'])[1]";
	
	public static String  AEJEA06="AEJEA06>(//*[contains(text(),'AEJEA06')])[1]";
	public static String  AEJEA061="AEJEA06>(//*[contains(text(),'AEJEA06')])[2]";
	public static String  wait="AEJEA06>(//*[contains(text(),'SVM1483')])";
	
	public static String  RouteOK="RouteOK>//*[@id='JdlgRoutingform-BKG_btnrok']";
	public static String  NoSchedulePOP="ConditionFilter>(//*[contains(text(),'No Schedule available')])";
	public static String  FirstserviceInput="FirstserviceInput>//*[@id='BKG-BKG_txtService3']";
	public static String  Selectbtn="Selectbtn>//*[@id='nfr_favsch_selectbtn']";
	public static String  Draft="Draft>(//*[contains(text(),'Draft')])[1]";
	public static String  Charges="Charges>//*[@id='BKG-BKG_jTabbedPane1']//following::li[5]";
	public static String  Paylocation="Paylocation>(//*[contains(text(),'Pay Location')])[4]";
	public static String  BookingSavedpop="BookingSavedpop>//*[contains(text(),'Booking Saved')]";
	public static String  BookingSavedOK="BookingSavedOK>//button[contains(text(),'Ok')]";
	public static String  AutoRated="AutoRated>(//*[contains(text(),'Auto Rate')])[1]";
	public static String  BookingUpdated="BookingUpdated>(//*[contains(text(),'Booking Updated ')])";
	public static String  Container="Container>//*[@id='BKG-BKG_jTabbedPane1']//following::li[2]";
	public static String  Containeredit="Containeredit>//*[@id='BKG-BKG_dsGridCargo-0-BKG_btnCargoGridEdit']";
	public static String  EquipmentNumber="EquipmentNumber>//*[@id='sel_one']";
	public static String  SOC="SOC>(//*[contains(text(),'S.O.C')])[2]";
	public static String  Ninput="Ninput>//*[@ID='txt_name1']";
	public static String  equipmentnumberinput1="equipmentnumberinput1>//*[@aria-label='Equipment No. Filter Input']";
	public static String  equipmentnumberinputedit="equipmentnumberinputedit>(//*[contains(text(),'Edit')])[4]";
	public static String  Containerpop="Containerpop>//*[contains(text(),'Cargo Weight is changed')]";
	public static String  ContainerpopOK="ContainerpopOK>//*[contains(text(),'Cargo Weight is changed')]//following::button[1]";
	public static String  Containersavebtn="Containersavebtn>//*[@id='BKG-tbl-btnsave']";
	public static String  Containerbookingupdate="Containerbookingupdate>//*[contains(text(),'Booking Updated ')]";
	public static String  Containerbookingupdateok="Containerbookingupdateok>//*[contains(text(),'Booking Updated ')]//following::button[1]";
	public static String  Switchtomaster="Switchtomaster>//a[contains(text(),'Master')]";
	public static String  Conformed="Conformed>//span[contains(text(),'Confirmed')]";
	public static String  Conformedsavepop="Conformedsavepop>//span[contains(text(),'Confirmed')]";
	public static String  ConformedOk="ConformedOk>//*[contains(text(),'Booking Updated ')]//following::button[1]";
	public static String  EquipmentProfile="EquipmentProfile>//*[@id='mdl1_tablbl']//following::label[1]";
	public static String  editlastpop="EquipmentProfile>//span[contains(text(),'Booking Updated ')]";
	public static String  editlastpopOK="editlastpopOK>//span[contains(text(),'Booking Updated ')]//following::button[1]";
	public static String  Newsearch="Newsearch>//button[@id='BKG-BKG_btnMybookSearch-BKG_btnMybookSearch']";
	public static String  Searchbookingdetials="Searchbookingdetials>(//*[contains(text(),'Search Booking Details')])";
	public static String  Inputequpmentforedit="Inputequpmentforedit>//input[@id='txt_name1']";
	public static String  Inputequpmentforeditsearch="Searchbookingdetials>//button[@id='myBtn']";
	public static String  Inputequpmentforeditselect="Inputequpmentforeditselect>//button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
	public static String  Cargotapfillpop="Cargotapfillpop>//*[contains(text(),'Please give the cargo weight in container tab')]";
	public static String  CargotapfillpopOk="Cargotapfillpop>//*[contains(text(),'Please give the cargo weight in container tab')]//following::button[1]";
	public static String Cancletopbtn="Cancletopbtn>//*[@id='BKG-tbl-btnTblCancel']";
	public static String Cancletopbtnclr="Cancletopbtnclr>//input[@id='BKG-BKG_txtBookingNo']";
	

	
	
	
	
	
	
	
	
	
	
	
	
}
