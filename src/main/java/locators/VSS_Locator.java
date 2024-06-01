package locators;

public interface VSS_Locator {
	//Login Xpaths
		public static String Username_Input = "Username>//*[@id='nfr_login_authname']";
		public static String Password_Input = "Password>//*[@id='nfr_login_authid']";
		public static String Login = "Login>//span[text()='Login']";
		public static String Home_Logo = "Home_Logo>//li[@id='nfr_dashboard_li']//a[1]";
		//Service Creation Xpaths
		public static String Module_Search = "Module_Search>//*[@id='nfr_topbar_autocomp_input']";
		public static String Click_Service_Creation = "Click_Service_Creation>//li[@data-item-label='Service Creation']";
		public static String New_Service_Creation = "New_Service_Creation>//*[@id='SER-tbl-btnTblNew']";
		public static String Pop_upSC = "Pop_upSC>//h2[text()='Service Creation']";
		public static String Pop_confirmcheck = "Pop_confirmcheck>//h2[text()='Service Creation']//following::span[2]";
		public static String New_Service_Creation_Yes = "New_Service_Creation_Yes>//button[text()='Yes']";
		public static String New_Service_Creation_No = "New_Service_Creation_No>//button[text()='No']";
		public static String Service_CodeI = "Service_CodeI>//*[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
		public static String Service_NameI = "Service_NameI>//*[@id='SER-SER_txtServiceName-SER_txtServiceName']";
		public static String No_of_Bound = "No_of_Bound>//*[@id='SER-SER_cmbNoOfBound_label']";
		public static String Bound1 = "Bound1>//*[@id='SER-SER_cmbNoOfBound_1']";
		public static String Bound2 = "Bound2>//*[@id='SER-SER_cmbNoOfBound_2']";
		public static String Bound3 = "Bound3>//*[@id='SER-SER_cmbNoOfBound_3']";
		public static String Bound4 = "Bound4>//*[@id='SER-SER_cmbNoOfBound_4']";
		public static String Service_Type = "Service_Type>//*[@id='SER-SER_cmbSerType_label']";
		public static String Service_Type_MainLine = "Service_Type_MainLine>//*[@id='SER-SER_cmbSerType_1']";
		public static String Service_Type_Feeder = "Service_Type_Feeder>//*[@id='SER-SER_cmbSerType_2']";
		public static String Freqency = "Frequency>//*[@id='SER-SER_txtFreqcy']";
		public static String No_of_Ships = "No_of_Ships>//input[@readonly='readonly']";
		//public static String No_of_Ships1 = "No_of_Ships1>//*[@id='SER-SER_txtNoVessel-SER_txtNoVessel-SER_txtNoVessel_outputcontainer_input']";
		public static String No_of_Ships1 = "No_of_Ships1>(//label[text()='No. of Ships']//following::input)[1]";
		public static String Entered_ShipValue = "Entered_ShipValue>//*[@id='SER-SER_txtNoVessel-SER_txtNoVessel-SER_txtNoVessel_outputcontainer_hinput']";
		public static String Ext_Fdr = "Ext_Fdr>//*[@id='SER-SER_cmbext_label']";
		public static String Ext_Fdr_Y = "Ext_Fdr_Y>//li[@data-label='Y']";
		public static String Ext_Fdr_N = "Ext_Fdr_N>//li[@data-label='N']";
		public static String Start_Date = "Start_Date>//*[@id='SER-SER_txtStartDate_input']";
		public static String Calender = "Calender>//div[contains(@class,'ui-datepicker ui-widget')]";
		public static String Start_Date_Select = "Start_Date_Select>//td[contains(@class,'ui-datepicker-current-day')]";
		public static String End_Date_Select = "Start_Date_Select>//td[contains(@class,'ui-datepicker-current-day')]//following::td[1]";
		public static String Start_Select_Month = "Start_Select_Month>//select[@aria-label='select month']";
		public static String Start_Select_Year = "Start_Select_Year>//select[@aria-label='select year']";
		public static String Start_Select_Day = "Start_Select_Day>//table[@class='ui-datepicker-calendar']";
		public static String End_Date = "End_Date>//*[@id='SER-SER_txtEndDate_input']";
		public static String End_Select_Month = "End_Select_Month>//select[@aria-label='select month']";
		public static String End_Select_Year = "End_Select_Year>//select[@aria-label='select year']";
		public static String End_Select_Day = "End_Select_Day>//table[@class='ui-datepicker-calendar']";
		public static String Status = "status>//*[@id='SER-SER_cmbActive_label']";
		public static String Status_Active = "Status_Active>//*[@id='SER-SER_cmbActive_1']";
		public static String Statuc_InActive = "Statuc_InActive>//*[@id='SER-SER_cmbActive_2']";
		public static String Save_Button="Save_Button>//*[@id='SER-tbl-btnsave']";
		public static String Popup_ServiceC = "Popup_ServiceC>//h2[text()='Service Creation']";
		public static String Success_Message = "Success_Message>//h2[text()='Service Creation']//following::span[2]"; 
		public static String ServiceCreation_OK = "ServiceCreation_OK>//*[@class='ok']";
		public static String Search_Button="Search_Button>//*[@id='SER-tbl-btnTblJdlgSearch']";
		public static String Edit_Button="Edit_Button>//*[@id='SER-tbl-btnTblEdit']";
		public static String Delete_Button = "Delete_Button>//*[@id='SER-tbl-btnTblDelete']";
		public static String Cancel_button = "Cancel_button>//*[@id='SER-tbl-btnTblCancel']";
		//Edit Service code and Serach Service pop-up xpaths
		public static String Search_Service_Button = "Search_Service_Button>//*[@id='SER-tbl-btnTblJdlgSearch']";
		public static String Search_Service = "Search_Service>//*[@id='nfr_sch_jd_header']";
		public static String Serach_ServiceCode = "Serach_ServiceCode>//*[@id='txt_name1']";
		public static String Serach_ServiceName = "Serach_ServiceName>//*[@id='txt_name2']";
		public static String Serach_ServiceType = "Search_ServiceTpe>//*[@id='txt_name3']";
		public static String Serach_Buton = "Serach_Buton>//button[text()='SEARCH']";
		public static String Select_Searched_Value = "Select_Searched_Value>(//div[@col-id='C1'])[2]";
		public static String Edit_Service_Code = "Edit_Service_Code>//input[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
		
		//Logout xpaths
		public static String User_Logout = "User_Logout>//a[@title='Logout']//img[1]";
		public static String Logout_Popup = "Logout_Popup>(//div[@id='JSP_dialog']//following-sibling::div[1])[6]";
		public static String Logout_Text = "Logout_Text>//span[text()='Are you sure want to logout?']";		
		public static String Logout_Yes = "Logout_Yes>//input[@value='Yes']";
		public static String Logout_No = "Logout_No>//input[@type='button']//following-sibling::button[1]";
		
		
		//Coastal Schedule Locators:
		public static String Click_Coastal_Schedule = "Click_Coastal_Schedule>//li[@data-item-label='Coastal Schedule']";
		public static String  Service_Search_Button = "Service_Search_Button>//*[@id='SLS-SLS_btnServiceCode-SLS_btnServiceCode']";
		public static String Tool_Search_Button = "Tool_Search_Button>//*[@id='SLS-j_idt6084-btnTblDefaultSearch']";
		public static String Enter_Service_code = "Enter_Service_code>//*[@id='ag-input-id-1133']";
		public static String Vessel_Search_Button = "Vessel_Search_Button>//*[@id='SLS-SLS_btnVesselCode']";
		public static String Edit_Coastal_Schedule = "Edit_Coastal_Schedule>//*[@id='SLS-j_idt6084-btnTblEdit']";
		public static String Click_Tree = "Click_Tree>//*[@id='SLS-SLS_tree-0_0_0_0']";
		public static String First_Voyage = "First_Voyage>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]";
		public static String Click_Tree_Call1 = "Click_Tree_Call1>//li[@id='SLS-SLS_tree-0_0_0_0_2']";
		public static String CallTime_Confirm = "CallTime_Confirm>(//*[@id='SLS-SLS_callConfirmationTimeAdjustment'])[5]";
		public static String EOSP_Date = "EOSP_Date>//input[@id='SLS_CallConfirmForm-SLS_dbkEosp_input']";
		public static String Arrival_Port = "Arrival_Port>//input[@id='SLS_CallConfirmForm-SLS_dbkArrPillot1_input']";
		public static String ALL_FAST_FWE = "ALL_FAST_FWE>//input[@id='SLS_CallConfirmForm-SLS_dbkArrDock1_input']";
		public static String All_Cast_Off = "All_Cast_Off>//input[@id='SLS_CallConfirmForm-SLS_dbkDepDock1_input']";
		public static String Pilot_Away = "Pilot_Away>//input[@id='SLS_CallConfirmForm-SLS_dbkDepDock1_input']";
		public static String BOSP_Date="BOSP_Date>//input[@id='SLS_CallConfirmForm-SLS_dbkBosp_input']";
		public static String Not_Working_Hours = "Not_Working_Hours>//input[@id='SLS_CallConfirmForm-SLS_txtNotWorking_input']";
		public static String Total_Moves = "Total_Moves>//input[@id='SLS_CallConfirmForm-SLS_txtTotalMoves']";
		public static String Pop_upCS = "Pop_upSC>//h2[text()='Coastal Schedule']";
		public static String Coastal_Schedule_Yes = "Coastal_Schedule_Yes>//button[text()='Yes']";
		public static String Coastal_Schedule_No = "Coastal_Schedule_No>//button[text()='No']";
		public static String Update_Coastal_Schedule = "Update_Coastal_Schedule>//*[@id='SLS_CallConfirmForm-SLS_btnOK']";
		public static String Color_Green = "Color_Green>(//div[@class='ag-row ag-row-odd ag-row-level-0 return sm-bg-lightgreen ag-row-position-absolute ag-row-last ag-row-focus ag-row-selected'])[2]";
		public static String Color_Check = "Color_Check>(//div[contains(@class,'sm-bg-lightgreen')])[2]";
		
	
}
