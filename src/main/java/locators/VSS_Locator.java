package locators;

public interface VSS_Locator {

	// ashok
	
	
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
			public static String Service_Details_Spopup = "Service_Details_Spopup>//*[@id='nfr_sch_twocolumn_header']";
			public static String Enter_Service_code = "Enter_Service_code>//*[@id='ag-input-id-1133']";
			public static String Select_Service_Code = "Select_Service_Code>(//div[@col-id='C1'])[2]";
			public static String Vessel_Search_Button = "Vessel_Search_Button>//*[@id='SLS-SLS_btnVesselCode']";
			public static String Vessel_Details_Spopup = "Vessel_Details_Spopup>//*[@id='nfr_sch_twocolumn_header']";
			public static String Select_Vessel_Code = "Select_Service_Code>(//div[@col-id='C1'])[2]";
			public static String Tree ="Tree>(//li[@data-nodetype='Service'])[1]";
			public static String Edit_Coastal_Schedule = "Edit_Coastal_Schedule>//*[@id='SLS-j_idt6084-btnTblEdit']";
			public static String Click_Tree = "Click_Tree>//*[@id='SLS-SLS_tree-0_0_0_0']";
			
			public static String First_Voyage = "First_Voyage>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]";
			public static String Commercial_Call = "Commercial_Call>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]//following::li[@data-nodetype='normal_commercial']";
			public static String Physical_Call = "Physical_Call>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]//following::li[@data-nodetype='normal_physical']";
			public static String Call_Confirmed = "Call_Confirmed>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]//following::li[@data-nodetype='confirm_commercial']";
			public static String Canal_Call= "Canal_call>(//*[@class='sm-font-bold  sm-font-inherit sm-label-middle'])[2]//following::li[@data-nodetype='normal_canal']";
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
			
			
			// Abinaya
			
			//TS_001
			
			public static String username="username >//*[@id='nfr_login_authname']";
			public static String password="password >//*[@id='nfr_login_authid']";
			public static String Login_btn="Login_btn >//*[@id='nfr_login_btnlogin']";
			public static String loginpage="loginpage >//*[text()='SOLVERMINDS']";
			public static String Home_page="Home_page >//*[@id='ui-id-1']";
			public static String search_bar="search_bar >//*[@id='nfr_topbar_autocomp_input']";
			public static String module_name="module_name >(//*[text()='EMS Contract Registration'])[2]";
			public static String save_button="save_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
			public static String contractno_field="contractno_field >//*[@id='RMS-RMS_txtContractno']";
			public static String contracttype_field="contracttype_field >(//label[@id='RMS-RMS_cmbContractType_label']/following::span)[1]";
			public static String leasekind_searchicon="leasekind_searchicon >//*[@id='RMS-RMS_btnLsKind']";
			public static String leasekind_selectvalue="leasekind_selectvalue >//*[text()='MASTER LEASE AGREEMENTT']";
			public static String leasekind_selectbutton="leasekind_selectbutton >(//span[text()='Select'])[1]";
			public static String lessorcode_searchicon="lessorcode_searchicon >//*[@id='RMS-RMS_btnLessor']";
			public static String lessorcode_searchbar="lessorcode_searchbar >(//span[text()='Lessor Code']//following::input)[2]";
			public static String lessorcode_searchvalue="lessorcode_searchvalue >//*[text()='THE CHINA NAVIGATION CO. PTE LTD.']";
			public static String lessee_searchicon="lessee_searchicon >//*[@id='RMS-RMS_btnlesse']";
			public static String lessee_searchbar="lessee_searchbar >(//span[text()='Lessee Code ']//following::input)[2]";
			public static String lesseecode_searchvalue="lesseecode_searchvalue >//*[text()='SVM SHIPPING']";
			public static String vaild_from="vaild_from >//*[@id='RMS-RMS_txtValidFrm_input']";
			public static String click_fromdate="click_fromdate >//*[text()='1']";
			public static String vaild_to="vaild_to >//*[@id='RMS-RMS_txtvalidTo_input']";
			public static String click_todate="click_todate >//a[text()='29']";
			public static String sizeandtype_tab="sizeandtype_tab >//a[text()='Size/Type']";
			public static String sizeandtype_Field="sizeandtype_Field >//*[@id='RMS-RMS_cmbEqp_label']";
			public static String leasechargetype_Field="leasechargetype_Field >//*[@id='RMS-RMS_cmbLeasechType_label']";
			public static String sizeandtype_Value="sizeandtype_Value >//li[text()='20DC']";
			public static String leasechargetype_Value="leasechargetype_Value >//li[text()='N - No banding']";
			public static String perdiem_field="perdiem_field >//*[@id='RMS-RMS_txtPerdiem_input']";
			public static String sizeaddbutton="sizeaddbutton >(//span[text()='ADD'])[1]";
			public static String termandcharges="termandcharges >//*[text()='Terms and Charges']";
			public static String Locationhierarchy_field="Locationhierarchy_field >//*[@id='RMS-RMS_cmbHierarchy_label']";
			public static String locationaddbutton="locationaddbutton >//*[@id='RMS-RMS_btnPortAdd']";
			public static String locationsearchtab="locationsearchtab >(//*[text()='Ports Code ']//following::input)[3]";
			public static String clicklocation_checkbox="clicklocation_checkbox >//*[text()='SGSIN']";
			public static String location_selectbutton="location_selectbutton >(//span[text()='Select'])[2]";
			public static String termchange_size="termchange_size >//*[@id='RMS-RMS_cmbHierEqp_label']";
			public static String termchange_addbutton="termchange_addbutton >(//span[text()='ADD'])[2]";
			public static String depreciationtab="depreciationtab >//*[text()='Depreciation']";
			public static String depreciation_Type="depreciation_type >//*[@id='RMS-RMS_cmbDeprType_label']";
			public static String depreciationsave_button="depreciationsave_button >//*[@id='RMS-RMS_tblsvm-btnsave']";
			public static String depreciationedit_button="depreciationedit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
			public static String successfully_popup="successfully_popup >//*[text()='EMS Contract Registration saved']";
			public static String logout_button="logout_button >//*[@id='nfr_topbar_logout']";
			public static String logout_yesbutton="logout_yesbutton >//*[@id='nfr_logout_cnf_form-nfr_logout_cnf_yes']";
			
			
			
			//TS_002
			public static String search_icon="search_icon >//*[@id='RMS-RMS_tblsvm-btnTblJdlgSearch']";
			public static String search_contractfield="search_contractfield >//*[@id='txt_name1']";
			public static String search_button="search_button >//*[text()='SEARCH']";
			public static String search_selecticon="search_selecticon >(//span[text()='Select'])[3]";
			public static String contractno_refreshbutton="contractno_refreshbutton >//*[@id='RMS-RMS_btnrefresh']";
			public static String edit_button="edit_button >//*[@id='RMS-RMS_tblsvm-btnTblEdit']";
			public static String contractupdated_popup="contractupdated_popup >//*[text()='EMS Contract Registration Updated']";
			public static String sizeadd_button="sizeadd_button >(//span[text()='Add'])[1]";
			public static String click_sizedetail="click_sizedetail >(//td[text()='10RF'])";
			public static String click_removebutton="click_removebutton >(//span[text()='Remove'])[1]";
			public static String click_yesbutton="click_yesbutton >//button[text()='Yes']";
			
			//vss_modle
			public static String proformaservicecrationtext="servicecrationtext >(//*[text()='Proforma Service Creation'])[2]";
			public static String newtoolbar_button="newtoolbar_button >//*[@id='SPF-SPF_toolbar-btnTblNew']";
			public static String performayes_button="performayes_button >//button[text()='Yes']";
			public static String servicecode_field="servicecode_field >//*[@id='SPF-SPF_txtServiceCode_input']";
			public static String remark_field="remark_field >//*[@id='SPF-SPF_sLabelremarkstext']";
			public static String newproformacreation="newproformacreation >//*[text()=' Do you want to create a new Proforma Service Creation?']";
			public static String AGgrid_plusicon ="AGgrid_plusicon >(//span[text()='Edit'])[1]//following::button[1]";
			public static String portsearch_icon="portsearch_icon >((//span[text()='Port Search'])[1]//following::button)[3]";
			public static String click_searchbar="click_searchbar >((//span[text()='Port Code'])[3]//following::input)[2]";
			public static String click_searchvalue="click_searchvalue >//*[text()='CHENNAI PORT']";
			public static String click_selectbutton="click_selectbutton >(//span[text()='Select'])[1]";
			public static String clickterminal_searchicon="clickterminal_searchicon >((//span[text()='Terminal Search'])[1]//following::button)[4]";
			public static String terminalcode_searchbar="terminalcode_searchbar >((//span[text()='Terminal Code'])[3]//following::input)[4]";
			public static String terminalcode_value="terminalcode_value >//*[text()='HUTCHISON AJMAN INTERNATIONAL TERMINALS']";
			public static String proforma_startdate="proforma_startdate >((//*[text()='Proforma Start Date'])[1]//following::input)[1]";
			public static String proforma_selectdate="proforma_selectdate >//a[text()='1']";
			public static String portsearch_icon2="portsearch_icon2 >((//span[text()='Port Search'])[1]//following::button)[7]";
			public static String clickterminal_searchicon2="clickterminal_searchicon2 >((//span[text()='Terminal Search'])[1]//following::button)[8]";
			public static String terminalcode_value2="terminalcode_value2 >(//div[text()='MADRAS PORT'])[2]";
			public static String click_searchvalue2="click_searchvalue >//*[text()='CHENNAI PORT9']";
			public static String click_aftersearchok_btn="click_aftersearchok_btn >(//span[text()='OK'])[13]";
			public static String portsearch_icon3="portsearch_icon3 >((//span[text()='Port Search'])[1]//following::button)[11]";
			public static String click_searchvalue3="click_searchvalue >(//*[text()='CHENNAI PORT'])[2]";
			public static String clickterminal_searchicon3="clickterminal_searchicon3 >((//span[text()='Terminal Search'])[1]//following::button)[12]";
			public static String terminalcode_value3="terminalcode_value3 >(//*[text()='HUTCHISON AJMAN INTERNATIONAL TERMINALS'])[2]";
			public static String proforma_savebtn="proforma_savebtn >//*[@id='SPF-SPF_toolbar-btnsave']";
			public static String proforma_creationsave="proforma_creationsave >//*[text()='Proforma Service Creation Saved.']";
			public static String click_saveokbtn="click_saveokbtn >//button[text()='Ok']";
			public static String global_searchicon="gobel_searchicon >//*[@id='SPF-SPF_toolbar-btnTblJdlgSearch']";
			public static String global_searchbox="gobal_searchbox >//*[@id='txt_name1']";
			public static String global_searchvalue="global_searchvalue >//*[text()='ABI TRADERS']";
			public static String global_selectbtn="global_selectbtn >(//*[text()='Select'])[3]";
			public static String edit_btn="edit_btn >//*[@id='SPF-SPF_toolbar-btnTblEdit']";
			public static String search_btn="search_btn >//*[text()='SEARCH']";
			public static String status_dropdown="status_dropdown >(//label[text()='Status']//following::label)[1]";
			public static String status_dropvalue="status_dropvalue >//li[text()='Confirm']";
			public static String proforma_code="proforma_code >//*[@id='SPF-SPF_txtProformaCde']";
			public static String bound_errormsg="bound_errormsg >//*[text()='Proforma Bound and Number of Service Bound should be same']";
			public static String change_boundvalue="change_boundvalue >(//*[text()='W'])[2]";
			public static String proforma_updated="proforma_updated >//*[text()='Proforma Service Creation Updated.']";
			public static String portcode_field="Recodefield_portcode >(//label[text()='AB001'])[1]";
			public static String portcode_field1="Recodefield_portcode1 >(//label[text()='AB009'])[1]";
			public static String portcode_field2="Recodefield_portcode2 >(//label[text()='AB001'])[2]";
			public static String proformadate_field="proformadate_field >//*[@id='SPF-SPF_txtStartDate_input']";
			
			//3rd
			public static String servicecode_click ="selectservicecode >//*[text()='ABIPRFSCH003']";
			public static String Arr_dockvalue ="Arr_dockvalue >(//div[@col-id='arrDock1'])[2]";
			public static String Arr_Dockmonth ="Arr_Dockmonth >//select[@data-handler='selectMonth']";
			public static String Arr_Dockselectmonth ="Arr_Dockselectmonth >//option[text()='Jan']";
			public static String Arr_Dockselectdate ="Arr_Dockselectdate >//a[text()='1']";
			public static String calenderclosebutton ="calenderclosebutton >//button[text()='Close']";
			public static String Arr_dockvaluebox ="Arr_dockvaluebox >(//*[@col-id='arrDock1'])[3]";
			public static String Arrdock_Error ="Arrdock_Error >//span[text()='Arrival Dock cannot be before of Arrival Pilot.']";
			public static String Dep_docktime ="Dep_docktime >(//*[@col-id='dep_Dock1'])[2]";
			public static String Scrollbutton ="Scrollbutton >(//div[@ref='eBodyHorizontalScrollViewport'])[1]";
			public static String Dep_docktime1 ="Dep_docktime1 >(//*[@col-id='dep_Dock1'])[3]";
			public static String departuredoct_verifymsg ="departuredoct_verifymsg >//*[text()='Departure Dock cannot be before the Arrival Dock.']";
			public static String Dep_polittime ="Dep_polittime >(//*[@col-id='dep_Pilot1'])[2]";
			public static String Dep_polittime1 ="Dep_polittime1 >(//*[@col-id='dep_Pilot1'])[3]";
			public static String DeparturePilot_verifymsg ="DeparturePilot_verifymsg >//*[text()='Departure Pilot should not be less than the Departure Dock.']";
			public static String quickproforma ="quickproforma >(//span[text()='Quick Proforma'])[1]";
			public static String quickproforma_portcode ="quickproforma_portcode >//*[@id='SPF_qprfrma_portcode_text_input']";
			public static String editport ="editport >((//tr[@data-ri='1'])[2]/following::td)[1]";
			public static String updatedportcode ="updatedportcode >//*[text()='ABCDE']";
			public static String changetimezone ="changetimezone >((//span[text()='BufferTime'])[1]//following::td)[7]";
			public static String timezone ="timezone >(//*[text()='0.0'])[1]";
			public static String timezonechangetime ="timezonechangetime >((//*[text()='Time Zone'])[7]//following::td)[8]";
			public static String Boundvalue ="Boundvaluechange >//*[@id='quickProformaCreation_defaultDsGrid1-0-SPF_quic_boundmenu_label']";
			public static String changeboundvalue ="changeboundvalue >(//li[text()='E'])[2]";
			public static String quickproforma_terminalcode ="quickproforma_terminalcode >//*[text()='BJFK9654']";
			public static String click_terminalcodesearchicon ="click_terminalcodesearchicon >//*[@id='quickProformaCreation_defaultDsGrid1-1-SPF_qp_Terminalbtn']";
			public static String search_terminalcode ="search_terminalcode >(//*[text()='AB009TER01'])[1]";
			public static String click_moveup ="click_moveup >//*[text()='Move Up']";
			public static String quickproforma_okbtn ="quickproforma_okbtn >(//span[text()='OK'])[8]";
			public static String Quickproforma_portname ="Quickproforma_portname >((//tr[@data-ri='1'])[2]//following::td)[1]";
			public static String aftermove_portname ="aftermove_portname >((//tr[@data-ri='0'])[3]//following::td)[1]";
			public static String Quickproforma_portname3 ="Quickproforma_portname3 >((//tr[@data-ri='2'])[2]//following::td)[1]";
			public static String Quickproforma_portname4 ="Quickproforma_portname4 >((//tr[@data-ri='3'])[2]//following::td)[1]";
			public static String Quickproforma_portname5 ="Quickproforma_portname5 >((//tr[@data-ri='4'])[2]//following::td)[1]";
			
			public static String proforma_portname1 ="Quickproforma_portname3 >((//div[@row-id='0'])[2]//following::div)[2]";		
			public static String proforma_portname2 ="Quickproforma_portname3 >((//div[@row-id='1'])[2]//following::div)[2]";
			public static String proforma_portname3 ="Quickproforma_portname3 >((//div[@row-id='2'])[2]//following::div)[2]";
			public static String proforma_portname4 ="Quickproforma_portname3 >((//div[@row-id='3'])[2]//following::div)[2]";
			public static String proforma_portname5 ="Quickproforma_portname3 >((//div[@row-id='4'])[2]//following::div)[2]";
	
			
			//Arunthathi
			
			public static String Username_input="UserName>//input[@id='nfr_login_authname']";
			public static String Password_input="Password>//input[@id='nfr_login_authid']";
//			public static String Login="Login>//*[@id='nfr_login_btnlogin']";
//			public static String Home_Logo="Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
			public static String Search_Input="Search_Input>//*[@aria-autocomplete='listbox']";
			public static String Newbtn="Newbtn>//*[@id='SPF-SPF_toolbar-btnTblNew']";
			public static String SearchMain="SearchMain>//*[@id='SPF-SPF_toolbar-btnTblJdlgSearch']";
			public static String Delete="Delete>//*[@id='SPF-SPF_toolbar-btnTblDelete']";
			public static String Savebtn="Savebtn>//*[contains(text(),'Save  \"ALT+S\"')]";
			public static String Searchbtn="Searchbtn>//*[@id='SER-tbl-btnTblJdlgSearch']";
			public static String Newpop="Newpop>//*[contains(text(),' Do you want to create a new Proforma Service ')]";
			public static String NwepopOK="NwepopOK>//*[contains(text(),' Do you want to create a new Proforma Service ')]//following::button[2]";
			public static String ServiceSearch="ServiceSearch>//*[@id='SPF-SPF_btnSearch1']";
			public static String ServiceCodeInput="ServiceCodeInput>//*[@aria-label='Service Code Filter Input']";
			public static String Searcservicedetials="Searcservicedetials>//*[contains(text(),'Search Service Details')]";
			public static String TestingCustomer="TestingCustomer>//*[contains(text(),'TESTING CUSTOMER')]";
			public static String Selectservicebtn="Selectservicebtn>//*[@id='nfr-twocol-select-button']";
			public static String RemarksInput="Selectservicebtn>//*[@id='SPF-SPF_sLabelremarkstext']";
			public static String QuickPerfoma="QuickPerfoma>(//*[contains(text(),'Quick Proforma')])[1]";	
			public static String Importfromperfoma="Importfromperfoma>(//*[contains(text(),'Import from Proforma')])";	
			public static String PortCodeInput="PortCodeInput>//*[@id='SPF_qprfrma_portcode_text_input']";
			public static String PortCodeInputCLICK="PortCodeInputCLICK>//*[contains(text(),'ABC01')]";
			public static String DDClick="DDClick>((//tr[@data-ri='1'])[2]/following::td)[1]";
			public static String EditInput="EditInput>(//*[contains(text(),'Service Code')])[3]//following::input[3]";
			public static String BufferTime="BufferTime>//*[@id='quickProformaCreation_txtbuffertime_input']";
			public static String TimeZone="TimeZone>//*[@id='quickProformaCreation_txttimezone_input']";
			public static String Bound="Bound>//*[@id='quickProformaCreation_defaultDsGrid1-2-SPF_quic_boundmenu_label']";
			public static String Boundselect="Boundselect>//*[@id='quickProformaCreation_defaultDsGrid1-2-SPF_quic_boundmenu_3']";
			public static String MoveUp="MoveUp>//*[@id='quickProformaCreation_btnMoveUp']";
			public static String OkBtn="OkBtn>//*[@id='quickProformaCreation_solverBtn2']";
			public static String TerminalSearch="TerminalSearch>//*[@id='quickProformaCreation_defaultDsGrid1-2-SPF_qp_Terminalbtn']";
			public static String CommonName="CommonName>(//*[contains(text(),'Common Name')])[5]";
			public static String TerminalDetials="TerminalDetials>(//*[contains(text(),'Terminal Details')])";
			public static String Canclebtn="TerminalDetials>//*[@id='SPF-SPF_toolbar-btnTblCancel']";
			public static String CanclebtnPop="CanclebtnPop>//*[contains(text(),' Do you want to clear this Proforma')]";
			public static String CanclebtnPopOK="CanclebtnPopOK>//*[contains(text(),' Do you want to clear this Proforma')]//following::button[2]";
			public static String ProformaDetials="ProformaDetials>//*[contains(text(),'Proforma Details')]";
			public static String Speed="Speed>//*[@id='quickProformaCreation_txtSpeed_input']";
			public static String ProformaCodeInput="ProformaCodeInput>//input[@id='txt_name1']";
			public static String Searchtable="Searchtable>//button[@id='myBtn']";
			public static String nUMBERCODE="nUMBERCODE>//*[contains(text(),'0001PRFSCH001')]";
			public static String nUMBERCODE1="nUMBERCODE>//*[contains(text(),'1PRFSCH002')]";
			public static String nUMBERCODE2="nUMBERCODE>//*[contains(text(),'23VDPRFSC1710')]";
			public static String SelectOkBtn="SelectOkBtn>//*[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
			public static String Deployed="Deployed>(//*[contains(text(),'Deployed')])[2]";
			public static String Performaservicecreation="Performaservicecreation>(//*[contains(text(),'Proforma Service Creation')])[7]";
			public static String PerformaservicecreationPopOK="PerformaservicecreationPopOK>(//*[contains(text(),'Proforma Service Creation')])[7]//following::button";
			public static String DraftStatus="DraftStatus>(//*[contains(text(),'Draft')])[2]";
			public static String ConformStatus="DraftStatus>(//*[contains(text(),'Confirm')])[13]";
			public static String PerformaservicecreationDraftPopok="PerformaservicecreationDraftPop>(//*[contains(text(),'Proforma Service Creation')])[7]//following::button[2]";
			public static String PerformaservicecreationDeletedOK="PerformaservicecreationDeletedOK>(//*[contains(text(),'Proforma Deleted.')])//following::button";
			public static String PerformaDeletedMSG="PerformaDeletedMSG>(//*[contains(text(),'Proforma Deleted.')])";
			public static String Alpha="Alpha>//*[contains(text(),'ALPHA')]";
			public static String Vishnu="Vishnu>//*[contains(text(),'VISHNU001')]";
			public static String InputData="InputData>(//*[contains(text(),'Port Code')])[1]//following::label[11]";
			public static String Importperforma="Importperforma>//*[@id='quickProformaCreation_solverBtn1']";
			public static String Servicecodeimport="Servicecodeimport>//INPUT[@aria-label='Service Code Filter Input']";
			public static String Rock="Rock>//*[contains(text(),'ROCK')][1]";
			public static String N="N>//*[@id='quickProformaCreation_defaultDsGrid1-2-SPF_quic_boundmenu_label']";
			public static String S="S>(//*[@data-label='S'])[4]";
			public static String Servicenameinpit="Servicenameinpit>//*[@aria-label='Service Name Filter Input']";
			public static String AddbUTTON="AddbUTTON>(//div[@col-id='Add'])[2]//button[1]";
			public static String Firstsearch="Firstsearch>(//div[@col-id='portsearch'])[2]//button[1]";
			public static String Firstsearch1="Firstsearch1>(//div[@col-id='portsearch'])[3]//button";
			public static String Firstsearch2="Firstsearch2>(//div[@col-id='portsearch'])[4]//button";
			public static String Postcodefilterinput="Postcodefilterinput>//input[@aria-label='Port Code Filter Input']";
			public static String Nlaer="Nlaer>(//*[contains(text(),'NLAER')])";
			public static String Savedpop="Savedpop>//*[contains(text(),'Proforma Service Creation Saved.')]";
			public static String OKK="OKK>//*[contains(text(),'Proforma Service Creation Saved.')]//following::button";
			public static String OKKK="OKKK>//*[contains(text(),'Proforma Service Creation Saved.')]//following::button[1]";
			public static String Mainsave="Mainsave>//*[@id='SPF-SPF_toolbar-btnsave']";
			public static String DistancePop="DistancePop>(//*[contains(text(),'Marine Distance')])[7]";
			public static String DistancePopok="DistancePopok>(//*[contains(text(),'Marine Distance')])[7]//following::button[1]";
			public static String Statuscli="Statuscli>//*[@id='SPF-SPF_proformastatus_label']";
			public static String Statusconformcli="Statusconformcli>//*[@data-label='Confirm']";
			public static String Wcli="Wcli>(//*[@col-id='bound'])[3]";
			public static String Wcliselect="Wcliselect>(//*[@col-id='bound'])[3]//following::div[@aria-rowindex='2'][2]";
			public static String Subbound="Subbound>//*[contains(text(),'Enter the Sub Bound ')]";
			public static String SubboundOK="SubboundOK>//*[contains(text(),'Enter the Sub Bound ')]//following::button";
			public static String DataNotFound="DataNotFound>//*[@id='lrp_cust_growl_container']";
			public static String CloseX="CloseX>(//a[@aria-label='Close'])[8]";
			
			
			//Prabhakaran
			
			//Login Xpaths
//			public static String Username_Input = "Username_Input>//*[@id='nfr_login_authname']";
//			public static String Password_Input = "Password_Input>//*[@id='nfr_login_authid']";
//			public static String Login = "Login>//span[text()='Login']";
			public static String home_Logo = "home_Logo>//li[@id='nfr_dashboard_li']//a[1]";
			//Service Creation Xpaths
//			public static String Module_Search = "Module_Search>//*[@id='nfr_topbar_autocomp_input']";
//			public static String Click_Service_Creation = "Enter_Service_Creation>//li[@data-item-label='Service Creation']";
//			public static String New_Service_Creation = "New_Service_Creation>//*[@id='SER-tbl-btnTblNew']";
//			public static String Pop_upSC = "Pop_upSC>//h2[text()='Service Creation']";
//			public static String Pop_confirmcheck = "Pop_confirmcheck>//h2[text()='Service Creation']//following::span[2]";
//			public static String New_Service_Creation_Yes = "New_Service_Creation_Yes>//button[text()='Yes']";
//			public static String New_Service_Creation_No = "New_Service_Creation_No>//button[text()='No']";
			public static String Service_Code = "Service_Code>//*[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
			public static String Service_Name = "Service_Name>//*[@id='SER-SER_txtServiceName-SER_txtServiceName']";
//			public static String No_of_Bound = "No_of_Bound>//*[@id='SER-SER_cmbNoOfBound_label']";
//			public static String Bound1 = "Bound1>//*[@id='SER-SER_cmbNoOfBound_1']";
//			public static String Bound2 = "Bound2>//*[@id='SER-SER_cmbNoOfBound_2']";
//			public static String Bound3 = "Bound3>//*[@id='SER-SER_cmbNoOfBound_3']";
//			public static String Bound4 = "Bound4>//*[@id='SER-SER_cmbNoOfBound_4']";
//			public static String Service_Type = "Service_Type>//*[@id='SER-SER_cmbSerType_label']";
//			public static String Service_Type_MainLine = "Service_Type_MainLine>//*[@id='SER-SER_cmbSerType_1']";
//			public static String Service_Type_Feeder = "Service_Type_Feeder>//*[@id='SER-SER_cmbSerType_2']";
//			public static String Freqency = "Frequency>//*[@id='SER-SER_txtFreqcy']";
//			public static String No_of_Ships = "No_of_Ships>//input[@readonly='readonly']";
//			public static String Ext_Fdr = "Ext_Fdr>//*[@id='SER-SER_cmbext_label']";
//			public static String Ext_Fdr_Y = "Ext_Fdr_Y>//li[@data-label='Y']";
//			public static String Ext_Fdr_N = "Ext_Fdr_N>//li[@data-label='N']";
//			public static String Start_Date = "Start_Date>//*[@id='SER-SER_txtStartDate_input']";
//			public static String Calender = "Calender>//div[contains(@class,'ui-datepicker ui-widget')]";
//			public static String Start_Date_Select = "Start_Date_Select>//td[contains(@class,'ui-datepicker-current-day')]";
//			public static String End_Date_Select = "Start_Date_Select>//td[contains(@class,'ui-datepicker-current-day')]//following::td[1]";
//			public static String Start_Select_Month = "Start_Select_Month>//select[@aria-label='select month']";
//			public static String Start_Select_Year = "Start_Select_Year>//select[@aria-label='select year']";
//			public static String Start_Select_Day = "Start_Select_Day>//table[@class='ui-datepicker-calendar']";
//			public static String End_Date = "End_Date>//*[@id='SER-SER_txtEndDate_input']";
//			public static String End_Select_Month = "End_Select_Month>//select[@aria-label='select month']";
//			public static String End_Select_Year = "End_Select_Year>//select[@aria-label='select year']";
//			public static String End_Select_Day = "End_Select_Day>//table[@class='ui-datepicker-calendar']";
//			public static String Status = "status>//*[@id='SER-SER_cmbActive_label']";
//			public static String Status_Active = "Status_Active>//*[@id='SER-SER_cmbActive_1']";
			public static String Status_InActive = "Statuc_InActive>//*[@id='SER-SER_cmbActive_2']";
//			public static String Save_Button="Save_Button>//*[@id='SER-tbl-btnsave']";
//			public static String Popup_ServiceC = "Popup_ServiceC>//h2[text()='Service Creation']";
//			public static String Success_Message = "Success_Message>//h2[text()='Service Creation']//following::span[2]"; 
//			public static String ServiceCreation_OK = "ServiceCreation_OK>//*[@class='ok']";
//			public static String Search_Button="Search_Button>//*[@id='SER-tbl-btnTblJdlgSearch']";
//			public static String Edit_Button="Edit_Button>//*[@id='SER-tbl-btnTblEdit']";
//			public static String Delete_Button = "Delete_Button>//*[@id='SER-tbl-btnTblDelete']";
//			public static String Cancel_button = "Cancel_button>//*[@id='SER-tbl-btnTblCancel']";
//			//Edit Service code and Serach Service pop-up xpaths
//			public static String Search_Service_Button = "Search_Service_Button>//*[@id='SER-tbl-btnTblJdlgSearch']";
//			public static String Search_Service = "Search_Service>//*[@id='nfr_sch_jd_header']";
//			
//			public static String Serach_ServiceCode = "Serach_ServiceCode>//*[@id='txt_name1']";
//			public static String Serach_ServiceName = "Serach_ServiceName>//*[@id='txt_name2']";
//			public static String Serach_ServiceType = "Search_ServiceTpe>//*[@id='txt_name3']";
//			public static String Serach_Buton = "Serach_Buton>//button[text()='SEARCH']";
//			public static String Select_Searched_Value = "Select_Searched_Value>(//div[@col-id='C1'])[2]";
//			public static String Edit_Service_Code = "Edit_Service_Code>//input[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
//			
			//Delete record in service creation
			 public static String selectService="selectService>(//div[@col-id='serviceCode'])[2]";
			 public static String deleteButton="deleteButton>//button[@id='SER-tbl-btnTblDelete']";
			 public static String alredyUsedInProforma="alredyUsedInProforma>//span[contains(.,'This Service Code is already used in the Proforma')]";
			 public static String confirmationPopup="confirmationPopup>(//button[.='Ok'])[7]";
			 public static String alreadyUsedInFeeder="alreadyUsedInFeeder>//span[contains(.,' This service code is already used in Feeder Schedule')]";
			 public static String noButton="noButton>//span[contains(.,' This service code is already used in Feeder Schedule')]/following::button[.='No']";
			 public static String filterOption="filterOption>//div[@id='SER-SER_dsGrid_nfr_toolpanel_li_id']"; 
			 public static String conditionFilter="conditionFilter>//span[.='Condition Filter']/parent::a[@id='SER-SER_dsGrid_conditionFilter_id']";
			 public static String serviceCodeTextbox="serviceCodeTextbox>//input[@aria-label='Service Code Filter Input']";
			 public static String deleteOk="deleteOk>//span[contains(.,' Do you want to delete this record permanently?')]/following::button[.='Yes']";
			 public static String deleteNo="deleteNo>//span[contains(.,' Do you want to delete this record permanently?')]/following::button[.='No']";
			 public static String servicePopup="servicePopup>//h2[text()='Service Creation']";
			 public static String serviceCodemenu="serviceCodemenu>(//span[.='Service Code']//preceding::span[@class='ag-icon ag-icon-menu'])[16]";
			 public static String filterServiceCode="filterServiceCode>(//span[@class='ag-icon ag-icon-filter'])[17]";
			 public static String searchBoxInFilter="searchBoxInFilter>(//input[@placeholder='Search...'])[5]";
			 
			 
			//Inactive status in service creation
			  public static String inActiveYes="inActiveYes>//h2[text()='Service Creation']/following::button[.='Yes']";
			  public static String updatePopup="updatePopup>//span[.='Service Creation updated']";
			  public static String inActiveOk="inActiveOk>//span[.='Service Creation updated']/following::button[.='Ok']";
			  public static String colorServiceCode="colorServiceCode>//input[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
			  public static String alreadyUsed="alreadyUsed>//span[contains(.,'This service code is already used in Feeder Schedule')]";
			  public static String clickYes="clickYes>//span[contains(.,'This service code is already used in Feeder Schedule')]/following::button[.='Yes']";
			  
			//Proforma service creation
			  public static String toolbarNewButton="toolbarNewButton>//button[@id='SPF-SPF_toolbar-btnTblNew']";
			  public static String proformaServicePopup="wantToCreatePopup>//h2[.='Proforma Service Creation']";
			  public static String createOk="createOk>//span[.=' Do you want to create a new Proforma Service Creation?']/following::button[.='Yes']";
			  public static String serviceTextfield="serviceCodeTextfield>//input[@id='SPF-SPF_txtServiceCode_input']";
			  public static String serviceSearchIcon="serviceSearchIcon>//button[@id='SPF-SPF_btnSearch1']";
			  public static String remarkTextBox="remarkTextBox_l>//textarea[@id='SPF-SPF_sLabelremarkstext']";
			  public static String selectPort="selectPort>//div[@col-id='C1']/parent::div[@row-index='0']";
			  public static String clickSelect="clickSelect>//button[@id='nfr-twocol-select-button']";
			  public static String portSearchButton="portSearchButton>//div[@col-id='portsearch']//child::button[@type='button']";
			  public static String terminalSearchButton="terminalSearchButton>//div[@col-id='terminalSearch']//../button[@type='button']" ;
			  public static String selectTerminal="selectPort>//div[@col-id='C1']/parent::div[@row-index='0']";
			  public static String savedOkButton="savedOkButton>//span[.='Proforma Service Creation Saved.']/following::button[.='Ok']";
			  public static String closeButton_1="closeButton_1>//a[@id='h1_img3']/child::i[@class='fa fa-remove mdlclose']";
			 
			  
			  
			 //Proforma status to inactive
			  public static String toolbarSearchButton="toolbarSearchButton>//button[@id='SPF-SPF_toolbar-btnTblJdlgSearch']";
			  public static String searchbyCode="searchbyCode>//input[@id='txt_name1']";
			  public static String clickSearch="clickSearch>//button[@id='myBtn']";
			  public static String selectCode="selectCode>//div[@col-id='C1']/parent::div[@row-id='0']";
			  public static String selectButton="selectButton>//span[.='Select']/parent::button[@id='nfr_sch_jdlg_form-jdlg_okbtn']";
			  public static String toolbarEditButton="toolbarEditButton>//button[@id='SPF-SPF_toolbar-btnTblEdit']";
			  public static String proformaStatus="proformaStatus>//label[@id='SPF-SPF_proformastatus_label']";
			  public static String selectStatus="selectStatus>//li[.='In-Active']";
			  public static String toolbarSaveButton="toolbarSaveButton>//button[@id='SPF-SPF_toolbar-btnsave']";
			  public static String proformaSCPopup="proformaSCPopup>//h2[.='Proforma Service Creation']";
			  public static String proformaSCOk="proformaSCOk>//h2[.='Proforma Service Creation']/following::button[.='Ok']";
			  public static String proformaCode="proformaCode>//input[@id='SPF-SPF_txtProformaCde']";
			
			 //Long Term Creation
			  public static String toolbarSearchLT="toolbarSearchLT>//button[@id='SLT-j_idt2697-btnTblDefaultSearch']";
			  public static String longTermTab="longTermTab>//label[.='Long term Creation']/parent::a";
			  public static String searchFrameLT="searchFrameLT>//span[@id='SLT_ToolBarSearchDialog_title']";
			  public static String searchIconLT="searchIconLT>//button[@id='SLT_SearchDialogform-SLT_SrchDialog_btnServiceCode']";
			  public static String selectFirst="selectFirst>//div[@row-index='0']/child::div[@col-id='C1']";
			  public static String selectSec="selectFirst>//div[@row-index='1']/child::div[@col-id='C1']";//sec
			  public static String selectButtonLT ="selectButtonLT>//span[.='Select']/parent::button[@id='nfr-twocol-select-button']";
			  public static String okButtonLT="okButtonLT>//button[@id='SLT_SearchDialogform-SLT_SrchDialog_btnOk']";
			  public static String toolbarEditLT="toolbarEditLT>//button[@id='SLT-j_idt2697-btnTblEdit']"; 
			  public static String draftBlueLT="draftBlueLT>//td[@class='sm-draftBlue sm-cell-center']";
			  public static String renameLT="renameLT>//span[.='Add/Rename']/parent::a";
			  public static String renameVessel="renameVessel>//span[.='Rename Vessel ']/parent::a";
			  public static String renameFrameLT="renameFrameLT>//span[@id='SLT_renameVessel_title']";
			  public static String renameFrameSearchIcon="renameFrameSearchIcon>//button[@id='SLT_renameVesselform-SLT_renameVessel_btntwoVesselCode']"; 
			  public static String futureCycles="futureCycles>//span[.='Future Cycles']/parent::div";
			  public static String currentCycle="currentCycle>//span[.='Current Cycle']/parent::div";
			  public static String okRename="okRename>//button[@id='SLT_renameVesselform-SLT_renameVessel_ok']";
			  public static String longTermPopup="LongTermPopup>//h2[@class='ui-dialog-title']";
			  public static String longTermPopupMsg="longTermPopupMsg>//span[.='Selected Vessel renamed']";
			  public static String renamedOkButtonCurrent="renamedOkButton>//span[.='Selected Vessel renamed']//following::button[.='Ok']";  
			  public static String renamedOkButtonFuture="renamedOkButtonFuture>//span[.='Selected and future Vessel(s) are renamed']//following::button[.='Ok']";
			  public static String futureCyclePopup="futureCyclePopup>//span[.='Selected and future Vessel(s) are renamed']";
			  public static String cerrentCyclePopup="cerrentCyclePopup>//span[.='Selected Vessel renamed']";
			  
			//Logout xpaths
//			public static String User_Logout = "User_Logout>//a[@title='Logout']//img[1]";
//			public static String Logout_Popup = "Logout_Popup>(//div[@id='JSP_dialog']//following-sibling::div[1])[6]";
//			public static String Logout_Text = "Logout_Text>//span[text()='Are you sure want to logout?']";		
//			public static String Logout_Yes = "Logout_Yes>//input[@value='Yes']";
//			public static String Logout_No = "Logout_No>//input[@type='button']//following-sibling::button[1]";
}
