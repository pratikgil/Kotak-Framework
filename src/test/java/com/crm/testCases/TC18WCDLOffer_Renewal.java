package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;
import com.crm.pages.WCDLOfferODC.WCDL_Renewal_OfferJourney;


public class TC18WCDLOffer_Renewal extends SetUp
{
@Test
	
	public void WCDLOffer_forRenewal() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "WCDLOffer_forRenewal";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("WCDLOffer_forRenewal",sheetName ))) {

				throw new SkipException(
						"Skipping the test WCDLOffer_forRenewal as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			WCDL_Renewal_OfferJourney WROJ=new WCDL_Renewal_OfferJourney();
			WROJ.WCDLOffer_Renewal();
			L.Logout();
	}
}