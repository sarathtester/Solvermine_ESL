package locators;

public interface VSS_Locator {

	//Login Xpaths
	public static String Username_Input = "Username_Input>//*[@id='nfr_login_authname']";
	public static String Password_Input = "Password_Input>//*[@id='nfr_login_authid']";
	public static String Login = "Login>//span[text()='Login']";
	public static String home_Logo = "home_Logo>//li[@id='nfr_dashboard_li']//a[1]";
	//Service Creation Xpaths
	public static String Module_Search = "Module_Search>//*[@id='nfr_topbar_autocomp_input']";
	public static String Click_Service_Creation = "Enter_Service_Creation>//li[@data-item-label='Service Creation']";
	public static String New_Service_Creation = "New_Service_Creation>//*[@id='SER-tbl-btnTblNew']";
	public static String Pop_upSC = "Pop_upSC>//h2[text()='Service Creation']";
	public static String Pop_confirmcheck = "Pop_confirmcheck>//h2[text()='Service Creation']//following::span[2]";
	public static String New_Service_Creation_Yes = "New_Service_Creation_Yes>//button[text()='Yes']";
	public static String New_Service_Creation_No = "New_Service_Creation_No>//button[text()='No']";
	public static String Service_Code = "Service_Code>//*[@id='SER-SER_txtServiceCode-SER_txtServiceCode']";
	public static String Service_Name = "Service_Name>//*[@id='SER-SER_txtServiceName-SER_txtServiceName']";
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
	public static String Status_InActive = "Statuc_InActive>//*[@id='SER-SER_cmbActive_2']";
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
	
	//Delete record in service creation
	 public static String selectService="selectService>(//div[@col-id='serviceCode'])[2]";
	 public static String deleteButton="deleteButton>//button[@id='SER-tbl-btnTblDelete']";
	 public static String alredyUsedInProforma="alredyUsedInProforma>//span[contains(.,'This Service Code is already used in the Proforma')]";
	 public static String confirmationPopup="confirmationPopup>(//button[.='Ok'])[7]";
	 public static String alreadyUsedInFeeder="alreadyUsedInFeeder>//span[contains(.,'This Service Code is already used in the Feeder Schedules')]";
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
	public static String User_Logout = "User_Logout>//a[@title='Logout']//img[1]";
	public static String Logout_Popup = "Logout_Popup>(//div[@id='JSP_dialog']//following-sibling::div[1])[6]";
	public static String Logout_Text = "Logout_Text>//span[text()='Are you sure want to logout?']";		
	public static String Logout_Yes = "Logout_Yes>//input[@value='Yes']";
	public static String Logout_No = "Logout_No>//input[@type='button']//following-sibling::button[1]";
	
	
}
