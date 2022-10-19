package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;
import com.crm.pages.WCDLOfferODC.WCDL_Sublimit_OfferJourney;

public class TC17WCDLOffer_Sublimit extends SetUp
{
@Test
	
	public void WCDLOffer_forSublimit() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "WCDLOffer_forSublimit";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("WCDLOffer_forSublimit",sheetName ))) {

				throw new SkipException(
						"Skipping the test WCDLOffer_forSublimit as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			WCDL_Sublimit_OfferJourney WSOJ=new WCDL_Sublimit_OfferJourney();
			WSOJ.WCDLOffer_Sublimit();
			L.Logout();
}
}