package locators;

public interface Proforma_Service_Locator extends Booking_Locators{
	
	public static String Username_input="UserName>//input[@id='nfr_login_authname']";
	public static String Password_input="Password>//input[@id='nfr_login_authid']";
	public static String Login="Login>//*[@id='nfr_login_btnlogin']";
	public static String Home_Logo="Home_Logo>//*[@id='nfr_topbar_user_detail_link']";
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


	
	
	
	
	

}
