package com.crm.pages.WCDLOfferODC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class WCDL_Renewal_OfferJourney extends TestListeners
{
	public static Logger log =(Logger) LogManager.getLogger(WCDL_Renewal_OfferJourney.class.getName());
	public static String Title1;
	
	public void WCDLOffer_Renewal() throws Exception
	{
		CommonMethods.mouseClick("MaeketingODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("OffersODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchiconODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("OfferIdInputODC_XPATH", "WCDLOffer_forRenewal", "Offer Id as an input", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchODC_XPATH");
		Thread.sleep(2000);
		
		KMBClearScriptODC_Renewal KCSOR= new KMBClearScriptODC_Renewal();
		KCSOR.ClearOffer();
		
		driver.navigate().refresh();
		String IndividualCRN= CommonMethods.getElementText("IndividualCRNODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forRenewal", "CRN of individual", 1, IndividualCRN);
		CommonMethods.highLight("IndividualCRNODC_XPATH");
		
		String BorrowingEntityCRN= CommonMethods.getElementText("BorrowingCRN_SublimitODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forRenewal", "CRN of borrowing entity", 1, BorrowingEntityCRN);
		CommonMethods.highLight("BorrowingCRN_SublimitODC_XPATH");
		
		String OfferId= CommonMethods.getElementText("OfferId_RenewalODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forRenewal", "Offer Id", 1, OfferId);
		CommonMethods.highLight("OfferId_RenewalODC_XPATH");
	
		CustomerDigitalJourney_for_Renewal CDJR= new CustomerDigitalJourney_for_Renewal();
		CDJR.CustomerDigitalJourney();
	}
	
}
