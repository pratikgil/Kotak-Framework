package com.crm.pages.WCDLOfferODC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class WCDL_Sublimit_OfferJourney extends TestListeners
{
	public static Logger log =(Logger) LogManager.getLogger(WCDL_Sublimit_OfferJourney.class.getName());
	public static String Title1;

	
	public void WCDLOffer_Sublimit() throws Exception
	{
		try {
			CommonMethods.mouseClick("MaeketingODC_XPATH");
			Thread.sleep(2000);
			CommonMethods.mouseClick("OffersODC_XPATH");
			Thread.sleep(2000);
			CommonMethods.mouseClick("SearchiconODC_XPATH");
			CommonMethods.input("OfferIdInputODC_XPATH", "WCDLOffer_forSublimit", "Offer Id as an input", 1);
			CommonMethods.mouseClick("SearchODC_XPATH");
			Thread.sleep(3000);
			
			KMBClearScriptODC_Sublimit KCSOS= new KMBClearScriptODC_Sublimit();
			KCSOS.ClearOffer();
			
			driver.navigate().refresh();
			String IndividualCRN= CommonMethods.getElementText("IndividualCRNODC_XPATH");
			ExcelOperation.setCellData("WCDLOffer_forSublimit", "CRN of individual", 1, IndividualCRN);
			CommonMethods.highLight("IndividualCRNODC_XPATH");
			
			
			String BorrowingEntityCRN= CommonMethods.getElementText("BorrowingCRN_SublimitODC_XPATH");
			ExcelOperation.setCellData("WCDLOffer_forSublimit", "CRN of borrowing entity", 1, BorrowingEntityCRN);
			CommonMethods.highLight("BorrowingCRN_SublimitODC_XPATH");
			
			String OfferId= CommonMethods.getElementText("OfferID_SublimitODC_XPATH");
			ExcelOperation.setCellData("WCDLOffer_forSublimit", "Offer Id", 1, OfferId);
			CommonMethods.highLight("OfferID_SublimitODC_XPATH");
			
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		CustomerDigitalJourney_for_Sublimit CDJS= new CustomerDigitalJourney_for_Sublimit();
		CDJS.CustomerDigitalJourney();
	}
	
	
}
