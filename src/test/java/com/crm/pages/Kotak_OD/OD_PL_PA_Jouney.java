package com.crm.pages.Kotak_OD;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;


public class OD_PL_PA_Jouney extends TestListeners 
{
	public static Logger log =(Logger) LogManager.getLogger(OD_PL_PA_Jouney.class.getName());
	public static String Title1;

	
	public void OD_PL_PA() throws Exception
	{
		String Title1=driver.getTitle();
		System.out.println(Title1);
		
		CommonMethods.mouseClick("MaeketingODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("OffersODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchiconODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("OfferIdInputODC_XPATH", "Kotak_OD_PL_PA", "Offer Id as an input", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("SearchODC_XPATH");
		Thread.sleep(2000);
	
		KMBClearScript_OD_PL_PA KCSOPP=new KMBClearScript_OD_PL_PA();
		KCSOPP.ClearOffer();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		String IndividualCRN= CommonMethods.getElementText("CRNNoOD_PL_PA_XPATH");
		ExcelOperation.setCellData("Kotak_OD_PL_PA", "CRN of individual", 1, IndividualCRN);
		CommonMethods.highLight("CRNNoOD_PL_PA_XPATH");
		
		String OfferId= CommonMethods.getElementText("OfferIdOD_PL_PA_XPATH");
		ExcelOperation.setCellData("Kotak_OD_PL_PA", "Offer Id", 1, OfferId);
		CommonMethods.highLight("OfferIdOD_PL_PA_XPATH");
		
		CustomerDigitalJourney_OD_PL_PA CDJOPP= new CustomerDigitalJourney_OD_PL_PA();
		CDJOPP.CustomerDigitalJourney();
    }
}	
