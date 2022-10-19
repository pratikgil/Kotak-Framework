package com.crm.pages.WCDLOfferODC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;


public class WCDL_ADHOC_OfferJourney extends TestListeners 
{
	public static Logger log =(Logger) LogManager.getLogger(WCDL_ADHOC_OfferJourney.class.getName());
	public static String Title1;
	
	public void WCDLOffer() throws Exception
	{
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		CommonMethods.mouseClick("MaeketingODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("OffersODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchiconODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("OfferIdInputODC_XPATH", "WCDLOffer_forAdhoc", "Offer Id as an input", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchODC_XPATH");
		Thread.sleep(2000);
		
		KMBClearScriptODC_Adhoc KCSO= new KMBClearScriptODC_Adhoc();
		KCSO.ClearOffer();
		
		driver.navigate().refresh();
		String IndividualCRN= CommonMethods.getElementText("IndividualCRNODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forAdhoc", "CRN of individual", 1, IndividualCRN);
		CommonMethods.highLight("IndividualCRNODC_XPATH");
		
		
		String BorrowingEntityCRN= CommonMethods.getElementText("BorrowingCRNODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forAdhoc", "CRN of borrowing entity", 1, BorrowingEntityCRN);
		CommonMethods.highLight("BorrowingCRNODC_XPATH");
		
		String OfferId= CommonMethods.getElementText("OfferIdODC_XPATH");
		ExcelOperation.setCellData("WCDLOffer_forAdhoc", "Offer Id", 1, OfferId);
		CommonMethods.highLight("OfferIdODC_XPATH");
		
		
		
		CustomerDigitalJourneyODC_for_ADHOC CDDO = new CustomerDigitalJourneyODC_for_ADHOC();
		CDDO.CustomerDigitalJourney();


		
	}
}
