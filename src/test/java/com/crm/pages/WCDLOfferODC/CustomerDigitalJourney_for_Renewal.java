package com.crm.pages.WCDLOfferODC;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class CustomerDigitalJourney_for_Renewal extends TestListeners
{
	public static Logger log = (Logger) LogManager.getLogger(CustomerDigitalJourney_for_Renewal.class.getName());
	
	public void CustomerDigitalJourney() throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
	
		driver.get("https://kmb.crmnext.com/sng7/vividkotak/vividflow/run/WorkingCapital_flow?ProductType=WCRE&Channel=35");
		String Title2 = driver.getTitle();
		System.out.println(Title2);

		CommonMethods.input("RegisteredMobileNoODC_XPATH", "WCDLOffer_forRenewal", "Registered Mobile no", 1);
		CommonMethods.input("CRNODC_Sublimit_XPATH", "WCDLOffer_forRenewal", "CRN of individual", 1);
		CommonMethods.mouseClick("NextODC_XPATH");
		CommonMethods.mouseClick("CrossBar1ODC_XPATH");
		CommonMethods.input("EnterOTPODC_XPATH", "WCDLOffer_forRenewal", "Enter OTP", 1);
		CommonMethods.mouseClick("Submit1ODC_XPATH");
		
		CommonMethods.scrollAtBottom();
		CommonMethods.mouseClick("RenewODC_renewal_XPATH");
		CommonMethods.scrollAtBottom();
		CommonMethods.mouseClick("ConfirmODC_renewal_XPATH");
		
		ScreenShot.takeSnapShot("jorney for WCDL Renewal completed", "pass");
		


	}
}
