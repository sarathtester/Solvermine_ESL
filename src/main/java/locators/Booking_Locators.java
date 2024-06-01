package locators;

public interface Booking_Locators extends Booking_Locators1, EMS_Locators,VSS_Locator {

	//Login
	public static String username="username >//*[@id='nfr_login_authname']";
	public static String password="password >//*[@id='nfr_login_authid']";
	public static String Login_btn="Login_btn >//*[@id='nfr_login_btnlogin']";
	//Booking
	public static String searchBox_l="searchBox_l>//input[@id='nfr_topbar_autocomp_input']";
	public static String agrParty_l="agrParty_l>//input[@id='BKG-BKG_txtAgrPartyName_input']";
	
}
