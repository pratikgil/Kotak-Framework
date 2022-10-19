package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMKotakCC.NTBAssisted_WithoutDocumentJourneyCC;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;
import com.crm.pages.WCDLOfferODC.WCDL_ADHOC_OfferJourney;

public class TC16WCDLOffer_ADHOC extends SetUp
{
@Test
	
	public void WCDLOffer_forAdhoc() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "WCDLOffer_forAdhoc";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("WCDLOffer_forAdhoc",sheetName ))) {

				throw new SkipException(
						"Skipping the test WCDLOffer_forAdhoc as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			WCDL_ADHOC_OfferJourney WCDLOJ = new WCDL_ADHOC_OfferJourney();
			WCDLOJ.WCDLOffer();
			L.Logout();
	
}
}
