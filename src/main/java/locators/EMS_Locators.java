package locators;

public interface EMS_Locators {

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
}


